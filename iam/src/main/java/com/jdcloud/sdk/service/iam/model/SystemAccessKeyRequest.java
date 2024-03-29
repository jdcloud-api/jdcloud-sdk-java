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
 * Back Management
 * Back Management API
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
 * systemAccessKeyRequest
 */
public class SystemAccessKeyRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * akType
     * Required:true
     */
    @Required
    private String akType;

    /**
     * erp
     * Required:true
     */
    @Required
    private String erp;

    /**
     * serviceCode
     * Required:true
     */
    @Required
    private String serviceCode;

    /**
     * policyContent
     * Required:true
     */
    @Required
    private String policyContent;

    /**
     * systemAccessKey
     * Required:true
     */
    @Required
    private String systemAccessKey;

    /**
     * attachDefaultPolicy
     * Required:true
     */
    @Required
    private Boolean attachDefaultPolicy;



    /**
     * get akType
     *
     * @return
     */
    public String getAkType() {
        return akType;
    }

    /**
     * set akType
     *
     * @param akType
     */
    public void setAkType(String akType) {
        this.akType = akType;
    }


    /**
     * get erp
     *
     * @return
     */
    public String getErp() {
        return erp;
    }

    /**
     * set erp
     *
     * @param erp
     */
    public void setErp(String erp) {
        this.erp = erp;
    }


    /**
     * get serviceCode
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * get policyContent
     *
     * @return
     */
    public String getPolicyContent() {
        return policyContent;
    }

    /**
     * set policyContent
     *
     * @param policyContent
     */
    public void setPolicyContent(String policyContent) {
        this.policyContent = policyContent;
    }


    /**
     * get systemAccessKey
     *
     * @return
     */
    public String getSystemAccessKey() {
        return systemAccessKey;
    }

    /**
     * set systemAccessKey
     *
     * @param systemAccessKey
     */
    public void setSystemAccessKey(String systemAccessKey) {
        this.systemAccessKey = systemAccessKey;
    }


    /**
     * get attachDefaultPolicy
     *
     * @return
     */
    public Boolean getAttachDefaultPolicy() {
        return attachDefaultPolicy;
    }

    /**
     * set attachDefaultPolicy
     *
     * @param attachDefaultPolicy
     */
    public void setAttachDefaultPolicy(Boolean attachDefaultPolicy) {
        this.attachDefaultPolicy = attachDefaultPolicy;
    }



    /**
     * set akType
     *
     * @param akType
     */
    public SystemAccessKeyRequest akType(String akType) {
        this.akType = akType;
        return this;
    }


    /**
     * set erp
     *
     * @param erp
     */
    public SystemAccessKeyRequest erp(String erp) {
        this.erp = erp;
        return this;
    }


    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public SystemAccessKeyRequest serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set policyContent
     *
     * @param policyContent
     */
    public SystemAccessKeyRequest policyContent(String policyContent) {
        this.policyContent = policyContent;
        return this;
    }


    /**
     * set systemAccessKey
     *
     * @param systemAccessKey
     */
    public SystemAccessKeyRequest systemAccessKey(String systemAccessKey) {
        this.systemAccessKey = systemAccessKey;
        return this;
    }


    /**
     * set attachDefaultPolicy
     *
     * @param attachDefaultPolicy
     */
    public SystemAccessKeyRequest attachDefaultPolicy(Boolean attachDefaultPolicy) {
        this.attachDefaultPolicy = attachDefaultPolicy;
        return this;
    }


}