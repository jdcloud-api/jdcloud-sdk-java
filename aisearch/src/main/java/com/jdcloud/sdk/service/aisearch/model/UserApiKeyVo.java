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

package com.jdcloud.sdk.service.aisearch.model;


/**
 * userApiKeyVo
 */
public class UserApiKeyVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * apikey编号
     */
    private String keyNo;

    /**
     * api key(加密)
     */
    private String apiKey;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 用户类型:JD_CLOUD
     */
    private String userType;

    /**
     * api key名称
     */
    private String apiKeyName;

    /**
     * 创建时间
     */
    private String createdDate;

    /**
     * 删除标识 1有效 0无效
     */
    private Integer deletedFlag;



    /**
     * get apikey编号
     *
     * @return
     */
    public String getKeyNo() {
        return keyNo;
    }

    /**
     * set apikey编号
     *
     * @param keyNo
     */
    public void setKeyNo(String keyNo) {
        this.keyNo = keyNo;
    }


    /**
     * get api key(加密)
     *
     * @return
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * set api key(加密)
     *
     * @param apiKey
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }


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
     * get 用户类型:JD_CLOUD
     *
     * @return
     */
    public String getUserType() {
        return userType;
    }

    /**
     * set 用户类型:JD_CLOUD
     *
     * @param userType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }


    /**
     * get api key名称
     *
     * @return
     */
    public String getApiKeyName() {
        return apiKeyName;
    }

    /**
     * set api key名称
     *
     * @param apiKeyName
     */
    public void setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
    }


    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * set 创建时间
     *
     * @param createdDate
     */
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * get 删除标识 1有效 0无效
     *
     * @return
     */
    public Integer getDeletedFlag() {
        return deletedFlag;
    }

    /**
     * set 删除标识 1有效 0无效
     *
     * @param deletedFlag
     */
    public void setDeletedFlag(Integer deletedFlag) {
        this.deletedFlag = deletedFlag;
    }



    /**
     * set apikey编号
     *
     * @param keyNo
     */
    public UserApiKeyVo keyNo(String keyNo) {
        this.keyNo = keyNo;
        return this;
    }


    /**
     * set api key(加密)
     *
     * @param apiKey
     */
    public UserApiKeyVo apiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }


    /**
     * set 用户pin
     *
     * @param pin
     */
    public UserApiKeyVo pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 用户类型:JD_CLOUD
     *
     * @param userType
     */
    public UserApiKeyVo userType(String userType) {
        this.userType = userType;
        return this;
    }


    /**
     * set api key名称
     *
     * @param apiKeyName
     */
    public UserApiKeyVo apiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createdDate
     */
    public UserApiKeyVo createdDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }


    /**
     * set 删除标识 1有效 0无效
     *
     * @param deletedFlag
     */
    public UserApiKeyVo deletedFlag(Integer deletedFlag) {
        this.deletedFlag = deletedFlag;
        return this;
    }


}