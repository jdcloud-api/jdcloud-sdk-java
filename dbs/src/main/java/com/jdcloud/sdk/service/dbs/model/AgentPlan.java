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

package com.jdcloud.sdk.service.dbs.model;

import java.util.List;
import java.util.ArrayList;

/**
 * agentPlan
 */
public class AgentPlan  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;

    /**
     * 备份方式
     */
    private String backupType;

    /**
     * schedule
     */
    private AgentBackupSchedule schedule;

    /**
     * datasource
     */
    private AgentDataSource datasource;

    /**
     * databases
     */
    private List<String> databases;

    /**
     * tables
     */
    private List<String> tables;

    /**
     * useBinlog
     */
    private Boolean useBinlog;


    /**
     * get id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 备份方式
     *
     * @return
     */
    public String getBackupType() {
        return backupType;
    }

    /**
     * set 备份方式
     *
     * @param backupType
     */
    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    /**
     * get schedule
     *
     * @return
     */
    public AgentBackupSchedule getSchedule() {
        return schedule;
    }

    /**
     * set schedule
     *
     * @param schedule
     */
    public void setSchedule(AgentBackupSchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * get datasource
     *
     * @return
     */
    public AgentDataSource getDatasource() {
        return datasource;
    }

    /**
     * set datasource
     *
     * @param datasource
     */
    public void setDatasource(AgentDataSource datasource) {
        this.datasource = datasource;
    }

    /**
     * get databases
     *
     * @return
     */
    public List<String> getDatabases() {
        return databases;
    }

    /**
     * set databases
     *
     * @param databases
     */
    public void setDatabases(List<String> databases) {
        this.databases = databases;
    }

    /**
     * get tables
     *
     * @return
     */
    public List<String> getTables() {
        return tables;
    }

    /**
     * set tables
     *
     * @param tables
     */
    public void setTables(List<String> tables) {
        this.tables = tables;
    }

    /**
     * get useBinlog
     *
     * @return
     */
    public Boolean getUseBinlog() {
        return useBinlog;
    }

    /**
     * set useBinlog
     *
     * @param useBinlog
     */
    public void setUseBinlog(Boolean useBinlog) {
        this.useBinlog = useBinlog;
    }


    /**
     * set id
     *
     * @param id
     */
    public AgentPlan id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 备份方式
     *
     * @param backupType
     */
    public AgentPlan backupType(String backupType) {
        this.backupType = backupType;
        return this;
    }

    /**
     * set schedule
     *
     * @param schedule
     */
    public AgentPlan schedule(AgentBackupSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * set datasource
     *
     * @param datasource
     */
    public AgentPlan datasource(AgentDataSource datasource) {
        this.datasource = datasource;
        return this;
    }

    /**
     * set databases
     *
     * @param databases
     */
    public AgentPlan databases(List<String> databases) {
        this.databases = databases;
        return this;
    }

    /**
     * set tables
     *
     * @param tables
     */
    public AgentPlan tables(List<String> tables) {
        this.tables = tables;
        return this;
    }

    /**
     * set useBinlog
     *
     * @param useBinlog
     */
    public AgentPlan useBinlog(Boolean useBinlog) {
        this.useBinlog = useBinlog;
        return this;
    }


    /**
     * add item to databases
     *
     * @param database
     */
    public void addDatabase(String database) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(database);
    }

    /**
     * add item to tables
     *
     * @param table
     */
    public void addTable(String table) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(table);
    }

}