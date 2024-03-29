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
 * Attack Log APIs
 * Anti DDoS Protection Package Attack Log APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.antipro.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 攻击记录统计, 参数 ip 优先级大于 instanceId. &lt;br&gt;- 指定 ip 参数时, 忽略 instanceId 参数, 统计 ip 的攻击情况. &lt;br&gt;- 未指定 ip 时, 统计 instanceId 指定实例相关攻击情况. &lt;br&gt;- ip 和 instanceId 均未指定时, 查询用户所有公网 IP 攻击情况
 */
public class DescribeAttackStatisticsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 攻击次数
     */
    private Integer attackCount;

    /**
     * 黑洞次数
     */
    private Integer blackHoleCount;

    /**
     * 攻击流量峰值
     */
    private Double peak;

    /**
     * 攻击流量单位
     */
    private String unit;


    /**
     * get 攻击次数
     *
     * @return
     */
    public Integer getAttackCount() {
        return attackCount;
    }

    /**
     * set 攻击次数
     *
     * @param attackCount
     */
    public void setAttackCount(Integer attackCount) {
        this.attackCount = attackCount;
    }

    /**
     * get 黑洞次数
     *
     * @return
     */
    public Integer getBlackHoleCount() {
        return blackHoleCount;
    }

    /**
     * set 黑洞次数
     *
     * @param blackHoleCount
     */
    public void setBlackHoleCount(Integer blackHoleCount) {
        this.blackHoleCount = blackHoleCount;
    }

    /**
     * get 攻击流量峰值
     *
     * @return
     */
    public Double getPeak() {
        return peak;
    }

    /**
     * set 攻击流量峰值
     *
     * @param peak
     */
    public void setPeak(Double peak) {
        this.peak = peak;
    }

    /**
     * get 攻击流量单位
     *
     * @return
     */
    public String getUnit() {
        return unit;
    }

    /**
     * set 攻击流量单位
     *
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }


    /**
     * set 攻击次数
     *
     * @param attackCount
     */
    public DescribeAttackStatisticsResult attackCount(Integer attackCount) {
        this.attackCount = attackCount;
        return this;
    }

    /**
     * set 黑洞次数
     *
     * @param blackHoleCount
     */
    public DescribeAttackStatisticsResult blackHoleCount(Integer blackHoleCount) {
        this.blackHoleCount = blackHoleCount;
        return this;
    }

    /**
     * set 攻击流量峰值
     *
     * @param peak
     */
    public DescribeAttackStatisticsResult peak(Double peak) {
        this.peak = peak;
        return this;
    }

    /**
     * set 攻击流量单位
     *
     * @param unit
     */
    public DescribeAttackStatisticsResult unit(String unit) {
        this.unit = unit;
        return this;
    }


}