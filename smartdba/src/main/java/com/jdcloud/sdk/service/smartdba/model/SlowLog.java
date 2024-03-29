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

package com.jdcloud.sdk.service.smartdba.model;


/**
 * slowLog
 */
public class SlowLog  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 执行时间(秒)
     */
    private Float execTime;

    /**
     * 锁等待时间(秒)
     */
    private Float lockTime;

    /**
     * 返回行数
     */
    private Float rowsSent;

    /**
     * 扫描行数
     */
    private Float rowsExamined;

    /**
     * sql语句
     */
    private String sql;

    /**
     * 数据库名
     */
    private String database;

    /**
     * 客户端IP
     */
    private String host;

    /**
     * 日志类型
     */
    private String logType;


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
     * get 用户名
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set 用户名
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * get 执行时间(秒)
     *
     * @return
     */
    public Float getExecTime() {
        return execTime;
    }

    /**
     * set 执行时间(秒)
     *
     * @param execTime
     */
    public void setExecTime(Float execTime) {
        this.execTime = execTime;
    }

    /**
     * get 锁等待时间(秒)
     *
     * @return
     */
    public Float getLockTime() {
        return lockTime;
    }

    /**
     * set 锁等待时间(秒)
     *
     * @param lockTime
     */
    public void setLockTime(Float lockTime) {
        this.lockTime = lockTime;
    }

    /**
     * get 返回行数
     *
     * @return
     */
    public Float getRowsSent() {
        return rowsSent;
    }

    /**
     * set 返回行数
     *
     * @param rowsSent
     */
    public void setRowsSent(Float rowsSent) {
        this.rowsSent = rowsSent;
    }

    /**
     * get 扫描行数
     *
     * @return
     */
    public Float getRowsExamined() {
        return rowsExamined;
    }

    /**
     * set 扫描行数
     *
     * @param rowsExamined
     */
    public void setRowsExamined(Float rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    /**
     * get sql语句
     *
     * @return
     */
    public String getSql() {
        return sql;
    }

    /**
     * set sql语句
     *
     * @param sql
     */
    public void setSql(String sql) {
        this.sql = sql;
    }

    /**
     * get 数据库名
     *
     * @return
     */
    public String getDatabase() {
        return database;
    }

    /**
     * set 数据库名
     *
     * @param database
     */
    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * get 客户端IP
     *
     * @return
     */
    public String getHost() {
        return host;
    }

    /**
     * set 客户端IP
     *
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * get 日志类型
     *
     * @return
     */
    public String getLogType() {
        return logType;
    }

    /**
     * set 日志类型
     *
     * @param logType
     */
    public void setLogType(String logType) {
        this.logType = logType;
    }


    /**
     * set 开始时间
     *
     * @param startTime
     */
    public SlowLog startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 用户名
     *
     * @param userName
     */
    public SlowLog userName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * set 执行时间(秒)
     *
     * @param execTime
     */
    public SlowLog execTime(Float execTime) {
        this.execTime = execTime;
        return this;
    }

    /**
     * set 锁等待时间(秒)
     *
     * @param lockTime
     */
    public SlowLog lockTime(Float lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    /**
     * set 返回行数
     *
     * @param rowsSent
     */
    public SlowLog rowsSent(Float rowsSent) {
        this.rowsSent = rowsSent;
        return this;
    }

    /**
     * set 扫描行数
     *
     * @param rowsExamined
     */
    public SlowLog rowsExamined(Float rowsExamined) {
        this.rowsExamined = rowsExamined;
        return this;
    }

    /**
     * set sql语句
     *
     * @param sql
     */
    public SlowLog sql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * set 数据库名
     *
     * @param database
     */
    public SlowLog database(String database) {
        this.database = database;
        return this;
    }

    /**
     * set 客户端IP
     *
     * @param host
     */
    public SlowLog host(String host) {
        this.host = host;
        return this;
    }

    /**
     * set 日志类型
     *
     * @param logType
     */
    public SlowLog logType(String logType) {
        this.logType = logType;
        return this;
    }


}