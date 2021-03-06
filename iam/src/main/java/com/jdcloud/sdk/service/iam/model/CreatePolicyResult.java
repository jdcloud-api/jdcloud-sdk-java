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
 * Policy Management
 * Policy Management API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iam.model;

import com.jdcloud.sdk.service.iam.model.Policy;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建策略
 */
public class CreatePolicyResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 策略信息
     */
    private Policy policy;


    /**
     * get 策略信息
     *
     * @return
     */
    public Policy getPolicy() {
        return policy;
    }

    /**
     * set 策略信息
     *
     * @param policy
     */
    public void setPolicy(Policy policy) {
        this.policy = policy;
    }


    /**
     * set 策略信息
     *
     * @param policy
     */
    public CreatePolicyResult policy(Policy policy) {
        this.policy = policy;
        return this;
    }


}