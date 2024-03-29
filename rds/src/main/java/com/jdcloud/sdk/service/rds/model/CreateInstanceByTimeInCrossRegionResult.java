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
 * 跨地域备份同步服务
 * API related to Relational Database Service
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 根据跨地域备份同步服务时间点创建实例。
 */
public class CreateInstanceByTimeInCrossRegionResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 新创建的实例ID
     */
    private String instanceId;

    /**
     * 订单ID
     */
    private String orderId;



    /**
     * get 新创建的实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 新创建的实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * get 订单ID
     *
     * @return
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * set 订单ID
     *
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }



    /**
     * set 新创建的实例ID
     *
     * @param instanceId
     */
    public CreateInstanceByTimeInCrossRegionResult instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * set 订单ID
     *
     * @param orderId
     */
    public CreateInstanceByTimeInCrossRegionResult orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }


}