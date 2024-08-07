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
 * 用户管理
 * 用户管理接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.user.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询用户信息
 */
public class DescribeUserResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户Pin
     */
    private String pin;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 用户唯一id
     */
    private String accountId;

    /**
     * 实名认证状态:0-未认证 1-已认证（个人） 2-已认证（企业） 3-已认证（个人和企业）
     */
    private Integer userAuth;



    /**
     * get 用户Pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户Pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 登录名
     *
     * @return
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * set 登录名
     *
     * @param loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }


    /**
     * get 用户唯一id
     *
     * @return
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * set 用户唯一id
     *
     * @param accountId
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }


    /**
     * get 实名认证状态:0-未认证 1-已认证（个人） 2-已认证（企业） 3-已认证（个人和企业）
     *
     * @return
     */
    public Integer getUserAuth() {
        return userAuth;
    }

    /**
     * set 实名认证状态:0-未认证 1-已认证（个人） 2-已认证（企业） 3-已认证（个人和企业）
     *
     * @param userAuth
     */
    public void setUserAuth(Integer userAuth) {
        this.userAuth = userAuth;
    }



    /**
     * set 用户Pin
     *
     * @param pin
     */
    public DescribeUserResult pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 登录名
     *
     * @param loginName
     */
    public DescribeUserResult loginName(String loginName) {
        this.loginName = loginName;
        return this;
    }


    /**
     * set 用户唯一id
     *
     * @param accountId
     */
    public DescribeUserResult accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }


    /**
     * set 实名认证状态:0-未认证 1-已认证（个人） 2-已认证（企业） 3-已认证（个人和企业）
     *
     * @param userAuth
     */
    public DescribeUserResult userAuth(Integer userAuth) {
        this.userAuth = userAuth;
        return this;
    }


}