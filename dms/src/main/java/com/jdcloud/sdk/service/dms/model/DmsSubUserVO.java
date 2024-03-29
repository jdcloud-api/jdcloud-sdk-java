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

package com.jdcloud.sdk.service.dms.model;


/**
 * dmsSubUserVO
 */
public class DmsSubUserVO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 子用户名。
     */
    private String name;

    /**
     * 手机号码。
     */
    private String phone;

    /**
     * 邮箱。
     */
    private String email;

    /**
     * 描述信息。
     */
    private String description;

    /**
     * 主账号。
     */
    private String account;

    /**
     * 子账号pin。
     */
    private String pin;

    /**
     * 用户创建时间。
     */
    private String createTime;

    /**
     * 用户更新时间。
     */
    private String updateTime;



    /**
     * get 子用户名。
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 子用户名。
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 手机号码。
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * set 手机号码。
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * get 邮箱。
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set 邮箱。
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * get 描述信息。
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述信息。
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 主账号。
     *
     * @return
     */
    public String getAccount() {
        return account;
    }

    /**
     * set 主账号。
     *
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }


    /**
     * get 子账号pin。
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 子账号pin。
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 用户创建时间。
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 用户创建时间。
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 用户更新时间。
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 用户更新时间。
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }



    /**
     * set 子用户名。
     *
     * @param name
     */
    public DmsSubUserVO name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 手机号码。
     *
     * @param phone
     */
    public DmsSubUserVO phone(String phone) {
        this.phone = phone;
        return this;
    }


    /**
     * set 邮箱。
     *
     * @param email
     */
    public DmsSubUserVO email(String email) {
        this.email = email;
        return this;
    }


    /**
     * set 描述信息。
     *
     * @param description
     */
    public DmsSubUserVO description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 主账号。
     *
     * @param account
     */
    public DmsSubUserVO account(String account) {
        this.account = account;
        return this;
    }


    /**
     * set 子账号pin。
     *
     * @param pin
     */
    public DmsSubUserVO pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 用户创建时间。
     *
     * @param createTime
     */
    public DmsSubUserVO createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 用户更新时间。
     *
     * @param updateTime
     */
    public DmsSubUserVO updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}