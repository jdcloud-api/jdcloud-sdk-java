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
 * Loki Log Search APIs
 * 产品日志查询（loki）
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.logs.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * lokiResponseResult
 */
public class LokiResponseResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日志查询及聚合查询的label：map类型，key为固定label及自定义label，固定label说明如下，product_name：产品名、instance_name：实例名、log_type：日志类型、namespace：命名空间、cluster_id：集群id、container_name：容器名、host：主机ip、pod_name：pod名、filePath：采集文件路径
     */
    private Object stream;

    /**
     * 统计结果分组的label：map类型，固定label及自定义label，返回统计时分组的label
     */
    private Object metric;

    /**
     * 日志查询及聚合查询结果，数组中的object为一个长度为2的数组，每个数组第一个元素为纳秒时间字符串(聚合查询时为秒时间戳数字)，第二个元素为日志（聚合查询时为数量字符串），格式：[[纳秒时间戳字符串(聚合时为数字),日志原文字符串1],[纳秒时间戳字符串(聚合时为数字),日志原文字符串2]]
     */
    
    private List<Object> values;
    /**
     * 统计结果，长度为2的数组，示例格式：[秒时间戳数字,统计数量数字字符串]
     */
    private Object value;



    /**
     * get 日志查询及聚合查询的label：map类型，key为固定label及自定义label，固定label说明如下，product_name：产品名、instance_name：实例名、log_type：日志类型、namespace：命名空间、cluster_id：集群id、container_name：容器名、host：主机ip、pod_name：pod名、filePath：采集文件路径
     *
     * @return
     */
    public Object getStream() {
        return stream;
    }

    /**
     * set 日志查询及聚合查询的label：map类型，key为固定label及自定义label，固定label说明如下，product_name：产品名、instance_name：实例名、log_type：日志类型、namespace：命名空间、cluster_id：集群id、container_name：容器名、host：主机ip、pod_name：pod名、filePath：采集文件路径
     *
     * @param stream
     */
    public void setStream(Object stream) {
        this.stream = stream;
    }


    /**
     * get 统计结果分组的label：map类型，固定label及自定义label，返回统计时分组的label
     *
     * @return
     */
    public Object getMetric() {
        return metric;
    }

    /**
     * set 统计结果分组的label：map类型，固定label及自定义label，返回统计时分组的label
     *
     * @param metric
     */
    public void setMetric(Object metric) {
        this.metric = metric;
    }


    /**
    * get 日志查询及聚合查询结果，数组中的object为一个长度为2的数组，每个数组第一个元素为纳秒时间字符串(聚合查询时为秒时间戳数字)，第二个元素为日志（聚合查询时为数量字符串），格式：[[纳秒时间戳字符串(聚合时为数字),日志原文字符串1],[纳秒时间戳字符串(聚合时为数字),日志原文字符串2]]
    *
    * @return
    */
    public List<Object> getValues() {
        return values;
    }

    /**
    * set 日志查询及聚合查询结果，数组中的object为一个长度为2的数组，每个数组第一个元素为纳秒时间字符串(聚合查询时为秒时间戳数字)，第二个元素为日志（聚合查询时为数量字符串），格式：[[纳秒时间戳字符串(聚合时为数字),日志原文字符串1],[纳秒时间戳字符串(聚合时为数字),日志原文字符串2]]
    *
    * @param values
    */
    public void setValues(List<Object> values) {
        this.values = values;
    }


    /**
     * get 统计结果，长度为2的数组，示例格式：[秒时间戳数字,统计数量数字字符串]
     *
     * @return
     */
    public Object getValue() {
        return value;
    }

    /**
     * set 统计结果，长度为2的数组，示例格式：[秒时间戳数字,统计数量数字字符串]
     *
     * @param value
     */
    public void setValue(Object value) {
        this.value = value;
    }



    /**
     * set 日志查询及聚合查询的label：map类型，key为固定label及自定义label，固定label说明如下，product_name：产品名、instance_name：实例名、log_type：日志类型、namespace：命名空间、cluster_id：集群id、container_name：容器名、host：主机ip、pod_name：pod名、filePath：采集文件路径
     *
     * @param stream
     */
    public LokiResponseResult stream(Object stream) {
        this.stream = stream;
        return this;
    }


    /**
     * set 统计结果分组的label：map类型，固定label及自定义label，返回统计时分组的label
     *
     * @param metric
     */
    public LokiResponseResult metric(Object metric) {
        this.metric = metric;
        return this;
    }


    /**
    * set 日志查询及聚合查询结果，数组中的object为一个长度为2的数组，每个数组第一个元素为纳秒时间字符串(聚合查询时为秒时间戳数字)，第二个元素为日志（聚合查询时为数量字符串），格式：[[纳秒时间戳字符串(聚合时为数字),日志原文字符串1],[纳秒时间戳字符串(聚合时为数字),日志原文字符串2]]
    *
    * @param values
    */
    public LokiResponseResult values(List<Object> values) {
        this.values = values;
        return this;
    }


    /**
     * set 统计结果，长度为2的数组，示例格式：[秒时间戳数字,统计数量数字字符串]
     *
     * @param value
     */
    public LokiResponseResult value(Object value) {
        this.value = value;
        return this;
    }



    /**
     * add item to 日志查询及聚合查询结果，数组中的object为一个长度为2的数组，每个数组第一个元素为纳秒时间字符串(聚合查询时为秒时间戳数字)，第二个元素为日志（聚合查询时为数量字符串），格式：[[纳秒时间戳字符串(聚合时为数字),日志原文字符串1],[纳秒时间戳字符串(聚合时为数字),日志原文字符串2]]
     *
     * @param value
     */
    public void addValue(Object value) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(value);
    }
}