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
 * GPU-Computing-Service
 * GPU算力服务应用订单信息相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.gcs.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 返回订单列表不分页
 */
public class DescribeOrderInfosRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * GCS系统资源实例ID
     */
    private String instanceId;

    /**
     * 主订单编号
     */
    private String orderNumber;

    /**
     * 子订单编号
     */
    private String subOrderNumber;

    /**
     * 订单类型：1-新购|2-续费|3-配置变更
     */
    private String orderType;

    /**
     * 主单打包id号
     */
    private String taskId;

    /**
     * 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get GCS系统资源实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set GCS系统资源实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * get 主订单编号
     *
     * @return
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * set 主订单编号
     *
     * @param orderNumber
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * get 子订单编号
     *
     * @return
     */
    public String getSubOrderNumber() {
        return subOrderNumber;
    }

    /**
     * set 子订单编号
     *
     * @param subOrderNumber
     */
    public void setSubOrderNumber(String subOrderNumber) {
        this.subOrderNumber = subOrderNumber;
    }


    /**
     * get 订单类型：1-新购|2-续费|3-配置变更
     *
     * @return
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * set 订单类型：1-新购|2-续费|3-配置变更
     *
     * @param orderType
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }


    /**
     * get 主单打包id号
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set 主单打包id号
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }


    /**
     * get 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set GCS系统资源实例ID
     *
     * @param instanceId
     */
    public DescribeOrderInfosRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * set 主订单编号
     *
     * @param orderNumber
     */
    public DescribeOrderInfosRequest orderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }


    /**
     * set 子订单编号
     *
     * @param subOrderNumber
     */
    public DescribeOrderInfosRequest subOrderNumber(String subOrderNumber) {
        this.subOrderNumber = subOrderNumber;
        return this;
    }


    /**
     * set 订单类型：1-新购|2-续费|3-配置变更
     *
     * @param orderType
     */
    public DescribeOrderInfosRequest orderType(String orderType) {
        this.orderType = orderType;
        return this;
    }


    /**
     * set 主单打包id号
     *
     * @param taskId
     */
    public DescribeOrderInfosRequest taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }


    /**
     * set 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public DescribeOrderInfosRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}