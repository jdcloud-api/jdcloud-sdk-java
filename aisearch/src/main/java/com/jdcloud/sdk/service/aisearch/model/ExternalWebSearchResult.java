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
 * webSearch接口
 * webSearch接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.aisearch.model;

import com.jdcloud.sdk.service.aisearch.model.CloudWebSearchResponseVo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * webSearch
 */
public class ExternalWebSearchResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * requestId
     */
    private String requestId;

    /**
     * 状态码
     */
    private String code;

    /**
     * 响应信息
     */
    private String msg;

    /**
     * 查询内容
     */
    private CloudWebSearchResponseVo data;



    /**
     * get requestId
     *
     * @return
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * set requestId
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * get 状态码
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * set 状态码
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * get 响应信息
     *
     * @return
     */
    public String getMsg() {
        return msg;
    }

    /**
     * set 响应信息
     *
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }


    /**
     * get 查询内容
     *
     * @return
     */
    public CloudWebSearchResponseVo getData() {
        return data;
    }

    /**
     * set 查询内容
     *
     * @param data
     */
    public void setData(CloudWebSearchResponseVo data) {
        this.data = data;
    }



    /**
     * set requestId
     *
     * @param requestId
     */
    public ExternalWebSearchResult requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }


    /**
     * set 状态码
     *
     * @param code
     */
    public ExternalWebSearchResult code(String code) {
        this.code = code;
        return this;
    }


    /**
     * set 响应信息
     *
     * @param msg
     */
    public ExternalWebSearchResult msg(String msg) {
        this.msg = msg;
        return this;
    }


    /**
     * set 查询内容
     *
     * @param data
     */
    public ExternalWebSearchResult data(CloudWebSearchResponseVo data) {
        this.data = data;
        return this;
    }


}