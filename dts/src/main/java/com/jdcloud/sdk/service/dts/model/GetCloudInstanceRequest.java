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
 * 数据传输服务
 * 数据传输服务相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dts.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取云实例详情
 */
public class GetCloudInstanceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例地域
     */
    private String instanceRegion;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》]
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例类型
     * Required:true
     */
    @Required
    private String instanceType;

    /**
     * 实例ID
     * Required:true
     */
    @Required
    private String instanceId;



    /**
     * get 实例地域
     *
     * @return
     */
    public String getInstanceRegion() {
        return instanceRegion;
    }

    /**
     * set 实例地域
     *
     * @param instanceRegion
     */
    public void setInstanceRegion(String instanceRegion) {
        this.instanceRegion = instanceRegion;
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
     * get 实例类型
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例类型
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }


    /**
     * get 实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }



    /**
     * set 实例地域
     *
     * @param instanceRegion
     */
    public GetCloudInstanceRequest instanceRegion(String instanceRegion) {
        this.instanceRegion = instanceRegion;
        return this;
    }


    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @param regionId
     */
    public GetCloudInstanceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 实例类型
     *
     * @param instanceType
     */
    public GetCloudInstanceRequest instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }


    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public GetCloudInstanceRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}