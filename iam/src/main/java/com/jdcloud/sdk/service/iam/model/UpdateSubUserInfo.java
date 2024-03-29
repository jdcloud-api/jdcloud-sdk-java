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
 * updateSubUserInfo
 */
public class UpdateSubUserInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 描述，0~256个字符
     */
    private String description;

    /**
     * 手机号码，区号-手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 姓名
     */
    private String nickName;



    /**
     * get 描述，0~256个字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述，0~256个字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 手机号码，区号-手机号
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * set 手机号码，区号-手机号
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * get 邮箱
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set 邮箱
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * get 姓名
     *
     * @return
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * set 姓名
     *
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }



    /**
     * set 描述，0~256个字符
     *
     * @param description
     */
    public UpdateSubUserInfo description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 手机号码，区号-手机号
     *
     * @param phone
     */
    public UpdateSubUserInfo phone(String phone) {
        this.phone = phone;
        return this;
    }


    /**
     * set 邮箱
     *
     * @param email
     */
    public UpdateSubUserInfo email(String email) {
        this.email = email;
        return this;
    }


    /**
     * set 姓名
     *
     * @param nickName
     */
    public UpdateSubUserInfo nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }


}