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

package com.jdcloud.sdk.service.iam.model;


/**
 * serviceInfo
 */
public class ServiceInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品线编码
     */
    private String serviceCode;

    /**
     * 中文名称
     */
    private String cnName;

    /**
     * 英文名称
     */
    private String enName;

    /**
     * 可用区信息
     */
    private String region;

    /**
     * 接入时间
     */
    private String createTime;

    /**
     * 操作人erp
     */
    private String createUser;

    /**
     * 是否可删除
     */
    private Boolean canDelete;



    /**
     * get 产品线编码
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品线编码
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * get 中文名称
     *
     * @return
     */
    public String getCnName() {
        return cnName;
    }

    /**
     * set 中文名称
     *
     * @param cnName
     */
    public void setCnName(String cnName) {
        this.cnName = cnName;
    }


    /**
     * get 英文名称
     *
     * @return
     */
    public String getEnName() {
        return enName;
    }

    /**
     * set 英文名称
     *
     * @param enName
     */
    public void setEnName(String enName) {
        this.enName = enName;
    }


    /**
     * get 可用区信息
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 可用区信息
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }


    /**
     * get 接入时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 接入时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 操作人erp
     *
     * @return
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * set 操作人erp
     *
     * @param createUser
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }


    /**
     * get 是否可删除
     *
     * @return
     */
    public Boolean getCanDelete() {
        return canDelete;
    }

    /**
     * set 是否可删除
     *
     * @param canDelete
     */
    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }



    /**
     * set 产品线编码
     *
     * @param serviceCode
     */
    public ServiceInfo serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set 中文名称
     *
     * @param cnName
     */
    public ServiceInfo cnName(String cnName) {
        this.cnName = cnName;
        return this;
    }


    /**
     * set 英文名称
     *
     * @param enName
     */
    public ServiceInfo enName(String enName) {
        this.enName = enName;
        return this;
    }


    /**
     * set 可用区信息
     *
     * @param region
     */
    public ServiceInfo region(String region) {
        this.region = region;
        return this;
    }


    /**
     * set 接入时间
     *
     * @param createTime
     */
    public ServiceInfo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 操作人erp
     *
     * @param createUser
     */
    public ServiceInfo createUser(String createUser) {
        this.createUser = createUser;
        return this;
    }


    /**
     * set 是否可删除
     *
     * @param canDelete
     */
    public ServiceInfo canDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }


}