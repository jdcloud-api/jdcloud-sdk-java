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

package com.jdcloud.sdk.service.clouddnsservice.model;


/**
 * actionlog
 */
public class Actionlog  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 操作记录的ID
     */
    private Integer id;

    /**
     * 用户名
     */
    private String userPin;

    /**
     * 操作的域名
     */
    private String domain;

    /**
     * 操作类型：1新增 2修改 3删除
     */
    private Integer type;

    /**
     * 操作的详细情况
     */
    private String detail;

    /**
     * 操作发生的时间
     */
    private Long time;

    /**
     * 操作的结果，成功true, 失败false
     */
    private Boolean success;

    /**
     * 操作失败的原因
     */
    private String failReason;

    /**
     * 操作者的IP
     */
    private String clientIp;


    /**
     * get 操作记录的ID
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 操作记录的ID
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 用户名
     *
     * @return
     */
    public String getUserPin() {
        return userPin;
    }

    /**
     * set 用户名
     *
     * @param userPin
     */
    public void setUserPin(String userPin) {
        this.userPin = userPin;
    }

    /**
     * get 操作的域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 操作的域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * get 操作类型：1新增 2修改 3删除
     *
     * @return
     */
    public Integer getType() {
        return type;
    }

    /**
     * set 操作类型：1新增 2修改 3删除
     *
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * get 操作的详细情况
     *
     * @return
     */
    public String getDetail() {
        return detail;
    }

    /**
     * set 操作的详细情况
     *
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * get 操作发生的时间
     *
     * @return
     */
    public Long getTime() {
        return time;
    }

    /**
     * set 操作发生的时间
     *
     * @param time
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * get 操作的结果，成功true, 失败false
     *
     * @return
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * set 操作的结果，成功true, 失败false
     *
     * @param success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * get 操作失败的原因
     *
     * @return
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * set 操作失败的原因
     *
     * @param failReason
     */
    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    /**
     * get 操作者的IP
     *
     * @return
     */
    public String getClientIp() {
        return clientIp;
    }

    /**
     * set 操作者的IP
     *
     * @param clientIp
     */
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }


    /**
     * set 操作记录的ID
     *
     * @param id
     */
    public Actionlog id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 用户名
     *
     * @param userPin
     */
    public Actionlog userPin(String userPin) {
        this.userPin = userPin;
        return this;
    }

    /**
     * set 操作的域名
     *
     * @param domain
     */
    public Actionlog domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set 操作类型：1新增 2修改 3删除
     *
     * @param type
     */
    public Actionlog type(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * set 操作的详细情况
     *
     * @param detail
     */
    public Actionlog detail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * set 操作发生的时间
     *
     * @param time
     */
    public Actionlog time(Long time) {
        this.time = time;
        return this;
    }

    /**
     * set 操作的结果，成功true, 失败false
     *
     * @param success
     */
    public Actionlog success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * set 操作失败的原因
     *
     * @param failReason
     */
    public Actionlog failReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * set 操作者的IP
     *
     * @param clientIp
     */
    public Actionlog clientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }


}