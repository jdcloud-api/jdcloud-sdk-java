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
 * Metric APIs
 * 日志服务日志监控任务相关的管理控制接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.logs.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.logs.model.MetricTaskSqlSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 更新监控任务，日志监控任务不许重名。
 */
public class UpdateMetricTaskRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 聚合函数,支持 count sum max min avg; 配置方式(SettingType) 为 空或visual 时，必填；
     */
    private String aggregate;

    /**
     * 自定义单位
     * Required:true
     */
    @Required
    private String customUnit;

    /**
     * 查询字段,支持 英文字母 数字 下划线 中划线 点（中文日志原文和各产品线的key）; 配置方式(SettingType) 为 空或visual 时，必填；
     */
    private String dataField;

    /**
     * 过滤语法，可以为空
     */
    private String filterContent;

    /**
     * 是否打开过滤; 配置方式(SettingType) 为 空或visual 时，必填；
     */
    private String filterOpen;

    /**
     * 过滤类型，只能是fulltext和 advance; 配置方式(SettingType) 为 空或visual 时，必填；
     */
    private String filterType;

    /**
     * 监控项 , 支持大小写英文字母 下划线 数字 点，且不超过255byte（不支持中划线）; 配置方式(SettingType) 为 空或visual 时，必填；
     */
    private String metric;

    /**
     * 监控任务名称,同一日志主题下唯一，支持中文 大小写英文字母 下划线 中划线 数字，且不超过32
     * Required:true
     */
    @Required
    private String name;

    /**
     * 配置方式: 可选参数；枚举值 visual，sql；分别代表可视化配置及sql配置方式，传空表示可视化配置；
     */
    private String settingType;

    /**
     * sqlSpec
     */
    private MetricTaskSqlSpec sqlSpec;

    /**
     * 单位
     * Required:true
     */
    @Required
    private String unit;

    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 日志集 UID
     * Required:true
     */
    @Required
    private String logsetUID;

    /**
     * 日志主题 UID
     * Required:true
     */
    @Required
    private String logtopicUID;

    /**
     * logmetrictaskUID
     * Required:true
     */
    @Required
    private String logmetrictaskUID;



    /**
     * get 聚合函数,支持 count sum max min avg; 配置方式(SettingType) 为 空或visual 时，必填；
     *
     * @return
     */
    public String getAggregate() {
        return aggregate;
    }

    /**
     * set 聚合函数,支持 count sum max min avg; 配置方式(SettingType) 为 空或visual 时，必填；
     *
     * @param aggregate
     */
    public void setAggregate(String aggregate) {
        this.aggregate = aggregate;
    }


    /**
     * get 自定义单位
     *
     * @return
     */
    public String getCustomUnit() {
        return customUnit;
    }

    /**
     * set 自定义单位
     *
     * @param customUnit
     */
    public void setCustomUnit(String customUnit) {
        this.customUnit = customUnit;
    }


    /**
     * get 查询字段,支持 英文字母 数字 下划线 中划线 点（中文日志原文和各产品线的key）; 配置方式(SettingType) 为 空或visual 时，必填；
     *
     * @return
     */
    public String getDataField() {
        return dataField;
    }

    /**
     * set 查询字段,支持 英文字母 数字 下划线 中划线 点（中文日志原文和各产品线的key）; 配置方式(SettingType) 为 空或visual 时，必填；
     *
     * @param dataField
     */
    public void setDataField(String dataField) {
        this.dataField = dataField;
    }


    /**
     * get 过滤语法，可以为空
     *
     * @return
     */
    public String getFilterContent() {
        return filterContent;
    }

    /**
     * set 过滤语法，可以为空
     *
     * @param filterContent
     */
    public void setFilterContent(String filterContent) {
        this.filterContent = filterContent;
    }


    /**
     * get 是否打开过滤; 配置方式(SettingType) 为 空或visual 时，必填；
     *
     * @return
     */
    public String getFilterOpen() {
        return filterOpen;
    }

    /**
     * set 是否打开过滤; 配置方式(SettingType) 为 空或visual 时，必填；
     *
     * @param filterOpen
     */
    public void setFilterOpen(String filterOpen) {
        this.filterOpen = filterOpen;
    }


    /**
     * get 过滤类型，只能是fulltext和 advance; 配置方式(SettingType) 为 空或visual 时，必填；
     *
     * @return
     */
    public String getFilterType() {
        return filterType;
    }

    /**
     * set 过滤类型，只能是fulltext和 advance; 配置方式(SettingType) 为 空或visual 时，必填；
     *
     * @param filterType
     */
    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }


    /**
     * get 监控项 , 支持大小写英文字母 下划线 数字 点，且不超过255byte（不支持中划线）; 配置方式(SettingType) 为 空或visual 时，必填；
     *
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * set 监控项 , 支持大小写英文字母 下划线 数字 点，且不超过255byte（不支持中划线）; 配置方式(SettingType) 为 空或visual 时，必填；
     *
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }


    /**
     * get 监控任务名称,同一日志主题下唯一，支持中文 大小写英文字母 下划线 中划线 数字，且不超过32
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 监控任务名称,同一日志主题下唯一，支持中文 大小写英文字母 下划线 中划线 数字，且不超过32
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 配置方式: 可选参数；枚举值 visual，sql；分别代表可视化配置及sql配置方式，传空表示可视化配置；
     *
     * @return
     */
    public String getSettingType() {
        return settingType;
    }

    /**
     * set 配置方式: 可选参数；枚举值 visual，sql；分别代表可视化配置及sql配置方式，传空表示可视化配置；
     *
     * @param settingType
     */
    public void setSettingType(String settingType) {
        this.settingType = settingType;
    }


    /**
     * get sqlSpec
     *
     * @return
     */
    public MetricTaskSqlSpec getSqlSpec() {
        return sqlSpec;
    }

    /**
     * set sqlSpec
     *
     * @param sqlSpec
     */
    public void setSqlSpec(MetricTaskSqlSpec sqlSpec) {
        this.sqlSpec = sqlSpec;
    }


    /**
     * get 单位
     *
     * @return
     */
    public String getUnit() {
        return unit;
    }

    /**
     * set 单位
     *
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
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
     * get 日志集 UID
     *
     * @return
     */
    public String getLogsetUID() {
        return logsetUID;
    }

    /**
     * set 日志集 UID
     *
     * @param logsetUID
     */
    public void setLogsetUID(String logsetUID) {
        this.logsetUID = logsetUID;
    }


    /**
     * get 日志主题 UID
     *
     * @return
     */
    public String getLogtopicUID() {
        return logtopicUID;
    }

    /**
     * set 日志主题 UID
     *
     * @param logtopicUID
     */
    public void setLogtopicUID(String logtopicUID) {
        this.logtopicUID = logtopicUID;
    }


    /**
     * get logmetrictaskUID
     *
     * @return
     */
    public String getLogmetrictaskUID() {
        return logmetrictaskUID;
    }

    /**
     * set logmetrictaskUID
     *
     * @param logmetrictaskUID
     */
    public void setLogmetrictaskUID(String logmetrictaskUID) {
        this.logmetrictaskUID = logmetrictaskUID;
    }



    /**
     * set 聚合函数,支持 count sum max min avg; 配置方式(SettingType) 为 空或visual 时，必填；
     *
     * @param aggregate
     */
    public UpdateMetricTaskRequest aggregate(String aggregate) {
        this.aggregate = aggregate;
        return this;
    }


    /**
     * set 自定义单位
     *
     * @param customUnit
     */
    public UpdateMetricTaskRequest customUnit(String customUnit) {
        this.customUnit = customUnit;
        return this;
    }


    /**
     * set 查询字段,支持 英文字母 数字 下划线 中划线 点（中文日志原文和各产品线的key）; 配置方式(SettingType) 为 空或visual 时，必填；
     *
     * @param dataField
     */
    public UpdateMetricTaskRequest dataField(String dataField) {
        this.dataField = dataField;
        return this;
    }


    /**
     * set 过滤语法，可以为空
     *
     * @param filterContent
     */
    public UpdateMetricTaskRequest filterContent(String filterContent) {
        this.filterContent = filterContent;
        return this;
    }


    /**
     * set 是否打开过滤; 配置方式(SettingType) 为 空或visual 时，必填；
     *
     * @param filterOpen
     */
    public UpdateMetricTaskRequest filterOpen(String filterOpen) {
        this.filterOpen = filterOpen;
        return this;
    }


    /**
     * set 过滤类型，只能是fulltext和 advance; 配置方式(SettingType) 为 空或visual 时，必填；
     *
     * @param filterType
     */
    public UpdateMetricTaskRequest filterType(String filterType) {
        this.filterType = filterType;
        return this;
    }


    /**
     * set 监控项 , 支持大小写英文字母 下划线 数字 点，且不超过255byte（不支持中划线）; 配置方式(SettingType) 为 空或visual 时，必填；
     *
     * @param metric
     */
    public UpdateMetricTaskRequest metric(String metric) {
        this.metric = metric;
        return this;
    }


    /**
     * set 监控任务名称,同一日志主题下唯一，支持中文 大小写英文字母 下划线 中划线 数字，且不超过32
     *
     * @param name
     */
    public UpdateMetricTaskRequest name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 配置方式: 可选参数；枚举值 visual，sql；分别代表可视化配置及sql配置方式，传空表示可视化配置；
     *
     * @param settingType
     */
    public UpdateMetricTaskRequest settingType(String settingType) {
        this.settingType = settingType;
        return this;
    }


    /**
     * set sqlSpec
     *
     * @param sqlSpec
     */
    public UpdateMetricTaskRequest sqlSpec(MetricTaskSqlSpec sqlSpec) {
        this.sqlSpec = sqlSpec;
        return this;
    }


    /**
     * set 单位
     *
     * @param unit
     */
    public UpdateMetricTaskRequest unit(String unit) {
        this.unit = unit;
        return this;
    }


    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public UpdateMetricTaskRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 日志集 UID
     *
     * @param logsetUID
     */
    public UpdateMetricTaskRequest logsetUID(String logsetUID) {
        this.logsetUID = logsetUID;
        return this;
    }


    /**
     * set 日志主题 UID
     *
     * @param logtopicUID
     */
    public UpdateMetricTaskRequest logtopicUID(String logtopicUID) {
        this.logtopicUID = logtopicUID;
        return this;
    }


    /**
     * set logmetrictaskUID
     *
     * @param logmetrictaskUID
     */
    public UpdateMetricTaskRequest logmetrictaskUID(String logmetrictaskUID) {
        this.logmetrictaskUID = logmetrictaskUID;
        return this;
    }


}