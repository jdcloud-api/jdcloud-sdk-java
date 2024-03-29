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

package com.jdcloud.sdk.service.bgw.model;

import java.util.List;
import java.util.ArrayList;

/**
 * customerGateway
 */
public class CustomerGateway  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 客户网关的Id
     */
    private String customerGatewayId;

    /**
     * 客户网关的名称
     */
    private String customerGatewayName;

    /**
     * 客户网关上的IP列表
     */
    
    private List<String> customerIps;
    /**
     * 客户自治系统的ASN号
     */
    private Integer bgpAsn;

    /**
     * 客户网关的描述
     */
    private String description;

    /**
     * 客户网关的创建时间
     */
    private String createdTime;

    /**
     * 客户网关的更新时间
     */
    private String updatedTime;



    /**
     * get 客户网关的Id
     *
     * @return
     */
    public String getCustomerGatewayId() {
        return customerGatewayId;
    }

    /**
     * set 客户网关的Id
     *
     * @param customerGatewayId
     */
    public void setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }


    /**
     * get 客户网关的名称
     *
     * @return
     */
    public String getCustomerGatewayName() {
        return customerGatewayName;
    }

    /**
     * set 客户网关的名称
     *
     * @param customerGatewayName
     */
    public void setCustomerGatewayName(String customerGatewayName) {
        this.customerGatewayName = customerGatewayName;
    }


    /**
    * get 客户网关上的IP列表
    *
    * @return
    */
    public List<String> getCustomerIps() {
        return customerIps;
    }

    /**
    * set 客户网关上的IP列表
    *
    * @param customerIps
    */
    public void setCustomerIps(List<String> customerIps) {
        this.customerIps = customerIps;
    }


    /**
     * get 客户自治系统的ASN号
     *
     * @return
     */
    public Integer getBgpAsn() {
        return bgpAsn;
    }

    /**
     * set 客户自治系统的ASN号
     *
     * @param bgpAsn
     */
    public void setBgpAsn(Integer bgpAsn) {
        this.bgpAsn = bgpAsn;
    }


    /**
     * get 客户网关的描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 客户网关的描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 客户网关的创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 客户网关的创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * get 客户网关的更新时间
     *
     * @return
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    /**
     * set 客户网关的更新时间
     *
     * @param updatedTime
     */
    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }



    /**
     * set 客户网关的Id
     *
     * @param customerGatewayId
     */
    public CustomerGateway customerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }


    /**
     * set 客户网关的名称
     *
     * @param customerGatewayName
     */
    public CustomerGateway customerGatewayName(String customerGatewayName) {
        this.customerGatewayName = customerGatewayName;
        return this;
    }


    /**
    * set 客户网关上的IP列表
    *
    * @param customerIps
    */
    public CustomerGateway customerIps(List<String> customerIps) {
        this.customerIps = customerIps;
        return this;
    }


    /**
     * set 客户自治系统的ASN号
     *
     * @param bgpAsn
     */
    public CustomerGateway bgpAsn(Integer bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }


    /**
     * set 客户网关的描述
     *
     * @param description
     */
    public CustomerGateway description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 客户网关的创建时间
     *
     * @param createdTime
     */
    public CustomerGateway createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }


    /**
     * set 客户网关的更新时间
     *
     * @param updatedTime
     */
    public CustomerGateway updatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }



    /**
     * add item to 客户网关上的IP列表
     *
     * @param customerIp
     */
    public void addCustomerIp(String customerIp) {
        if (this.customerIps == null) {
            this.customerIps = new ArrayList<>();
        }
        this.customerIps.add(customerIp);
    }
}