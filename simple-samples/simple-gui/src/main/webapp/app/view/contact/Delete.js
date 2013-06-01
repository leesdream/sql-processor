/*
 * File: app/view/PersonDelete.js
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

Ext.define('SimpleWeb.view.contact.Delete', {
    extend : 'Ext.window.Window',

    id : 'ContactDelete',
    width : 400,
    closeAction : 'hide',
    iconCls : 'icon-delete',
    title : 'Delete Contact',
    modal : true,
    y : 100,

    initComponent : function() {
        var me = this;

        Ext.applyIf(me, {
            items : [ {
                xtype : 'form',
                bodyPadding : 10,
                header : false,
                title : 'Contact Data',
                api : {
                    submit : 'simpleService.deleteContact'
                },
                defaults : {
                    anchor : '100%'
                },
                items : [ {
                    xtype : 'textfield',
                    hidden : true,
                    name : 'id',
                    itemId : 'id',
                    fieldLabel : 'id'
                }, {
                    xtype : 'displayfield',
                    hidden : true,
                    name : 'person_id',
                    itemId : 'person_id',
                    fieldLabel : 'Person_Id'
                }, {
                    xtype : 'displayfield',
                    hidden : true,
                    name : 'personId',
                    itemId : 'personId',
                    fieldLabel : 'PersonId'
                }, {
                    xtype : 'displayfield',
                    itemId : 'ctype',
                    name : 'ctype',
                    fieldLabel : 'Type'
                }, {
                    xtype : 'displayfield',
                    itemId : 'address',
                    name : 'address',
                    fieldLabel : 'Address'
                }, {
                    xtype : 'displayfield',
                    itemId : 'phoneNumber',
                    name : 'phoneNumber',
                    fieldLabel : 'Phone Number'
                } ]
            } ],
            dockedItems : [ {
                xtype : 'toolbar',
                dock : 'bottom',
                items : [ {
                    xtype : 'tbfill'
                }, {
                    xtype : 'button',
                    itemId : 'cancel_dialog',
                    text : 'Cancel'
                }, {
                    xtype : 'button',
                    itemId : 'accept_delete_contact',
                    iconCls : 'icon-accept',
                    text : 'Delete Contact'
                } ]
            } ]
        });

        me.callParent(arguments);
    }

});