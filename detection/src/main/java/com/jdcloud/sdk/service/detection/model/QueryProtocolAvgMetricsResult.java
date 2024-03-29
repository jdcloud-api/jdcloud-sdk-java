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
 * Task related APIs
 * 云拔测-任务相关接口
 *
 * OpenAPI spec version: v3
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.detection.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.detection.model.ProtocolMetric;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询协议类型任务平均指标数据
 */
public class QueryProtocolAvgMetricsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * success
     */
    private Boolean success;

    /**
     * message
     */
    private String message;

    /**
     * data
     */
    
    private List<ProtocolMetric> data;


    /**
     * get success
     *
     * @return
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * set success
     *
     * @param success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }


    /**
     * get message
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set message
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
    * get data
    *
    * @return
    */
    public List<ProtocolMetric> getData() {
        return data;
    }

    /**
    * set data
    *
    * @param data
    */
    public void setData(List<ProtocolMetric> data) {
        this.data = data;
    }



    /**
     * set success
     *
     * @param success
     */
    public QueryProtocolAvgMetricsResult success(Boolean success) {
        this.success = success;
        return this;
    }


    /**
     * set message
     *
     * @param message
     */
    public QueryProtocolAvgMetricsResult message(String message) {
        this.message = message;
        return this;
    }


    /**
    * set data
    *
    * @param data
    */
    public QueryProtocolAvgMetricsResult data(List<ProtocolMetric> data) {
        this.data = data;
        return this;
    }



    /**
     * add item to data
     *
     * @param data
     */
    public void addData(ProtocolMetric data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }
}