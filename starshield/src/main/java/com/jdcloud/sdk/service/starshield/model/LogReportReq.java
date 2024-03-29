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

import com.jdcloud.sdk.annotation.Required;

/**
 * logReportReq
 */
public class LogReportReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例id，代表要查询的WAF实例
     * Required:true
     */
    @Required
    private String wafInstanceId;

    /**
     * 域名
     */
    private String domain;

    /**
     * 日志Id
     * Required:true
     */
    @Required
    private String logId;

    /**
     * 产生时间
     * Required:true
     */
    @Required
    private Long accessTime;



    /**
     * get 实例id，代表要查询的WAF实例
     *
     * @return
     */
    public String getWafInstanceId() {
        return wafInstanceId;
    }

    /**
     * set 实例id，代表要查询的WAF实例
     *
     * @param wafInstanceId
     */
    public void setWafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
    }


    /**
     * get 域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * get 日志Id
     *
     * @return
     */
    public String getLogId() {
        return logId;
    }

    /**
     * set 日志Id
     *
     * @param logId
     */
    public void setLogId(String logId) {
        this.logId = logId;
    }


    /**
     * get 产生时间
     *
     * @return
     */
    public Long getAccessTime() {
        return accessTime;
    }

    /**
     * set 产生时间
     *
     * @param accessTime
     */
    public void setAccessTime(Long accessTime) {
        this.accessTime = accessTime;
    }



    /**
     * set 实例id，代表要查询的WAF实例
     *
     * @param wafInstanceId
     */
    public LogReportReq wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }


    /**
     * set 域名
     *
     * @param domain
     */
    public LogReportReq domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * set 日志Id
     *
     * @param logId
     */
    public LogReportReq logId(String logId) {
        this.logId = logId;
        return this;
    }


    /**
     * set 产生时间
     *
     * @param accessTime
     */
    public LogReportReq accessTime(Long accessTime) {
        this.accessTime = accessTime;
        return this;
    }


}