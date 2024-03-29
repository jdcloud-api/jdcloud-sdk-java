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

package com.jdcloud.sdk.service.clickhouse.model;


/**
 * account
 */
public class Account  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 账号名
     */
    private String accountName;

    /**
     * 权限
     */
    private String privileges;

    /**
     * 账号状态
     */
    private String accountStatus;

    /**
     * 账号创建时间
     */
    private Integer createTime;


    /**
     * get 账号名
     *
     * @return
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * set 账号名
     *
     * @param accountName
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * get 权限
     *
     * @return
     */
    public String getPrivileges() {
        return privileges;
    }

    /**
     * set 权限
     *
     * @param privileges
     */
    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }

    /**
     * get 账号状态
     *
     * @return
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * set 账号状态
     *
     * @param accountStatus
     */
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * get 账号创建时间
     *
     * @return
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * set 账号创建时间
     *
     * @param createTime
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }


    /**
     * set 账号名
     *
     * @param accountName
     */
    public Account accountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * set 权限
     *
     * @param privileges
     */
    public Account privileges(String privileges) {
        this.privileges = privileges;
        return this;
    }

    /**
     * set 账号状态
     *
     * @param accountStatus
     */
    public Account accountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }

    /**
     * set 账号创建时间
     *
     * @param createTime
     */
    public Account createTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }


}