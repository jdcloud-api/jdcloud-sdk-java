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
 * distributorBillReturnRecord
 */
public class DistributorBillReturnRecord  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Number id;

    /**
     * 服务商ID
     */
    private String distributorId;

    /**
     * 返还单号
     */
    private String retrunBillId;

    /**
     * 业务ID
     */
    private String businessId;

    /**
     * pin
     */
    private String pin;

    /**
     * 产品编码
     */
    private String serviceCode;

    /**
     * 操作类型
     */
    private String opType;

    /**
     * 金额
     */
    private Number returnAmount;

    /**
     * 原金额
     */
    private Number orgiReturnAmount;

    /**
     * 调账原因
     */
    private String remark;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 修改时间
     */
    private String updateTime;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 是否删除0未删除,1已删除
     */
    private Integer yn;



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
     * get 服务商ID
     *
     * @return
     */
    public String getDistributorId() {
        return distributorId;
    }

    /**
     * set 服务商ID
     *
     * @param distributorId
     */
    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
    }


    /**
     * get 返还单号
     *
     * @return
     */
    public String getRetrunBillId() {
        return retrunBillId;
    }

    /**
     * set 返还单号
     *
     * @param retrunBillId
     */
    public void setRetrunBillId(String retrunBillId) {
        this.retrunBillId = retrunBillId;
    }


    /**
     * get 业务ID
     *
     * @return
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * set 业务ID
     *
     * @param businessId
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }


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
     * get 操作类型
     *
     * @return
     */
    public String getOpType() {
        return opType;
    }

    /**
     * set 操作类型
     *
     * @param opType
     */
    public void setOpType(String opType) {
        this.opType = opType;
    }


    /**
     * get 金额
     *
     * @return
     */
    public Number getReturnAmount() {
        return returnAmount;
    }

    /**
     * set 金额
     *
     * @param returnAmount
     */
    public void setReturnAmount(Number returnAmount) {
        this.returnAmount = returnAmount;
    }


    /**
     * get 原金额
     *
     * @return
     */
    public Number getOrgiReturnAmount() {
        return orgiReturnAmount;
    }

    /**
     * set 原金额
     *
     * @param orgiReturnAmount
     */
    public void setOrgiReturnAmount(Number orgiReturnAmount) {
        this.orgiReturnAmount = orgiReturnAmount;
    }


    /**
     * get 调账原因
     *
     * @return
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set 调账原因
     *
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }


    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 创建人
     *
     * @return
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * set 创建人
     *
     * @param createUser
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }


    /**
     * get 修改时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * get 修改人
     *
     * @return
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * set 修改人
     *
     * @param updateUser
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }


    /**
     * get 是否删除0未删除,1已删除
     *
     * @return
     */
    public Integer getYn() {
        return yn;
    }

    /**
     * set 是否删除0未删除,1已删除
     *
     * @param yn
     */
    public void setYn(Integer yn) {
        this.yn = yn;
    }



    /**
     * set ID
     *
     * @param id
     */
    public DistributorBillReturnRecord id(Number id) {
        this.id = id;
        return this;
    }


    /**
     * set 服务商ID
     *
     * @param distributorId
     */
    public DistributorBillReturnRecord distributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }


    /**
     * set 返还单号
     *
     * @param retrunBillId
     */
    public DistributorBillReturnRecord retrunBillId(String retrunBillId) {
        this.retrunBillId = retrunBillId;
        return this;
    }


    /**
     * set 业务ID
     *
     * @param businessId
     */
    public DistributorBillReturnRecord businessId(String businessId) {
        this.businessId = businessId;
        return this;
    }


    /**
     * set pin
     *
     * @param pin
     */
    public DistributorBillReturnRecord pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 产品编码
     *
     * @param serviceCode
     */
    public DistributorBillReturnRecord serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set 操作类型
     *
     * @param opType
     */
    public DistributorBillReturnRecord opType(String opType) {
        this.opType = opType;
        return this;
    }


    /**
     * set 金额
     *
     * @param returnAmount
     */
    public DistributorBillReturnRecord returnAmount(Number returnAmount) {
        this.returnAmount = returnAmount;
        return this;
    }


    /**
     * set 原金额
     *
     * @param orgiReturnAmount
     */
    public DistributorBillReturnRecord orgiReturnAmount(Number orgiReturnAmount) {
        this.orgiReturnAmount = orgiReturnAmount;
        return this;
    }


    /**
     * set 调账原因
     *
     * @param remark
     */
    public DistributorBillReturnRecord remark(String remark) {
        this.remark = remark;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createTime
     */
    public DistributorBillReturnRecord createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 创建人
     *
     * @param createUser
     */
    public DistributorBillReturnRecord createUser(String createUser) {
        this.createUser = createUser;
        return this;
    }


    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public DistributorBillReturnRecord updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set 修改人
     *
     * @param updateUser
     */
    public DistributorBillReturnRecord updateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }


    /**
     * set 是否删除0未删除,1已删除
     *
     * @param yn
     */
    public DistributorBillReturnRecord yn(Integer yn) {
        this.yn = yn;
        return this;
    }


}