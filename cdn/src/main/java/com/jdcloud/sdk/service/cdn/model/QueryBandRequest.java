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
 * 带宽查询接口
 */
public class QueryBandRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     */
    private String startTime;

    /**
     * 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     */
    private String endTime;

    /**
     * 需要查询的域名, 必须为用户pin下有权限的域名
     */
    private String domain;

    /**
     * 地域
     */
    private String area;

    /**
     * 运营商
     */
    private String isp;

    /**
     * 查询周期
     */
    private String period;



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
     * get 需要查询的域名, 必须为用户pin下有权限的域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 需要查询的域名, 必须为用户pin下有权限的域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * get 地域
     *
     * @return
     */
    public String getArea() {
        return area;
    }

    /**
     * set 地域
     *
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }


    /**
     * get 运营商
     *
     * @return
     */
    public String getIsp() {
        return isp;
    }

    /**
     * set 运营商
     *
     * @param isp
     */
    public void setIsp(String isp) {
        this.isp = isp;
    }


    /**
     * get 查询周期
     *
     * @return
     */
    public String getPeriod() {
        return period;
    }

    /**
     * set 查询周期
     *
     * @param period
     */
    public void setPeriod(String period) {
        this.period = period;
    }



    /**
     * set 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param startTime
     */
    public QueryBandRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param endTime
     */
    public QueryBandRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    /**
     * set 需要查询的域名, 必须为用户pin下有权限的域名
     *
     * @param domain
     */
    public QueryBandRequest domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * set 地域
     *
     * @param area
     */
    public QueryBandRequest area(String area) {
        this.area = area;
        return this;
    }


    /**
     * set 运营商
     *
     * @param isp
     */
    public QueryBandRequest isp(String isp) {
        this.isp = isp;
        return this;
    }


    /**
     * set 查询周期
     *
     * @param period
     */
    public QueryBandRequest period(String period) {
        this.period = period;
        return this;
    }


}