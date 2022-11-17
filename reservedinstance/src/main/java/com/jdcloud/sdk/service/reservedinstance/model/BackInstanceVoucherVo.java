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

package com.jdcloud.sdk.service.reservedinstance.model;


/**
 * backInstanceVoucherVo
 */
public class BackInstanceVoucherVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pin
     */
    private String pin;

    /**
     * 账户名
     */
    private String account;

    /**
     * 实例券id
     */
    private String instanceVoucherId;

    /**
     * 实例券类型
     */
    private String instanceVoucherType;

    /**
     * 资源预留(1 有预留、2 无预留)
     */
    private Integer isReserved;

    /**
     * 地域
     */
    private String region;

    /**
     * 展示说明
     */
    private String tips;

    /**
     * 展示实例族/规格
     */
    private String label;

    /**
     * 数量
     */
    private Integer count;

    /**
     * 显示单位
     */
    private String unit;

    /**
     * 生效时间
     */
    private String startTime;

    /**
     * 失效时间
     */
    private String endTime;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 状态(1：正常: 2：已退订 -1:失效)
     */
    private Integer status;



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
     * get 账户名
     *
     * @return
     */
    public String getAccount() {
        return account;
    }

    /**
     * set 账户名
     *
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }


    /**
     * get 实例券id
     *
     * @return
     */
    public String getInstanceVoucherId() {
        return instanceVoucherId;
    }

    /**
     * set 实例券id
     *
     * @param instanceVoucherId
     */
    public void setInstanceVoucherId(String instanceVoucherId) {
        this.instanceVoucherId = instanceVoucherId;
    }


    /**
     * get 实例券类型
     *
     * @return
     */
    public String getInstanceVoucherType() {
        return instanceVoucherType;
    }

    /**
     * set 实例券类型
     *
     * @param instanceVoucherType
     */
    public void setInstanceVoucherType(String instanceVoucherType) {
        this.instanceVoucherType = instanceVoucherType;
    }


    /**
     * get 资源预留(1 有预留、2 无预留)
     *
     * @return
     */
    public Integer getIsReserved() {
        return isReserved;
    }

    /**
     * set 资源预留(1 有预留、2 无预留)
     *
     * @param isReserved
     */
    public void setIsReserved(Integer isReserved) {
        this.isReserved = isReserved;
    }


    /**
     * get 地域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }


    /**
     * get 展示说明
     *
     * @return
     */
    public String getTips() {
        return tips;
    }

    /**
     * set 展示说明
     *
     * @param tips
     */
    public void setTips(String tips) {
        this.tips = tips;
    }


    /**
     * get 展示实例族/规格
     *
     * @return
     */
    public String getLabel() {
        return label;
    }

    /**
     * set 展示实例族/规格
     *
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }


    /**
     * get 数量
     *
     * @return
     */
    public Integer getCount() {
        return count;
    }

    /**
     * set 数量
     *
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }


    /**
     * get 显示单位
     *
     * @return
     */
    public String getUnit() {
        return unit;
    }

    /**
     * set 显示单位
     *
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }


    /**
     * get 生效时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 生效时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 失效时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 失效时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
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
     * get 状态(1：正常: 2：已退订 -1:失效)
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 状态(1：正常: 2：已退订 -1:失效)
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }



    /**
     * set pin
     *
     * @param pin
     */
    public BackInstanceVoucherVo pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 账户名
     *
     * @param account
     */
    public BackInstanceVoucherVo account(String account) {
        this.account = account;
        return this;
    }


    /**
     * set 实例券id
     *
     * @param instanceVoucherId
     */
    public BackInstanceVoucherVo instanceVoucherId(String instanceVoucherId) {
        this.instanceVoucherId = instanceVoucherId;
        return this;
    }


    /**
     * set 实例券类型
     *
     * @param instanceVoucherType
     */
    public BackInstanceVoucherVo instanceVoucherType(String instanceVoucherType) {
        this.instanceVoucherType = instanceVoucherType;
        return this;
    }


    /**
     * set 资源预留(1 有预留、2 无预留)
     *
     * @param isReserved
     */
    public BackInstanceVoucherVo isReserved(Integer isReserved) {
        this.isReserved = isReserved;
        return this;
    }


    /**
     * set 地域
     *
     * @param region
     */
    public BackInstanceVoucherVo region(String region) {
        this.region = region;
        return this;
    }


    /**
     * set 展示说明
     *
     * @param tips
     */
    public BackInstanceVoucherVo tips(String tips) {
        this.tips = tips;
        return this;
    }


    /**
     * set 展示实例族/规格
     *
     * @param label
     */
    public BackInstanceVoucherVo label(String label) {
        this.label = label;
        return this;
    }


    /**
     * set 数量
     *
     * @param count
     */
    public BackInstanceVoucherVo count(Integer count) {
        this.count = count;
        return this;
    }


    /**
     * set 显示单位
     *
     * @param unit
     */
    public BackInstanceVoucherVo unit(String unit) {
        this.unit = unit;
        return this;
    }


    /**
     * set 生效时间
     *
     * @param startTime
     */
    public BackInstanceVoucherVo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 失效时间
     *
     * @param endTime
     */
    public BackInstanceVoucherVo endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createTime
     */
    public BackInstanceVoucherVo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 状态(1：正常: 2：已退订 -1:失效)
     *
     * @param status
     */
    public BackInstanceVoucherVo status(Integer status) {
        this.status = status;
        return this;
    }


}