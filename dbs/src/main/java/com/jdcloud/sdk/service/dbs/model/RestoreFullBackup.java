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

import com.jdcloud.sdk.annotation.Required;

/**
 * restoreFullBackup
 */
public class RestoreFullBackup  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用于恢复的备份Id，仅限于本备份计划生成的备份
     * Required:true
     */
    @Required
    private String backupId;

    /**
     * 备份实例的数据源信息
     * Required:true
     */
    @Required
    private RestoreSourceEndpoint sourceEndpoint;

    /**
     * 是否是新建数据源；true：是；false：不是
     * Required:true
     */
    @Required
    private Boolean createNewEndpoint;


    /**
     * get 用于恢复的备份Id，仅限于本备份计划生成的备份
     *
     * @return
     */
    public String getBackupId() {
        return backupId;
    }

    /**
     * set 用于恢复的备份Id，仅限于本备份计划生成的备份
     *
     * @param backupId
     */
    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * get 备份实例的数据源信息
     *
     * @return
     */
    public RestoreSourceEndpoint getSourceEndpoint() {
        return sourceEndpoint;
    }

    /**
     * set 备份实例的数据源信息
     *
     * @param sourceEndpoint
     */
    public void setSourceEndpoint(RestoreSourceEndpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
    }

    /**
     * get 是否是新建数据源；true：是；false：不是
     *
     * @return
     */
    public Boolean getCreateNewEndpoint() {
        return createNewEndpoint;
    }

    /**
     * set 是否是新建数据源；true：是；false：不是
     *
     * @param createNewEndpoint
     */
    public void setCreateNewEndpoint(Boolean createNewEndpoint) {
        this.createNewEndpoint = createNewEndpoint;
    }


    /**
     * set 用于恢复的备份Id，仅限于本备份计划生成的备份
     *
     * @param backupId
     */
    public RestoreFullBackup backupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * set 备份实例的数据源信息
     *
     * @param sourceEndpoint
     */
    public RestoreFullBackup sourceEndpoint(RestoreSourceEndpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }

    /**
     * set 是否是新建数据源；true：是；false：不是
     *
     * @param createNewEndpoint
     */
    public RestoreFullBackup createNewEndpoint(Boolean createNewEndpoint) {
        this.createNewEndpoint = createNewEndpoint;
        return this;
    }


}