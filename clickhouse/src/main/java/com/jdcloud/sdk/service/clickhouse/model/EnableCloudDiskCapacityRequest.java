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

package com.jdcloud.sdk.service.clickhouse.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 开启数据库的云盘扩容功能
 */
public class EnableCloudDiskCapacityRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pin
     * Required:true
     */
    @Required
    private String pin;

    /**
     * instanceId
     */
    private String instanceId;

    /**
     * 地域代码
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get instanceId
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set instanceId
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 地域代码
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set pin
     *
     * @param pin
     */
    public EnableCloudDiskCapacityRequest pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set instanceId
     *
     * @param instanceId
     */
    public EnableCloudDiskCapacityRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public EnableCloudDiskCapacityRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}