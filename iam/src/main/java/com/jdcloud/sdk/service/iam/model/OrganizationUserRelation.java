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
 * 组织用户关联子用户信息
 */
public class OrganizationUserRelation  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 组织ID
     */
    private String orgId;

    /**
     * 组织用户标识，如：erp
     */
    private String userId;

    /**
     * 关联的子用户名
     */
    private String subUserName;

    /**
     * 组织部门路径名称
     */
    private String departmentPathName;

    /**
     * 创建时间
     */
    private String createTime;



    /**
     * get 组织ID
     *
     * @return
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * set 组织ID
     *
     * @param orgId
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }


    /**
     * get 组织用户标识，如：erp
     *
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set 组织用户标识，如：erp
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }


    /**
     * get 关联的子用户名
     *
     * @return
     */
    public String getSubUserName() {
        return subUserName;
    }

    /**
     * set 关联的子用户名
     *
     * @param subUserName
     */
    public void setSubUserName(String subUserName) {
        this.subUserName = subUserName;
    }


    /**
     * get 组织部门路径名称
     *
     * @return
     */
    public String getDepartmentPathName() {
        return departmentPathName;
    }

    /**
     * set 组织部门路径名称
     *
     * @param departmentPathName
     */
    public void setDepartmentPathName(String departmentPathName) {
        this.departmentPathName = departmentPathName;
    }


    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }



    /**
     * set 组织ID
     *
     * @param orgId
     */
    public OrganizationUserRelation orgId(String orgId) {
        this.orgId = orgId;
        return this;
    }


    /**
     * set 组织用户标识，如：erp
     *
     * @param userId
     */
    public OrganizationUserRelation userId(String userId) {
        this.userId = userId;
        return this;
    }


    /**
     * set 关联的子用户名
     *
     * @param subUserName
     */
    public OrganizationUserRelation subUserName(String subUserName) {
        this.subUserName = subUserName;
        return this;
    }


    /**
     * set 组织部门路径名称
     *
     * @param departmentPathName
     */
    public OrganizationUserRelation departmentPathName(String departmentPathName) {
        this.departmentPathName = departmentPathName;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createTime
     */
    public OrganizationUserRelation createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


}