/*
This file is part of Ext JS 4.2

Copyright (c) 2011-2013 Sencha Inc

Contact:  http://www.sencha.com/contact

GNU General Public License Usage
This file may be used under the terms of the GNU General Public License version 3.0 as
published by the Free Software Foundation and appearing in the file LICENSE included in the
packaging of this file.

Please review the following information to ensure the GNU General Public License version 3.0
requirements will be met: http://www.gnu.org/copyleft/gpl.html.

If you are unsure which license is appropriate for your use, please contact the sales department
at http://www.sencha.com/contact.

Build date: 2013-03-11 22:33:40 (aed16176e68b5e8aa1433452b12805c0ad913836)
*/
This file is part of Ext JS 4.2

Copyright (c) 2011-2013 Sencha Inc

Contact:  http://www.sencha.com/contact

GNU General Public License Usage
This file may be used under the terms of the GNU General Public License version 3.0 as
published by the Free Software Foundation and appearing in the file LICENSE included in the
packaging of this file.

Please review the following information to ensure the GNU General Public License version 3.0
requirements will be met: http://www.gnu.org/copyleft/gpl.html.

If you are unsure which license is appropriate for your use, please contact the sales department
at http://www.sencha.com/contact.

Build date: 2013-03-11 22:33:40 (aed16176e68b5e8aa1433452b12805c0ad913836)
*/
Ext.define("ExtThemeNeptune.Component",{override:"Ext.Component",initComponent:function(){this.callParent();if(this.dock&&this.border===undefined){this.border=false}},initStyles:function(){var b=this,a=b.border;if(b.dock){b.border=null}b.callParent(arguments);b.border=a}});Ext.define("ExtThemeNeptune.container.ButtonGroup",{override:"Ext.container.ButtonGroup",usePlainButtons:false});Ext.define("ExtThemeNeptune.form.field.HtmlEditor",{override:"Ext.form.field.HtmlEditor",defaultButtonUI:"plain-toolbar"});Ext.define("ExtThemeNeptune.grid.RowEditor",{override:"Ext.grid.RowEditor",buttonUI:"default-toolbar"});Ext.define("ExtThemeNeptune.layout.component.Dock",{override:"Ext.layout.component.Dock",noBorderClassTable:[0,Ext.baseCSSPrefix+"noborder-l",Ext.baseCSSPrefix+"noborder-b",Ext.baseCSSPrefix+"noborder-bl",Ext.baseCSSPrefix+"noborder-r",Ext.baseCSSPrefix+"noborder-rl",Ext.baseCSSPrefix+"noborder-rb",Ext.baseCSSPrefix+"noborder-rbl",Ext.baseCSSPrefix+"noborder-t",Ext.baseCSSPrefix+"noborder-tl",Ext.baseCSSPrefix+"noborder-tb",Ext.baseCSSPrefix+"noborder-tbl",Ext.baseCSSPrefix+"noborder-tr",Ext.baseCSSPrefix+"noborder-trl",Ext.baseCSSPrefix+"noborder-trb",Ext.baseCSSPrefix+"noborder-trbl"],edgeMasks:{top:8,right:4,bottom:2,left:1},handleItemBorders:function(){var y=this,f=0,z=8,A=4,l=2,e=1,a=y.owner,s=a.bodyBorder,n=a.border,j=y.collapsed,p=y.edgeMasks,k=y.noBorderClassTable,x=a.dockedItems.generation,w,d,v,h,r,m,u,o,g,q,t,c;if(y.initializedBorders===x){return}t=[];c=[];d=y.getBorderCollapseTable();k=y.getBorderClassTable?y.getBorderClassTable():k;y.initializedBorders=x;y.collapsed=false;v=y.getDockedItems();y.collapsed=j;for(r=0,m=v.length;r<m;r++){u=v[r];if(u.ignoreBorderManagement){continue}o=u.dock;q=h=0;t.length=0;c.length=0;if(o!=="bottom"){if(f&z){w=u.border}else{w=n;if(w!==false){h+=z}}if(w===false){q+=z}}if(o!=="left"){if(f&A){w=u.border}else{w=n;if(w!==false){h+=A}}if(w===false){q+=A}}if(o!=="top"){if(f&l){w=u.border}else{w=n;if(w!==false){h+=l}}if(w===false){q+=l}}if(o!=="right"){if(f&e){w=u.border}else{w=n;if(w!==false){h+=e}}if(w===false){q+=e}}if((g=u.lastBorderMask)!==q){u.lastBorderMask=q;if(g){c[0]=k[g]}if(q){t[0]=k[q]}}if((g=u.lastBorderCollapse)!==h){u.lastBorderCollapse=h;if(g){c[c.length]=d[g]}if(h){t[t.length]=d[h]}}if(c.length){u.removeCls(c)}if(t.length){u.addCls(t)}f|=p[o]}q=h=0;t.length=0;c.length=0;if(f&z){w=s}else{w=n;if(w!==false){h+=z}}if(w===false){q+=z}if(f&A){w=s}else{w=n;if(w!==false){h+=A}}if(w===false){q+=A}if(f&l){w=s}else{w=n;if(w!==false){h+=l}}if(w===false){q+=l}if(f&e){w=s}else{w=n;if(w!==false){h+=e}}if(w===false){q+=e}if((g=y.lastBodyBorderMask)!==q){y.lastBodyBorderMask=q;if(g){c[0]=k[g]}if(q){t[0]=k[q]}}if((g=y.lastBodyBorderCollapse)!==h){y.lastBodyBorderCollapse=h;if(g){c[c.length]=d[g]}if(h){t[t.length]=d[h]}}if(c.length){a.removeBodyCls(c)}if(t.length){a.addBodyCls(t)}},onRemove:function(b){var a=b.lastBorderMask;if(!b.isDestroyed&&!b.ignoreBorderManagement&&a){b.lastBorderMask=0;b.removeCls(this.noBorderClassTable[a])}this.callParent([b])}});Ext.define("ExtThemeNeptune.menu.Menu",{override:"Ext.menu.Menu",showSeparator:false});Ext.define("ExtThemeNeptune.menu.Separator",{override:"Ext.menu.Separator",border:true});Ext.define("ExtThemeNeptune.panel.Panel",{override:"Ext.panel.Panel",border:false,bodyBorder:false,initBorderProps:Ext.emptyFn,initBodyBorder:function(){if(this.bodyBorder!==true){this.callParent()}}});Ext.define("ExtThemeNeptune.panel.Table",{override:"Ext.panel.Table",bodyBorder:true});Ext.define("ExtThemeNeptune.panel.Tool",{override:"Ext.panel.Tool",height:16,width:16});Ext.define("ExtThemeNeptune.picker.Month",{override:"Ext.picker.Month",measureMaxHeight:36});Ext.define("ExtThemeNeptune.resizer.Splitter",{override:"Ext.resizer.Splitter",size:8});Ext.define("ExtThemeNeptune.tab.Tab",{override:"Ext.tab.Tab",border:false});Ext.define("ExtThemeNeptune.toolbar.Paging",{override:"Ext.toolbar.Paging",defaultButtonUI:"plain-toolbar"});Ext.define("ExtThemeNeptune.toolbar.Toolbar",{override:"Ext.toolbar.Toolbar",usePlainButtons:false,border:false});Ext.ns('Ext.app');

Ext.app.REMOTING_API = {
  "url" : "http://simple-backend.cfapps.io/router",
  "type" : "remoting",
  "actions" : {
    "authWeb" : [ {
      "name" : "loadAuthRoles",
      "len" : 1
    }, {
      "name" : "createUserRole",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "loadAuthUsers",
      "len" : 1
    }, {
      "name" : "deleteUserRole",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "createAuthRole",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "createAuthUser",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "updateAuthUser",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "deleteAuthRole",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "updateAuthRole",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "loadUserRoles",
      "len" : 1
    }, {
      "name" : "deleteAuthUser",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "updateUserRole",
      "len" : 0,
      "formHandler" : true
    } ],
    "personWeb" : [ {
      "name" : "updateRelative",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "createContact",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "loadContacts",
      "len" : 1
    }, {
      "name" : "loadCountries",
      "len" : 1
    }, {
      "name" : "createPerson",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "updatePerson",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "createRelative",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "loadPeople",
      "len" : 1
    }, {
      "name" : "deleteRelative",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "deleteContact",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "updateContact",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "deletePerson",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "loadRelatives",
      "len" : 1
    } ]
  }
};try {
    Ext.require("Ext.direct.*", function() {
        Ext.direct.Manager.addProvider(Ext.app.REMOTING_API);
        Ext.direct.Manager.on("exception", function(exception) {
            console.error(exception.message);
            Ext.Msg.alert("Error", exception.message);
        });
    });
}
catch (error) {
    console.error(error);
}
/*
 * File: app/model/AuthRole.js
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

Ext.define('Simpleauth.model.AuthRole', {
    extend: 'Ext.data.Model',

    fields: [
        {
            name: 'id',
            type: 'int'
        },
        {
            name: 'version',
            type: 'int'
        },
        {
            name: 'name',
            type: 'string'
        },
        {
            name: 'description',
            type: 'string'
        }
    ]
});/*
 * File: app/model/AuthUser.js
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

Ext.define('Simpleauth.model.AuthUser', {
    extend: 'Ext.data.Model',

    uses: [
        'Simpleauth.model.UserRole'
    ],

    fields: [
        {
            name: 'id',
            type: 'int'
        },
        {
            name: 'version',
            type: 'int'
        },
        {
            name: 'username',
            type: 'string'
        },
        {
            name: 'password',
            type: 'string'
        },
        {
            name: 'name',
            type: 'string'
        },
        {
            name: 'email',
            type: 'string'
        },
        {
            name: 'lastLogin',
            type: 'date'
        }
    ],

    hasMany: {
        associationKey: 'userRoles',
        model: 'Simpleauth.model.UserRole',
        foreignKey: 'authUserId',
        name: 'userRoles'
    }
});/*
 * File: app/model/UserRole.js
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

Ext.define('Simpleauth.model.UserRole', {
    extend: 'Ext.data.Model',

    uses: [
        'Simpleauth.model.AuthRole'
    ],

    fields: [
        {
            name: 'id',
            type: 'int'
        },
        {
            name: 'authUserId',
            type: 'int'
        },
        {
            name: 'version',
            type: 'int'
        },
        {
            mapping: 'authRole.name',
            name: 'name',
            type: 'string'
        },
        {
            mapping: 'authRole.description',
            name: 'description',
            type: 'string'
        }
    ],

    hasOne: {
        associationKey: 'authRole',
        model: 'Simpleauth.model.AuthRole',
        foreignKey: 'authRoleId',
        getterName: 'getAuthRole',
        setterName: 'setAuthRole'
    }
});/*
 * File: app/store/QueryAuthRoles.js
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

Ext.define('Simpleauth.store.QueryAuthRoles', {
    extend: 'Ext.data.Store',

    requires: [
        'Simpleauth.model.AuthRole'
    ],

    constructor: function(cfg) {
        var me = this;
        cfg = cfg || {};
        me.callParent([Ext.apply({
            autoLoad: true,
            model: 'Simpleauth.model.AuthRole',
            storeId: 'MyDirectStore1',
            proxy: {
                type: 'direct',
                directFn: authWeb.loadAuthRoles,
                reader: {
                    type: 'json',
                    root: 'records'
                }
            },
            sorters: {
                property: 'name'
            }
        }, cfg)]);
    }
});/*
 * File: app/store/AuthUsers.js
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

Ext.define('Simpleauth.store.AuthUsers', {
    extend: 'Ext.data.Store',

    requires: [
        'Simpleauth.model.AuthUser'
    ],

    constructor: function(cfg) {
        var me = this;
        cfg = cfg || {};
        me.callParent([Ext.apply({
            autoLoad: true,
            model: 'Simpleauth.model.AuthUser',
            remoteFilter: true,
            storeId: 'AuthUsers',
            proxy: {
                type: 'direct',
                directFn: authWeb.loadAuthUsers,
                reader: {
                    type: 'json',
                    root: 'records'
                }
            },
            listeners: {
                load: {
                    fn: me.fitin,
                    scope: me
                }
            },
            sorters: {
                property: 'username'
            }
        }, cfg)]);
    },

    fitin: function(store, records, successful, eOpts) {
        if (store.currentPage > 1 && !records.length) {
            store.previousPage();
        }   
    }

});/*
 * File: app/store/AuthRoles.js
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

Ext.define('Simpleauth.store.AuthRoles', {
    extend: 'Ext.data.Store',

    requires: [
        'Simpleauth.model.AuthRole'
    ],

    constructor: function(cfg) {
        var me = this;
        cfg = cfg || {};
        me.callParent([Ext.apply({
            autoLoad: true,
            model: 'Simpleauth.model.AuthRole',
            remoteFilter: true,
            storeId: 'AuthRoles',
            proxy: {
                type: 'direct',
                directFn: authWeb.loadAuthRoles,
                reader: {
                    type: 'json',
                    root: 'records'
                }
            },
            listeners: {
                load: {
                    fn: me.fitin,
                    scope: me
                }
            },
            sorters: {
                property: 'name'
            }
        }, cfg)]);
    },

    fitin: function(store, records, successful, eOpts) {
        if (store.currentPage > 1 && !records.length) {
            store.previousPage();
        }   
    }

});/*
 * File: app/store/UserRoles.js
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

Ext.define('Simpleauth.store.UserRoles', {
    extend: 'Ext.data.Store',

    requires: [
        'Simpleauth.model.UserRole'
    ],

    constructor: function(cfg) {
        var me = this;
        cfg = cfg || {};
        me.callParent([Ext.apply({
            model: 'Simpleauth.model.UserRole',
            remoteFilter: true,
            storeId: 'UserRoles',
            proxy: {
                type: 'direct',
                directFn: authWeb.loadUserRoles,
                reader: {
                    type: 'json',
                    root: 'records'
                }
            },
            sorters: {
                property: 'name'
            }
        }, cfg)]);
    }
});/*
 * File: app/view/toolbar/AddRemoveModify.js
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

Ext.define('Simpleauth.view.toolbar.AddRemoveModify', {
    extend: 'Ext.toolbar.Toolbar',
    alias: 'widget.toolbaraddremovemodify',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'button',
                    action: 'create',
                    iconCls: 'icon-add',
                    text: 'Add'
                },
                {
                    xtype: 'button',
                    action: 'delete',
                    iconCls: 'icon-delete',
                    text: 'Remove'
                },
                {
                    xtype: 'button',
                    action: 'update',
                    iconCls: 'icon-edit',
                    text: 'Modify'
                }
            ]
        });

        me.callParent(arguments);
    }

});/*
 * File: app/view/toolbar/OkCancel.js
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

Ext.define('Simpleauth.view.toolbar.OkCancel', {
    extend: 'Ext.toolbar.Toolbar',
    alias: 'widget.toolbarokcancel',

    ui: 'footer',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'button',
                    action: 'submit',
                    width: 70,
                    text: 'OK'
                },
                {
                    xtype: 'button',
                    action: 'cancel',
                    width: 70,
                    text: 'Cancel'
                }
            ]
        });

        me.callParent(arguments);
    }

});/*
 * File: app/view/toolbar/OkCancelReset.js
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

Ext.define('Simpleauth.view.toolbar.OkCancelReset', {
    extend: 'Ext.toolbar.Toolbar',
    alias: 'widget.toolbarokcancelreset',

    ui: 'footer',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'button',
                    action: 'submit',
                    width: 70,
                    text: 'OK'
                },
                {
                    xtype: 'button',
                    action: 'cancel',
                    width: 70,
                    text: 'Cancel'
                },
                {
                    xtype: 'button',
                    action: 'reset',
                    width: 70,
                    text: 'Reset'
                }
            ]
        });

        me.callParent(arguments);
    }

});/*
 * File: app/view/UserList.js
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

Ext.define('Simpleauth.view.UserList', {
    extend: 'Ext.grid.Panel',
    alias: 'widget.userlist',

    requires: [
        'Simpleauth.view.toolbar.AddRemoveModify'
    ],

    id: 'Users',
    title: 'Users',
    store: 'AuthUsers',

    stateful: true,
    stateId: "userlist_state",

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            dockedItems: [
                {
                    xtype: 'toolbaraddremovemodify',
                    dock: 'top'
                },
                {
                    xtype: 'pagingtoolbar',
                    dock: 'bottom',
                    width: 360,
                    displayInfo: true,
                    store: 'AuthUsers'
                }
            ],
            columns: [
                {
                    xtype: 'numbercolumn',
                    hidden: true,
                    dataIndex: 'id',
                    text: 'Id',
                    flex: 1,
                    format: '0'
                },
                {
                    xtype: 'numbercolumn',
                    hidden: true,
                    dataIndex: 'version',
                    text: 'Version',
                    flex: 1,
                    format: '0'
                },
                {
                    xtype: 'gridcolumn',
                    dataIndex: 'username',
                    text: 'Username',
                    flex: 1
                },
                {
                    xtype: 'gridcolumn',
                    hidden: true,
                    dataIndex: 'password',
                    text: 'Password',
                    flex: 1
                },
                {
                    xtype: 'gridcolumn',
                    dataIndex: 'name',
                    text: 'Name',
                    flex: 1
                },
                {
                    xtype: 'gridcolumn',
                    dataIndex: 'email',
                    text: 'Email',
                    flex: 1
                },
                {
                    xtype: 'datecolumn',
                    dataIndex: 'lastLogin',
                    text: 'Last Login',
                    flex: 1
                }
            ]
        });

        me.callParent(arguments);
    }

});
/*
 * File: app/view/RoleList.js
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

Ext.define('Simpleauth.view.RoleList', {
    extend: 'Ext.grid.Panel',
    alias: 'widget.rolelist',

    requires: [
        'Simpleauth.view.toolbar.AddRemoveModify'
    ],

    id: 'Roles',
    title: 'Roles',
    store: 'AuthRoles',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            dockedItems: [
                {
                    xtype: 'toolbaraddremovemodify',
                    dock: 'top'
                },
                {
                    xtype: 'pagingtoolbar',
                    dock: 'bottom',
                    width: 360,
                    displayInfo: true,
                    store: 'AuthRoles'
                }
            ],
            columns: [
                {
                    xtype: 'numbercolumn',
                    hidden: true,
                    dataIndex: 'id',
                    text: 'Id',
                    flex: 1,
                    format: '0'
                },
                {
                    xtype: 'numbercolumn',
                    hidden: true,
                    dataIndex: 'version',
                    text: 'Version',
                    flex: 1,
                    format: '0'
                },
                {
                    xtype: 'gridcolumn',
                    dataIndex: 'name',
                    text: 'Name',
                    flex: 1
                },
                {
                    xtype: 'gridcolumn',
                    dataIndex: 'description',
                    text: 'Description',
                    flex: 2
                }
            ]
        });

        me.callParent(arguments);
    }

});/*
 * File: app/view/UserRoleList.js
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

Ext.define('Simpleauth.view.UserRoleList', {
    extend: 'Ext.grid.Panel',
    alias: 'widget.userrolelist',

    id: 'UserRoleList',
    title: 'User Roles',
    store: 'UserRoles',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            tools: [
                {
                    xtype: 'tool',
                    type: 'refresh'
                }
            ],
            dockedItems: [
                {
                    xtype: 'toolbar',
                    dock: 'top',
                    items: [
                        {
                            xtype: 'button',
                            action: 'createrole',
                            iconCls: 'icon-add',
                            text: 'Add'
                        },
                        {
                            xtype: 'button',
                            action: 'delete',
                            iconCls: 'icon-delete',
                            text: 'Remove'
                        }
                    ]
                }
            ],
            columns: [
                {
                    xtype: 'numbercolumn',
                    hidden: true,
                    dataIndex: 'id',
                    text: 'Id',
                    flex: 1,
                    format: '0'
                },
                {
                    xtype: 'numbercolumn',
                    hidden: true,
                    dataIndex: 'authUserId',
                    text: 'AuthUserId',
                    flex: 1,
                    format: '0'
                },
                {
                    xtype: 'numbercolumn',
                    hidden: true,
                    dataIndex: 'version',
                    text: 'Version',
                    flex: 1,
                    format: '0'
                },
                {
                    xtype: 'gridcolumn',
                    dataIndex: 'name',
                    text: 'Name',
                    flex: 1
                },
                {
                    xtype: 'gridcolumn',
                    dataIndex: 'description',
                    text: 'Description',
                    flex: 2
                }
            ]
        });

        me.callParent(arguments);
    }

});/*
 * File: app/view/Page.js
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

Ext.define('Simpleauth.view.Page', {
    extend: 'Ext.container.Viewport',

    requires: [
        'Simpleauth.view.UserList',
        'Simpleauth.view.UserRoleList',
        'Simpleauth.view.RoleList'
    ],

    id: 'Page',
    layout: {
        type: 'fit'
    },

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'tabpanel',
                    id: 'pages',
                    activeTab: 0,
                    deferredRender: false,
                    plain: true,
                    items: [
                        {
                            xtype: 'panel',
                            layout: {
                                type: 'border'
                            },
                            title: 'Users',
                            items: [
                                {
                                    xtype: 'userlist',
                                    header: false,
                                    flex: 3,
                                    region: 'center',
                                    split: true,
                                    splitterResize: false
                                },
                                {
                                    xtype: 'panel',
                                    flex: 2,
                                    region: 'east',
                                    split: true,
                                    splitterResize: false,
                                    id: 'UserDetail',
                                    width: 150,
                                    title: '',
                                    items: [
                                        {
                                            xtype: 'userrolelist',
                                            frame: true,
                                            margin: 5
                                        }
                                    ]
                                }
                            ]
                        },
                        {
                            xtype: 'panel',
                            layout: {
                                align: 'stretch',
                                type: 'hbox'
                            },
                            title: 'Roles',
                            items: [
                                {
                                    xtype: 'rolelist',
                                    header: false,
                                    flex: 1
                                }
                            ]
                        }
                    ],
                    dockedItems: [
                        {
                            xtype: 'toolbar',
                            dock: 'top',
                            cls: 'thick',
                            hidden: true,
                            itemId: 'main',
                            items: [
                                {
                                    xtype: 'button',
                                    text: 'System',
                                    menu: {
                                        xtype: 'menu',
                                        items: [
                                            {
                                                xtype: 'menuitem',
                                                action: 'quit',
                                                text: 'Quit'
                                            }
                                        ]
                                    }
                                }
                            ]
                        }
                    ]
                }
            ]
        });

        me.callParent(arguments);
    }

});
/*
 * File: app/view/Viewport.js
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

Ext.define('Simpleauth.view.Viewport', {
    extend: 'Simpleauth.view.Page',
    renderTo: Ext.getBody()
});/*
 * File: app/view/UserCreate.js
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

Ext.define('Simpleauth.view.UserCreate', {
    extend: 'Ext.window.Window',

    requires: [
        'Simpleauth.view.toolbar.OkCancelReset'
    ],

    id: 'UserCreate',
    itemId: 'dialog',
    width: 400,
    closeAction: 'hide',
    iconCls: 'icon-add',
    title: 'Add User',
    modal: true,

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    bodyPadding: 10,
                    header: false,
                    title: 'Data',
                    api: { submit: "authWeb.createAuthUser" },
                    standardSubmit: false,
                    trackResetOnLoad: true,
                    items: [
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: 'Username',
                            name: 'username',
                            allowBlank: false
                        },
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: 'Password',
                            name: 'password',
                            inputType: 'password'
                        },
                        {
                            xtype: 'textfield',
                            matchFieldName: 'password',
                            anchor: '100%',
                            fieldLabel: 'Confirm',
                            name: 'passwordCfm',
                            submitValue: false,
                            inputType: 'password',
                            validateBlank: true,
                            vtype: 'match'
                        },
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: 'Name',
                            name: 'name',
                            allowBlank: false
                        },
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: 'Email',
                            name: 'email',
                            vtype: 'email'
                        }
                    ]
                },
                {
                    xtype: 'toolbarokcancelreset'
                }
            ]
        });

        me.callParent(arguments);
    }

});/*
 * File: app/view/UserDelete.js
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

Ext.define('Simpleauth.view.UserDelete', {
    extend: 'Ext.window.Window',

    requires: [
        'Simpleauth.view.toolbar.OkCancel'
    ],

    id: 'UserDelete',
    itemId: 'dialog',
    width: 400,
    closeAction: 'hide',
    iconCls: 'icon-delete',
    title: 'Remove User',
    modal: true,

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    bodyPadding: 10,
                    header: false,
                    title: 'Data',
                    api: { submit: "authWeb.deleteAuthUser" },
                    standardSubmit: false,
                    trackResetOnLoad: true,
                    items: [
                        {
                            xtype: 'numberfield',
                            anchor: '100%',
                            hidden: true,
                            fieldLabel: 'Id',
                            name: 'id',
                            readOnly: true
                        },
                        {
                            xtype: 'numberfield',
                            anchor: '100%',
                            hidden: true,
                            fieldLabel: 'Version',
                            name: 'version',
                            readOnly: true
                        },
                        {
                            xtype: 'displayfield',
                            anchor: '100%',
                            fieldLabel: 'Username',
                            name: 'username'
                        },
                        {
                            xtype: 'displayfield',
                            anchor: '100%',
                            fieldLabel: 'Name',
                            name: 'name'
                        },
                        {
                            xtype: 'displayfield',
                            anchor: '100%',
                            fieldLabel: 'Email',
                            name: 'email'
                        }
                    ]
                },
                {
                    xtype: 'toolbarokcancel'
                }
            ]
        });

        me.callParent(arguments);
    }

});/*
 * File: app/view/UserRoleCreate.js
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

Ext.define('Simpleauth.view.UserRoleCreate', {
    extend: 'Ext.window.Window',

    requires: [
        'Simpleauth.view.toolbar.OkCancelReset'
    ],

    id: 'UserRoleCreate',
    itemId: 'dialog',
    width: 400,
    closeAction: 'hide',
    iconCls: 'icon-add',
    title: 'Add User Role',
    modal: true,

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    bodyPadding: 10,
                    header: false,
                    title: 'Data',
                    api: { submit: "authWeb.createUserRole" },
                    standardSubmit: false,
                    trackResetOnLoad: true,
                    items: [
                        {
                            xtype: 'numberfield',
                            anchor: '100%',
                            hidden: true,
                            fieldLabel: 'User Id',
                            name: 'authUserId',
                            readOnly: true
                        },
                        {
                            xtype: 'combobox',
                            anchor: '100%',
                            fieldLabel: 'Role',
                            name: 'authRole.id',
                            allowBlank: false,
                            displayField: 'name',
                            forceSelection: true,
                            minChars: 1,
                            queryMode: 'local',
                            queryParam: 'name',
                            store: 'QueryAuthRoles',
                            valueField: 'id'
                        }
                    ]
                },
                {
                    xtype: 'toolbarokcancelreset'
                }
            ]
        });

        me.callParent(arguments);
    }

});/*
 * File: app/view/UserRoleDelete.js
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

Ext.define('Simpleauth.view.UserRoleDelete', {
    extend: 'Ext.window.Window',

    requires: [
        'Simpleauth.view.toolbar.OkCancel'
    ],

    id: 'UserRoleDelete',
    itemId: 'dialog',
    width: 400,
    closeAction: 'hide',
    iconCls: 'icon-delete',
    title: 'Remove User Role',
    modal: true,

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    bodyPadding: 10,
                    header: false,
                    title: 'Data',
                    api: { submit: "authWeb.deleteUserRole" },
                    standardSubmit: false,
                    trackResetOnLoad: true,
                    items: [
                        {
                            xtype: 'numberfield',
                            anchor: '100%',
                            hidden: true,
                            fieldLabel: 'Id',
                            name: 'id',
                            readOnly: true
                        },
                        {
                            xtype: 'numberfield',
                            anchor: '100%',
                            hidden: true,
                            fieldLabel: 'Version',
                            name: 'version',
                            readOnly: true
                        },
                        {
                            xtype: 'displayfield',
                            anchor: '100%',
                            fieldLabel: 'Name',
                            name: 'name'
                        },
                        {
                            xtype: 'displayfield',
                            anchor: '100%',
                            fieldLabel: 'Description',
                            name: 'description'
                        }
                    ]
                },
                {
                    xtype: 'toolbarokcancel'
                }
            ]
        });

        me.callParent(arguments);
    }

});/*
 * File: app/view/UserUpdate.js
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

Ext.define('Simpleauth.view.UserUpdate', {
    extend: 'Ext.window.Window',

    requires: [
        'Simpleauth.view.toolbar.OkCancelReset'
    ],

    id: 'UserUpdate',
    itemId: 'dialog',
    width: 400,
    closeAction: 'hide',
    iconCls: 'icon-edit',
    title: 'Modify User',
    modal: true,

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    bodyPadding: 10,
                    header: false,
                    title: 'Data',
                    api: { submit: "authWeb.updateAuthUser" },
                    standardSubmit: false,
                    trackResetOnLoad: true,
                    items: [
                        {
                            xtype: 'numberfield',
                            anchor: '100%',
                            hidden: true,
                            fieldLabel: 'Id',
                            name: 'id',
                            readOnly: true
                        },
                        {
                            xtype: 'numberfield',
                            anchor: '100%',
                            hidden: true,
                            fieldLabel: 'Version',
                            name: 'version',
                            readOnly: true
                        },
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: 'Username',
                            name: 'username',
                            allowBlank: false
                        },
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: 'Password',
                            name: 'password',
                            inputType: 'password'
                        },
                        {
                            xtype: 'textfield',
                            matchFieldName: 'password',
                            anchor: '100%',
                            fieldLabel: 'Confirm',
                            name: 'passwordCfm',
                            submitValue: false,
                            inputType: 'password',
                            validateBlank: true,
                            vtype: 'match'
                        },
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: 'Name',
                            name: 'name',
                            allowBlank: false
                        },
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: 'Email',
                            name: 'email',
                            vtype: 'email'
                        }
                    ]
                },
                {
                    xtype: 'toolbarokcancelreset'
                }
            ]
        });

        me.callParent(arguments);
    }

});/*
 * File: app/view/RoleCreate.js
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

Ext.define('Simpleauth.view.RoleCreate', {
    extend: 'Ext.window.Window',

    requires: [
        'Simpleauth.view.toolbar.OkCancelReset'
    ],

    id: 'RoleCreate',
    itemId: 'dialog',
    width: 400,
    closeAction: 'hide',
    iconCls: 'icon-add',
    title: 'Add Role',
    modal: true,

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    bodyPadding: 10,
                    header: false,
                    title: 'Data',
                    api: { submit: "authWeb.createAuthRole" },
                    standardSubmit: false,
                    trackResetOnLoad: true,
                    items: [
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: 'Name',
                            name: 'name',
                            allowBlank: false
                        },
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: 'Description',
                            name: 'description'
                        }
                    ]
                },
                {
                    xtype: 'toolbarokcancelreset'
                }
            ]
        });

        me.callParent(arguments);
    }

});/*
 * File: app/view/RoleDelete.js
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

Ext.define('Simpleauth.view.RoleDelete', {
    extend: 'Ext.window.Window',

    requires: [
        'Simpleauth.view.toolbar.OkCancel'
    ],

    id: 'RoleDelete',
    itemId: 'dialog',
    width: 400,
    closeAction: 'hide',
    iconCls: 'icon-delete',
    title: 'Remove Role',
    modal: true,

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    bodyPadding: 10,
                    header: false,
                    title: 'Data',
                    api: { submit: "authWeb.deleteAuthRole" },
                    standardSubmit: false,
                    trackResetOnLoad: true,
                    items: [
                        {
                            xtype: 'numberfield',
                            anchor: '100%',
                            hidden: true,
                            fieldLabel: 'Id',
                            name: 'id',
                            readOnly: true
                        },
                        {
                            xtype: 'numberfield',
                            anchor: '100%',
                            hidden: true,
                            fieldLabel: 'Version',
                            name: 'version',
                            readOnly: true
                        },
                        {
                            xtype: 'displayfield',
                            anchor: '100%',
                            fieldLabel: 'Name',
                            name: 'name'
                        },
                        {
                            xtype: 'displayfield',
                            anchor: '100%',
                            fieldLabel: 'Description',
                            name: 'description'
                        }
                    ]
                },
                {
                    xtype: 'toolbarokcancel'
                }
            ]
        });

        me.callParent(arguments);
    }

});/*
 * File: app/view/RoleUpdate.js
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

Ext.define('Simpleauth.view.RoleUpdate', {
    extend: 'Ext.window.Window',

    requires: [
        'Simpleauth.view.toolbar.OkCancelReset'
    ],

    id: 'RoleUpdate',
    itemId: 'dialog',
    width: 400,
    closeAction: 'hide',
    iconCls: 'icon-edit',
    title: 'Modify Role',
    modal: true,

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    bodyPadding: 10,
                    header: false,
                    title: 'Data',
                    api: { submit: "authWeb.updateAuthRole" },
                    standardSubmit: false,
                    trackResetOnLoad: true,
                    items: [
                        {
                            xtype: 'numberfield',
                            anchor: '100%',
                            hidden: true,
                            fieldLabel: 'Id',
                            name: 'id',
                            readOnly: true
                        },
                        {
                            xtype: 'numberfield',
                            anchor: '100%',
                            hidden: true,
                            fieldLabel: 'Version',
                            name: 'version',
                            readOnly: true
                        },
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: 'Name',
                            name: 'name',
                            allowBlank: false
                        },
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: 'Description',
                            name: 'description'
                        }
                    ]
                },
                {
                    xtype: 'toolbarokcancelreset'
                }
            ]
        });

        me.callParent(arguments);
    }

});//TODO: reset selection on load (reload record)

Ext.state.Manager.setProvider(Ext.create('Ext.state.LocalStorageProvider'));

Ext.define("Ext.grid.column.Text", {
    override: "Ext.grid.column.Column",
    /*
    alias: ['widget.textcolumn'],
    alternateClassName: 'Ext.grid.TextColumn',
    */

    defaultRenderer: function(value) {
        return Ext.String.htmlEncode(value);
    }
});

/**
 * Match two fields (passwords)
 */
Ext.apply(Ext.form.VTypes, {
    matchText: "Confirmation does not match intial value",
    match: function(value, field) {
        var field1 = field.up("form").getForm().findField(field.matchFieldName);
        return field1 && field1 != field ? field1.getValue() == value : true;
    }
});

// Mark invalid fields...
//proc to sakra funguje i bez initializace? ...isEnabled() = false
//Ext.QuickTips.init();

/**
 * Static application methods
 */
Ext.ns("Simpleauth");

Ext.applyIf(Simpleauth, {

    /**
     * Role title (name, description...)
     */
    getRoleTitle: function(record) {
        if (record && record.data) {
//TODO
        }
    }
});

Ext.define('Simpleauth.controller.override.Page', {
    override: 'Simpleauth.controller.Page',

    init: function(application) {

        // Document title
        document.title = document.defaultTitle
                = application.title + " " + application.version;

        // Handle application events
        application.on({
            quit: function() {
                var msg = "Do you really want to quit " + application.title + " application?";
                Ext.MessageBox.confirm("Quit Application", msg, function(response) {
                    if (response == "yes") {
                        Ext.getCmp("Page").destroy();
                        document.title = "";
                        window.close();
                    }
                });
            }
        });

        // Handle view events
        this.control({
            "combobox": {
                blur: function(component, e, eOpts) {
                    this.resetComboboxFilter.call(component);
                }
            },
            "#dialog": {
                beforehide: function(component, eOpts) {
                    var form = component.down("form");
                    component.focus(); //blur fields...
                    if (form) {
                        form = form.getForm();
                        form.clearInvalid();
                        form.getFields().each(this.resetComboboxFilter);
                    }
                },
                afterrender: function(component, eOpts) {
                    var form = component.down("form").getForm();
                    component.getEl().on("keyup", function(e) { //submit on ctrl-enter
                        if (e.ctrlKey && e.getKey() == e.ENTER) {
                            if (form.isValid()) {
                                var msg = "Are you sure you are ready to submit this request?";
                                Ext.MessageBox.confirm("Submit request", msg, function(response) {
                                    if (response == "yes") {
                                        form.submit(); 
                                    }
                                });
                            }
                        }
                    });
                }
            },
            "#dialog form": {
                validitychange: function(basic, valid, eOpts) {
//TODO
                },
                beforeaction: function(basic, action, eOpts) {
                    if (!action.form.isValid()) { //stop action...
                        return false;
                    }
                    var dialog = action.form.owner.up("#dialog");
                    dialog.el.mask("Processing...");
                },
                actioncomplete: function(basic, action, eOpts) {
                    var dialog = action.form.owner.up("#dialog");
                    if (dialog.store) { //reload assigned store...
                        dialog.store.reload();
                    }
                    dialog.el.unmask();
                    dialog.close();
                },
                actionfailed: function(basic, action, eOpts) {
                    var dialog = action.form.owner.up("#dialog");
                    dialog.el.unmask();
                }
            },
            "#dialog button[action=submit]": {
                click: function(target, e, eOpts) {
                    target.up("window").down("form").getForm().submit();
                }
            },
            "#dialog button[action=reset]": {
                click: function(target, e, eOpts) {
                    target.up("window").down("form").getForm().reset();
                }
            },
            "#dialog button[action=cancel]": {
                click: function(target, e, eOpts) {
                    target.up("window").close();
                }
            },
            "menuitem[action=quit]": {
                click: function(item, e, eOpts) {
                    application.fireEvent("quit");
                }
            },
            "grid button[action=create]": {
                click: function(target, e, eOpts) {
                    var grid = target.up("grid");
                    grid.fireEvent(target.action, grid);
                }
            },
            "grid button[action=update], grid button[action=delete]": {
                click: function(target, e, eOpts) {
                    var grid = target.up("grid"),
                            record = grid.getSelectionModel().getSelection()[0];
                    if (record) {
                        grid.fireEvent(target.action, grid, record);
                    }
                }
            },
            "grid tool[type=refresh]": {
                click: function(tool, e, eOpts) {
                    var grid = tool.up("grid"), store = grid.getStore();
                    if (store.proxy.extraParams && store.proxy.extraParams.authUserId > -1) {
                        store.reload();
                    }
                }
            },
            "grid": {
                beforerender: function(component, eOpts) {
                    component.store.on({
                        load: function() {
                            var args = [component].concat([].slice.call(arguments));
                            component.fireEventArgs("load", args);

                        }
                    });
                },
                load: function(component, eOpts) {
                    if (component.autoSelect !== false) {
                        var model = component.getSelectionModel();
                        if (model && !model.getSelection().length) {
                            model.select(0);
                        }
                    }
                }
            },
            "#Users": {
                create: function(grid, record) {
                    return this.dialog("UserCreate", grid, record);
                },
                update: function(grid, record) {
                    record = record.copy(); //empty password (keep current)
                    record.set("password", "");
                    record.commit();
                    return this.dialog("UserUpdate", grid, record);
                },
                "delete": function(grid, record) {
                    return this.dialog("UserDelete", grid, record);
                },
                selectionchange: function(view, selections, options) {
                    this.loadUserRoles(selections[0]);
                },
                load: function(grid) {
                    this.loadUserRoles(grid.getSelectionModel().getSelection()[0]);
                }
            },
            "#Roles": {
                create: function(grid, record) {
                    return this.dialog("RoleCreate", grid, record);
                },
                update: function(grid, record) {
                    return this.dialog("RoleUpdate", grid, record);
                },
                "delete": function(grid, record) {
                    return this.dialog("RoleDelete", grid, record);
                },
                load: function() {
                    //Ext.getCmp("UserRoleList").store.reload();
                    Ext.data.StoreManager.lookup("UserRoles").reload();
                    Ext.data.StoreManager.lookup("QueryAuthRoles").reload();
                }
            },
            "#UserRoleList button[action=createrole]": {
                click: function(target, e, eOpts) {
                    var grid = target.up("grid");
                            params = grid.store.proxy.extraParams;
                    if (params.authUserId != undefined) {
                        grid.fireEvent(target.action, grid, params);
                    }
                }
            },
            "#UserRoleList": {
                createrole: function(grid, params) {
                    record = Ext.create("Simpleauth.model.UserRole");
                    record.set("authUserId", params.authUserId);
                    record.commit();
                    return this.dialog("UserRoleCreate", grid, record);
                },
                delete: function(grid, record) {
                    return this.dialog("UserRoleDelete", grid, record);
                }
            }
        });
    },

    loadUserRoles: function(selected) {
        var detail = Ext.getCmp("UserDetail");
        if (selected && selected.data) {
            var grid = Ext.getCmp("UserRoleList"), store = grid.getStore();
            store.proxy.extraParams.authUserId = selected.data.id;
            store.load();
            //grid.setTitle(selected.data.name);
            detail.enable();
        }
        else {
            detail.disable();
        }
    },

    resetComboboxFilter: function() {
        if (this.is("combobox")) {
            var value = this.getValue();
            this.reset();
            this.setValue(value);
        }
    },

    dialog: function(name, grid, record) {
        var dialog = Ext.getCmp(name);
        if (!dialog) { //create dialog...
            dialog = Ext.create("Simpleauth.view." + name);
        }
        if (grid) { //assign store
            dialog.store = grid.getStore();
        }
        if (record) { //load record
            dialog.down("form").loadRecord(record);
        }
        dialog.show();
    }
});

//TODO: reset selection on load (reload record)

Ext.define("Ext.grid.column.Text", {
    override: "Ext.grid.column.Column",
    /*
    alias: ['widget.textcolumn'],
    alternateClassName: 'Ext.grid.TextColumn',
    */

    defaultRenderer: function(value) {
        return Ext.String.htmlEncode(value);
    }
});

/**
 * Match two fields (passwords)
 */
Ext.apply(Ext.form.VTypes, {
    matchText: "Confirmation does not match intial value",
    match: function(value, field) {
        var field1 = field.up("form").getForm().findField(field.matchFieldName);
        return field1 && field1 != field ? field1.getValue() == value : true;
    }
});

// Mark invalid fields...
//proc to sakra funguje i bez initializace? ...isEnabled() = false
//Ext.QuickTips.init();

Ext.define('Simpleauth.controller.override.Page', {
    override: 'Simpleauth.controller.Page',

    init: function(application) {

        // Document title
        document.title = document.defaultTitle
                = application.title + " " + application.version;

        // Handle application events
        application.on({
            quit: function() {
                var msg = "Do you really want to quit " + application.title + " application?";
                Ext.MessageBox.confirm("Quit Application", msg, function(response) {
                    if (response == "yes") {
                        Ext.getCmp("Page").destroy();
                        document.title = "";
                        window.close();
                    }
                });
            }
        });

        // Handle view events
        this.control({
            "combobox": {
                blur: function(component, e, eOpts) {
                    this.resetComboboxFilter.call(component);
                }
            },
            "#dialog": {
                beforehide: function(component, eOpts) {
                    var form = component.down("form");
                    component.focus(); //blur fields...
                    if (form) {
                        form = form.getForm();
                        form.clearInvalid();
                        form.getFields().each(this.resetComboboxFilter);
                    }
                },
                afterrender: function(component, eOpts) {
                    var form = component.down("form").getForm();
                    component.getEl().on("keyup", function(e) { //submit on ctrl-enter
                        if (e.ctrlKey && e.getKey() == e.ENTER) {
                            if (form.isValid()) {
                                var msg = "Are you sure you are ready to submit this request?";
                                Ext.MessageBox.confirm("Submit request", msg, function(response) {
                                    if (response == "yes") {
                                        form.submit(); 
                                    }
                                });
                            }
                        }
                    });
                }
            },
            "#dialog form": {
                validitychange: function(basic, valid, eOpts) {
//TODO
                },
                beforeaction: function(basic, action, eOpts) {
                    if (!action.form.isValid()) { //stop action...
                        return false;
                    }
                    var dialog = action.form.owner.up("#dialog");
                    dialog.mask("Processing...");
                },
                actioncomplete: function(basic, action, eOpts) {
                    var dialog = action.form.owner.up("#dialog");
                    if (dialog.store) { //reload assigned store...
                        dialog.store.reload();
                    }
                    dialog.unmask();
                    dialog.close();
                },
                actionfailed: function(basic, action, eOpts) {
                    var dialog = action.form.owner.up("#dialog");
                    dialog.unmask();
                }
            },
            "#dialog button[action=submit]": {
                click: function(target, e, eOpts) {
                    target.up("window").down("form").getForm().submit();
                }
            },
            "#dialog button[action=reset]": {
                click: function(target, e, eOpts) {
                    target.up("window").down("form").getForm().reset();
                }
            },
            "#dialog button[action=cancel]": {
                click: function(target, e, eOpts) {
                    target.up("window").close();
                }
            },
            "menuitem[action=quit]": {
                click: function(item, e, eOpts) {
                    application.fireEvent("quit");
                }
            },
            "grid button[action=create]": {
                click: function(target, e, eOpts) {
                    var grid = target.up("grid");
                    grid.fireEvent(target.action, grid);
                }
            },
            "grid button[action=update], grid button[action=delete]": {
                click: function(target, e, eOpts) {
                    var grid = target.up("grid"),
                            record = grid.getSelectionModel().getSelection()[0];
                    if (record) {
                        grid.fireEvent(target.action, grid, record);
                    }
                }
            },
            "grid tool[type=refresh]": {
                click: function(tool, e, eOpts) {
                    var grid = tool.up("grid"), store = grid.getStore();
                    if (store.proxy.extraParams && store.proxy.extraParams.authUserId > -1) {
                        store.reload();
                    }
                }
            },
            "grid": {
                beforerender: function(component, eOpts) {
                    component.store.on({
                        load: function() {
                            var args = [component].concat([].slice.call(arguments));
                            component.fireEventArgs("load", args);
                        }
                    });
                }
            },
            "#Users": {
                create: function(grid, record) {
                    return this.dialog("UserCreate", grid, record);
                },
                update: function(grid, record) {
                    record = record.copy(); //empty password (keep current)
                    record.set("password", "");
                    record.commit();
                    return this.dialog("UserUpdate", grid, record);
                },
                "delete": function(grid, record) {
                    return this.dialog("UserDelete", grid, record);
                },
                selectionchange: function(view, selections, options) {
                    this.loadUserRoles(selections[0]);
                },
                load: function(grid) {
                    this.loadUserRoles(grid.getSelectionModel().getSelection()[0]);
                }
            },
            "#UserRoleList button[action=updateroles]": {
                click: function(target, e, eOpts) {
                    var grid = target.up("grid");
                            params = grid.store.proxy.extraParams;
                    if (params.authUserId != undefined) {
                        grid.fireEvent(target.action, grid, params);
                    }
                }
            },
            "#UserRoleList": {
                updateroles: function(grid, params) {
                    return this.dialog("UserRolesUpdate", grid, params);
                },
            },
            "#Roles": {
                create: function(grid, record) {
                    return this.dialog("RoleCreate", grid, record);
                },
                update: function(grid, record) {
                    return this.dialog("RoleUpdate", grid, record);
                },
                "delete": function(grid, record) {
                    return this.dialog("RoleDelete", grid, record);
                },
                load: function() {
                    Ext.getCmp("UserRoleList").store.reload();
                }
            }
        });
    },

    loadUserRoles: function(selected) {
        if (selected && selected.data) {
            var store = Ext.getCmp("UserRoleList").getStore();
            store.proxy.extraParams.authUserId = selected.data.id;
            store.load();
        }
    },

    resetComboboxFilter: function() {
        if (this.is("combobox")) {
            var value = this.getValue();
            this.reset();
            this.setValue(value);
        }
    },

    dialog: function(name, grid, record) {
        var dialog = Ext.getCmp(name);
        if (!dialog) { //create dialog...
            dialog = Ext.create("Simpleauth.view." + name);
        }
        if (grid) { //assign store
            dialog.store = grid.getStore();
        }
        if (record) { //load record
            dialog.down("form").loadRecord(record);
        }
        dialog.show();
    }
});

/*
 * File: app/controller/Page.js
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

Ext.define('Simpleauth.controller.Page', {
    extend: 'Ext.app.Controller',

    requires: [
        'Simpleauth.controller.override.Page'
    ]
});
/*
 * File: app.js
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

//@require @packageOverrides
Ext.Loader.setConfig({
    enabled: true
});

Ext.application({
    title: 'Simple Auth.',
    version: '1.1',
    models: [
        'AuthUser',
        'AuthRole',
        'UserRole'
    ],
    stores: [
        'AuthUsers',
        'AuthRoles',
        'UserRoles',
        'QueryAuthRoles'
    ],
    views: [
        'Page'
    ],
    autoCreateViewport: true,
    controllers: [
        'Page'
    ],
    name: 'Simpleauth'
});