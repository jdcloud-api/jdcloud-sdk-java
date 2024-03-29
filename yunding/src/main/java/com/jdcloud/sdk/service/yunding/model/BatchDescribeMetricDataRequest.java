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
 * yunding-monitor
 * 云鼎-云监控相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.yunding.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.monitor.model.TagFilter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.monitor.model.Filter;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查看某资源多个监控项数据，metric介绍：&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/monitoring/metrics&quot;&gt;Metrics&lt;/a&gt;，可以使用接口&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/monitoring/metrics&quot;&gt;describeMetrics&lt;/a&gt;：查询产品线可用的metric列表。
 */
public class BatchDescribeMetricDataRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 聚合方式，用于不同时间轴上的聚合。如balance产品同一个resourceId下存在port&#x3D;80和port&#x3D;8080等多种维度。可选值参考:sum、avg、min、max
     */
    private String aggrType;

    /**
     * 采样方式，用于在时间轴维度上将聚合周期内的数据聚合为一个点。可选值参考：sum(聚合周期内的数据求和)、avg(求平均)、last(最新值)、min(最小值)、max(最大值)
     */
    private String downSampleType;

    /**
     * 查询时间范围的开始时间， UTC时间，格式：2016-12-11T00:00:00+0800（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     */
    private String startTime;

    /**
     * 查询时间范围的结束时间， UTC时间，格式：2016-12-11T00:00:00+0800（为空时，将由startTime与timeInterval计算得出）（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     */
    private String endTime;

    /**
     * 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval默认为1h，当前时间往 前1h
     */
    private String timeInterval;

    /**
     * 监控指标数据的维度信息,根据tags来筛选指标数据不同的维度
     */
    
    private List<TagFilter> tags;
    /**
     * 是否对查询的tags分组
     */
    private Boolean groupBy;

    /**
     * 是否求速率
     */
    private Boolean rate;

    /**
     * 资源的类型，取值vm, lb, ip, database 等,&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/monitoring/api/describeservices?content&#x3D;API&amp;SOP&#x3D;JDCloud&quot;&gt;describeServices&lt;/a&gt;：查询己接入云监控的产品线列表
     */
    private String serviceCode;

    /**
     * 资源的维度。查询serviceCode下可用的维度请使用describeServices接口
     */
    private String dimension;

    /**
     * 资源的uuid
     * Required:true
     */
    @Required
    private String resourceId;

    /**
     * 是否跨资源查询，默认为false。当该字段为false时，取resourceId字段进行查询；当该子弹为true时，忽略resourceId字段，从tags中取resourceId作为实际的多资源id处理。
     */
    private Boolean multiResources;

    /**
     * 自定义过滤标签，查询时必须在filters中指定要查询的metric，支持多个metric。如：  name&#x3D;&#39;metric&#39;,values&#x3D;[&quot;metric1&quot;,&quot;metric2&quot;]
     * Required:true
     */
    @Required
    
    private List<Filter> filters;
    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 聚合方式，用于不同时间轴上的聚合。如balance产品同一个resourceId下存在port&#x3D;80和port&#x3D;8080等多种维度。可选值参考:sum、avg、min、max
     *
     * @return
     */
    public String getAggrType() {
        return aggrType;
    }

    /**
     * set 聚合方式，用于不同时间轴上的聚合。如balance产品同一个resourceId下存在port&#x3D;80和port&#x3D;8080等多种维度。可选值参考:sum、avg、min、max
     *
     * @param aggrType
     */
    public void setAggrType(String aggrType) {
        this.aggrType = aggrType;
    }


    /**
     * get 采样方式，用于在时间轴维度上将聚合周期内的数据聚合为一个点。可选值参考：sum(聚合周期内的数据求和)、avg(求平均)、last(最新值)、min(最小值)、max(最大值)
     *
     * @return
     */
    public String getDownSampleType() {
        return downSampleType;
    }

    /**
     * set 采样方式，用于在时间轴维度上将聚合周期内的数据聚合为一个点。可选值参考：sum(聚合周期内的数据求和)、avg(求平均)、last(最新值)、min(最小值)、max(最大值)
     *
     * @param downSampleType
     */
    public void setDownSampleType(String downSampleType) {
        this.downSampleType = downSampleType;
    }


    /**
     * get 查询时间范围的开始时间， UTC时间，格式：2016-12-11T00:00:00+0800（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 查询时间范围的开始时间， UTC时间，格式：2016-12-11T00:00:00+0800（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 查询时间范围的结束时间， UTC时间，格式：2016-12-11T00:00:00+0800（为空时，将由startTime与timeInterval计算得出）（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询时间范围的结束时间， UTC时间，格式：2016-12-11T00:00:00+0800（为空时，将由startTime与timeInterval计算得出）（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * get 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval默认为1h，当前时间往 前1h
     *
     * @return
     */
    public String getTimeInterval() {
        return timeInterval;
    }

    /**
     * set 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval默认为1h，当前时间往 前1h
     *
     * @param timeInterval
     */
    public void setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
    }


    /**
    * get 监控指标数据的维度信息,根据tags来筛选指标数据不同的维度
    *
    * @return
    */
    public List<TagFilter> getTags() {
        return tags;
    }

    /**
    * set 监控指标数据的维度信息,根据tags来筛选指标数据不同的维度
    *
    * @param tags
    */
    public void setTags(List<TagFilter> tags) {
        this.tags = tags;
    }


    /**
     * get 是否对查询的tags分组
     *
     * @return
     */
    public Boolean getGroupBy() {
        return groupBy;
    }

    /**
     * set 是否对查询的tags分组
     *
     * @param groupBy
     */
    public void setGroupBy(Boolean groupBy) {
        this.groupBy = groupBy;
    }


    /**
     * get 是否求速率
     *
     * @return
     */
    public Boolean getRate() {
        return rate;
    }

    /**
     * set 是否求速率
     *
     * @param rate
     */
    public void setRate(Boolean rate) {
        this.rate = rate;
    }


    /**
     * get 资源的类型，取值vm, lb, ip, database 等,&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/monitoring/api/describeservices?content&#x3D;API&amp;SOP&#x3D;JDCloud&quot;&gt;describeServices&lt;/a&gt;：查询己接入云监控的产品线列表
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 资源的类型，取值vm, lb, ip, database 等,&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/monitoring/api/describeservices?content&#x3D;API&amp;SOP&#x3D;JDCloud&quot;&gt;describeServices&lt;/a&gt;：查询己接入云监控的产品线列表
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * get 资源的维度。查询serviceCode下可用的维度请使用describeServices接口
     *
     * @return
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * set 资源的维度。查询serviceCode下可用的维度请使用describeServices接口
     *
     * @param dimension
     */
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }


    /**
     * get 资源的uuid
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源的uuid
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * get 是否跨资源查询，默认为false。当该字段为false时，取resourceId字段进行查询；当该子弹为true时，忽略resourceId字段，从tags中取resourceId作为实际的多资源id处理。
     *
     * @return
     */
    public Boolean getMultiResources() {
        return multiResources;
    }

    /**
     * set 是否跨资源查询，默认为false。当该字段为false时，取resourceId字段进行查询；当该子弹为true时，忽略resourceId字段，从tags中取resourceId作为实际的多资源id处理。
     *
     * @param multiResources
     */
    public void setMultiResources(Boolean multiResources) {
        this.multiResources = multiResources;
    }


    /**
    * get 自定义过滤标签，查询时必须在filters中指定要查询的metric，支持多个metric。如：  name&#x3D;&#39;metric&#39;,values&#x3D;[&quot;metric1&quot;,&quot;metric2&quot;]
    *
    * @return
    */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
    * set 自定义过滤标签，查询时必须在filters中指定要查询的metric，支持多个metric。如：  name&#x3D;&#39;metric&#39;,values&#x3D;[&quot;metric1&quot;,&quot;metric2&quot;]
    *
    * @param filters
    */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }


    /**
     * get 地域 Id
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 聚合方式，用于不同时间轴上的聚合。如balance产品同一个resourceId下存在port&#x3D;80和port&#x3D;8080等多种维度。可选值参考:sum、avg、min、max
     *
     * @param aggrType
     */
    public BatchDescribeMetricDataRequest aggrType(String aggrType) {
        this.aggrType = aggrType;
        return this;
    }


    /**
     * set 采样方式，用于在时间轴维度上将聚合周期内的数据聚合为一个点。可选值参考：sum(聚合周期内的数据求和)、avg(求平均)、last(最新值)、min(最小值)、max(最大值)
     *
     * @param downSampleType
     */
    public BatchDescribeMetricDataRequest downSampleType(String downSampleType) {
        this.downSampleType = downSampleType;
        return this;
    }


    /**
     * set 查询时间范围的开始时间， UTC时间，格式：2016-12-11T00:00:00+0800（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     *
     * @param startTime
     */
    public BatchDescribeMetricDataRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 查询时间范围的结束时间， UTC时间，格式：2016-12-11T00:00:00+0800（为空时，将由startTime与timeInterval计算得出）（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     *
     * @param endTime
     */
    public BatchDescribeMetricDataRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    /**
     * set 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval默认为1h，当前时间往 前1h
     *
     * @param timeInterval
     */
    public BatchDescribeMetricDataRequest timeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }


    /**
    * set 监控指标数据的维度信息,根据tags来筛选指标数据不同的维度
    *
    * @param tags
    */
    public BatchDescribeMetricDataRequest tags(List<TagFilter> tags) {
        this.tags = tags;
        return this;
    }


    /**
     * set 是否对查询的tags分组
     *
     * @param groupBy
     */
    public BatchDescribeMetricDataRequest groupBy(Boolean groupBy) {
        this.groupBy = groupBy;
        return this;
    }


    /**
     * set 是否求速率
     *
     * @param rate
     */
    public BatchDescribeMetricDataRequest rate(Boolean rate) {
        this.rate = rate;
        return this;
    }


    /**
     * set 资源的类型，取值vm, lb, ip, database 等,&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/monitoring/api/describeservices?content&#x3D;API&amp;SOP&#x3D;JDCloud&quot;&gt;describeServices&lt;/a&gt;：查询己接入云监控的产品线列表
     *
     * @param serviceCode
     */
    public BatchDescribeMetricDataRequest serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set 资源的维度。查询serviceCode下可用的维度请使用describeServices接口
     *
     * @param dimension
     */
    public BatchDescribeMetricDataRequest dimension(String dimension) {
        this.dimension = dimension;
        return this;
    }


    /**
     * set 资源的uuid
     *
     * @param resourceId
     */
    public BatchDescribeMetricDataRequest resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }


    /**
     * set 是否跨资源查询，默认为false。当该字段为false时，取resourceId字段进行查询；当该子弹为true时，忽略resourceId字段，从tags中取resourceId作为实际的多资源id处理。
     *
     * @param multiResources
     */
    public BatchDescribeMetricDataRequest multiResources(Boolean multiResources) {
        this.multiResources = multiResources;
        return this;
    }


    /**
    * set 自定义过滤标签，查询时必须在filters中指定要查询的metric，支持多个metric。如：  name&#x3D;&#39;metric&#39;,values&#x3D;[&quot;metric1&quot;,&quot;metric2&quot;]
    *
    * @param filters
    */
    public BatchDescribeMetricDataRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public BatchDescribeMetricDataRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to 监控指标数据的维度信息,根据tags来筛选指标数据不同的维度
     *
     * @param tag
     */
    public void addTag(TagFilter tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

    /**
     * add item to 自定义过滤标签，查询时必须在filters中指定要查询的metric，支持多个metric。如：  name&#x3D;&#39;metric&#39;,values&#x3D;[&quot;metric1&quot;,&quot;metric2&quot;]
     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }
}