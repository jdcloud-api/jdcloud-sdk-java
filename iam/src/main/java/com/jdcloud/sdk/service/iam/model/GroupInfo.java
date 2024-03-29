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

import java.util.List;
import java.util.ArrayList;

/**
 * groupInfo
 */
public class GroupInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户组ID
     */
    private String groupId;

    /**
     * 用户组名
     */
    private String name;

    /**
     * 京东云资源标识(jrn)
     */
    private String jrn;

    /**
     * description
     */
    private String description;

    /**
     * 用户组创建时间
     */
    private String createTime;

    /**
     * 用户组更新时间
     */
    private String updateTime;

    /**
     * policies
     */
    
    private List<String> policies;


    /**
     * get 用户组ID
     *
     * @return
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * set 用户组ID
     *
     * @param groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }


    /**
     * get 用户组名
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 用户组名
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
     * get description
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set description
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 用户组创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 用户组创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 用户组更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 用户组更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
    * get policies
    *
    * @return
    */
    public List<String> getPolicies() {
        return policies;
    }

    /**
    * set policies
    *
    * @param policies
    */
    public void setPolicies(List<String> policies) {
        this.policies = policies;
    }



    /**
     * set 用户组ID
     *
     * @param groupId
     */
    public GroupInfo groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }


    /**
     * set 用户组名
     *
     * @param name
     */
    public GroupInfo name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 京东云资源标识(jrn)
     *
     * @param jrn
     */
    public GroupInfo jrn(String jrn) {
        this.jrn = jrn;
        return this;
    }


    /**
     * set description
     *
     * @param description
     */
    public GroupInfo description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 用户组创建时间
     *
     * @param createTime
     */
    public GroupInfo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 用户组更新时间
     *
     * @param updateTime
     */
    public GroupInfo updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
    * set policies
    *
    * @param policies
    */
    public GroupInfo policies(List<String> policies) {
        this.policies = policies;
        return this;
    }



    /**
     * add item to policies
     *
     * @param policie
     */
    public void addPolicie(String policie) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policie);
    }
}