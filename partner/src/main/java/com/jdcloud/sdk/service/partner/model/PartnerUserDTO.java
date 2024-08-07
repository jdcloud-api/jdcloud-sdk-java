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

package com.jdcloud.sdk.service.partner.model;


/**
 * partnerUserDTO
 */
public class PartnerUserDTO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 客户ID
     */
    private String customerId;

    /**
     * pin
     */
    private String pin;

    /**
     * 账户名
     */
    private String loginName;

    /**
     * 1一级渠道商 2二级渠道商 3 一级渠道商客户 4 二级渠道商客户
     */
    private Integer type;

    /**
     * 类型名称
     */
    private String typeName;



    /**
     * get 客户ID
     *
     * @return
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * set 客户ID
     *
     * @param customerId
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


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
     * get 账户名
     *
     * @return
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * set 账户名
     *
     * @param loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }


    /**
     * get 1一级渠道商 2二级渠道商 3 一级渠道商客户 4 二级渠道商客户
     *
     * @return
     */
    public Integer getType() {
        return type;
    }

    /**
     * set 1一级渠道商 2二级渠道商 3 一级渠道商客户 4 二级渠道商客户
     *
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }


    /**
     * get 类型名称
     *
     * @return
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * set 类型名称
     *
     * @param typeName
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }



    /**
     * set 客户ID
     *
     * @param customerId
     */
    public PartnerUserDTO customerId(String customerId) {
        this.customerId = customerId;
        return this;
    }


    /**
     * set pin
     *
     * @param pin
     */
    public PartnerUserDTO pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 账户名
     *
     * @param loginName
     */
    public PartnerUserDTO loginName(String loginName) {
        this.loginName = loginName;
        return this;
    }


    /**
     * set 1一级渠道商 2二级渠道商 3 一级渠道商客户 4 二级渠道商客户
     *
     * @param type
     */
    public PartnerUserDTO type(Integer type) {
        this.type = type;
        return this;
    }


    /**
     * set 类型名称
     *
     * @param typeName
     */
    public PartnerUserDTO typeName(String typeName) {
        this.typeName = typeName;
        return this;
    }


}