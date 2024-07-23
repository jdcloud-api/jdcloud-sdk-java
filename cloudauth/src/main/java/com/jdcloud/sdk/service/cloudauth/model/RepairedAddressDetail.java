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

package com.jdcloud.sdk.service.cloudauth.model;


/**
 * repairedAddressDetail
 */
public class RepairedAddressDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 修复状态(0 无需修复，1 地址已修复， 2 ： 地址手机号都修复 -1 未匹配)
     */
    private Integer repairStatus;

    /**
     * 修复ID
     */
    private Long repairedId;

    /**
     * 可信度(2：高、1：中、0：低)
     */
    private String reliability;

    /**
     * 活跃时间
     */
    private String activeTime;

    /**
     * 地址类型(住宅小区、学校、医院，POI类型)
     */
    private String addressType;



    /**
     * get 修复状态(0 无需修复，1 地址已修复， 2 ： 地址手机号都修复 -1 未匹配)
     *
     * @return
     */
    public Integer getRepairStatus() {
        return repairStatus;
    }

    /**
     * set 修复状态(0 无需修复，1 地址已修复， 2 ： 地址手机号都修复 -1 未匹配)
     *
     * @param repairStatus
     */
    public void setRepairStatus(Integer repairStatus) {
        this.repairStatus = repairStatus;
    }


    /**
     * get 修复ID
     *
     * @return
     */
    public Long getRepairedId() {
        return repairedId;
    }

    /**
     * set 修复ID
     *
     * @param repairedId
     */
    public void setRepairedId(Long repairedId) {
        this.repairedId = repairedId;
    }


    /**
     * get 可信度(2：高、1：中、0：低)
     *
     * @return
     */
    public String getReliability() {
        return reliability;
    }

    /**
     * set 可信度(2：高、1：中、0：低)
     *
     * @param reliability
     */
    public void setReliability(String reliability) {
        this.reliability = reliability;
    }


    /**
     * get 活跃时间
     *
     * @return
     */
    public String getActiveTime() {
        return activeTime;
    }

    /**
     * set 活跃时间
     *
     * @param activeTime
     */
    public void setActiveTime(String activeTime) {
        this.activeTime = activeTime;
    }


    /**
     * get 地址类型(住宅小区、学校、医院，POI类型)
     *
     * @return
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * set 地址类型(住宅小区、学校、医院，POI类型)
     *
     * @param addressType
     */
    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }



    /**
     * set 修复状态(0 无需修复，1 地址已修复， 2 ： 地址手机号都修复 -1 未匹配)
     *
     * @param repairStatus
     */
    public RepairedAddressDetail repairStatus(Integer repairStatus) {
        this.repairStatus = repairStatus;
        return this;
    }


    /**
     * set 修复ID
     *
     * @param repairedId
     */
    public RepairedAddressDetail repairedId(Long repairedId) {
        this.repairedId = repairedId;
        return this;
    }


    /**
     * set 可信度(2：高、1：中、0：低)
     *
     * @param reliability
     */
    public RepairedAddressDetail reliability(String reliability) {
        this.reliability = reliability;
        return this;
    }


    /**
     * set 活跃时间
     *
     * @param activeTime
     */
    public RepairedAddressDetail activeTime(String activeTime) {
        this.activeTime = activeTime;
        return this;
    }


    /**
     * set 地址类型(住宅小区、学校、医院，POI类型)
     *
     * @param addressType
     */
    public RepairedAddressDetail addressType(String addressType) {
        this.addressType = addressType;
        return this;
    }


}