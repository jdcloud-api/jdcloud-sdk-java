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
 * 实例管理
 * 实例管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.clickhouse.model;

import com.jdcloud.sdk.service.clickhouse.model.ChSpec;
import com.jdcloud.sdk.service.clickhouse.model.ZkSpec;
import com.jdcloud.sdk.service.clickhouse.model.MonitorSpec;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询 node 可用规格
 */
public class DescribeNodeClassesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * chSpec
     */
    private ChSpec chSpec;

    /**
     * zkSpec
     */
    private ZkSpec zkSpec;

    /**
     * monitorSpec
     */
    private MonitorSpec monitorSpec;


    /**
     * get chSpec
     *
     * @return
     */
    public ChSpec getChSpec() {
        return chSpec;
    }

    /**
     * set chSpec
     *
     * @param chSpec
     */
    public void setChSpec(ChSpec chSpec) {
        this.chSpec = chSpec;
    }

    /**
     * get zkSpec
     *
     * @return
     */
    public ZkSpec getZkSpec() {
        return zkSpec;
    }

    /**
     * set zkSpec
     *
     * @param zkSpec
     */
    public void setZkSpec(ZkSpec zkSpec) {
        this.zkSpec = zkSpec;
    }

    /**
     * get monitorSpec
     *
     * @return
     */
    public MonitorSpec getMonitorSpec() {
        return monitorSpec;
    }

    /**
     * set monitorSpec
     *
     * @param monitorSpec
     */
    public void setMonitorSpec(MonitorSpec monitorSpec) {
        this.monitorSpec = monitorSpec;
    }


    /**
     * set chSpec
     *
     * @param chSpec
     */
    public DescribeNodeClassesResult chSpec(ChSpec chSpec) {
        this.chSpec = chSpec;
        return this;
    }

    /**
     * set zkSpec
     *
     * @param zkSpec
     */
    public DescribeNodeClassesResult zkSpec(ZkSpec zkSpec) {
        this.zkSpec = zkSpec;
        return this;
    }

    /**
     * set monitorSpec
     *
     * @param monitorSpec
     */
    public DescribeNodeClassesResult monitorSpec(MonitorSpec monitorSpec) {
        this.monitorSpec = monitorSpec;
        return this;
    }


}