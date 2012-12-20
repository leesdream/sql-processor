package org.sqlproc.sample.simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.jdbc.JdbcEngineFactory;
import org.sqlproc.engine.jdbc.JdbcSimpleSession;
import org.sqlproc.engine.util.DDLLoader;
import org.sqlproc.sample.simple.dao.BankAccountDao;
import org.sqlproc.sample.simple.dao.BookDao;
import org.sqlproc.sample.simple.dao.ContactDao;
import org.sqlproc.sample.simple.dao.CreditCardDao;
import org.sqlproc.sample.simple.dao.LibraryDao;
import org.sqlproc.sample.simple.dao.MovieDao;
import org.sqlproc.sample.simple.dao.PerformerDao;
import org.sqlproc.sample.simple.dao.PersonDao;
import org.sqlproc.sample.simple.dao.PersonLibraryDao;
import org.sqlproc.sample.simple.dao.PhysicalMediaDao;
import org.sqlproc.sample.simple.dao.SubscriberDao;
import org.sqlproc.sample.simple.model.BankAccount;
import org.sqlproc.sample.simple.model.Contact;
import org.sqlproc.sample.simple.model.CreditCard;
import org.sqlproc.sample.simple.model.Library;
import org.sqlproc.sample.simple.model.Movie;
import org.sqlproc.sample.simple.model.NewBook;
import org.sqlproc.sample.simple.model.Performer;
import org.sqlproc.sample.simple.model.Person;
import org.sqlproc.sample.simple.model.PhoneNumber;
import org.sqlproc.sample.simple.model.PhysicalMedia;
import org.sqlproc.sample.simple.model.Subscriber;
import org.sqlproc.sample.simple.type.PhoneNumberType;

public class Main {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private Connection connection;
    private SqlSession session;
    private SqlEngineFactory sqlFactory;
    private List<String> ddls;

    static {
        try {
            DriverManager.registerDriver(new org.hsqldb.jdbcDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Main() throws SQLException {
        JdbcEngineFactory factory = new JdbcEngineFactory();
        factory.setMetaFilesNames("statements.qry");
        factory.addCustomType(new PhoneNumberType());
        this.sqlFactory = factory;

        ddls = DDLLoader.getDDLs(this.getClass(), "hsqldb.ddl");

        connection = DriverManager.getConnection("jdbc:hsqldb:mem:sqlproc", "sa", "");
        session = new JdbcSimpleSession(connection);
    }

    public void setupDb() throws SQLException {

        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            for (int i = 0, n = ddls.size(); i < n; i++) {
                String ddl = ddls.get(i);
                if (ddl == null)
                    continue;
                System.out.println(ddl);
                stmt.addBatch(ddl);
            }
            stmt.executeBatch();

        } finally {
            if (stmt != null)
                stmt.close();
        }
    }

    public void initDao() throws SQLException {
        bankAccountDao = new BankAccountDao(session, sqlFactory);
        bookDao = new BookDao(session, sqlFactory);
        contactDao = new ContactDao(session, sqlFactory);
        creditCardDao = new CreditCardDao(session, sqlFactory);
        libraryDao = new LibraryDao(session, sqlFactory);
        movieDao = new MovieDao(session, sqlFactory);
        personDao = new PersonDao(session, sqlFactory);
        performerDao = new PerformerDao(session, sqlFactory);
        personLibraryDao = new PersonLibraryDao(session, sqlFactory);
        subscriberDao = new SubscriberDao(session, sqlFactory);
        physicalMediaDao = new PhysicalMediaDao(session, sqlFactory);
    }

    private BankAccountDao bankAccountDao;
    private BookDao bookDao;
    private ContactDao contactDao;
    private CreditCardDao creditCardDao;
    private LibraryDao libraryDao;
    private MovieDao movieDao;
    private PersonDao personDao;
    private PerformerDao performerDao;
    private PersonLibraryDao personLibraryDao;
    private SubscriberDao subscriberDao;
    private PhysicalMediaDao physicalMediaDao;

    public static void main(String[] args) throws Exception {
        Person person, p;
        BankAccount bankAccount, b1;
        NewBook book, b;
        Contact contact, c;
        CreditCard creditCard, c1;
        Library l, library;
        Movie movie, m;
        Subscriber subscriber, s;
        PhysicalMedia physicalMedia, pm;

        List<Person> list;
        boolean deleted;
        Main main = new Main();
        main.setupDb();
        main.initDao();

        // insert
        Person jan = main.getPersonDao().insertPerson(new Person("Jan", "Jánský"));
        main.getContactDao().insertPersonContacts(jan,
                new Contact()._setAddress("Jan address 1")._setPhoneNumber(new PhoneNumber(111, 222, 3333)));
        Person janik = main.getPersonDao().insertPerson(new Person("Janík", "Janíček"));
        main.getContactDao().insertPersonContacts(janik, new Contact()._setAddress("Janik address 1"));
        Person honza = main.getPersonDao().insertPerson(new Person("Honza", "Honzovský"));
        main.getContactDao().insertPersonContacts(honza, new Contact()._setAddress("Honza address 1"),
                new Contact()._setAddress("Honza address 2"));
        Person honzik = main.getPersonDao().insertPerson(new Person("Honzik", "Honzíček"));
        Performer honzikp = main.getPerformerDao().insertPerformer(new Performer()._setPerson(honzik));
        Person andrej = main.getPersonDao().insertPerson(new Person("Andrej", "Andrejček")._setSsn("123456789"));
        main.getContactDao().insertPersonContacts(andrej,
                new Contact()._setAddress("Andrej address 1")._setPhoneNumber(new PhoneNumber(444, 555, 6666)));

        Library lib = main.getLibraryDao().insertLibrary(new Library("Alexandria Library"));
        Subscriber janikS = main.getSubscriberDao().insertLibrarySubscriber(lib,
                new Subscriber(lib, "Janik Subscr")._setContact(jan.getContacts().get(0)));
        Subscriber honzaS = main.getSubscriberDao().insertLibrarySubscriber(lib,
                new Subscriber(lib, "Honza Subscr")._setContact(honza.getContacts().get(0)));

        BankAccount bankAccount1 = main.getBankAccountDao().insertBankAccount(
                new BankAccount(janikS, "BA")._setBaAccount("account 1"));
        main.getBankAccountDao().insertBankAccount(new BankAccount(honzaS, "BA")._setBaAccount("account 2"));
        CreditCard creditCard1 = main.getCreditCardDao().insertCreditCard(
                new CreditCard(janikS, "CC")._setCcNumber(123L));
        main.getCreditCardDao().insertCreditCard(new CreditCard(honzaS, "CC")._setCcNumber(456L));

        NewBook book1 = main.getBookDao().insertBook(
                (NewBook) new NewBook("The Adventures of Robin Hood", "978-0140367003")._setAuthor(honzikp));
        NewBook book2 = main.getBookDao().insertBook(new NewBook("The Three Musketeers", "978-1897093634"));
        Movie movie1 = main.getMovieDao().insertMovie(new Movie("Pippi Långstrump i Söderhavet", "abc", 82));
        Movie movie2 = main.getMovieDao().insertMovie(new Movie("Die Another Day", "def", 95));

        PhysicalMedia pbook1 = main.getPhysicalMediaDao().insertPhysicalMedia(new PhysicalMedia("folder 001", book1));
        PhysicalMedia pbook2 = main.getPhysicalMediaDao().insertPhysicalMedia(new PhysicalMedia("folder 002", book2));
        PhysicalMedia pmovie1 = main.getPhysicalMediaDao().insertPhysicalMedia(new PhysicalMedia("folder 003", movie1));
        PhysicalMedia pmovie2 = main.getPhysicalMediaDao().insertPhysicalMedia(new PhysicalMedia("folder 004", movie2));

        main.getPersonLibraryDao().insertPersonLibrary(jan, book1, movie1);
        main.getPersonLibraryDao().insertPersonLibrary(honza, book2, movie2);
        main.getPersonLibraryDao().insertPersonLibrary(andrej, book1, book2, movie2);

        // update
        person = new Person();
        person.setId(andrej.getId());
        person.setFirstName("Andrejík");
        p = main.getPersonDao().updatePerson(person);
        Assert.assertNotNull(p);

        bankAccount1.setBaAccount("updated account");
        bankAccount1.setSubscriber(honzaS);
        b1 = main.getBankAccountDao().updateBankAccount(bankAccount1);
        Assert.assertNotNull(b1);

        book1.setNewIsbn("978-9940367003");
        book1.setTitle("The Adventures of Robin Hood Updated");
        b = main.getBookDao().updateBook(book1);
        Assert.assertNotNull(b);

        contact = honza.getContacts().get(0);
        contact.setAddress("Honza address 1 Updated");
        contact.setPhoneNumber(new PhoneNumber(000, 000, 0000));
        c = main.getContactDao().updateContact(contact);
        Assert.assertNotNull(c);

        creditCard1.setCcNumber(789L);
        c1 = main.getCreditCardDao().updateCreditCard(creditCard1);
        Assert.assertNotNull(c1);

        lib.setName("Alexandria Library Updated");
        l = main.getLibraryDao().updateLibrary(lib);
        Assert.assertNotNull(c);

        movie1.setUrlimdb("def Updated");
        movie1.setTitle("Die Another Day Updated");
        m = main.getMovieDao().updateMovie(movie1);
        Assert.assertNotNull(m);

        pbook1.setLocation("folder 011");
        pm = main.getPhysicalMediaDao().updatePhysicalMedia(pbook1);
        Assert.assertNotNull(pm);

        janikS.setName("Janik Subscr Updated");
        s = main.getSubscriberDao().updateSubscriber(janikS);
        Assert.assertNotNull(s);

        // get
        person = new Person();
        person.setId(andrej.getId());
        p = main.getPersonDao().getPerson(person);
        Assert.assertNotNull(p);
        Assert.assertEquals("Andrejík", p.getFirstName());
        Assert.assertEquals("Andrejček", p.getLastName());
        Assert.assertEquals("123456789", p.getSsn());
        Assert.assertTrue(p.getContacts().size() == 0);

        // update also with null values
        person = new Person();
        person.setId(andrej.getId());
        person.setFirstName("Andrioša");
        person.setNull(Person.Attribute.ssn);
        p = main.getPersonDao().updatePerson(person);
        Assert.assertNotNull(p);

        // get
        person = new Person();
        person.setId(andrej.getId());
        person.setInit(Person.Association.contacts);
        p = main.getPersonDao().getPerson(person);
        Assert.assertNotNull(p);
        Assert.assertEquals("Andrioša", p.getFirstName());
        Assert.assertEquals("Andrejček", p.getLastName());
        Assert.assertNull(p.getSsn());
        Assert.assertEquals(1, p.getContacts().size());
        Assert.assertEquals("Andrej address 1", p.getContacts().get(0).getAddress());
        Assert.assertEquals(new PhoneNumber(444, 555, 6666), p.getContacts().get(0).getPhoneNumber());

        // person.setInit(Person.Association.library);
        // p = main.getPersonDao().getPerson(person);
        // Assert.assertNotNull(p);
        // Assert.assertEquals(3, p.getLibrary().size());
        // Assert.assertEquals("The Adventures of Robin Hood Updated", p.getLibrary().get(0).getTitle());
        // Assert.assertTrue(p.getLibrary().get(0) instanceof NewBook);
        // Assert.assertEquals("978-9940367003", ((NewBook) p.getLibrary().get(0)).getNewIsbn());
        // Assert.assertEquals("The Three Musketeers", p.getLibrary().get(1).getTitle());
        // Assert.assertTrue(p.getLibrary().get(1) instanceof NewBook);
        // Assert.assertEquals("978-1897093634", ((NewBook) p.getLibrary().get(1)).getNewIsbn());
        // Assert.assertEquals("Die Another Day", p.getLibrary().get(2).getTitle());
        // Assert.assertTrue(p.getLibrary().get(2) instanceof Movie);
        // Assert.assertEquals("def", ((Movie) p.getLibrary().get(2)).getUrlimdb());

        // get
        book = new NewBook();
        book.setId(book1.getId());
        book.setInit(NewBook.Association.author);
        b = main.getBookDao().getBook(book);
        Assert.assertNotNull(b);
        Assert.assertEquals("978-9940367003", b.getNewIsbn());
        Assert.assertEquals("The Adventures of Robin Hood Updated", b.getTitle());
        Assert.assertNotNull(b.getAuthor());
        Assert.assertEquals(honzikp.getId(), b.getAuthor().getId());

        bankAccount = new BankAccount();
        bankAccount.setId(bankAccount1.getId());
        bankAccount.setInit(BankAccount.Association.subscriber);
        b1 = main.getBankAccountDao().getBankAccount(bankAccount);
        Assert.assertNotNull(b1);
        Assert.assertEquals("updated account", b1.getBaAccount());
        Assert.assertEquals(honzaS.getId(), b1.getSubscriber().getId());
        Assert.assertNotNull(b1.getSubscriber());
        Assert.assertEquals("Honza Subscr", b1.getSubscriber().getName());

        contact = new Contact();
        contact.setId(honza.getContacts().get(0).getId());
        contact.setInit(Contact.Association.person);
        c = main.getContactDao().getContact(contact);
        Assert.assertNotNull(c);
        Assert.assertEquals("Honza address 1 Updated", c.getAddress());
        Assert.assertEquals(new PhoneNumber(000, 0000, 0000), c.getPhoneNumber());
        Assert.assertNotNull(c.getPerson());
        Assert.assertEquals("Honzovský", c.getPerson().getLastName());

        creditCard = new CreditCard();
        creditCard.setId(creditCard1.getId());
        creditCard.setInit(CreditCard.Association.subscriber);
        c1 = main.getCreditCardDao().getCreditCard(creditCard);
        Assert.assertNotNull(c1);
        Assert.assertEquals(new Long(789), c1.getCcNumber());
        Assert.assertNotNull(c1.getSubscriber());
        Assert.assertEquals("Janik Subscr Updated", c1.getSubscriber().getName());

        library = new Library();
        library.setId(lib.getId());
        l = main.getLibraryDao().getLibrary(library);
        Assert.assertNotNull(l);

        movie = new Movie();
        movie.setId(movie1.getId());
        m = main.getMovieDao().getMovie(movie);
        Assert.assertNotNull(m);
        Assert.assertEquals("def Updated", m.getUrlimdb());
        Assert.assertEquals("Die Another Day Updated", m.getTitle());

        physicalMedia = new PhysicalMedia();
        physicalMedia.setId(pbook1.getId());
        pm = main.getPhysicalMediaDao().getPhysicalMedia(physicalMedia);
        Assert.assertNotNull(pm);
        Assert.assertEquals("folder 011", pm.getLocation());
        Assert.assertNull(pm.getMedia());
        physicalMedia.setInit(PhysicalMedia.Association.media);
        pm = main.getPhysicalMediaDao().getPhysicalMedia(physicalMedia);
        Assert.assertNotNull(pm);
        Assert.assertEquals("folder 011", pm.getLocation());
        Assert.assertNotNull(pm.getMedia());
        Assert.assertTrue(pm.getMedia() instanceof NewBook);
        Assert.assertEquals("978-9940367003", ((NewBook) pm.getMedia()).getNewIsbn());

        physicalMedia = new PhysicalMedia();
        physicalMedia.setId(pmovie1.getId());
        pm = main.getPhysicalMediaDao().getPhysicalMedia(physicalMedia);
        Assert.assertNotNull(pm);
        Assert.assertEquals("folder 003", pm.getLocation());
        Assert.assertNull(pm.getMedia());
        physicalMedia.setInit(PhysicalMedia.Association.media);
        pm = main.getPhysicalMediaDao().getPhysicalMedia(physicalMedia);
        Assert.assertNotNull(pm);
        Assert.assertEquals("folder 003", pm.getLocation());
        Assert.assertNotNull(pm.getMedia());
        Assert.assertTrue(pm.getMedia() instanceof Movie);
        Assert.assertEquals("def Updated", ((Movie) pm.getMedia()).getUrlimdb());

        subscriber = new Subscriber();
        subscriber.setId(janikS.getId());
        s = main.getSubscriberDao().getSubscriber(subscriber);
        Assert.assertNotNull(s);
        Assert.assertEquals("Janik Subscr Updated", s.getName());
        Assert.assertNull(s.getLibrary().getName());
        Assert.assertNull(s.getContact().getAddress());

        subscriber.setInit(Subscriber.Association.contact);
        subscriber.setInit(Subscriber.Association.library);
        s = main.getSubscriberDao().getSubscriber(subscriber);
        Assert.assertNotNull(s);
        Assert.assertEquals("Alexandria Library Updated", s.getLibrary().getName());
        Assert.assertEquals("Jan address 1", s.getContact().getAddress());

        subscriber.setInit(Subscriber.Association.billingDetails);
        s = main.getSubscriberDao().getSubscriber(subscriber);
        Assert.assertNotNull(s);
        Assert.assertNotNull(s.getLibrary());
        Assert.assertNotNull(s.getContact());
        Assert.assertTrue(s.getBillingDetails().size() == 1);
        Assert.assertTrue(s.getBillingDetails().get(0) instanceof CreditCard);
        Assert.assertEquals(new Long(789), ((CreditCard) s.getBillingDetails().get(0)).getCcNumber());

        // // queries
        // list = main.listAll();
        // Assert.assertEquals(5, list.size());
        //
        // person = new Person();
        // person.setName("Jan");
        // list = main.listSome(person);
        // Assert.assertEquals(1, list.size());
        //
        // person = new Person();
        // person.setName("Jan");
        // list = main.listLike(person, true);
        // Assert.assertEquals(2, list.size());
        // list = main.listLike(person, false);
        // Assert.assertEquals(2, list.size());
        // person.setName("an");
        // list = main.listLike(person, true);
        // Assert.assertEquals(1, list.size());
        // list = main.listLike(person, false);
        // Assert.assertEquals(3, list.size());
        //
        // // left join
        // person = new Person();
        // person.setName("Honza");
        // list = main.listPeopleAndContacts(person);
        // Assert.assertEquals(1, list.size());
        // Assert.assertEquals("Honza", list.get(0).getName());
        // Assert.assertEquals(2, list.get(0).getContacts().size());
        // Assert.assertTrue(list.get(0).getContacts() instanceof ArrayList);
        // Assert.assertEquals("Honza address 1", list.get(0).getContacts().get(0).getAddress());
        // Assert.assertEquals("Honza address 2", list.get(0).getContacts().get(1).getAddress());
        // list = main.listPeopleAndContacts2(person);
        // Assert.assertEquals(1, list.size());
        // Assert.assertEquals("Honza", list.get(0).getName());
        // Assert.assertEquals(2, list.get(0).getContacts().size());
        // Assert.assertTrue(list.get(0).getContacts() instanceof List);
        // Assert.assertEquals("Honza address 1", list.get(0).getContacts().get(0).getAddress());
        // Assert.assertEquals("Honza address 2", list.get(0).getContacts().get(1).getAddress());
        //
        // // inheritance
        // list = main.listPeopleLibrary(null);
        // Assert.assertEquals(5, list.size());
        // Assert.assertEquals("Andrej", list.get(0).getName());
        // Assert.assertEquals(3, list.get(0).getLibrary().size());
        // Assert.assertEquals("Die Another Day", list.get(0).getLibrary().get(0).getTitle());
        // Assert.assertTrue(list.get(0).getLibrary().get(0) instanceof Movie);
        // Assert.assertEquals("def", ((Movie) list.get(0).getLibrary().get(0)).getUrlimdb());
        // Assert.assertEquals(new Integer(95), ((Movie) list.get(0).getLibrary().get(0)).getPlaylength());
        // Assert.assertEquals("The Adventures of Robin Hood", list.get(0).getLibrary().get(1).getTitle());
        // Assert.assertTrue(list.get(0).getLibrary().get(1) instanceof NewBook);
        // Assert.assertEquals("978-0140367003", ((NewBook) list.get(0).getLibrary().get(1)).getIsbn());
        // Assert.assertEquals("The Three Musketeers", list.get(0).getLibrary().get(2).getTitle());
        // Assert.assertTrue(list.get(0).getLibrary().get(2) instanceof NewBook);
        // Assert.assertEquals("978-1897093634", ((NewBook) list.get(0).getLibrary().get(2)).getIsbn());
        //
        // // crud
        // person = new Person();
        // person.setId(janik.getId());
        // person.setName("Bozena");
        // p = main.update(person);
        // Assert.assertNotNull(p);
        // Assert.assertEquals("Bozena", p.getName());
        //
        // person = new Person();
        // person.setId(jan.getId());
        // deleted = main.delete(person);
        // Assert.assertTrue(deleted);
        // list = main.listAll();
        // Assert.assertEquals(4, list.size());
        //
        // try {
        // deleted = main.delete(null);
        // Assert.fail();
        // } catch (IllegalArgumentException e) {
        // }
        // list = main.listAll();
        // Assert.assertEquals(4, list.size());
        //
        // // custom type
        // Contact cc = new Contact()._setAddress("Pepa address 1");
        // cc.setPhoneNumber(new PhoneNumber(111, 222, 3333));
        // Person pepa = main.insertCustom(new Person("Pepa"), cc);
        // Contact contact = new Contact();
        // contact.setPhoneNumber(new PhoneNumber(111, 222, 3333));
        // list = main.listCustom(contact);
        // Assert.assertEquals(1, list.size());
        // Assert.assertEquals("111-222-3333", list.get(0).getContacts().get(0).getPhoneNumber().toString());
        //
        // List<Subscriber> subscribers = main.listAllSubsribersWithBillingDetails();
        // Assert.assertEquals(2, subscribers.size());
        //
        // java.sql.Timestamp stamp = main.callSimpleFunction(new java.sql.Timestamp(new Date().getTime()));
        // Assert.assertNotNull(stamp);
        //
        // Long id = main.callStoredProcedure("Katka");
        // Assert.assertNotNull(id);
    }

    public BankAccountDao getBankAccountDao() {
        return bankAccountDao;
    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public ContactDao getContactDao() {
        return contactDao;
    }

    public CreditCardDao getCreditCardDao() {
        return creditCardDao;
    }

    public LibraryDao getLibraryDao() {
        return libraryDao;
    }

    public MovieDao getMovieDao() {
        return movieDao;
    }

    public PersonDao getPersonDao() {
        return personDao;
    }

    public PerformerDao getPerformerDao() {
        return performerDao;
    }

    public SubscriberDao getSubscriberDao() {
        return subscriberDao;
    }

    public PersonLibraryDao getPersonLibraryDao() {
        return personLibraryDao;
    }

    public PhysicalMediaDao getPhysicalMediaDao() {
        return physicalMediaDao;
    }
}
