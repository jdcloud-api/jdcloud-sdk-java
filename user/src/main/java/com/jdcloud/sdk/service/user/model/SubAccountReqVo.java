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

package com.jdcloud.sdk.service.user.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * subAccountReqVo
 */
public class SubAccountReqVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主账号
     * Required:true
     */
    @Required
    private String account;

    /**
     * 子账号
     * Required:true
     */
    @Required
    private String subUser;

    /**
     * 密码
     * Required:true
     */
    @Required
    private String password;



    /**
     * get 主账号
     *
     * @return
     */
    public String getAccount() {
        return account;
    }

    /**
     * set 主账号
     *
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }


    /**
     * get 子账号
     *
     * @return
     */
    public String getSubUser() {
        return subUser;
    }

    /**
     * set 子账号
     *
     * @param subUser
     */
    public void setSubUser(String subUser) {
        this.subUser = subUser;
    }


    /**
     * get 密码
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set 密码
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }



    /**
     * set 主账号
     *
     * @param account
     */
    public SubAccountReqVo account(String account) {
        this.account = account;
        return this;
    }


    /**
     * set 子账号
     *
     * @param subUser
     */
    public SubAccountReqVo subUser(String subUser) {
        this.subUser = subUser;
        return this;
    }


    /**
     * set 密码
     *
     * @param password
     */
    public SubAccountReqVo password(String password) {
        this.password = password;
        return this;
    }


}