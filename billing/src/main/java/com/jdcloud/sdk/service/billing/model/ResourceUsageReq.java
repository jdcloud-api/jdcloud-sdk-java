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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * resourceUsageReq
 */
public class ResourceUsageReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户pin
     * Required:true
     */
    @Required
    private String pin;

    /**
     * 产品线编码
     * Required:true
     */
    @Required
    private String appCode;

    /**
     * 产品编码
     * Required:true
     */
    @Required
    private String serviceCode;

    /**
     * 地域
     * Required:true
     */
    @Required
    private String region;

    /**
     * 资源ID
     * Required:true
     */
    @Required
    private String resourceId;

    /**
     * 开始时间（格式：2021-01-01 00:00:00）
     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 结束时间（格式：2021-01-01 23:59:59）
     * Required:true
     */
    @Required
    private String endTime;

    /**
     * 站点（0：中国站）
     * Required:true
     */
    @Required
    private Integer site;

    /**
     * 计费项
     * Required:true
     */
    @Required
    
    private List<Formula> formula;


    /**
     * get 用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 产品线编码
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set 产品线编码
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }


    /**
     * get 产品编码
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品编码
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
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
     * get 开始时间（格式：2021-01-01 00:00:00）
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 开始时间（格式：2021-01-01 00:00:00）
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 结束时间（格式：2021-01-01 23:59:59）
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 结束时间（格式：2021-01-01 23:59:59）
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * get 站点（0：中国站）
     *
     * @return
     */
    public Integer getSite() {
        return site;
    }

    /**
     * set 站点（0：中国站）
     *
     * @param site
     */
    public void setSite(Integer site) {
        this.site = site;
    }


    /**
    * get 计费项
    *
    * @return
    */
    public List<Formula> getFormula() {
        return formula;
    }

    /**
    * set 计费项
    *
    * @param formula
    */
    public void setFormula(List<Formula> formula) {
        this.formula = formula;
    }



    /**
     * set 用户pin
     *
     * @param pin
     */
    public ResourceUsageReq pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 产品线编码
     *
     * @param appCode
     */
    public ResourceUsageReq appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }


    /**
     * set 产品编码
     *
     * @param serviceCode
     */
    public ResourceUsageReq serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set 地域
     *
     * @param region
     */
    public ResourceUsageReq region(String region) {
        this.region = region;
        return this;
    }


    /**
     * set 资源ID
     *
     * @param resourceId
     */
    public ResourceUsageReq resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }


    /**
     * set 开始时间（格式：2021-01-01 00:00:00）
     *
     * @param startTime
     */
    public ResourceUsageReq startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 结束时间（格式：2021-01-01 23:59:59）
     *
     * @param endTime
     */
    public ResourceUsageReq endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    /**
     * set 站点（0：中国站）
     *
     * @param site
     */
    public ResourceUsageReq site(Integer site) {
        this.site = site;
        return this;
    }


    /**
    * set 计费项
    *
    * @param formula
    */
    public ResourceUsageReq formula(List<Formula> formula) {
        this.formula = formula;
        return this;
    }



    /**
     * add item to 计费项
     *
     * @param formula
     */
    public void addFormula(Formula formula) {
        if (this.formula == null) {
            this.formula = new ArrayList<>();
        }
        this.formula.add(formula);
    }
}