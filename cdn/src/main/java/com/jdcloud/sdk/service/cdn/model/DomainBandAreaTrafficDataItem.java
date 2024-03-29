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

package com.jdcloud.sdk.service.cdn.model;


/**
 * domainBandAreaTrafficDataItem
 */
public class DomainBandAreaTrafficDataItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 开始时间戳
     */
    private String startTimeStamp;

    /**
     * 开始时间戳
     */
    private String endTimeStamp;

    /**
     * 带宽单位Mbps
     */
    private Double avgbandwidth;

    /**
     * 流量单位MB
     */
    private Double flow;

    /**
     * 请求量
     */
    private Long pv;

    /**
     * 地域
     */
    private String area;

    /**
     * 运营商
     */
    private String isp;



    /**
     * get 开始时间戳
     *
     * @return
     */
    public String getStartTimeStamp() {
        return startTimeStamp;
    }

    /**
     * set 开始时间戳
     *
     * @param startTimeStamp
     */
    public void setStartTimeStamp(String startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
    }


    /**
     * get 开始时间戳
     *
     * @return
     */
    public String getEndTimeStamp() {
        return endTimeStamp;
    }

    /**
     * set 开始时间戳
     *
     * @param endTimeStamp
     */
    public void setEndTimeStamp(String endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
    }


    /**
     * get 带宽单位Mbps
     *
     * @return
     */
    public Double getAvgbandwidth() {
        return avgbandwidth;
    }

    /**
     * set 带宽单位Mbps
     *
     * @param avgbandwidth
     */
    public void setAvgbandwidth(Double avgbandwidth) {
        this.avgbandwidth = avgbandwidth;
    }


    /**
     * get 流量单位MB
     *
     * @return
     */
    public Double getFlow() {
        return flow;
    }

    /**
     * set 流量单位MB
     *
     * @param flow
     */
    public void setFlow(Double flow) {
        this.flow = flow;
    }


    /**
     * get 请求量
     *
     * @return
     */
    public Long getPv() {
        return pv;
    }

    /**
     * set 请求量
     *
     * @param pv
     */
    public void setPv(Long pv) {
        this.pv = pv;
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
     * set 开始时间戳
     *
     * @param startTimeStamp
     */
    public DomainBandAreaTrafficDataItem startTimeStamp(String startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
        return this;
    }


    /**
     * set 开始时间戳
     *
     * @param endTimeStamp
     */
    public DomainBandAreaTrafficDataItem endTimeStamp(String endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
        return this;
    }


    /**
     * set 带宽单位Mbps
     *
     * @param avgbandwidth
     */
    public DomainBandAreaTrafficDataItem avgbandwidth(Double avgbandwidth) {
        this.avgbandwidth = avgbandwidth;
        return this;
    }


    /**
     * set 流量单位MB
     *
     * @param flow
     */
    public DomainBandAreaTrafficDataItem flow(Double flow) {
        this.flow = flow;
        return this;
    }


    /**
     * set 请求量
     *
     * @param pv
     */
    public DomainBandAreaTrafficDataItem pv(Long pv) {
        this.pv = pv;
        return this;
    }


    /**
     * set 地域
     *
     * @param area
     */
    public DomainBandAreaTrafficDataItem area(String area) {
        this.area = area;
        return this;
    }


    /**
     * set 运营商
     *
     * @param isp
     */
    public DomainBandAreaTrafficDataItem isp(String isp) {
        this.isp = isp;
        return this;
    }


}