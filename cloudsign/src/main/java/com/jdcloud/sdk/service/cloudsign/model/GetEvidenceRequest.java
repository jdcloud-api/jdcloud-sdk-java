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
 * 存取证对外开放接口
 * 存取证对外开放接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cloudsign.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 单证据链取证接口
 */
public class GetEvidenceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 业务流水号
     * Required:true
     */
    @Required
    private String businessId;

    /**
     * 存证编号
     * Required:true
     */
    @Required
    private String evidenceId;



    /**
     * get 业务流水号
     *
     * @return
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * set 业务流水号
     *
     * @param businessId
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }


    /**
     * get 存证编号
     *
     * @return
     */
    public String getEvidenceId() {
        return evidenceId;
    }

    /**
     * set 存证编号
     *
     * @param evidenceId
     */
    public void setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
    }



    /**
     * set 业务流水号
     *
     * @param businessId
     */
    public GetEvidenceRequest businessId(String businessId) {
        this.businessId = businessId;
        return this;
    }


    /**
     * set 存证编号
     *
     * @param evidenceId
     */
    public GetEvidenceRequest evidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
        return this;
    }


}