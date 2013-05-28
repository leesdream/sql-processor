/*
 * File: app/view/PersonView.js
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

Ext.define('SimpleWeb.view.person.Details', {
    extend : 'Ext.panel.Panel',
    alias : 'widget.mypanel6',

    layout : {
        type : 'border'
    },
    header : false,
    title : 'Person',

    initComponent : function() {
        var me = this;

        Ext.applyIf(me, {
            dockedItems : [ {
                xtype : 'toolbar',
                dock : 'top',
                cls : 'line',
                items : [ {
                    xtype : 'button',
                    itemId : 'search_person',
                    iconCls : 'icon-search',
                    text : 'Search'
                }, {
                    xtype : 'tbseparator'
                }, {
                    xtype : 'button',
                    itemId : 'add_person',
                    iconCls : 'icon-add',
                    text : 'Add'
                }, {
                    xtype : 'button',
                    itemId : 'delete_person',
                    iconCls : 'icon-delete',
                    text : 'Delete'
                } ]
            } ],
            items : [ {
                xtype : 'panel',
                flex : 1,
                region : 'west',
                split : false,
                width : 150,
                layout : {
                    type : 'anchor'
                },
                bodyPadding : 10,
                header : false,
                title : 'Person Detail',
                items : [ {
                    xtype : 'fieldset',
                    layout : {
                        type : 'auto'
                    },
                    title : 'Personal Data',
                    items : [ {
                        xtype : 'displayfield',
                        itemId : 'firstName',
                        fieldLabel : 'First Name'
                    }, {
                        xtype : 'displayfield',
                        itemId : 'lastName',
                        fieldLabel : 'Last Name'
                    }, {
                        xtype : 'displayfield',
                        renderer : function(value, displayField) {
                            return Ext.util.Format.dateRenderer('d.m.Y')(value)
                        },
                        itemId : 'dateOfBirth',
                        fieldLabel : 'Date of Birth'
                    }, {
                        xtype : 'displayfield',
                        itemId : 'ssn',
                        fieldLabel : 'SSN'
                    }, {
                        xtype : 'displayfield',
                        itemId : 'gender',
                        fieldLabel : 'Gender'
                    }, {
                        xtype : 'toolbar',
                        items : [ {
                            xtype : 'button',
                            itemId : 'modify_person',
                            iconCls : 'icon-edit',
                            text : 'Modify'
                        } ]
                    } ]
                } ]
            }, {
                xtype : 'panel',
                flex : 1,
                region : 'center',
                bodyPadding : 10,
                header : false,
                title : 'Person Subdetails',
                items : [ {
                    xtype : 'fieldset',
                    title : 'Person Contacts',
                    items : [ {
                        xtype : 'gridpanel',
                        itemId : 'contact_list',
                        header : false,
                        title : 'Contact List',
                        store : me.initialConfig.store,
                        columns : [ {
                            xtype : 'numbercolumn',
                            hidden : true,
                            dataIndex : 'id',
                            text : 'Id',
                            format : '0'
                        }, {
                            xtype : 'numbercolumn',
                            hidden : true,
                            enableColumnHide : false,
                            dataIndex : 'personId',
                            text : 'PersonId',
                            flex : 1
                        }, {
                            xtype : 'gridcolumn',
                            dataIndex : 'ctype',
                            text : 'Type',
                            flex : 1
                        }, {
                            xtype : 'gridcolumn',
                            dataIndex : 'address',
                            text : 'Address',
                            flex : 2
                        }, {
                            xtype : 'gridcolumn',
                            dataIndex : 'phoneNumber',
                            text : 'Phone'
                        } ]
                    }, {
                        xtype : 'toolbar',
                        disabled : true,
                        items : [ {
                            xtype : 'button',
                            iconCls : 'icon-add',
                            text : 'Add'
                        }, {
                            xtype : 'button',
                            iconCls : 'icon-delete',
                            text : 'Delete'
                        }, {
                            xtype : 'button',
                            iconCls : 'icon-edit',
                            text : 'Modify'
                        } ]
                    } ]
                } ]
            } ]
        });
        me.callParent(arguments);
    },

    onDestroy : function() {
        var me = this;
        console.log("godd-bye details");
        console.log(me.itemId);
        var store = Ext.data.StoreManager.lookup(me.itemId);
        console.log(store);
        if (store)
            Ext.data.StoreManager.unregister(store);
        me.callParent(arguments);
    }
});