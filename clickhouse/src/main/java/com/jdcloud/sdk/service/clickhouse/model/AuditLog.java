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

package com.jdcloud.sdk.service.clickhouse.model;


/**
 * auditLog
 */
public class AuditLog  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 源IP
     */
    private String ip;

    /**
     * 初始请求ID
     */
    private String requestId;

    /**
     * 节点名称
     */
    private String segmentName;

    /**
     * SQL语句
     */
    private String sql;

    /**
     * accountName
     */
    private String accountName;

    /**
     * SQL开始执行时间
     */
    private String startTime;


    /**
     * get 源IP
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set 源IP
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * get 初始请求ID
     *
     * @return
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * set 初始请求ID
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * get 节点名称
     *
     * @return
     */
    public String getSegmentName() {
        return segmentName;
    }

    /**
     * set 节点名称
     *
     * @param segmentName
     */
    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    /**
     * get SQL语句
     *
     * @return
     */
    public String getSql() {
        return sql;
    }

    /**
     * set SQL语句
     *
     * @param sql
     */
    public void setSql(String sql) {
        this.sql = sql;
    }

    /**
     * get accountName
     *
     * @return
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * set accountName
     *
     * @param accountName
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * get SQL开始执行时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set SQL开始执行时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * set 源IP
     *
     * @param ip
     */
    public AuditLog ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set 初始请求ID
     *
     * @param requestId
     */
    public AuditLog requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * set 节点名称
     *
     * @param segmentName
     */
    public AuditLog segmentName(String segmentName) {
        this.segmentName = segmentName;
        return this;
    }

    /**
     * set SQL语句
     *
     * @param sql
     */
    public AuditLog sql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * set accountName
     *
     * @param accountName
     */
    public AuditLog accountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * set SQL开始执行时间
     *
     * @param startTime
     */
    public AuditLog startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


}