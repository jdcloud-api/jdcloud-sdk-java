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

package com.jdcloud.sdk.service.privatezone.model;


/**
 * describeActionLogsRes
 */
public class DescribeActionLogsRes  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 操作日志id
     */
    private Integer id;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * zone
     */
    private String zone;

    /**
     * zone id
     */
    private String zoneId;

    /**
     * 操作类型
     */
    private String actionType;

    /**
     * 操作详情
     */
    private String detail;

    /**
     * 操作发生时间
     */
    private String time;

    /**
     * 操作结果 true-&gt;成功 false-&gt;失败
     */
    private Boolean success;

    /**
     * 操作失败原因
     */
    private String failReason;

    /**
     * 操作者IP
     */
    private String clientIp;


    /**
     * get 操作日志id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 操作日志id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * get zone
     *
     * @return
     */
    public String getZone() {
        return zone;
    }

    /**
     * set zone
     *
     * @param zone
     */
    public void setZone(String zone) {
        this.zone = zone;
    }

    /**
     * get zone id
     *
     * @return
     */
    public String getZoneId() {
        return zoneId;
    }

    /**
     * set zone id
     *
     * @param zoneId
     */
    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    /**
     * get 操作类型
     *
     * @return
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * set 操作类型
     *
     * @param actionType
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * get 操作详情
     *
     * @return
     */
    public String getDetail() {
        return detail;
    }

    /**
     * set 操作详情
     *
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * get 操作发生时间
     *
     * @return
     */
    public String getTime() {
        return time;
    }

    /**
     * set 操作发生时间
     *
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * get 操作结果 true-&gt;成功 false-&gt;失败
     *
     * @return
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * set 操作结果 true-&gt;成功 false-&gt;失败
     *
     * @param success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * get 操作失败原因
     *
     * @return
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * set 操作失败原因
     *
     * @param failReason
     */
    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    /**
     * get 操作者IP
     *
     * @return
     */
    public String getClientIp() {
        return clientIp;
    }

    /**
     * set 操作者IP
     *
     * @param clientIp
     */
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }


    /**
     * set 操作日志id
     *
     * @param id
     */
    public DescribeActionLogsRes id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public DescribeActionLogsRes pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set zone
     *
     * @param zone
     */
    public DescribeActionLogsRes zone(String zone) {
        this.zone = zone;
        return this;
    }

    /**
     * set zone id
     *
     * @param zoneId
     */
    public DescribeActionLogsRes zoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    /**
     * set 操作类型
     *
     * @param actionType
     */
    public DescribeActionLogsRes actionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * set 操作详情
     *
     * @param detail
     */
    public DescribeActionLogsRes detail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * set 操作发生时间
     *
     * @param time
     */
    public DescribeActionLogsRes time(String time) {
        this.time = time;
        return this;
    }

    /**
     * set 操作结果 true-&gt;成功 false-&gt;失败
     *
     * @param success
     */
    public DescribeActionLogsRes success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * set 操作失败原因
     *
     * @param failReason
     */
    public DescribeActionLogsRes failReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * set 操作者IP
     *
     * @param clientIp
     */
    public DescribeActionLogsRes clientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }


}