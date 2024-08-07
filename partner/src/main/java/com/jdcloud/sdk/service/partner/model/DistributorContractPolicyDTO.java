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

package com.jdcloud.sdk.service.partner.model;


/**
 * distributorContractPolicyDTO
 */
public class DistributorContractPolicyDTO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Number id;

    /**
     * 服务商pin
     */
    private String distributorPin;

    /**
     * 服务商主协议PIN(1是0否)
     */
    private Integer mainFlag;

    /**
     * 服务商政策ID
     */
    private String returnPolicyId;

    /**
     * 服务商政策名称
     */
    private String returnPolicyName;



    /**
     * get ID
     *
     * @return
     */
    public Number getId() {
        return id;
    }

    /**
     * set ID
     *
     * @param id
     */
    public void setId(Number id) {
        this.id = id;
    }


    /**
     * get 服务商pin
     *
     * @return
     */
    public String getDistributorPin() {
        return distributorPin;
    }

    /**
     * set 服务商pin
     *
     * @param distributorPin
     */
    public void setDistributorPin(String distributorPin) {
        this.distributorPin = distributorPin;
    }


    /**
     * get 服务商主协议PIN(1是0否)
     *
     * @return
     */
    public Integer getMainFlag() {
        return mainFlag;
    }

    /**
     * set 服务商主协议PIN(1是0否)
     *
     * @param mainFlag
     */
    public void setMainFlag(Integer mainFlag) {
        this.mainFlag = mainFlag;
    }


    /**
     * get 服务商政策ID
     *
     * @return
     */
    public String getReturnPolicyId() {
        return returnPolicyId;
    }

    /**
     * set 服务商政策ID
     *
     * @param returnPolicyId
     */
    public void setReturnPolicyId(String returnPolicyId) {
        this.returnPolicyId = returnPolicyId;
    }


    /**
     * get 服务商政策名称
     *
     * @return
     */
    public String getReturnPolicyName() {
        return returnPolicyName;
    }

    /**
     * set 服务商政策名称
     *
     * @param returnPolicyName
     */
    public void setReturnPolicyName(String returnPolicyName) {
        this.returnPolicyName = returnPolicyName;
    }



    /**
     * set ID
     *
     * @param id
     */
    public DistributorContractPolicyDTO id(Number id) {
        this.id = id;
        return this;
    }


    /**
     * set 服务商pin
     *
     * @param distributorPin
     */
    public DistributorContractPolicyDTO distributorPin(String distributorPin) {
        this.distributorPin = distributorPin;
        return this;
    }


    /**
     * set 服务商主协议PIN(1是0否)
     *
     * @param mainFlag
     */
    public DistributorContractPolicyDTO mainFlag(Integer mainFlag) {
        this.mainFlag = mainFlag;
        return this;
    }


    /**
     * set 服务商政策ID
     *
     * @param returnPolicyId
     */
    public DistributorContractPolicyDTO returnPolicyId(String returnPolicyId) {
        this.returnPolicyId = returnPolicyId;
        return this;
    }


    /**
     * set 服务商政策名称
     *
     * @param returnPolicyName
     */
    public DistributorContractPolicyDTO returnPolicyName(String returnPolicyName) {
        this.returnPolicyName = returnPolicyName;
        return this;
    }


}