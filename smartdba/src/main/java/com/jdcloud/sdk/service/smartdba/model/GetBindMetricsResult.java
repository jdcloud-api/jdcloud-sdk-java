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
 * Metrics
 * 实时性能、性能够趋相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.smartdba.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.smartdba.model.SupportMetric;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询实例已经绑定的监控项
 */
public class GetBindMetricsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * sys
     */
    private List<SupportMetric> sys;

    /**
     * server
     */
    private List<SupportMetric> server;


    /**
     * get sys
     *
     * @return
     */
    public List<SupportMetric> getSys() {
        return sys;
    }

    /**
     * set sys
     *
     * @param sys
     */
    public void setSys(List<SupportMetric> sys) {
        this.sys = sys;
    }

    /**
     * get server
     *
     * @return
     */
    public List<SupportMetric> getServer() {
        return server;
    }

    /**
     * set server
     *
     * @param server
     */
    public void setServer(List<SupportMetric> server) {
        this.server = server;
    }


    /**
     * set sys
     *
     * @param sys
     */
    public GetBindMetricsResult sys(List<SupportMetric> sys) {
        this.sys = sys;
        return this;
    }

    /**
     * set server
     *
     * @param server
     */
    public GetBindMetricsResult server(List<SupportMetric> server) {
        this.server = server;
        return this;
    }


    /**
     * add item to sys
     *
     * @param sy
     */
    public void addSy(SupportMetric sy) {
        if (this.sys == null) {
            this.sys = new ArrayList<>();
        }
        this.sys.add(sy);
    }

    /**
     * add item to server
     *
     * @param server
     */
    public void addServer(SupportMetric server) {
        if (this.server == null) {
            this.server = new ArrayList<>();
        }
        this.server.add(server);
    }

}