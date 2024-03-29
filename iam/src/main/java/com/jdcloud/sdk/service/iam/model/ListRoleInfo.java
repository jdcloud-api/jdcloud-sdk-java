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
 * listRoleInfo
 */
public class ListRoleInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色类型，2-服务相关角色，3-服务角色，4-用户角色
     */
    private Integer type;

    /**
     * 角色信任关系策略
     */
    private String assumeRolePolicyDocument;

    /**
     * 描述，0~1000个字符
     */
    private String description;

    /**
     * 创建角色的时间
     */
    private String createTime;



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
     * get 角色信任关系策略
     *
     * @return
     */
    public String getAssumeRolePolicyDocument() {
        return assumeRolePolicyDocument;
    }

    /**
     * set 角色信任关系策略
     *
     * @param assumeRolePolicyDocument
     */
    public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
    }


    /**
     * get 描述，0~1000个字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述，0~1000个字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
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
     * set 角色名称
     *
     * @param roleName
     */
    public ListRoleInfo roleName(String roleName) {
        this.roleName = roleName;
        return this;
    }


    /**
     * set 角色类型，2-服务相关角色，3-服务角色，4-用户角色
     *
     * @param type
     */
    public ListRoleInfo type(Integer type) {
        this.type = type;
        return this;
    }


    /**
     * set 角色信任关系策略
     *
     * @param assumeRolePolicyDocument
     */
    public ListRoleInfo assumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
        return this;
    }


    /**
     * set 描述，0~1000个字符
     *
     * @param description
     */
    public ListRoleInfo description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 创建角色的时间
     *
     * @param createTime
     */
    public ListRoleInfo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


}