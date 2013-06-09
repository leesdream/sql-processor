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

Ext.define('Simplereg.view.PersonDelete', {
    extend: 'Ext.window.Window',

    id: 'PersonDelete',
    width: 400,
    closeAction: 'hide',
    iconCls: 'icon-delete',
    title: 'Remove Person',
    modal: true,

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    defaults: {
                        anchor: '1'
                    },
                    bodyPadding: 10,
                    header: false,
                    title: 'Personal Data',
                    api: { submit: "Simplereg.controller.Person.deletePersonFromDialog" },
                    items: [
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            hidden: true,
                            fieldLabel: 'Id',
                            name: 'id',
                            readOnly: true
                        },
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            hidden: true,
                            fieldLabel: 'Version',
                            name: 'version',
                            readOnly: true
                        },
                        {
                            xtype: 'displayfield',
                            fieldLabel: 'First Name',
                            name: 'firstName'
                        },
                        {
                            xtype: 'displayfield',
                            fieldLabel: 'Last Name',
                            name: 'lastName'
                        },
                        {
                            xtype: 'displayfield',
                            renderer: function(value, displayField) {
                                return Ext.util.Format.dateRenderer('j.n.Y')(value);
                            },
                            fieldLabel: 'Date of Birth',
                            name: 'dateOfBirth'
                        },
                        {
                            xtype: 'displayfield',
                            fieldLabel: 'SSN',
                            name: 'ssn'
                        },
                        {
                            xtype: 'displayfield',
                            fieldLabel: 'Gender',
                            name: 'gender'
                        }
                    ],
                    dockedItems: [
                        {
                            xtype: 'toolbar',
                            dock: 'bottom',
                            items: [
                                {
                                    xtype: 'tbfill'
                                },
                                {
                                    xtype: 'button',
                                    itemId: 'cancel_dialog',
                                    iconCls: 'icon-cancel',
                                    text: 'Cancel'
                                },
                                {
                                    xtype: 'button',
                                    itemId: 'submit_dialog',
                                    iconCls: 'icon-delete',
                                    text: 'Remove Person'
                                }
                            ]
                        }
                    ]
                }
            ]
        });

        me.callParent(arguments);
    },

    bussy: function(msg) {
        var me = this, bussy;

        if (!me.bussyMask) {
            me.bussyMask = new Ext.LoadMask({
                msg: "Processing...",
                target: me
            });
        }

        if (msg == undefined || msg === true) {
            bussy = true;
        }
        else if (!msg) {
            bussy = false;
        }
        else {
            me.bussyMask.msg = msg;
            bussy = true;
        }

        if (bussy) {
            me.bussyMask.show();
        }
        else {
            me.bussyMask.hide();
        }

        return bussy;
    }

});