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
 * 统计查询类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 批量域名查询日志-pin维度
 */
public class QueryDomainsLogForJdRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pin
     */
    private String pin;

    /**
     * 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     */
    private String startTime;

    /**
     * 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     */
    private String endTime;

    /**
     * 时间间隔，取值(hour，day，fiveMin)，不传默认小时。
     */
    private String interval;

    /**
     * 日志类型，取值(log，zip,gz)，不传默认gz。
     */
    private String logType;



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
     * get 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * get 时间间隔，取值(hour，day，fiveMin)，不传默认小时。
     *
     * @return
     */
    public String getInterval() {
        return interval;
    }

    /**
     * set 时间间隔，取值(hour，day，fiveMin)，不传默认小时。
     *
     * @param interval
     */
    public void setInterval(String interval) {
        this.interval = interval;
    }


    /**
     * get 日志类型，取值(log，zip,gz)，不传默认gz。
     *
     * @return
     */
    public String getLogType() {
        return logType;
    }

    /**
     * set 日志类型，取值(log，zip,gz)，不传默认gz。
     *
     * @param logType
     */
    public void setLogType(String logType) {
        this.logType = logType;
    }



    /**
     * set pin
     *
     * @param pin
     */
    public QueryDomainsLogForJdRequest pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param startTime
     */
    public QueryDomainsLogForJdRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param endTime
     */
    public QueryDomainsLogForJdRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    /**
     * set 时间间隔，取值(hour，day，fiveMin)，不传默认小时。
     *
     * @param interval
     */
    public QueryDomainsLogForJdRequest interval(String interval) {
        this.interval = interval;
        return this;
    }


    /**
     * set 日志类型，取值(log，zip,gz)，不传默认gz。
     *
     * @param logType
     */
    public QueryDomainsLogForJdRequest logType(String logType) {
        this.logType = logType;
        return this;
    }


}