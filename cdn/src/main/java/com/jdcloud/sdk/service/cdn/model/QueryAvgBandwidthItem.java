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
 * queryAvgBandwidthItem
 */
public class QueryAvgBandwidthItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 五分钟序列，202003021100 表示 从 2020-03-02 11:00 到 2020-03-02 11:05 这个时段
     */
    private String startTime;

    /**
     * 平均带宽kbps
     */
    private Double avgbandwidth;

    /**
     * isp
     */
    private String isp;



    /**
     * get 五分钟序列，202003021100 表示 从 2020-03-02 11:00 到 2020-03-02 11:05 这个时段
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 五分钟序列，202003021100 表示 从 2020-03-02 11:00 到 2020-03-02 11:05 这个时段
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 平均带宽kbps
     *
     * @return
     */
    public Double getAvgbandwidth() {
        return avgbandwidth;
    }

    /**
     * set 平均带宽kbps
     *
     * @param avgbandwidth
     */
    public void setAvgbandwidth(Double avgbandwidth) {
        this.avgbandwidth = avgbandwidth;
    }


    /**
     * get isp
     *
     * @return
     */
    public String getIsp() {
        return isp;
    }

    /**
     * set isp
     *
     * @param isp
     */
    public void setIsp(String isp) {
        this.isp = isp;
    }



    /**
     * set 五分钟序列，202003021100 表示 从 2020-03-02 11:00 到 2020-03-02 11:05 这个时段
     *
     * @param startTime
     */
    public QueryAvgBandwidthItem startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 平均带宽kbps
     *
     * @param avgbandwidth
     */
    public QueryAvgBandwidthItem avgbandwidth(Double avgbandwidth) {
        this.avgbandwidth = avgbandwidth;
        return this;
    }


    /**
     * set isp
     *
     * @param isp
     */
    public QueryAvgBandwidthItem isp(String isp) {
        this.isp = isp;
        return this;
    }


}