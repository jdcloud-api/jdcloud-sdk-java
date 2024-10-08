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
 * billDataList
 */
public class BillDataList  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 发票主单号
     */
    private Integer invoiceOrderId;

    /**
     * 发票子单号
     */
    private Integer childOrderId;

    /**
     * 产品线名称
     */
    private String serviceCode;

    /**
     * 可开票金额
     */
    private Number amount;

    /**
     * 实付金额
     */
    private Number actualAmount;

    /**
     * 退款金额
     */
    private Number refundAmount;

    /**
     * 创建日期
     */
    private String createTime;

    /**
     * 更新日期
     */
    private String updateTime;

    /**
     * 状态[已申请-applied ，处理中-processing ，已开票-invoiced ，已邮寄-mailed ，已驳回-dismissed ，已作废-obsolete ，已取消-cancelled]
     */
    private String status;

    /**
     * 使用人
     */
    private String owner;

    /**
     * 交易(支付)类型 1-代付 2-自付
     */
    private Integer payType;

    /**
     * 交易(支付)类型描述 1-代付 2-自付
     */
    private String payTypeDesc;



    /**
     * get id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * get 发票主单号
     *
     * @return
     */
    public Integer getInvoiceOrderId() {
        return invoiceOrderId;
    }

    /**
     * set 发票主单号
     *
     * @param invoiceOrderId
     */
    public void setInvoiceOrderId(Integer invoiceOrderId) {
        this.invoiceOrderId = invoiceOrderId;
    }


    /**
     * get 发票子单号
     *
     * @return
     */
    public Integer getChildOrderId() {
        return childOrderId;
    }

    /**
     * set 发票子单号
     *
     * @param childOrderId
     */
    public void setChildOrderId(Integer childOrderId) {
        this.childOrderId = childOrderId;
    }


    /**
     * get 产品线名称
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品线名称
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * get 可开票金额
     *
     * @return
     */
    public Number getAmount() {
        return amount;
    }

    /**
     * set 可开票金额
     *
     * @param amount
     */
    public void setAmount(Number amount) {
        this.amount = amount;
    }


    /**
     * get 实付金额
     *
     * @return
     */
    public Number getActualAmount() {
        return actualAmount;
    }

    /**
     * set 实付金额
     *
     * @param actualAmount
     */
    public void setActualAmount(Number actualAmount) {
        this.actualAmount = actualAmount;
    }


    /**
     * get 退款金额
     *
     * @return
     */
    public Number getRefundAmount() {
        return refundAmount;
    }

    /**
     * set 退款金额
     *
     * @param refundAmount
     */
    public void setRefundAmount(Number refundAmount) {
        this.refundAmount = refundAmount;
    }


    /**
     * get 创建日期
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建日期
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 更新日期
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新日期
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * get 状态[已申请-applied ，处理中-processing ，已开票-invoiced ，已邮寄-mailed ，已驳回-dismissed ，已作废-obsolete ，已取消-cancelled]
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 状态[已申请-applied ，处理中-processing ，已开票-invoiced ，已邮寄-mailed ，已驳回-dismissed ，已作废-obsolete ，已取消-cancelled]
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get 使用人
     *
     * @return
     */
    public String getOwner() {
        return owner;
    }

    /**
     * set 使用人
     *
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }


    /**
     * get 交易(支付)类型 1-代付 2-自付
     *
     * @return
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * set 交易(支付)类型 1-代付 2-自付
     *
     * @param payType
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }


    /**
     * get 交易(支付)类型描述 1-代付 2-自付
     *
     * @return
     */
    public String getPayTypeDesc() {
        return payTypeDesc;
    }

    /**
     * set 交易(支付)类型描述 1-代付 2-自付
     *
     * @param payTypeDesc
     */
    public void setPayTypeDesc(String payTypeDesc) {
        this.payTypeDesc = payTypeDesc;
    }



    /**
     * set id
     *
     * @param id
     */
    public BillDataList id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set 发票主单号
     *
     * @param invoiceOrderId
     */
    public BillDataList invoiceOrderId(Integer invoiceOrderId) {
        this.invoiceOrderId = invoiceOrderId;
        return this;
    }


    /**
     * set 发票子单号
     *
     * @param childOrderId
     */
    public BillDataList childOrderId(Integer childOrderId) {
        this.childOrderId = childOrderId;
        return this;
    }


    /**
     * set 产品线名称
     *
     * @param serviceCode
     */
    public BillDataList serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set 可开票金额
     *
     * @param amount
     */
    public BillDataList amount(Number amount) {
        this.amount = amount;
        return this;
    }


    /**
     * set 实付金额
     *
     * @param actualAmount
     */
    public BillDataList actualAmount(Number actualAmount) {
        this.actualAmount = actualAmount;
        return this;
    }


    /**
     * set 退款金额
     *
     * @param refundAmount
     */
    public BillDataList refundAmount(Number refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }


    /**
     * set 创建日期
     *
     * @param createTime
     */
    public BillDataList createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 更新日期
     *
     * @param updateTime
     */
    public BillDataList updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set 状态[已申请-applied ，处理中-processing ，已开票-invoiced ，已邮寄-mailed ，已驳回-dismissed ，已作废-obsolete ，已取消-cancelled]
     *
     * @param status
     */
    public BillDataList status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set 使用人
     *
     * @param owner
     */
    public BillDataList owner(String owner) {
        this.owner = owner;
        return this;
    }


    /**
     * set 交易(支付)类型 1-代付 2-自付
     *
     * @param payType
     */
    public BillDataList payType(Integer payType) {
        this.payType = payType;
        return this;
    }


    /**
     * set 交易(支付)类型描述 1-代付 2-自付
     *
     * @param payTypeDesc
     */
    public BillDataList payTypeDesc(String payTypeDesc) {
        this.payTypeDesc = payTypeDesc;
        return this;
    }


}