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

package com.jdcloud.sdk.service.invoice.model;


/**
 * refundOrderInfo
 */
public class RefundOrderInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主单号
     */
    private String orderNumber;

    /**
     * 子单号
     */
    private String childOrderNumber;

    /**
     * 子单退款金额
     */
    private Number childRefundAmount;



    /**
     * get 主单号
     *
     * @return
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * set 主单号
     *
     * @param orderNumber
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * get 子单号
     *
     * @return
     */
    public String getChildOrderNumber() {
        return childOrderNumber;
    }

    /**
     * set 子单号
     *
     * @param childOrderNumber
     */
    public void setChildOrderNumber(String childOrderNumber) {
        this.childOrderNumber = childOrderNumber;
    }


    /**
     * get 子单退款金额
     *
     * @return
     */
    public Number getChildRefundAmount() {
        return childRefundAmount;
    }

    /**
     * set 子单退款金额
     *
     * @param childRefundAmount
     */
    public void setChildRefundAmount(Number childRefundAmount) {
        this.childRefundAmount = childRefundAmount;
    }



    /**
     * set 主单号
     *
     * @param orderNumber
     */
    public RefundOrderInfo orderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }


    /**
     * set 子单号
     *
     * @param childOrderNumber
     */
    public RefundOrderInfo childOrderNumber(String childOrderNumber) {
        this.childOrderNumber = childOrderNumber;
        return this;
    }


    /**
     * set 子单退款金额
     *
     * @param childRefundAmount
     */
    public RefundOrderInfo childRefundAmount(Number childRefundAmount) {
        this.childRefundAmount = childRefundAmount;
        return this;
    }


}