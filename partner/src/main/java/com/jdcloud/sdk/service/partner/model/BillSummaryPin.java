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
 * Partner Summary APIs
 * 计费费用/账单汇总相关服务
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.partner.model;


/**
 * 查询pin费用汇总结果
 */
public class BillSummaryPin  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pin
     */
    private String pin;

    /**
     * 账号名
     */
    private String loginName;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 原价
     */
    private Number billFee;

    /**
     * 优惠金额
     */
    private Number discountFee;

    /**
     * 抹零金额
     */
    private Number eraseFee;

    /**
     * 优惠后金额
     */
    private Number actualFee;

    /**
     * 付费代金券支付金额
     */
    private Number payCouponFee;

    /**
     * 免费代金券支付金额
     */
    private Number freeCouponFee;

    /**
     * 现金支付金额
     */
    private Number cashPayFee;

    /**
     * 余额支付金额
     */
    private Number balancePayFee;



    /**
     * get pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 账号名
     *
     * @return
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * set 账号名
     *
     * @param loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }


    /**
     * get 客户名称
     *
     * @return
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * set 客户名称
     *
     * @param customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    /**
     * get 原价
     *
     * @return
     */
    public Number getBillFee() {
        return billFee;
    }

    /**
     * set 原价
     *
     * @param billFee
     */
    public void setBillFee(Number billFee) {
        this.billFee = billFee;
    }


    /**
     * get 优惠金额
     *
     * @return
     */
    public Number getDiscountFee() {
        return discountFee;
    }

    /**
     * set 优惠金额
     *
     * @param discountFee
     */
    public void setDiscountFee(Number discountFee) {
        this.discountFee = discountFee;
    }


    /**
     * get 抹零金额
     *
     * @return
     */
    public Number getEraseFee() {
        return eraseFee;
    }

    /**
     * set 抹零金额
     *
     * @param eraseFee
     */
    public void setEraseFee(Number eraseFee) {
        this.eraseFee = eraseFee;
    }


    /**
     * get 优惠后金额
     *
     * @return
     */
    public Number getActualFee() {
        return actualFee;
    }

    /**
     * set 优惠后金额
     *
     * @param actualFee
     */
    public void setActualFee(Number actualFee) {
        this.actualFee = actualFee;
    }


    /**
     * get 付费代金券支付金额
     *
     * @return
     */
    public Number getPayCouponFee() {
        return payCouponFee;
    }

    /**
     * set 付费代金券支付金额
     *
     * @param payCouponFee
     */
    public void setPayCouponFee(Number payCouponFee) {
        this.payCouponFee = payCouponFee;
    }


    /**
     * get 免费代金券支付金额
     *
     * @return
     */
    public Number getFreeCouponFee() {
        return freeCouponFee;
    }

    /**
     * set 免费代金券支付金额
     *
     * @param freeCouponFee
     */
    public void setFreeCouponFee(Number freeCouponFee) {
        this.freeCouponFee = freeCouponFee;
    }


    /**
     * get 现金支付金额
     *
     * @return
     */
    public Number getCashPayFee() {
        return cashPayFee;
    }

    /**
     * set 现金支付金额
     *
     * @param cashPayFee
     */
    public void setCashPayFee(Number cashPayFee) {
        this.cashPayFee = cashPayFee;
    }


    /**
     * get 余额支付金额
     *
     * @return
     */
    public Number getBalancePayFee() {
        return balancePayFee;
    }

    /**
     * set 余额支付金额
     *
     * @param balancePayFee
     */
    public void setBalancePayFee(Number balancePayFee) {
        this.balancePayFee = balancePayFee;
    }



    /**
     * set pin
     *
     * @param pin
     */
    public BillSummaryPin pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 账号名
     *
     * @param loginName
     */
    public BillSummaryPin loginName(String loginName) {
        this.loginName = loginName;
        return this;
    }


    /**
     * set 客户名称
     *
     * @param customerName
     */
    public BillSummaryPin customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }


    /**
     * set 原价
     *
     * @param billFee
     */
    public BillSummaryPin billFee(Number billFee) {
        this.billFee = billFee;
        return this;
    }


    /**
     * set 优惠金额
     *
     * @param discountFee
     */
    public BillSummaryPin discountFee(Number discountFee) {
        this.discountFee = discountFee;
        return this;
    }


    /**
     * set 抹零金额
     *
     * @param eraseFee
     */
    public BillSummaryPin eraseFee(Number eraseFee) {
        this.eraseFee = eraseFee;
        return this;
    }


    /**
     * set 优惠后金额
     *
     * @param actualFee
     */
    public BillSummaryPin actualFee(Number actualFee) {
        this.actualFee = actualFee;
        return this;
    }


    /**
     * set 付费代金券支付金额
     *
     * @param payCouponFee
     */
    public BillSummaryPin payCouponFee(Number payCouponFee) {
        this.payCouponFee = payCouponFee;
        return this;
    }


    /**
     * set 免费代金券支付金额
     *
     * @param freeCouponFee
     */
    public BillSummaryPin freeCouponFee(Number freeCouponFee) {
        this.freeCouponFee = freeCouponFee;
        return this;
    }


    /**
     * set 现金支付金额
     *
     * @param cashPayFee
     */
    public BillSummaryPin cashPayFee(Number cashPayFee) {
        this.cashPayFee = cashPayFee;
        return this;
    }


    /**
     * set 余额支付金额
     *
     * @param balancePayFee
     */
    public BillSummaryPin balancePayFee(Number balancePayFee) {
        this.balancePayFee = balancePayFee;
        return this;
    }


}