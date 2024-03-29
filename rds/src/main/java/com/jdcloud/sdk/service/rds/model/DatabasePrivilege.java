/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;

/**
 * databasePrivilege
 */
public class DatabasePrivilege  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据库名称
     */
    private String dbName;

    /**
     * 账号对数据库所具有的细粒度权限，权限的具体定义参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     */
    
    private List<String> privileges;
    /**
     * 数据库表的细粒度权限内容
     */
    
    private List<TablePrivilege> tablePrivileges;


    /**
     * get 数据库名称
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 数据库名称
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }


    /**
    * get 账号对数据库所具有的细粒度权限，权限的具体定义参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
    *
    * @return
    */
    public List<String> getPrivileges() {
        return privileges;
    }

    /**
    * set 账号对数据库所具有的细粒度权限，权限的具体定义参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
    *
    * @param privileges
    */
    public void setPrivileges(List<String> privileges) {
        this.privileges = privileges;
    }


    /**
    * get 数据库表的细粒度权限内容
    *
    * @return
    */
    public List<TablePrivilege> getTablePrivileges() {
        return tablePrivileges;
    }

    /**
    * set 数据库表的细粒度权限内容
    *
    * @param tablePrivileges
    */
    public void setTablePrivileges(List<TablePrivilege> tablePrivileges) {
        this.tablePrivileges = tablePrivileges;
    }



    /**
     * set 数据库名称
     *
     * @param dbName
     */
    public DatabasePrivilege dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }


    /**
    * set 账号对数据库所具有的细粒度权限，权限的具体定义参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
    *
    * @param privileges
    */
    public DatabasePrivilege privileges(List<String> privileges) {
        this.privileges = privileges;
        return this;
    }


    /**
    * set 数据库表的细粒度权限内容
    *
    * @param tablePrivileges
    */
    public DatabasePrivilege tablePrivileges(List<TablePrivilege> tablePrivileges) {
        this.tablePrivileges = tablePrivileges;
        return this;
    }



    /**
     * add item to 账号对数据库所具有的细粒度权限，权限的具体定义参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param privilege
     */
    public void addPrivilege(String privilege) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilege);
    }

    /**
     * add item to 数据库表的细粒度权限内容
     *
     * @param tablePrivilege
     */
    public void addTablePrivilege(TablePrivilege tablePrivilege) {
        if (this.tablePrivileges == null) {
            this.tablePrivileges = new ArrayList<>();
        }
        this.tablePrivileges.add(tablePrivilege);
    }
}