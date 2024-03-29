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
 * Permission Management
 * Permission Management API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iam.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 为子用户解绑策略
 */
public class RemovePermissionOfSubUserRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 权限id
     * Required:true
     */
    @Required
    private Integer permissionId;

    /**
     * 子用户用户名
     * Required:true
     */
    @Required
    private String subUser;



    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 权限id
     *
     * @return
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * set 权限id
     *
     * @param permissionId
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }


    /**
     * get 子用户用户名
     *
     * @return
     */
    public String getSubUser() {
        return subUser;
    }

    /**
     * set 子用户用户名
     *
     * @param subUser
     */
    public void setSubUser(String subUser) {
        this.subUser = subUser;
    }



    /**
     * set Region ID
     *
     * @param regionId
     */
    public RemovePermissionOfSubUserRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 权限id
     *
     * @param permissionId
     */
    public RemovePermissionOfSubUserRequest permissionId(Integer permissionId) {
        this.permissionId = permissionId;
        return this;
    }


    /**
     * set 子用户用户名
     *
     * @param subUser
     */
    public RemovePermissionOfSubUserRequest subUser(String subUser) {
        this.subUser = subUser;
        return this;
    }


}