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

package com.jdcloud.sdk.service.vpc.model;


/**
 * vpcPolicy
 */
public class VpcPolicy  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 策略的Id,全局唯一
     */
    private String vpcPolicyId;

    /**
     * 访问策略名称
     */
    private String vpcPolicyName;

    /**
     * 访问策略所属vpc id
     */
    private String vpcId;

    /**
     * 具体策略内容(格式参考样例)
     */
    private String policyDocument;



    /**
     * get 策略的Id,全局唯一
     *
     * @return
     */
    public String getVpcPolicyId() {
        return vpcPolicyId;
    }

    /**
     * set 策略的Id,全局唯一
     *
     * @param vpcPolicyId
     */
    public void setVpcPolicyId(String vpcPolicyId) {
        this.vpcPolicyId = vpcPolicyId;
    }


    /**
     * get 访问策略名称
     *
     * @return
     */
    public String getVpcPolicyName() {
        return vpcPolicyName;
    }

    /**
     * set 访问策略名称
     *
     * @param vpcPolicyName
     */
    public void setVpcPolicyName(String vpcPolicyName) {
        this.vpcPolicyName = vpcPolicyName;
    }


    /**
     * get 访问策略所属vpc id
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 访问策略所属vpc id
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }


    /**
     * get 具体策略内容(格式参考样例)
     *
     * @return
     */
    public String getPolicyDocument() {
        return policyDocument;
    }

    /**
     * set 具体策略内容(格式参考样例)
     *
     * @param policyDocument
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }



    /**
     * set 策略的Id,全局唯一
     *
     * @param vpcPolicyId
     */
    public VpcPolicy vpcPolicyId(String vpcPolicyId) {
        this.vpcPolicyId = vpcPolicyId;
        return this;
    }


    /**
     * set 访问策略名称
     *
     * @param vpcPolicyName
     */
    public VpcPolicy vpcPolicyName(String vpcPolicyName) {
        this.vpcPolicyName = vpcPolicyName;
        return this;
    }


    /**
     * set 访问策略所属vpc id
     *
     * @param vpcId
     */
    public VpcPolicy vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }


    /**
     * set 具体策略内容(格式参考样例)
     *
     * @param policyDocument
     */
    public VpcPolicy policyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }


}