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

package com.jdcloud.sdk.service.cdn.model;


/**
 * feeDomain
 */
public class FeeDomain  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * domain
     */
    private String domain;

    /**
     * feeType
     */
    private Integer feeType;



    /**
     * get domain
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set domain
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * get feeType
     *
     * @return
     */
    public Integer getFeeType() {
        return feeType;
    }

    /**
     * set feeType
     *
     * @param feeType
     */
    public void setFeeType(Integer feeType) {
        this.feeType = feeType;
    }



    /**
     * set domain
     *
     * @param domain
     */
    public FeeDomain domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * set feeType
     *
     * @param feeType
     */
    public FeeDomain feeType(Integer feeType) {
        this.feeType = feeType;
        return this;
    }


}