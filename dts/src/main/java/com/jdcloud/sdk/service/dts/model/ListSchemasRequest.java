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

import com.jdcloud.sdk.service.dts.model.TransmissionEndpoint;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取Schema列表
 */
public class ListSchemasRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订阅任务ID，配置订阅任务时，此项必填。
     */
    private String taskId;

    /**
     * 数据库名称，此项选填。
     */
    private String databaseName;

    /**
     * 实例信息
     * Required:true
     */
    @Required
    private TransmissionEndpoint endpoint;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》]
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * DTS连接模板ID
     * Required:true
     */
    @Required
    private String endpointId;



    /**
     * get 订阅任务ID，配置订阅任务时，此项必填。
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set 订阅任务ID，配置订阅任务时，此项必填。
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }


    /**
     * get 数据库名称，此项选填。
     *
     * @return
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * set 数据库名称，此项选填。
     *
     * @param databaseName
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }


    /**
     * get 实例信息
     *
     * @return
     */
    public TransmissionEndpoint getEndpoint() {
        return endpoint;
    }

    /**
     * set 实例信息
     *
     * @param endpoint
     */
    public void setEndpoint(TransmissionEndpoint endpoint) {
        this.endpoint = endpoint;
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
     * get DTS连接模板ID
     *
     * @return
     */
    public String getEndpointId() {
        return endpointId;
    }

    /**
     * set DTS连接模板ID
     *
     * @param endpointId
     */
    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }



    /**
     * set 订阅任务ID，配置订阅任务时，此项必填。
     *
     * @param taskId
     */
    public ListSchemasRequest taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }


    /**
     * set 数据库名称，此项选填。
     *
     * @param databaseName
     */
    public ListSchemasRequest databaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }


    /**
     * set 实例信息
     *
     * @param endpoint
     */
    public ListSchemasRequest endpoint(TransmissionEndpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }


    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @param regionId
     */
    public ListSchemasRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set DTS连接模板ID
     *
     * @param endpointId
     */
    public ListSchemasRequest endpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }


}