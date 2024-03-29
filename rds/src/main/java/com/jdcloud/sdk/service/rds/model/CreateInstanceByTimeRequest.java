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

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.rds.model.RestoredNewDBInstanceSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 根据源实例备份创建一个新实例，并通过追加日志的方式，将新实例的数据恢复到跟源实例指定时间点的数据状态一样。&lt;br&gt;例如根据实例A在“2018-06-18 23:00:00”时间点创建一个实例B，就是新建一个实例B，该实例B的数据跟实例A在“2018-06-18 23:00:00”这个时间点的数据完全一致。&lt;br&gt;对于SQL Server，主备切换后30分钟内，不支持按时间点恢复/创建，例如在10:05分用户进行了主备切换，那么10:05 ~ 10:35这个时间段不能进行按时间点恢复/创建。
 */
public class CreateInstanceByTimeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 根据源实例的哪个时间点创建新实例
     * Required:true
     */
    @Required
    private String restoreTime;

    /**
     * 新建实例规格
     * Required:true
     */
    @Required
    private RestoredNewDBInstanceSpec instanceSpec;

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
     * get 新建实例规格
     *
     * @return
     */
    public RestoredNewDBInstanceSpec getInstanceSpec() {
        return instanceSpec;
    }

    /**
     * set 新建实例规格
     *
     * @param instanceSpec
     */
    public void setInstanceSpec(RestoredNewDBInstanceSpec instanceSpec) {
        this.instanceSpec = instanceSpec;
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
    public CreateInstanceByTimeRequest restoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }


    /**
     * set 新建实例规格
     *
     * @param instanceSpec
     */
    public CreateInstanceByTimeRequest instanceSpec(RestoredNewDBInstanceSpec instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }


    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public CreateInstanceByTimeRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public CreateInstanceByTimeRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}