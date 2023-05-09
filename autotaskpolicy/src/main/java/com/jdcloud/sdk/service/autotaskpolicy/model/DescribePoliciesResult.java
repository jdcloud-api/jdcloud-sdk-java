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
 * Policy Scheduler
 * 关于策略调度的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.autotaskpolicy.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.autotaskpolicy.model.Policy;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询策略列表。

 */
public class DescribePoliciesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * policies
     */
    
    private List<Policy> policies;
    /**
     * totalCount
     */
    private Number totalCount;



    /**
    * get policies
    *
    * @return
    */
    public List<Policy> getPolicies() {
        return policies;
    }

    /**
    * set policies
    *
    * @param policies
    */
    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }


    /**
     * get totalCount
     *
     * @return
     */
    public Number getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Number totalCount) {
        this.totalCount = totalCount;
    }



    /**
    * set policies
    *
    * @param policies
    */
    public DescribePoliciesResult policies(List<Policy> policies) {
        this.policies = policies;
        return this;
    }


    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribePoliciesResult totalCount(Number totalCount) {
        this.totalCount = totalCount;
        return this;
    }



    /**
     * add item to policies
     *
     * @param policie
     */
    public void addPolicie(Policy policie) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policie);
    }
}