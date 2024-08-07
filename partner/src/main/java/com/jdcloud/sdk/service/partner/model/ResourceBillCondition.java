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
 * Partner Resource Bill APIs
 * 渠道计费资源账单相关服务
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.partner.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * resourceBillCondition
 */
public class ResourceBillCondition  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 账期，按月：yyyy-MM
     * Required:true
     */
    @Required
    private String billDate;

    /**
     * appCode
     */
    private String appCode;

    /**
     * serviceCode
     */
    private String serviceCode;

    /**
     * 计费类型
     */
    private Integer billingType;

    /**
     * 资源id
     */
    private String resourceId;

    /**
     * 地域
     */
    private String region;

    /**
     * 渠道商客户PIN
     */
    private String pin;

    /**
     * 当前页序号
     */
    private Integer pageIndex;

    /**
     * 每页结果数量
     */
    private Integer pageSize;



    /**
     * get 账期，按月：yyyy-MM
     *
     * @return
     */
    public String getBillDate() {
        return billDate;
    }

    /**
     * set 账期，按月：yyyy-MM
     *
     * @param billDate
     */
    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }


    /**
     * get appCode
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set appCode
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }


    /**
     * get serviceCode
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * get 计费类型
     *
     * @return
     */
    public Integer getBillingType() {
        return billingType;
    }

    /**
     * set 计费类型
     *
     * @param billingType
     */
    public void setBillingType(Integer billingType) {
        this.billingType = billingType;
    }


    /**
     * get 资源id
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源id
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * get 地域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }


    /**
     * get 渠道商客户PIN
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 渠道商客户PIN
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 当前页序号
     *
     * @return
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * set 当前页序号
     *
     * @param pageIndex
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }


    /**
     * get 每页结果数量
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页结果数量
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }



    /**
     * set 账期，按月：yyyy-MM
     *
     * @param billDate
     */
    public ResourceBillCondition billDate(String billDate) {
        this.billDate = billDate;
        return this;
    }


    /**
     * set appCode
     *
     * @param appCode
     */
    public ResourceBillCondition appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }


    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public ResourceBillCondition serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set 计费类型
     *
     * @param billingType
     */
    public ResourceBillCondition billingType(Integer billingType) {
        this.billingType = billingType;
        return this;
    }


    /**
     * set 资源id
     *
     * @param resourceId
     */
    public ResourceBillCondition resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }


    /**
     * set 地域
     *
     * @param region
     */
    public ResourceBillCondition region(String region) {
        this.region = region;
        return this;
    }


    /**
     * set 渠道商客户PIN
     *
     * @param pin
     */
    public ResourceBillCondition pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 当前页序号
     *
     * @param pageIndex
     */
    public ResourceBillCondition pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }


    /**
     * set 每页结果数量
     *
     * @param pageSize
     */
    public ResourceBillCondition pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


}