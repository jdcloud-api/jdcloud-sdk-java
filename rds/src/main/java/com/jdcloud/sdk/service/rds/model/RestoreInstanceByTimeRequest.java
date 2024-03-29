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
 * 实例管理
 * 实例管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 根据时间点，选择单表恢复当前实例&lt;br&gt;- 仅支持MySQL
 */
public class RestoreInstanceByTimeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 根据源实例的哪个时间点创建新实例
     * Required:true
     */
    @Required
    private String restoreTime;

    /**
     * 需要进行单库，单表恢复的概要信息
     * Required:true
     */
    @Required
    
    private List<Schema> restoreSchema;
    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * RDS 实例ID，唯一标识一个RDS实例
     * Required:true
     */
    @Required
    private String instanceId;



    /**
     * get 根据源实例的哪个时间点创建新实例
     *
     * @return
     */
    public String getRestoreTime() {
        return restoreTime;
    }

    /**
     * set 根据源实例的哪个时间点创建新实例
     *
     * @param restoreTime
     */
    public void setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
    }


    /**
    * get 需要进行单库，单表恢复的概要信息
    *
    * @return
    */
    public List<Schema> getRestoreSchema() {
        return restoreSchema;
    }

    /**
    * set 需要进行单库，单表恢复的概要信息
    *
    * @param restoreSchema
    */
    public void setRestoreSchema(List<Schema> restoreSchema) {
        this.restoreSchema = restoreSchema;
    }


    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get RDS 实例ID，唯一标识一个RDS实例
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }



    /**
     * set 根据源实例的哪个时间点创建新实例
     *
     * @param restoreTime
     */
    public RestoreInstanceByTimeRequest restoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }


    /**
    * set 需要进行单库，单表恢复的概要信息
    *
    * @param restoreSchema
    */
    public RestoreInstanceByTimeRequest restoreSchema(List<Schema> restoreSchema) {
        this.restoreSchema = restoreSchema;
        return this;
    }


    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public RestoreInstanceByTimeRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public RestoreInstanceByTimeRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }



    /**
     * add item to 需要进行单库，单表恢复的概要信息
     *
     * @param restoreSchema
     */
    public void addRestoreSchema(Schema restoreSchema) {
        if (this.restoreSchema == null) {
            this.restoreSchema = new ArrayList<>();
        }
        this.restoreSchema.add(restoreSchema);
    }
}