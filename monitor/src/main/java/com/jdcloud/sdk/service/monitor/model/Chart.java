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

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;

/**
 * chart
 */
public class Chart  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    private Integer id;

    /**
     * serviceCode
     */
    private String serviceCode;

    /**
     * groupCode
     */
    private String groupCode;

    /**
     * chartNameCH
     */
    private String chartNameCH;

    /**
     * chartNameEN
     */
    private String chartNameEN;

    /**
     * chartUnitCH
     */
    private String chartUnitCH;

    /**
     * chartUnitEN
     */
    private String chartUnitEN;

    /**
     * chartIndex
     */
    private Integer chartIndex;

    /**
     * metrics
     */
    private String metrics;

    /**
     * metricIds
     */
    private List<Integer> metricIds;

    /**
     * 排序字段
     */
    private String column;

    /**
     * 排序方式
     */
    private String dir;

    /**
     * 页码
     */
    private Integer number;

    /**
     * 查询条数
     */
    private Integer size;


    /**
     * get 自增id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 自增id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get serviceCode
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get groupCode
     *
     * @return
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * set groupCode
     *
     * @param groupCode
     */
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    /**
     * get chartNameCH
     *
     * @return
     */
    public String getChartNameCH() {
        return chartNameCH;
    }

    /**
     * set chartNameCH
     *
     * @param chartNameCH
     */
    public void setChartNameCH(String chartNameCH) {
        this.chartNameCH = chartNameCH;
    }

    /**
     * get chartNameEN
     *
     * @return
     */
    public String getChartNameEN() {
        return chartNameEN;
    }

    /**
     * set chartNameEN
     *
     * @param chartNameEN
     */
    public void setChartNameEN(String chartNameEN) {
        this.chartNameEN = chartNameEN;
    }

    /**
     * get chartUnitCH
     *
     * @return
     */
    public String getChartUnitCH() {
        return chartUnitCH;
    }

    /**
     * set chartUnitCH
     *
     * @param chartUnitCH
     */
    public void setChartUnitCH(String chartUnitCH) {
        this.chartUnitCH = chartUnitCH;
    }

    /**
     * get chartUnitEN
     *
     * @return
     */
    public String getChartUnitEN() {
        return chartUnitEN;
    }

    /**
     * set chartUnitEN
     *
     * @param chartUnitEN
     */
    public void setChartUnitEN(String chartUnitEN) {
        this.chartUnitEN = chartUnitEN;
    }

    /**
     * get chartIndex
     *
     * @return
     */
    public Integer getChartIndex() {
        return chartIndex;
    }

    /**
     * set chartIndex
     *
     * @param chartIndex
     */
    public void setChartIndex(Integer chartIndex) {
        this.chartIndex = chartIndex;
    }

    /**
     * get metrics
     *
     * @return
     */
    public String getMetrics() {
        return metrics;
    }

    /**
     * set metrics
     *
     * @param metrics
     */
    public void setMetrics(String metrics) {
        this.metrics = metrics;
    }

    /**
     * get metricIds
     *
     * @return
     */
    public List<Integer> getMetricIds() {
        return metricIds;
    }

    /**
     * set metricIds
     *
     * @param metricIds
     */
    public void setMetricIds(List<Integer> metricIds) {
        this.metricIds = metricIds;
    }

    /**
     * get 排序字段
     *
     * @return
     */
    public String getColumn() {
        return column;
    }

    /**
     * set 排序字段
     *
     * @param column
     */
    public void setColumn(String column) {
        this.column = column;
    }

    /**
     * get 排序方式
     *
     * @return
     */
    public String getDir() {
        return dir;
    }

    /**
     * set 排序方式
     *
     * @param dir
     */
    public void setDir(String dir) {
        this.dir = dir;
    }

    /**
     * get 页码
     *
     * @return
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * set 页码
     *
     * @param number
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * get 查询条数
     *
     * @return
     */
    public Integer getSize() {
        return size;
    }

    /**
     * set 查询条数
     *
     * @param size
     */
    public void setSize(Integer size) {
        this.size = size;
    }


    /**
     * set 自增id
     *
     * @param id
     */
    public Chart id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public Chart serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set groupCode
     *
     * @param groupCode
     */
    public Chart groupCode(String groupCode) {
        this.groupCode = groupCode;
        return this;
    }

    /**
     * set chartNameCH
     *
     * @param chartNameCH
     */
    public Chart chartNameCH(String chartNameCH) {
        this.chartNameCH = chartNameCH;
        return this;
    }

    /**
     * set chartNameEN
     *
     * @param chartNameEN
     */
    public Chart chartNameEN(String chartNameEN) {
        this.chartNameEN = chartNameEN;
        return this;
    }

    /**
     * set chartUnitCH
     *
     * @param chartUnitCH
     */
    public Chart chartUnitCH(String chartUnitCH) {
        this.chartUnitCH = chartUnitCH;
        return this;
    }

    /**
     * set chartUnitEN
     *
     * @param chartUnitEN
     */
    public Chart chartUnitEN(String chartUnitEN) {
        this.chartUnitEN = chartUnitEN;
        return this;
    }

    /**
     * set chartIndex
     *
     * @param chartIndex
     */
    public Chart chartIndex(Integer chartIndex) {
        this.chartIndex = chartIndex;
        return this;
    }

    /**
     * set metrics
     *
     * @param metrics
     */
    public Chart metrics(String metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * set metricIds
     *
     * @param metricIds
     */
    public Chart metricIds(List<Integer> metricIds) {
        this.metricIds = metricIds;
        return this;
    }

    /**
     * set 排序字段
     *
     * @param column
     */
    public Chart column(String column) {
        this.column = column;
        return this;
    }

    /**
     * set 排序方式
     *
     * @param dir
     */
    public Chart dir(String dir) {
        this.dir = dir;
        return this;
    }

    /**
     * set 页码
     *
     * @param number
     */
    public Chart number(Integer number) {
        this.number = number;
        return this;
    }

    /**
     * set 查询条数
     *
     * @param size
     */
    public Chart size(Integer size) {
        this.size = size;
        return this;
    }


    /**
     * add item to metricIds
     *
     * @param metricId
     */
    public void addMetricId(Integer metricId) {
        if (this.metricIds == null) {
            this.metricIds = new ArrayList<>();
        }
        this.metricIds.add(metricId);
    }

}