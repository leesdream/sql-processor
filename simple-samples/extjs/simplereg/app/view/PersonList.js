/*
 * File: app/view/PersonList.js
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

Ext.define('Simplereg.view.PersonList', {
    extend: 'Ext.grid.Panel',
    alias: 'widget.personlist',

    requires: [
        'Simplereg.view.override.PersonList'
    ],

    frame: true,
    itemId: 'people',
    title: 'People',
    store: 'People',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            dockedItems: [
                {
                    xtype: 'pagingtoolbar',
                    dock: 'bottom',
                    width: 360,
                    displayInfo: true,
                    store: 'People'
                }
            ],
            columns: [
                {
                    xtype: 'numbercolumn',
                    hidden: true,
                    sortable: false,
                    dataIndex: 'id',
                    text: 'Id',
                    flex: 1,
                    format: '0'
                },
                {
                    xtype: 'numbercolumn',
                    hidden: true,
                    sortable: false,
                    dataIndex: 'version',
                    text: 'Version',
                    flex: 1,
                    format: '0'
                },
                {
                    xtype: 'gridcolumn',
                    sortable: false,
                    dataIndex: 'firstName',
                    text: 'First Name',
                    flex: 2
                },
                {
                    xtype: 'gridcolumn',
                    dataIndex: 'lastName',
                    text: 'Last Name',
                    flex: 2
                },
                {
                    xtype: 'datecolumn',
                    sortable: false,
                    dataIndex: 'dateOfBirth',
                    text: 'Date of Birth',
                    flex: 2,
                    format: 'd.m.Y'
                },
                {
                    xtype: 'gridcolumn',
                    sortable: false,
                    dataIndex: 'ssn',
                    text: 'SSN',
                    flex: 2
                },
                {
                    xtype: 'gridcolumn',
                    sortable: false,
                    dataIndex: 'gender',
                    text: 'Gender',
                    flex: 1
                },
                {
                    xtype: 'actioncolumn',
                    hideable: false,
                    flex: 0.1,
                    items: [
                        {
                            handler: function(view, rowIndex, colIndex, item, e, record, row) {
                                var page = Ext.getCmp("page");
                                page.openPersonDetail(record.data.id, record);
                            },
                            action: 'open',
                            iconCls: 'icon-page',
                            tooltip: 'Open Person Detail'
                        }
                    ]
                }
            ]
        });

        me.callParent(arguments);
    }

});