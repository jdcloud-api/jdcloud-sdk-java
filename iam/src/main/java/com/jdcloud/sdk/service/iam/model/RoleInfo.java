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
 * roleInfo
 */
public class RoleInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    private String roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色类型，2-服务相关角色，3-服务角色，4-用户角色
     */
    private Integer type;

    /**
     * 信任实体信息
     */
    private String assumeRolePolicyDocument;

    /**
     * 描述，0~256个字符
     */
    private String description;

    /**
     * 最大会话时长3600~43200秒，默认3600秒
     */
    private Integer maxSessionDuration;

    /**
     * 京东云资源标识(jrn)
     */
    private String jrn;

    /**
     * 创建角色的时间
     */
    private String createTime;

    /**
     * 角色所属主账号
     */
    private String account;



    /**
     * get 角色ID
     *
     * @return
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * set 角色ID
     *
     * @param roleId
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }


    /**
     * get 角色名称
     *
     * @return
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * set 角色名称
     *
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


    /**
     * get 角色类型，2-服务相关角色，3-服务角色，4-用户角色
     *
     * @return
     */
    public Integer getType() {
        return type;
    }

    /**
     * set 角色类型，2-服务相关角色，3-服务角色，4-用户角色
     *
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }


    /**
     * get 信任实体信息
     *
     * @return
     */
    public String getAssumeRolePolicyDocument() {
        return assumeRolePolicyDocument;
    }

    /**
     * set 信任实体信息
     *
     * @param assumeRolePolicyDocument
     */
    public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
    }


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
     * get 最大会话时长3600~43200秒，默认3600秒
     *
     * @return
     */
    public Integer getMaxSessionDuration() {
        return maxSessionDuration;
    }

    /**
     * set 最大会话时长3600~43200秒，默认3600秒
     *
     * @param maxSessionDuration
     */
    public void setMaxSessionDuration(Integer maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
    }


    /**
     * get 京东云资源标识(jrn)
     *
     * @return
     */
    public String getJrn() {
        return jrn;
    }

    /**
     * set 京东云资源标识(jrn)
     *
     * @param jrn
     */
    public void setJrn(String jrn) {
        this.jrn = jrn;
    }


    /**
     * get 创建角色的时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建角色的时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 角色所属主账号
     *
     * @return
     */
    public String getAccount() {
        return account;
    }

    /**
     * set 角色所属主账号
     *
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }



    /**
     * set 角色ID
     *
     * @param roleId
     */
    public RoleInfo roleId(String roleId) {
        this.roleId = roleId;
        return this;
    }


    /**
     * set 角色名称
     *
     * @param roleName
     */
    public RoleInfo roleName(String roleName) {
        this.roleName = roleName;
        return this;
    }


    /**
     * set 角色类型，2-服务相关角色，3-服务角色，4-用户角色
     *
     * @param type
     */
    public RoleInfo type(Integer type) {
        this.type = type;
        return this;
    }


    /**
     * set 信任实体信息
     *
     * @param assumeRolePolicyDocument
     */
    public RoleInfo assumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
        return this;
    }


    /**
     * set 描述，0~256个字符
     *
     * @param description
     */
    public RoleInfo description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 最大会话时长3600~43200秒，默认3600秒
     *
     * @param maxSessionDuration
     */
    public RoleInfo maxSessionDuration(Integer maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
        return this;
    }


    /**
     * set 京东云资源标识(jrn)
     *
     * @param jrn
     */
    public RoleInfo jrn(String jrn) {
        this.jrn = jrn;
        return this;
    }


    /**
     * set 创建角色的时间
     *
     * @param createTime
     */
    public RoleInfo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 角色所属主账号
     *
     * @param account
     */
    public RoleInfo account(String account) {
        this.account = account;
        return this;
    }


}