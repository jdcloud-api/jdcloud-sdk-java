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

/**
 * orderFee
 */
public class OrderFee  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单编号
     */
    private String transactionNo;

    /**
     * 订单退款金额
     */
    private Double actualFee;

    /**
     * 现金退款金额
     */
    private Double cashPayFee;

    /**
     * 余额退款金额
     */
    private Double balancePayFee;

    /**
     * 代金券退款金额
     */
    private Double cashCouponFee;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 开始时间
     */
    private String endTime;

    /**
     * 规格
     */
    private String formula;

    /**
     * 时间单位
     */
    private Integer timeUnit;

    /**
     * 单位长度
     */
    private Integer timeSpan;

    /**
     * 退款代金券列表
     */
    
    private List<RefundCoupon> refundCouponList;


    /**
     * get 订单编号
     *
     * @return
     */
    public String getTransactionNo() {
        return transactionNo;
    }

    /**
     * set 订单编号
     *
     * @param transactionNo
     */
    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }


    /**
     * get 订单退款金额
     *
     * @return
     */
    public Double getActualFee() {
        return actualFee;
    }

    /**
     * set 订单退款金额
     *
     * @param actualFee
     */
    public void setActualFee(Double actualFee) {
        this.actualFee = actualFee;
    }


    /**
     * get 现金退款金额
     *
     * @return
     */
    public Double getCashPayFee() {
        return cashPayFee;
    }

    /**
     * set 现金退款金额
     *
     * @param cashPayFee
     */
    public void setCashPayFee(Double cashPayFee) {
        this.cashPayFee = cashPayFee;
    }


    /**
     * get 余额退款金额
     *
     * @return
     */
    public Double getBalancePayFee() {
        return balancePayFee;
    }

    /**
     * set 余额退款金额
     *
     * @param balancePayFee
     */
    public void setBalancePayFee(Double balancePayFee) {
        this.balancePayFee = balancePayFee;
    }


    /**
     * get 代金券退款金额
     *
     * @return
     */
    public Double getCashCouponFee() {
        return cashCouponFee;
    }

    /**
     * set 代金券退款金额
     *
     * @param cashCouponFee
     */
    public void setCashCouponFee(Double cashCouponFee) {
        this.cashCouponFee = cashCouponFee;
    }


    /**
     * get 开始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 开始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 开始时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 开始时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * get 规格
     *
     * @return
     */
    public String getFormula() {
        return formula;
    }

    /**
     * set 规格
     *
     * @param formula
     */
    public void setFormula(String formula) {
        this.formula = formula;
    }


    /**
     * get 时间单位
     *
     * @return
     */
    public Integer getTimeUnit() {
        return timeUnit;
    }

    /**
     * set 时间单位
     *
     * @param timeUnit
     */
    public void setTimeUnit(Integer timeUnit) {
        this.timeUnit = timeUnit;
    }


    /**
     * get 单位长度
     *
     * @return
     */
    public Integer getTimeSpan() {
        return timeSpan;
    }

    /**
     * set 单位长度
     *
     * @param timeSpan
     */
    public void setTimeSpan(Integer timeSpan) {
        this.timeSpan = timeSpan;
    }


    /**
    * get 退款代金券列表
    *
    * @return
    */
    public List<RefundCoupon> getRefundCouponList() {
        return refundCouponList;
    }

    /**
    * set 退款代金券列表
    *
    * @param refundCouponList
    */
    public void setRefundCouponList(List<RefundCoupon> refundCouponList) {
        this.refundCouponList = refundCouponList;
    }



    /**
     * set 订单编号
     *
     * @param transactionNo
     */
    public OrderFee transactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
        return this;
    }


    /**
     * set 订单退款金额
     *
     * @param actualFee
     */
    public OrderFee actualFee(Double actualFee) {
        this.actualFee = actualFee;
        return this;
    }


    /**
     * set 现金退款金额
     *
     * @param cashPayFee
     */
    public OrderFee cashPayFee(Double cashPayFee) {
        this.cashPayFee = cashPayFee;
        return this;
    }


    /**
     * set 余额退款金额
     *
     * @param balancePayFee
     */
    public OrderFee balancePayFee(Double balancePayFee) {
        this.balancePayFee = balancePayFee;
        return this;
    }


    /**
     * set 代金券退款金额
     *
     * @param cashCouponFee
     */
    public OrderFee cashCouponFee(Double cashCouponFee) {
        this.cashCouponFee = cashCouponFee;
        return this;
    }


    /**
     * set 开始时间
     *
     * @param startTime
     */
    public OrderFee startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 开始时间
     *
     * @param endTime
     */
    public OrderFee endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    /**
     * set 规格
     *
     * @param formula
     */
    public OrderFee formula(String formula) {
        this.formula = formula;
        return this;
    }


    /**
     * set 时间单位
     *
     * @param timeUnit
     */
    public OrderFee timeUnit(Integer timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }


    /**
     * set 单位长度
     *
     * @param timeSpan
     */
    public OrderFee timeSpan(Integer timeSpan) {
        this.timeSpan = timeSpan;
        return this;
    }


    /**
    * set 退款代金券列表
    *
    * @param refundCouponList
    */
    public OrderFee refundCouponList(List<RefundCoupon> refundCouponList) {
        this.refundCouponList = refundCouponList;
        return this;
    }



    /**
     * add item to 退款代金券列表
     *
     * @param refundCouponList
     */
    public void addRefundCouponList(RefundCoupon refundCouponList) {
        if (this.refundCouponList == null) {
            this.refundCouponList = new ArrayList<>();
        }
        this.refundCouponList.add(refundCouponList);
    }
}