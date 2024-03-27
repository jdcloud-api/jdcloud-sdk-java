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
 * User Group Management
 * User Group Management API
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
 * 列举用户组的策略的资源组列表
 */
public class DescribeAttachedGroupPoliciesScopeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 策略ID
     * Required:true
     */
    @Required
    private String policyID;

    /**
     * 滤绑定策略资源组：&quot;Deny&quot; 不允许，Allow 允许，空情况默认不允许，兼容历史数据
     */
    private String filterBindResGroup;

    /**
     * 用户组名称
     * Required:true
     */
    @Required
    private String groupName;



    /**
     * get 策略ID
     *
     * @return
     */
    public String getPolicyID() {
        return policyID;
    }

    /**
     * set 策略ID
     *
     * @param policyID
     */
    public void setPolicyID(String policyID) {
        this.policyID = policyID;
    }


    /**
     * get 滤绑定策略资源组：&quot;Deny&quot; 不允许，Allow 允许，空情况默认不允许，兼容历史数据
     *
     * @return
     */
    public String getFilterBindResGroup() {
        return filterBindResGroup;
    }

    /**
     * set 滤绑定策略资源组：&quot;Deny&quot; 不允许，Allow 允许，空情况默认不允许，兼容历史数据
     *
     * @param filterBindResGroup
     */
    public void setFilterBindResGroup(String filterBindResGroup) {
        this.filterBindResGroup = filterBindResGroup;
    }


    /**
     * get 用户组名称
     *
     * @return
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * set 用户组名称
     *
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }



    /**
     * set 策略ID
     *
     * @param policyID
     */
    public DescribeAttachedGroupPoliciesScopeRequest policyID(String policyID) {
        this.policyID = policyID;
        return this;
    }


    /**
     * set 滤绑定策略资源组：&quot;Deny&quot; 不允许，Allow 允许，空情况默认不允许，兼容历史数据
     *
     * @param filterBindResGroup
     */
    public DescribeAttachedGroupPoliciesScopeRequest filterBindResGroup(String filterBindResGroup) {
        this.filterBindResGroup = filterBindResGroup;
        return this;
    }


    /**
     * set 用户组名称
     *
     * @param groupName
     */
    public DescribeAttachedGroupPoliciesScopeRequest groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }


}