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

package com.jdcloud.sdk.service.billing.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * resourceInfo
 */
public class ResourceInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源ID
     * Required:true
     */
    @Required
    private String resourceId;

    /**
     * 用户PIN
     * Required:true
     */
    @Required
    private String pin;

    /**
     * 产品编码
     * Required:true
     */
    @Required
    private String serviceCode;

    /**
     * 退款单号
     * Required:true
     */
    @Required
    private String refundNo;

    /**
     * 订单编号列表,退续费订单时必传，一次退多个续费订单请按续费时间倒序传入
     */
    
    private List<String> orderNumberList;


    /**
     * get 资源ID
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源ID
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * get 用户PIN
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户PIN
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 产品编码
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品编码
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * get 退款单号
     *
     * @return
     */
    public String getRefundNo() {
        return refundNo;
    }

    /**
     * set 退款单号
     *
     * @param refundNo
     */
    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }


    /**
    * get 订单编号列表,退续费订单时必传，一次退多个续费订单请按续费时间倒序传入
    *
    * @return
    */
    public List<String> getOrderNumberList() {
        return orderNumberList;
    }

    /**
    * set 订单编号列表,退续费订单时必传，一次退多个续费订单请按续费时间倒序传入
    *
    * @param orderNumberList
    */
    public void setOrderNumberList(List<String> orderNumberList) {
        this.orderNumberList = orderNumberList;
    }



    /**
     * set 资源ID
     *
     * @param resourceId
     */
    public ResourceInfo resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }


    /**
     * set 用户PIN
     *
     * @param pin
     */
    public ResourceInfo pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 产品编码
     *
     * @param serviceCode
     */
    public ResourceInfo serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set 退款单号
     *
     * @param refundNo
     */
    public ResourceInfo refundNo(String refundNo) {
        this.refundNo = refundNo;
        return this;
    }


    /**
    * set 订单编号列表,退续费订单时必传，一次退多个续费订单请按续费时间倒序传入
    *
    * @param orderNumberList
    */
    public ResourceInfo orderNumberList(List<String> orderNumberList) {
        this.orderNumberList = orderNumberList;
        return this;
    }



    /**
     * add item to 订单编号列表,退续费订单时必传，一次退多个续费订单请按续费时间倒序传入
     *
     * @param orderNumberList
     */
    public void addOrderNumberList(String orderNumberList) {
        if (this.orderNumberList == null) {
            this.orderNumberList = new ArrayList<>();
        }
        this.orderNumberList.add(orderNumberList);
    }
}