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
 * 为用户组绑定策略
 */
public class AttachGroupPolicyRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 策略名称
     * Required:true
     */
    @Required
    private String policyName;

    /**
     * 资源组id
     */
    private String scopeId;

    /**
     * 允许添加策略绑定：&quot;Deny&quot; 不允许，Allow 允许，空情况默认允许，兼容历史数据
     */
    private String allowAddPolicy;

    /**
     * 用户组名称
     * Required:true
     */
    @Required
    private String groupName;



    /**
     * get 策略名称
     *
     * @return
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * set 策略名称
     *
     * @param policyName
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }


    /**
     * get 资源组id
     *
     * @return
     */
    public String getScopeId() {
        return scopeId;
    }

    /**
     * set 资源组id
     *
     * @param scopeId
     */
    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }


    /**
     * get 允许添加策略绑定：&quot;Deny&quot; 不允许，Allow 允许，空情况默认允许，兼容历史数据
     *
     * @return
     */
    public String getAllowAddPolicy() {
        return allowAddPolicy;
    }

    /**
     * set 允许添加策略绑定：&quot;Deny&quot; 不允许，Allow 允许，空情况默认允许，兼容历史数据
     *
     * @param allowAddPolicy
     */
    public void setAllowAddPolicy(String allowAddPolicy) {
        this.allowAddPolicy = allowAddPolicy;
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
     * set 策略名称
     *
     * @param policyName
     */
    public AttachGroupPolicyRequest policyName(String policyName) {
        this.policyName = policyName;
        return this;
    }


    /**
     * set 资源组id
     *
     * @param scopeId
     */
    public AttachGroupPolicyRequest scopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }


    /**
     * set 允许添加策略绑定：&quot;Deny&quot; 不允许，Allow 允许，空情况默认允许，兼容历史数据
     *
     * @param allowAddPolicy
     */
    public AttachGroupPolicyRequest allowAddPolicy(String allowAddPolicy) {
        this.allowAddPolicy = allowAddPolicy;
        return this;
    }


    /**
     * set 用户组名称
     *
     * @param groupName
     */
    public AttachGroupPolicyRequest groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }


}