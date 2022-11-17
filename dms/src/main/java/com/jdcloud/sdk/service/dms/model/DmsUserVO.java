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

import java.util.List;
import java.util.ArrayList;

/**
 * dmsUserVO
 */
public class DmsUserVO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名。
     */
    private String username;

    /**
     * 用户pin。
     */
    private String pin;

    /**
     * 用户对应的的主账号的pin。
     */
    private String masterPin;

    /**
     * 用户是否是主账号。
     */
    private String isMaster;

    /**
     * 用户账号Id。
     */
    private Long accountId;

    /**
     * 用户手机号码。
     */
    private String phone;

    /**
     * 用户邮箱。
     */
    private String email;

    /**
     * 用户的启用状态。
     */
    private String activeStatus;

    /**
     * 用户的删除状态。
     */
    private String deleteStatus;

    /**
     * 用户的添加时间，格式为：YYYY-MM-DD HH:mm:ss。
     */
    private String addDate;

    /**
     * 用户的添加时间，格式为：YYYY-MM-DD HH:mm:ss。
     */
    private String loginDate;

    /**
     * 用户的添加时间，格式为：YYYY-MM-DD HH:mm:ss。
     */
    private String createDate;

    /**
     * 用户的添加时间，格式为：YYYY-MM-DD HH:mm:ss。
     */
    private String modifiedDate;

    /**
     * 用户角色列表。
     */
    
    private List<DmsRoleVO> roleVOList;


    /**
     * get 用户名。
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * set 用户名。
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * get 用户pin。
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin。
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 用户对应的的主账号的pin。
     *
     * @return
     */
    public String getMasterPin() {
        return masterPin;
    }

    /**
     * set 用户对应的的主账号的pin。
     *
     * @param masterPin
     */
    public void setMasterPin(String masterPin) {
        this.masterPin = masterPin;
    }


    /**
     * get 用户是否是主账号。
     *
     * @return
     */
    public String getIsMaster() {
        return isMaster;
    }

    /**
     * set 用户是否是主账号。
     *
     * @param isMaster
     */
    public void setIsMaster(String isMaster) {
        this.isMaster = isMaster;
    }


    /**
     * get 用户账号Id。
     *
     * @return
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * set 用户账号Id。
     *
     * @param accountId
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }


    /**
     * get 用户手机号码。
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * set 用户手机号码。
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * get 用户邮箱。
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set 用户邮箱。
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * get 用户的启用状态。
     *
     * @return
     */
    public String getActiveStatus() {
        return activeStatus;
    }

    /**
     * set 用户的启用状态。
     *
     * @param activeStatus
     */
    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }


    /**
     * get 用户的删除状态。
     *
     * @return
     */
    public String getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * set 用户的删除状态。
     *
     * @param deleteStatus
     */
    public void setDeleteStatus(String deleteStatus) {
        this.deleteStatus = deleteStatus;
    }


    /**
     * get 用户的添加时间，格式为：YYYY-MM-DD HH:mm:ss。
     *
     * @return
     */
    public String getAddDate() {
        return addDate;
    }

    /**
     * set 用户的添加时间，格式为：YYYY-MM-DD HH:mm:ss。
     *
     * @param addDate
     */
    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }


    /**
     * get 用户的添加时间，格式为：YYYY-MM-DD HH:mm:ss。
     *
     * @return
     */
    public String getLoginDate() {
        return loginDate;
    }

    /**
     * set 用户的添加时间，格式为：YYYY-MM-DD HH:mm:ss。
     *
     * @param loginDate
     */
    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate;
    }


    /**
     * get 用户的添加时间，格式为：YYYY-MM-DD HH:mm:ss。
     *
     * @return
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * set 用户的添加时间，格式为：YYYY-MM-DD HH:mm:ss。
     *
     * @param createDate
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }


    /**
     * get 用户的添加时间，格式为：YYYY-MM-DD HH:mm:ss。
     *
     * @return
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    /**
     * set 用户的添加时间，格式为：YYYY-MM-DD HH:mm:ss。
     *
     * @param modifiedDate
     */
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
    * get 用户角色列表。
    *
    * @return
    */
    public List<DmsRoleVO> getRoleVOList() {
        return roleVOList;
    }

    /**
    * set 用户角色列表。
    *
    * @param roleVOList
    */
    public void setRoleVOList(List<DmsRoleVO> roleVOList) {
        this.roleVOList = roleVOList;
    }



    /**
     * set 用户名。
     *
     * @param username
     */
    public DmsUserVO username(String username) {
        this.username = username;
        return this;
    }


    /**
     * set 用户pin。
     *
     * @param pin
     */
    public DmsUserVO pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 用户对应的的主账号的pin。
     *
     * @param masterPin
     */
    public DmsUserVO masterPin(String masterPin) {
        this.masterPin = masterPin;
        return this;
    }


    /**
     * set 用户是否是主账号。
     *
     * @param isMaster
     */
    public DmsUserVO isMaster(String isMaster) {
        this.isMaster = isMaster;
        return this;
    }


    /**
     * set 用户账号Id。
     *
     * @param accountId
     */
    public DmsUserVO accountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }


    /**
     * set 用户手机号码。
     *
     * @param phone
     */
    public DmsUserVO phone(String phone) {
        this.phone = phone;
        return this;
    }


    /**
     * set 用户邮箱。
     *
     * @param email
     */
    public DmsUserVO email(String email) {
        this.email = email;
        return this;
    }


    /**
     * set 用户的启用状态。
     *
     * @param activeStatus
     */
    public DmsUserVO activeStatus(String activeStatus) {
        this.activeStatus = activeStatus;
        return this;
    }


    /**
     * set 用户的删除状态。
     *
     * @param deleteStatus
     */
    public DmsUserVO deleteStatus(String deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }


    /**
     * set 用户的添加时间，格式为：YYYY-MM-DD HH:mm:ss。
     *
     * @param addDate
     */
    public DmsUserVO addDate(String addDate) {
        this.addDate = addDate;
        return this;
    }


    /**
     * set 用户的添加时间，格式为：YYYY-MM-DD HH:mm:ss。
     *
     * @param loginDate
     */
    public DmsUserVO loginDate(String loginDate) {
        this.loginDate = loginDate;
        return this;
    }


    /**
     * set 用户的添加时间，格式为：YYYY-MM-DD HH:mm:ss。
     *
     * @param createDate
     */
    public DmsUserVO createDate(String createDate) {
        this.createDate = createDate;
        return this;
    }


    /**
     * set 用户的添加时间，格式为：YYYY-MM-DD HH:mm:ss。
     *
     * @param modifiedDate
     */
    public DmsUserVO modifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }


    /**
    * set 用户角色列表。
    *
    * @param roleVOList
    */
    public DmsUserVO roleVOList(List<DmsRoleVO> roleVOList) {
        this.roleVOList = roleVOList;
        return this;
    }



    /**
     * add item to 用户角色列表。
     *
     * @param roleVOList
     */
    public void addRoleVOList(DmsRoleVO roleVOList) {
        if (this.roleVOList == null) {
            this.roleVOList = new ArrayList<>();
        }
        this.roleVOList.add(roleVOList);
    }
}