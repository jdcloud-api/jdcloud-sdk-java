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
 * Put APIs
 * 监控数据上报接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 监控数据上报。
 */
public class PutProductMetricDataResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 失败数量
     */
    private Integer failed;

    /**
     * 成功数量
     */
    private Integer success;


    /**
     * get 失败数量
     *
     * @return
     */
    public Integer getFailed() {
        return failed;
    }

    /**
     * set 失败数量
     *
     * @param failed
     */
    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    /**
     * get 成功数量
     *
     * @return
     */
    public Integer getSuccess() {
        return success;
    }

    /**
     * set 成功数量
     *
     * @param success
     */
    public void setSuccess(Integer success) {
        this.success = success;
    }


    /**
     * set 失败数量
     *
     * @param failed
     */
    public PutProductMetricDataResult failed(Integer failed) {
        this.failed = failed;
        return this;
    }

    /**
     * set 成功数量
     *
     * @param success
     */
    public PutProductMetricDataResult success(Integer success) {
        this.success = success;
        return this;
    }


}