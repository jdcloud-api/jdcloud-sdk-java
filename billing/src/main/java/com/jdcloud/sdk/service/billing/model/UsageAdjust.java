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

package com.jdcloud.sdk.service.billing.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * usageAdjust
 */
public class UsageAdjust  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品
     * Required:true
     */
    @Required
    private String serviceCode;

    /**
     * 资源ID
     * Required:true
     */
    @Required
    private String resourceId;

    /**
     * 计费项code
     * Required:true
     */
    @Required
    private String property;

    /**
     * 调整金额
     * Required:true
     */
    @Required
    private Double adjustUsage;



    /**
     * get 产品
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * get 资源ID
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源ID
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * get 计费项code
     *
     * @return
     */
    public String getProperty() {
        return property;
    }

    /**
     * set 计费项code
     *
     * @param property
     */
    public void setProperty(String property) {
        this.property = property;
    }


    /**
     * get 调整金额
     *
     * @return
     */
    public Double getAdjustUsage() {
        return adjustUsage;
    }

    /**
     * set 调整金额
     *
     * @param adjustUsage
     */
    public void setAdjustUsage(Double adjustUsage) {
        this.adjustUsage = adjustUsage;
    }



    /**
     * set 产品
     *
     * @param serviceCode
     */
    public UsageAdjust serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set 资源ID
     *
     * @param resourceId
     */
    public UsageAdjust resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }


    /**
     * set 计费项code
     *
     * @param property
     */
    public UsageAdjust property(String property) {
        this.property = property;
        return this;
    }


    /**
     * set 调整金额
     *
     * @param adjustUsage
     */
    public UsageAdjust adjustUsage(Double adjustUsage) {
        this.adjustUsage = adjustUsage;
        return this;
    }


}