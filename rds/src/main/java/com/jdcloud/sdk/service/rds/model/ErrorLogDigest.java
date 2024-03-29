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

package com.jdcloud.sdk.service.rds.model;


/**
 * errorLogDigest
 */
public class ErrorLogDigest  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 错误日志开始执行时间
     */
    private String startTime;

    /**
     * 数据库名，表示该SQL是在哪个数据库中执行的&lt;br&gt;- MySQL不支持
     */
    private String dbName;

    /**
     * 数据库账号，表示该数据库在哪个账号下面&lt;br&gt;- MySQL不支持
     */
    private String dbNameAccount;

    /**
     * 错误日志信息
     */
    private String errorLogInformation;

    /**
     * 错误日志级别&lt;br&gt;- MySQL不支持
     */
    private String errorSeverity;



    /**
     * get 错误日志开始执行时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 错误日志开始执行时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 数据库名，表示该SQL是在哪个数据库中执行的&lt;br&gt;- MySQL不支持
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 数据库名，表示该SQL是在哪个数据库中执行的&lt;br&gt;- MySQL不支持
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }


    /**
     * get 数据库账号，表示该数据库在哪个账号下面&lt;br&gt;- MySQL不支持
     *
     * @return
     */
    public String getDbNameAccount() {
        return dbNameAccount;
    }

    /**
     * set 数据库账号，表示该数据库在哪个账号下面&lt;br&gt;- MySQL不支持
     *
     * @param dbNameAccount
     */
    public void setDbNameAccount(String dbNameAccount) {
        this.dbNameAccount = dbNameAccount;
    }


    /**
     * get 错误日志信息
     *
     * @return
     */
    public String getErrorLogInformation() {
        return errorLogInformation;
    }

    /**
     * set 错误日志信息
     *
     * @param errorLogInformation
     */
    public void setErrorLogInformation(String errorLogInformation) {
        this.errorLogInformation = errorLogInformation;
    }


    /**
     * get 错误日志级别&lt;br&gt;- MySQL不支持
     *
     * @return
     */
    public String getErrorSeverity() {
        return errorSeverity;
    }

    /**
     * set 错误日志级别&lt;br&gt;- MySQL不支持
     *
     * @param errorSeverity
     */
    public void setErrorSeverity(String errorSeverity) {
        this.errorSeverity = errorSeverity;
    }



    /**
     * set 错误日志开始执行时间
     *
     * @param startTime
     */
    public ErrorLogDigest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 数据库名，表示该SQL是在哪个数据库中执行的&lt;br&gt;- MySQL不支持
     *
     * @param dbName
     */
    public ErrorLogDigest dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }


    /**
     * set 数据库账号，表示该数据库在哪个账号下面&lt;br&gt;- MySQL不支持
     *
     * @param dbNameAccount
     */
    public ErrorLogDigest dbNameAccount(String dbNameAccount) {
        this.dbNameAccount = dbNameAccount;
        return this;
    }


    /**
     * set 错误日志信息
     *
     * @param errorLogInformation
     */
    public ErrorLogDigest errorLogInformation(String errorLogInformation) {
        this.errorLogInformation = errorLogInformation;
        return this;
    }


    /**
     * set 错误日志级别&lt;br&gt;- MySQL不支持
     *
     * @param errorSeverity
     */
    public ErrorLogDigest errorSeverity(String errorSeverity) {
        this.errorSeverity = errorSeverity;
        return this;
    }


}