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
 * SubUser Management
 * SubUser Management API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iam.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.iam.model.GroupInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询子用户所属的所有组
 */
public class DescribeSubUserGroupsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * groups
     */
    
    private List<GroupInfo> groups;
    /**
     * total
     */
    private Integer total;



    /**
    * get groups
    *
    * @return
    */
    public List<GroupInfo> getGroups() {
        return groups;
    }

    /**
    * set groups
    *
    * @param groups
    */
    public void setGroups(List<GroupInfo> groups) {
        this.groups = groups;
    }


    /**
     * get total
     *
     * @return
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * set total
     *
     * @param total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }



    /**
    * set groups
    *
    * @param groups
    */
    public DescribeSubUserGroupsResult groups(List<GroupInfo> groups) {
        this.groups = groups;
        return this;
    }


    /**
     * set total
     *
     * @param total
     */
    public DescribeSubUserGroupsResult total(Integer total) {
        this.total = total;
        return this;
    }



    /**
     * add item to groups
     *
     * @param group
     */
    public void addGroup(GroupInfo group) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(group);
    }
}