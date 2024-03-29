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
 * yunding-rds
 * 云鼎-云数据库管理相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.yunding.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.yunding.model.Database;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取当前实例的所有数据库详细信息的列表
 */
public class DescribeRdsDatabasesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * databases
     */
    
    private List<Database> databases;
    /**
     * totalCount
     */
    private Integer totalCount;



    /**
    * get databases
    *
    * @return
    */
    public List<Database> getDatabases() {
        return databases;
    }

    /**
    * set databases
    *
    * @param databases
    */
    public void setDatabases(List<Database> databases) {
        this.databases = databases;
    }


    /**
     * get totalCount
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }



    /**
    * set databases
    *
    * @param databases
    */
    public DescribeRdsDatabasesResult databases(List<Database> databases) {
        this.databases = databases;
        return this;
    }


    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribeRdsDatabasesResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }



    /**
     * add item to databases
     *
     * @param database
     */
    public void addDatabase(Database database) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(database);
    }
}