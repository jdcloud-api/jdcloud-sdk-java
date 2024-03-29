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

import com.jdcloud.sdk.annotation.Required;

/**
 * schema
 */
public class Schema  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 原数据库名
     * Required:true
     */
    @Required
    private String dbName;

    /**
     * 新数据库名
     * Required:true
     */
    @Required
    private String newDBName;

    /**
     * 原数据库表名
     */
    private String tableName;

    /**
     * 新数据库表名
     */
    private String newTableName;



    /**
     * get 原数据库名
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 原数据库名
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }


    /**
     * get 新数据库名
     *
     * @return
     */
    public String getNewDBName() {
        return newDBName;
    }

    /**
     * set 新数据库名
     *
     * @param newDBName
     */
    public void setNewDBName(String newDBName) {
        this.newDBName = newDBName;
    }


    /**
     * get 原数据库表名
     *
     * @return
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * set 原数据库表名
     *
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


    /**
     * get 新数据库表名
     *
     * @return
     */
    public String getNewTableName() {
        return newTableName;
    }

    /**
     * set 新数据库表名
     *
     * @param newTableName
     */
    public void setNewTableName(String newTableName) {
        this.newTableName = newTableName;
    }



    /**
     * set 原数据库名
     *
     * @param dbName
     */
    public Schema dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }


    /**
     * set 新数据库名
     *
     * @param newDBName
     */
    public Schema newDBName(String newDBName) {
        this.newDBName = newDBName;
        return this;
    }


    /**
     * set 原数据库表名
     *
     * @param tableName
     */
    public Schema tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }


    /**
     * set 新数据库表名
     *
     * @param newTableName
     */
    public Schema newTableName(String newTableName) {
        this.newTableName = newTableName;
        return this;
    }


}