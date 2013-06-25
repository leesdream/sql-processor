/*
 * File: app/model/RelativePerson.js
 *
 * This file was generated by Sencha Architect version 2.2.2.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 4.2.x library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 4.2.x. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('Simplereg.model.RelativePerson', {
    extend: 'Ext.data.Model',

    uses: [
        'Simplereg.model.Person'
    ],

    fields: [
        {
            name: 'id',
            type: 'int'
        },
        {
            name: 'personId',
            type: 'int'
        },
        {
            name: 'version',
            type: 'int'
        },
        {
            name: 'rtype',
            type: 'string'
        },
        {
            name: 'relative',
            type: 'string'
        },
        {
            name: 'relPerson.id',
            type: 'int'
        },
        {
            name: 'relPerson.firstName',
            type: 'string'
        },
        {
            name: 'relPerson.lastName',
            type: 'string'
        },
        {
            dateFormat: 'd.m.Y',
            name: 'relPerson.dateOfBirth',
            type: 'date'
        },
        {
            name: 'relPerson.ssn',
            type: 'string'
        },
        {
            name: 'relPerson.gender',
            type: 'string'
        }
    ],

    belongsTo: {
        associationKey: 'person',
        model: 'Simplereg.model.Person',
        foreignKey: 'person_id',
        getterName: 'setPerson',
        setterName: 'getPerson'
    },

    hasOne: {
        associationKey: 'relPerson',
        model: 'Simplereg.model.Person',
        foreignKey: 'rel_person_id',
        getterName: 'getRelPerson',
        setterName: 'setRelPerson'
    }
});