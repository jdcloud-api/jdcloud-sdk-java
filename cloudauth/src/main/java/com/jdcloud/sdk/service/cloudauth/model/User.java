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

package com.jdcloud.sdk.service.cloudauth.model;


/**
 * user
 */
public class User  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pin
     */
    private String pin;

    /**
     * 状态（0  未开通；1 开通中；2 已开通；3 停服）
     */
    private Integer status;

    /**
     * 资源id
     */
    private String resourceId;

    /**
     * 开通时间
     */
    private String applyTime;

    /**
     * 实名信息
     */
    private String name;



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
     * get 状态（0  未开通；1 开通中；2 已开通；3 停服）
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 状态（0  未开通；1 开通中；2 已开通；3 停服）
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * get 开通时间
     *
     * @return
     */
    public String getApplyTime() {
        return applyTime;
    }

    /**
     * set 开通时间
     *
     * @param applyTime
     */
    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }


    /**
     * get 实名信息
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 实名信息
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }



    /**
     * set pin
     *
     * @param pin
     */
    public User pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 状态（0  未开通；1 开通中；2 已开通；3 停服）
     *
     * @param status
     */
    public User status(Integer status) {
        this.status = status;
        return this;
    }


    /**
     * set 资源id
     *
     * @param resourceId
     */
    public User resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }


    /**
     * set 开通时间
     *
     * @param applyTime
     */
    public User applyTime(String applyTime) {
        this.applyTime = applyTime;
        return this;
    }


    /**
     * set 实名信息
     *
     * @param name
     */
    public User name(String name) {
        this.name = name;
        return this;
    }


}