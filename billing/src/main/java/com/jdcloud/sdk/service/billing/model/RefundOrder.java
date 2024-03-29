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


/**
 * refundOrder
 */
public class RefundOrder  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单编号
     */
    private String orderNumber;

    /**
     * 订单退款金额
     */
    private Double refundPrice;

    /**
     * 订单现金退款金额
     */
    private Double cashRefundPrice;

    /**
     * 订单余额退款金额
     */
    private Double balanceRefundPrice;

    /**
     * 订单代金券退款金额
     */
    private Double couponRefundPrice;



    /**
     * get 订单编号
     *
     * @return
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * set 订单编号
     *
     * @param orderNumber
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * get 订单退款金额
     *
     * @return
     */
    public Double getRefundPrice() {
        return refundPrice;
    }

    /**
     * set 订单退款金额
     *
     * @param refundPrice
     */
    public void setRefundPrice(Double refundPrice) {
        this.refundPrice = refundPrice;
    }


    /**
     * get 订单现金退款金额
     *
     * @return
     */
    public Double getCashRefundPrice() {
        return cashRefundPrice;
    }

    /**
     * set 订单现金退款金额
     *
     * @param cashRefundPrice
     */
    public void setCashRefundPrice(Double cashRefundPrice) {
        this.cashRefundPrice = cashRefundPrice;
    }


    /**
     * get 订单余额退款金额
     *
     * @return
     */
    public Double getBalanceRefundPrice() {
        return balanceRefundPrice;
    }

    /**
     * set 订单余额退款金额
     *
     * @param balanceRefundPrice
     */
    public void setBalanceRefundPrice(Double balanceRefundPrice) {
        this.balanceRefundPrice = balanceRefundPrice;
    }


    /**
     * get 订单代金券退款金额
     *
     * @return
     */
    public Double getCouponRefundPrice() {
        return couponRefundPrice;
    }

    /**
     * set 订单代金券退款金额
     *
     * @param couponRefundPrice
     */
    public void setCouponRefundPrice(Double couponRefundPrice) {
        this.couponRefundPrice = couponRefundPrice;
    }



    /**
     * set 订单编号
     *
     * @param orderNumber
     */
    public RefundOrder orderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }


    /**
     * set 订单退款金额
     *
     * @param refundPrice
     */
    public RefundOrder refundPrice(Double refundPrice) {
        this.refundPrice = refundPrice;
        return this;
    }


    /**
     * set 订单现金退款金额
     *
     * @param cashRefundPrice
     */
    public RefundOrder cashRefundPrice(Double cashRefundPrice) {
        this.cashRefundPrice = cashRefundPrice;
        return this;
    }


    /**
     * set 订单余额退款金额
     *
     * @param balanceRefundPrice
     */
    public RefundOrder balanceRefundPrice(Double balanceRefundPrice) {
        this.balanceRefundPrice = balanceRefundPrice;
        return this;
    }


    /**
     * set 订单代金券退款金额
     *
     * @param couponRefundPrice
     */
    public RefundOrder couponRefundPrice(Double couponRefundPrice) {
        this.couponRefundPrice = couponRefundPrice;
        return this;
    }


}