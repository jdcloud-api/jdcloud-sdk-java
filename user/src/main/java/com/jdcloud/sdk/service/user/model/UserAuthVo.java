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


/**
 * userAuthVo
 */
public class UserAuthVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 认证类型：0-未认证 1-个人认证 2-企业认证 3-个人和企业同时认证
     */
    private Integer userAuth;

    /**
     * 企业名称
     */
    private String companyName;

    /**
     * 姓名
     */
    private String name;



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
     * get 认证类型：0-未认证 1-个人认证 2-企业认证 3-个人和企业同时认证
     *
     * @return
     */
    public Integer getUserAuth() {
        return userAuth;
    }

    /**
     * set 认证类型：0-未认证 1-个人认证 2-企业认证 3-个人和企业同时认证
     *
     * @param userAuth
     */
    public void setUserAuth(Integer userAuth) {
        this.userAuth = userAuth;
    }


    /**
     * get 企业名称
     *
     * @return
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * set 企业名称
     *
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    /**
     * get 姓名
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 姓名
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }



    /**
     * set 用户pin
     *
     * @param pin
     */
    public UserAuthVo pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 认证类型：0-未认证 1-个人认证 2-企业认证 3-个人和企业同时认证
     *
     * @param userAuth
     */
    public UserAuthVo userAuth(Integer userAuth) {
        this.userAuth = userAuth;
        return this;
    }


    /**
     * set 企业名称
     *
     * @param companyName
     */
    public UserAuthVo companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }


    /**
     * set 姓名
     *
     * @param name
     */
    public UserAuthVo name(String name) {
        this.name = name;
        return this;
    }


}