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
 * Anti DDoS Pro Attack Log APIs
 * Anti DDoS Pro Attack Log APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询攻击次数及流量峰值
 */
public class DescribeAttackStatisticsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 攻击流量峰值
     */
    private Double flow;

    /**
     * 攻击次数
     */
    private Integer count;

    /**
     * 流量单位, bps、Kbps、Mbps、Gbps
     */
    private String unit;


    /**
     * get 攻击流量峰值
     *
     * @return
     */
    public Double getFlow() {
        return flow;
    }

    /**
     * set 攻击流量峰值
     *
     * @param flow
     */
    public void setFlow(Double flow) {
        this.flow = flow;
    }

    /**
     * get 攻击次数
     *
     * @return
     */
    public Integer getCount() {
        return count;
    }

    /**
     * set 攻击次数
     *
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * get 流量单位, bps、Kbps、Mbps、Gbps
     *
     * @return
     */
    public String getUnit() {
        return unit;
    }

    /**
     * set 流量单位, bps、Kbps、Mbps、Gbps
     *
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }


    /**
     * set 攻击流量峰值
     *
     * @param flow
     */
    public DescribeAttackStatisticsResult flow(Double flow) {
        this.flow = flow;
        return this;
    }

    /**
     * set 攻击次数
     *
     * @param count
     */
    public DescribeAttackStatisticsResult count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * set 流量单位, bps、Kbps、Mbps、Gbps
     *
     * @param unit
     */
    public DescribeAttackStatisticsResult unit(String unit) {
        this.unit = unit;
        return this;
    }


}