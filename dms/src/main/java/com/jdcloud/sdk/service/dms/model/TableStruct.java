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

package com.jdcloud.sdk.service.dms.model;


/**
 * tableStruct
 */
public class TableStruct  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 表名。
     */
    private String tableName;

    /**
     * 建表语句。
     */
    private String tableStruct;


    /**
     * get 表名。
     *
     * @return
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * set 表名。
     *
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * get 建表语句。
     *
     * @return
     */
    public String getTableStruct() {
        return tableStruct;
    }

    /**
     * set 建表语句。
     *
     * @param tableStruct
     */
    public void setTableStruct(String tableStruct) {
        this.tableStruct = tableStruct;
    }


    /**
     * set 表名。
     *
     * @param tableName
     */
    public TableStruct tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * set 建表语句。
     *
     * @param tableStruct
     */
    public TableStruct tableStruct(String tableStruct) {
        this.tableStruct = tableStruct;
        return this;
    }


}