package org.sample.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.validation.Valid;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.ConvertUtilsBean;
import org.apache.commons.beanutils.converters.DateConverter;
import org.sample.model.Contact;
import org.sample.model.Person;
import org.sample.web.app.ContactService;
import org.sample.web.app.PersonService;
import org.sample.web.form.CountHolder;
import org.sample.web.form.PersonForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.sqlproc.engine.impl.SqlStandardControl;

import ch.ralscha.extdirectspring.annotation.ExtDirectMethod;
import ch.ralscha.extdirectspring.annotation.ExtDirectMethodType;
import ch.ralscha.extdirectspring.bean.ExtDirectFormPostResult;
import ch.ralscha.extdirectspring.bean.ExtDirectStoreReadRequest;
import ch.ralscha.extdirectspring.bean.ExtDirectStoreReadResult;
import ch.ralscha.extdirectspring.bean.SortDirection;
import ch.ralscha.extdirectspring.bean.SortInfo;
import ch.ralscha.extdirectspring.filter.Filter;
import ch.ralscha.extdirectspring.filter.StringFilter;

@Service
public class SimpleService {

    // TODO - form validation
    // TODO - exception handling

    protected ContactService contactService;
    protected PersonService personService;
    protected BeanUtilsBean beanUtilsBean;

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public SimpleService() {
        beanUtilsBean = new BeanUtilsBean(new ConvertUtilsBean() {

            @Override
            public Object convert(String value, Class clazz) {
                if (clazz.isEnum()) {
                    if (value == null || value.isEmpty()) {
                        return null;
                    }
                    return Enum.valueOf(clazz, value);

                } else {
                    return super.convert(value, clazz);
                }
            }
        });

        DateConverter dateConverter = new DateConverter(null);
        dateConverter.setPattern("dd.MM.yyyy");
        beanUtilsBean.getConvertUtils().register(dateConverter, Date.class);

    }

    @ExtDirectMethod(value = ExtDirectMethodType.STORE_READ, group = "person")
    public ExtDirectStoreReadResult<Person> loadPeople(ExtDirectStoreReadRequest request) throws Exception {
        logger.info("listPeople -> " + request);

        PersonForm form = buildPersonFormFromParams(request.getParams());

        SqlStandardControl sqlControl = (form.getId() == null) ? buildControlFromParams(request)
                : new SqlStandardControl();
        if (request.getSorters() != null) {
            for (SortInfo sort : request.getSorters()) {
                if ("lastName".equalsIgnoreCase(sort.getProperty())) {
                    if (sort.getDirection() == SortDirection.ASCENDING)
                        sqlControl.setAscOrder(Person.ORDER_BY_LAST_NAME);
                    else if (sort.getDirection() == SortDirection.DESCENDING)
                        sqlControl.setDescOrder(Person.ORDER_BY_LAST_NAME);
                    break;
                }
            }
        }
        if (sqlControl.getOrder() == null)
            sqlControl.setAscOrder(Person.ORDER_BY_ID);
        logger.info("loadPeople control " + sqlControl);
        CountHolder count = new CountHolder();
        List<Person> people = personService.listPeople(form, sqlControl, count);

        ExtDirectStoreReadResult<Person> result = new ExtDirectStoreReadResult<Person>(new Long(count.getCount()),
                people, true);
        logger.info("listPeople <- " + result);
        return result;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.STORE_MODIFY, group = "person")
    public List<Person> createPerson(List<Person> people) {
        List<Person> result = new ArrayList<Person>();
        for (Person person : people) {
            person.setSsn(emptyToNull(person.getSsn()));
            Person p = personService.insertPerson(person);
            if (p != null)
                result.add(p);
        }
        return result;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.STORE_MODIFY, group = "person")
    public List<Person> updatePerson(List<Person> people) {
        List<Person> result = new ArrayList<Person>();
        for (Person person : people) {
            person.setSsn(emptyToNull(person.getSsn()));
            Person p = personService.updatePerson(person);
            if (p != null)
                result.add(p);
        }
        return result;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.STORE_MODIFY, group = "person")
    public void deletePerson(List<Person> people) {
        for (Person person : people) {
            personService.deletePerson(person);
        }
    }

    @ExtDirectMethod(value = ExtDirectMethodType.STORE_READ, group = "person")
    public ExtDirectStoreReadResult<Contact> loadContacts(ExtDirectStoreReadRequest request) throws Exception {
        logger.info("loadContacts -> " + request);

        Contact form = buildContactFormFromParams(request.getParams());

        SqlStandardControl sqlControl = buildControlFromParams(request);
        logger.info("loadContacts control " + sqlControl);
        CountHolder count = new CountHolder();
        List<Contact> contacts = contactService.listContacts(form, sqlControl, count);

        ExtDirectStoreReadResult<Contact> result = new ExtDirectStoreReadResult<Contact>(new Long(count.getCount()),
                contacts, true);
        logger.info("loadContacts <- " + result);
        return result;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.STORE_MODIFY, group = "person")
    public List<Contact> createContacts(List<Contact> contacts) {
        List<Contact> result = new ArrayList<Contact>();
        for (Contact contact : contacts) {
            contact.setPhoneNumber(emptyToNull(contact.getPhoneNumber()));
            Contact c = contactService.insertContact(contact);
            if (c != null)
                result.add(c);
        }
        return result;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.STORE_MODIFY, group = "person")
    public List<Contact> updateContacts(List<Contact> contacts) {
        List<Contact> result = new ArrayList<Contact>();
        for (Contact contact : contacts) {
            contact.setPhoneNumber(emptyToNull(contact.getPhoneNumber()));
            Contact c = contactService.updateContact(contact);
            if (c != null)
                result.add(c);
        }
        return result;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.STORE_MODIFY, group = "person")
    public void deleteContacts(List<Contact> contacts) {
        for (Contact contact : contacts) {
            contactService.deleteContact(contact);
        }
    }

    @ExtDirectMethod(value = ExtDirectMethodType.FORM_POST, group = "person")
    public ExtDirectFormPostResult validatePersonForm(@Valid Person p, BindingResult result) {
        if (!result.hasErrors()) {
            // another validations
        }
        return new ExtDirectFormPostResult(result);
    }

    @ExtDirectMethod(value = ExtDirectMethodType.FORM_POST, group = "person")
    public ExtDirectFormPostResult createContact(@Valid Contact contact, BindingResult result) {
        Contact resultContact = null;
        if (!result.hasErrors()) {
            contact.setPhoneNumber(emptyToNull(contact.getPhoneNumber()));
            resultContact = contactService.insertContact(contact);
        }
        ExtDirectFormPostResult postResult = new ExtDirectFormPostResult(result);
        if (resultContact != null) {
            postResult.addResultProperty("id", resultContact.getId());
        }
        return postResult;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.FORM_POST, group = "person")
    public ExtDirectFormPostResult updateContact(@Valid Contact contact, BindingResult result) {
        Contact resultContact = null;
        if (!result.hasErrors()) {
            contact.setPhoneNumber(emptyToNull(contact.getPhoneNumber()));
            resultContact = contactService.updateContact(contact);
        }
        ExtDirectFormPostResult postResult = new ExtDirectFormPostResult(result);
        if (resultContact != null) {
            postResult.addResultProperty("id", resultContact.getId());
        }
        return postResult;
    }

    @ExtDirectMethod(value = ExtDirectMethodType.FORM_POST, group = "person")
    public ExtDirectFormPostResult deleteContact(Contact contact, BindingResult result) {
        if (!result.hasErrors()) {
            if (contact.getId() != null)
                contactService.deleteContact(contact);
        }
        ExtDirectFormPostResult postResult = new ExtDirectFormPostResult(result);
        return postResult;
    }

    private String emptyToNull(String s) {
        if (s == null)
            return s;
        if (s.trim().length() == 0)
            return null;
        return s;
    }

    private PersonForm buildPersonFormFromFilters(List<Filter> filters) throws Exception {

        PersonForm form = new PersonForm();

        for (Filter filter : filters) {
            String value = ((StringFilter) filter).getValue();
            String key = filter.getField();
            logger.info("personFormFromFilters '" + key + "' '" + value + "'");
            beanUtilsBean.setProperty(form, key, value);
        }

        return form;
    }

    private PersonForm buildPersonFormFromParams(Map<String, Object> params) throws Exception {

        PersonForm form = new PersonForm();

        for (Entry<String, Object> p : params.entrySet()) {
            String key = p.getKey();
            Object value = p.getValue();
            if (value == null || ((value instanceof String) && ((String) value).length() == 0))
                continue;
            logger.info("personFormFromParams '" + key + "' '" + value + "' '" + value.getClass() + "'");
            if ("contacts".equals(key) && value instanceof Boolean && ((Boolean) value))
                form.setInit(Person.Association.contacts);
            else
                beanUtilsBean.setProperty(form, key, value);
        }

        return form;
    }

    private Contact buildContactFormFromFilters(List<Filter> filters) throws Exception {

        Contact form = new Contact();

        for (Filter filter : filters) {
            String value = ((StringFilter) filter).getValue();
            String key = filter.getField();
            logger.info("personFormFromFilters '" + key + "' '" + value + "'");
            beanUtilsBean.setProperty(form, key, value);
        }

        return form;
    }

    private Contact buildContactFormFromParams(Map<String, Object> params) throws Exception {

        Contact form = new Contact();

        for (Entry<String, Object> p : params.entrySet()) {
            String key = p.getKey();
            Object value = p.getValue();
            if (value == null || ((value instanceof String) && ((String) value).length() == 0))
                continue;
            logger.info("personFormFromParams '" + key + "' '" + value + "' '" + value.getClass() + "'");
            if ("personId".equals(key)) {
                form.setPerson(new Person());
                beanUtilsBean.setProperty(form.getPerson(), "id", value);
            } else {
                beanUtilsBean.setProperty(form, key, value);
            }
        }

        return form;
    }

    private SqlStandardControl buildControlFromParams(ExtDirectStoreReadRequest request) {
        SqlStandardControl sqlControl = new SqlStandardControl();
        if (request.getStart() != null)
            sqlControl.setFirstResult(request.getStart());
        if (request.getLimit() != null)
            sqlControl.setMaxResults(request.getLimit());
        return sqlControl;
    }

    @Required
    public void setContactService(ContactService contactService) {
        this.contactService = contactService;
    }

    @Required
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }
}
