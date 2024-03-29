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

import java.util.List;
import java.util.ArrayList;

/**
 * statisticsData
 */
public class StatisticsData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     */
    private String startTime;

    /**
     * UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     */
    private String endTime;

    /**
     * domain
     */
    private String domain;

    /**
     * dataItemList
     */
    
    private List<StatisticsDataItem> dataItemList;


    /**
     * get UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * get domain
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set domain
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
    * get dataItemList
    *
    * @return
    */
    public List<StatisticsDataItem> getDataItemList() {
        return dataItemList;
    }

    /**
    * set dataItemList
    *
    * @param dataItemList
    */
    public void setDataItemList(List<StatisticsDataItem> dataItemList) {
        this.dataItemList = dataItemList;
    }



    /**
     * set UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param startTime
     */
    public StatisticsData startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param endTime
     */
    public StatisticsData endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    /**
     * set domain
     *
     * @param domain
     */
    public StatisticsData domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
    * set dataItemList
    *
    * @param dataItemList
    */
    public StatisticsData dataItemList(List<StatisticsDataItem> dataItemList) {
        this.dataItemList = dataItemList;
        return this;
    }



    /**
     * add item to dataItemList
     *
     * @param dataItemList
     */
    public void addDataItemList(StatisticsDataItem dataItemList) {
        if (this.dataItemList == null) {
            this.dataItemList = new ArrayList<>();
        }
        this.dataItemList.add(dataItemList);
    }
}