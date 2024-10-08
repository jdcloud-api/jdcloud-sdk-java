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

package com.jdcloud.sdk.service.starshield.model;


/**
 * opListIncomeSummaryResp
 */
public class OpListIncomeSummaryResp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Number id;

    /**
     * 账单id
     */
    private String dataSourceId;

    /**
     * 操作类型，1、新增，2、更新
     */
    private Integer opType;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 产品serviceCode
     */
    private String serviceCode;

    /**
     * 计费类型，1、按配置，2、按用量，3、包年包月，4、一次性
     */
    private Integer billingType;

    /**
     * 计费开始时间（格式：yyyy-MM-dd HH:mm:ss）
     */
    private String startTime;

    /**
     * 计费结束时间（格式：yyyy-MM-dd HH:mm:ss）
     */
    private String endTime;

    /**
     * 账期（格式：yyyy-MM-dd HH:mm:ss）
     */
    private String billTime;

    /**
     * 原价，保留6位小数
     */
    private String billFee;

    /**
     * 实际价格 应付金额，保留2位小数
     */
    private String actualFee;

    /**
     * 折扣金额，保留2位小数
     */
    private String discountFee;

    /**
     * 金额类型，5:电汇
     */
    private Integer amountType;

    /**
     * 币种
     */
    private String payCurrency;

    /**
     * 税率
     */
    private String taxRate;

    /**
     * 支付状态，0：未支付、1：已支付
     */
    private Integer payState;

    /**
     * 支付时间，必传（格式：yyyy-MM-dd HH:mm:ss）
     */
    private String payTime;

    /**
     * 线下签合同的主体id
     */
    private String orgId;

    /**
     * 线下签合同的主体名称
     */
    private String orgName;

    /**
     * 1-新购，2-续费，3-配置变更，4-退款，42-降配延时 47-包年包月转换配置、用量
     */
    private Integer orderType;

    /**
     * 账单类型，1-正常账单，2-退款账单，3-调账账单，4-保底账单
     */
    private Integer billType;

    /**
     * 调整账单需要原始账单ID
     */
    private String origDataSourceId;

    /**
     * 销售合同编号
     */
    private String salesContractNumber;

    /**
     * 销售合同状态 1、草稿，2、审批中，3、审批驳回，4、EBS审批中，5、待用印、6、待签订，7、签订中，8、已签订，9、不签订，11、已失效
     */
    private Integer salesContractStatus;

    /**
     * 地域，如cn-north-1，不可修改
     */
    private String region;

    /**
     * 配置描述（备注）
     */
    private String formulaDesc;

    /**
     * 计提推送结果code
     */
    private String ebsResultCode;

    /**
     * 计提推送结果message
     */
    private String ebsResultMessage;

    /**
     * 账单推送结果code
     */
    private String billResultCode;

    /**
     * 账单推送结果message
     */
    private String billResultMessage;

    /**
     * 是否推计提
     */
    private Boolean ebsPush;

    /**
     * 是否推账单
     */
    private Boolean billPush;



    /**
     * get 主键id
     *
     * @return
     */
    public Number getId() {
        return id;
    }

    /**
     * set 主键id
     *
     * @param id
     */
    public void setId(Number id) {
        this.id = id;
    }


    /**
     * get 账单id
     *
     * @return
     */
    public String getDataSourceId() {
        return dataSourceId;
    }

    /**
     * set 账单id
     *
     * @param dataSourceId
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }


    /**
     * get 操作类型，1、新增，2、更新
     *
     * @return
     */
    public Integer getOpType() {
        return opType;
    }

    /**
     * set 操作类型，1、新增，2、更新
     *
     * @param opType
     */
    public void setOpType(Integer opType) {
        this.opType = opType;
    }


    /**
     * get 用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 产品serviceCode
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品serviceCode
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * get 计费类型，1、按配置，2、按用量，3、包年包月，4、一次性
     *
     * @return
     */
    public Integer getBillingType() {
        return billingType;
    }

    /**
     * set 计费类型，1、按配置，2、按用量，3、包年包月，4、一次性
     *
     * @param billingType
     */
    public void setBillingType(Integer billingType) {
        this.billingType = billingType;
    }


    /**
     * get 计费开始时间（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 计费开始时间（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 计费结束时间（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 计费结束时间（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * get 账期（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @return
     */
    public String getBillTime() {
        return billTime;
    }

    /**
     * set 账期（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @param billTime
     */
    public void setBillTime(String billTime) {
        this.billTime = billTime;
    }


    /**
     * get 原价，保留6位小数
     *
     * @return
     */
    public String getBillFee() {
        return billFee;
    }

    /**
     * set 原价，保留6位小数
     *
     * @param billFee
     */
    public void setBillFee(String billFee) {
        this.billFee = billFee;
    }


    /**
     * get 实际价格 应付金额，保留2位小数
     *
     * @return
     */
    public String getActualFee() {
        return actualFee;
    }

    /**
     * set 实际价格 应付金额，保留2位小数
     *
     * @param actualFee
     */
    public void setActualFee(String actualFee) {
        this.actualFee = actualFee;
    }


    /**
     * get 折扣金额，保留2位小数
     *
     * @return
     */
    public String getDiscountFee() {
        return discountFee;
    }

    /**
     * set 折扣金额，保留2位小数
     *
     * @param discountFee
     */
    public void setDiscountFee(String discountFee) {
        this.discountFee = discountFee;
    }


    /**
     * get 金额类型，5:电汇
     *
     * @return
     */
    public Integer getAmountType() {
        return amountType;
    }

    /**
     * set 金额类型，5:电汇
     *
     * @param amountType
     */
    public void setAmountType(Integer amountType) {
        this.amountType = amountType;
    }


    /**
     * get 币种
     *
     * @return
     */
    public String getPayCurrency() {
        return payCurrency;
    }

    /**
     * set 币种
     *
     * @param payCurrency
     */
    public void setPayCurrency(String payCurrency) {
        this.payCurrency = payCurrency;
    }


    /**
     * get 税率
     *
     * @return
     */
    public String getTaxRate() {
        return taxRate;
    }

    /**
     * set 税率
     *
     * @param taxRate
     */
    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * get 支付状态，0：未支付、1：已支付
     *
     * @return
     */
    public Integer getPayState() {
        return payState;
    }

    /**
     * set 支付状态，0：未支付、1：已支付
     *
     * @param payState
     */
    public void setPayState(Integer payState) {
        this.payState = payState;
    }


    /**
     * get 支付时间，必传（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @return
     */
    public String getPayTime() {
        return payTime;
    }

    /**
     * set 支付时间，必传（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @param payTime
     */
    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }


    /**
     * get 线下签合同的主体id
     *
     * @return
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * set 线下签合同的主体id
     *
     * @param orgId
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }


    /**
     * get 线下签合同的主体名称
     *
     * @return
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * set 线下签合同的主体名称
     *
     * @param orgName
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }


    /**
     * get 1-新购，2-续费，3-配置变更，4-退款，42-降配延时 47-包年包月转换配置、用量
     *
     * @return
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * set 1-新购，2-续费，3-配置变更，4-退款，42-降配延时 47-包年包月转换配置、用量
     *
     * @param orderType
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }


    /**
     * get 账单类型，1-正常账单，2-退款账单，3-调账账单，4-保底账单
     *
     * @return
     */
    public Integer getBillType() {
        return billType;
    }

    /**
     * set 账单类型，1-正常账单，2-退款账单，3-调账账单，4-保底账单
     *
     * @param billType
     */
    public void setBillType(Integer billType) {
        this.billType = billType;
    }


    /**
     * get 调整账单需要原始账单ID
     *
     * @return
     */
    public String getOrigDataSourceId() {
        return origDataSourceId;
    }

    /**
     * set 调整账单需要原始账单ID
     *
     * @param origDataSourceId
     */
    public void setOrigDataSourceId(String origDataSourceId) {
        this.origDataSourceId = origDataSourceId;
    }


    /**
     * get 销售合同编号
     *
     * @return
     */
    public String getSalesContractNumber() {
        return salesContractNumber;
    }

    /**
     * set 销售合同编号
     *
     * @param salesContractNumber
     */
    public void setSalesContractNumber(String salesContractNumber) {
        this.salesContractNumber = salesContractNumber;
    }


    /**
     * get 销售合同状态 1、草稿，2、审批中，3、审批驳回，4、EBS审批中，5、待用印、6、待签订，7、签订中，8、已签订，9、不签订，11、已失效
     *
     * @return
     */
    public Integer getSalesContractStatus() {
        return salesContractStatus;
    }

    /**
     * set 销售合同状态 1、草稿，2、审批中，3、审批驳回，4、EBS审批中，5、待用印、6、待签订，7、签订中，8、已签订，9、不签订，11、已失效
     *
     * @param salesContractStatus
     */
    public void setSalesContractStatus(Integer salesContractStatus) {
        this.salesContractStatus = salesContractStatus;
    }


    /**
     * get 地域，如cn-north-1，不可修改
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域，如cn-north-1，不可修改
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }


    /**
     * get 配置描述（备注）
     *
     * @return
     */
    public String getFormulaDesc() {
        return formulaDesc;
    }

    /**
     * set 配置描述（备注）
     *
     * @param formulaDesc
     */
    public void setFormulaDesc(String formulaDesc) {
        this.formulaDesc = formulaDesc;
    }


    /**
     * get 计提推送结果code
     *
     * @return
     */
    public String getEbsResultCode() {
        return ebsResultCode;
    }

    /**
     * set 计提推送结果code
     *
     * @param ebsResultCode
     */
    public void setEbsResultCode(String ebsResultCode) {
        this.ebsResultCode = ebsResultCode;
    }


    /**
     * get 计提推送结果message
     *
     * @return
     */
    public String getEbsResultMessage() {
        return ebsResultMessage;
    }

    /**
     * set 计提推送结果message
     *
     * @param ebsResultMessage
     */
    public void setEbsResultMessage(String ebsResultMessage) {
        this.ebsResultMessage = ebsResultMessage;
    }


    /**
     * get 账单推送结果code
     *
     * @return
     */
    public String getBillResultCode() {
        return billResultCode;
    }

    /**
     * set 账单推送结果code
     *
     * @param billResultCode
     */
    public void setBillResultCode(String billResultCode) {
        this.billResultCode = billResultCode;
    }


    /**
     * get 账单推送结果message
     *
     * @return
     */
    public String getBillResultMessage() {
        return billResultMessage;
    }

    /**
     * set 账单推送结果message
     *
     * @param billResultMessage
     */
    public void setBillResultMessage(String billResultMessage) {
        this.billResultMessage = billResultMessage;
    }


    /**
     * get 是否推计提
     *
     * @return
     */
    public Boolean getEbsPush() {
        return ebsPush;
    }

    /**
     * set 是否推计提
     *
     * @param ebsPush
     */
    public void setEbsPush(Boolean ebsPush) {
        this.ebsPush = ebsPush;
    }


    /**
     * get 是否推账单
     *
     * @return
     */
    public Boolean getBillPush() {
        return billPush;
    }

    /**
     * set 是否推账单
     *
     * @param billPush
     */
    public void setBillPush(Boolean billPush) {
        this.billPush = billPush;
    }



    /**
     * set 主键id
     *
     * @param id
     */
    public OpListIncomeSummaryResp id(Number id) {
        this.id = id;
        return this;
    }


    /**
     * set 账单id
     *
     * @param dataSourceId
     */
    public OpListIncomeSummaryResp dataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }


    /**
     * set 操作类型，1、新增，2、更新
     *
     * @param opType
     */
    public OpListIncomeSummaryResp opType(Integer opType) {
        this.opType = opType;
        return this;
    }


    /**
     * set 用户pin
     *
     * @param pin
     */
    public OpListIncomeSummaryResp pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 产品serviceCode
     *
     * @param serviceCode
     */
    public OpListIncomeSummaryResp serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set 计费类型，1、按配置，2、按用量，3、包年包月，4、一次性
     *
     * @param billingType
     */
    public OpListIncomeSummaryResp billingType(Integer billingType) {
        this.billingType = billingType;
        return this;
    }


    /**
     * set 计费开始时间（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @param startTime
     */
    public OpListIncomeSummaryResp startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 计费结束时间（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @param endTime
     */
    public OpListIncomeSummaryResp endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    /**
     * set 账期（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @param billTime
     */
    public OpListIncomeSummaryResp billTime(String billTime) {
        this.billTime = billTime;
        return this;
    }


    /**
     * set 原价，保留6位小数
     *
     * @param billFee
     */
    public OpListIncomeSummaryResp billFee(String billFee) {
        this.billFee = billFee;
        return this;
    }


    /**
     * set 实际价格 应付金额，保留2位小数
     *
     * @param actualFee
     */
    public OpListIncomeSummaryResp actualFee(String actualFee) {
        this.actualFee = actualFee;
        return this;
    }


    /**
     * set 折扣金额，保留2位小数
     *
     * @param discountFee
     */
    public OpListIncomeSummaryResp discountFee(String discountFee) {
        this.discountFee = discountFee;
        return this;
    }


    /**
     * set 金额类型，5:电汇
     *
     * @param amountType
     */
    public OpListIncomeSummaryResp amountType(Integer amountType) {
        this.amountType = amountType;
        return this;
    }


    /**
     * set 币种
     *
     * @param payCurrency
     */
    public OpListIncomeSummaryResp payCurrency(String payCurrency) {
        this.payCurrency = payCurrency;
        return this;
    }


    /**
     * set 税率
     *
     * @param taxRate
     */
    public OpListIncomeSummaryResp taxRate(String taxRate) {
        this.taxRate = taxRate;
        return this;
    }


    /**
     * set 支付状态，0：未支付、1：已支付
     *
     * @param payState
     */
    public OpListIncomeSummaryResp payState(Integer payState) {
        this.payState = payState;
        return this;
    }


    /**
     * set 支付时间，必传（格式：yyyy-MM-dd HH:mm:ss）
     *
     * @param payTime
     */
    public OpListIncomeSummaryResp payTime(String payTime) {
        this.payTime = payTime;
        return this;
    }


    /**
     * set 线下签合同的主体id
     *
     * @param orgId
     */
    public OpListIncomeSummaryResp orgId(String orgId) {
        this.orgId = orgId;
        return this;
    }


    /**
     * set 线下签合同的主体名称
     *
     * @param orgName
     */
    public OpListIncomeSummaryResp orgName(String orgName) {
        this.orgName = orgName;
        return this;
    }


    /**
     * set 1-新购，2-续费，3-配置变更，4-退款，42-降配延时 47-包年包月转换配置、用量
     *
     * @param orderType
     */
    public OpListIncomeSummaryResp orderType(Integer orderType) {
        this.orderType = orderType;
        return this;
    }


    /**
     * set 账单类型，1-正常账单，2-退款账单，3-调账账单，4-保底账单
     *
     * @param billType
     */
    public OpListIncomeSummaryResp billType(Integer billType) {
        this.billType = billType;
        return this;
    }


    /**
     * set 调整账单需要原始账单ID
     *
     * @param origDataSourceId
     */
    public OpListIncomeSummaryResp origDataSourceId(String origDataSourceId) {
        this.origDataSourceId = origDataSourceId;
        return this;
    }


    /**
     * set 销售合同编号
     *
     * @param salesContractNumber
     */
    public OpListIncomeSummaryResp salesContractNumber(String salesContractNumber) {
        this.salesContractNumber = salesContractNumber;
        return this;
    }


    /**
     * set 销售合同状态 1、草稿，2、审批中，3、审批驳回，4、EBS审批中，5、待用印、6、待签订，7、签订中，8、已签订，9、不签订，11、已失效
     *
     * @param salesContractStatus
     */
    public OpListIncomeSummaryResp salesContractStatus(Integer salesContractStatus) {
        this.salesContractStatus = salesContractStatus;
        return this;
    }


    /**
     * set 地域，如cn-north-1，不可修改
     *
     * @param region
     */
    public OpListIncomeSummaryResp region(String region) {
        this.region = region;
        return this;
    }


    /**
     * set 配置描述（备注）
     *
     * @param formulaDesc
     */
    public OpListIncomeSummaryResp formulaDesc(String formulaDesc) {
        this.formulaDesc = formulaDesc;
        return this;
    }


    /**
     * set 计提推送结果code
     *
     * @param ebsResultCode
     */
    public OpListIncomeSummaryResp ebsResultCode(String ebsResultCode) {
        this.ebsResultCode = ebsResultCode;
        return this;
    }


    /**
     * set 计提推送结果message
     *
     * @param ebsResultMessage
     */
    public OpListIncomeSummaryResp ebsResultMessage(String ebsResultMessage) {
        this.ebsResultMessage = ebsResultMessage;
        return this;
    }


    /**
     * set 账单推送结果code
     *
     * @param billResultCode
     */
    public OpListIncomeSummaryResp billResultCode(String billResultCode) {
        this.billResultCode = billResultCode;
        return this;
    }


    /**
     * set 账单推送结果message
     *
     * @param billResultMessage
     */
    public OpListIncomeSummaryResp billResultMessage(String billResultMessage) {
        this.billResultMessage = billResultMessage;
        return this;
    }


    /**
     * set 是否推计提
     *
     * @param ebsPush
     */
    public OpListIncomeSummaryResp ebsPush(Boolean ebsPush) {
        this.ebsPush = ebsPush;
        return this;
    }


    /**
     * set 是否推账单
     *
     * @param billPush
     */
    public OpListIncomeSummaryResp billPush(Boolean billPush) {
        this.billPush = billPush;
        return this;
    }


}