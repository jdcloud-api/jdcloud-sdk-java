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
 * 数据库备份服务
 * 数据库备份服务接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dbs.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.dbs.model.RestoreSourceEndpoint;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 根据逻辑备份进行全量恢复
 */
public class RestoreLogicalBackupRequest extends JdcloudRequest implements java.io.Serializable {

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
     * 地域代码，取值范围参见[《各地域及可用区对照表》]
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 备份计划ID
     * Required:true
     */
    @Required
    private String backupPlanId;


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
     * get 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 备份计划ID
     *
     * @return
     */
    public String getBackupPlanId() {
        return backupPlanId;
    }

    /**
     * set 备份计划ID
     *
     * @param backupPlanId
     */
    public void setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
    }


    /**
     * set 用于恢复的备份Id，仅限于本备份计划生成的备份
     *
     * @param backupId
     */
    public RestoreLogicalBackupRequest backupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * set 备份实例的数据源信息
     *
     * @param sourceEndpoint
     */
    public RestoreLogicalBackupRequest sourceEndpoint(RestoreSourceEndpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }

    /**
     * set 是否是新建数据源；true：是；false：不是
     *
     * @param createNewEndpoint
     */
    public RestoreLogicalBackupRequest createNewEndpoint(Boolean createNewEndpoint) {
        this.createNewEndpoint = createNewEndpoint;
        return this;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @param regionId
     */
    public RestoreLogicalBackupRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 备份计划ID
     *
     * @param backupPlanId
     */
    public RestoreLogicalBackupRequest backupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }


}