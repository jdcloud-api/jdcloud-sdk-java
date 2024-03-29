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
 * 实名认证-服务管理接口
 * 实名认证-服务管理接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cloudauth.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询所有支持的银行
 */
public class QueryBankListResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 认证结果true 成功, false 失败
     */
    private Boolean success;

    /**
     * 是否有异常 true 有异常, false 无异常
     */
    private Boolean hasException;

    /**
     * 认证结果状态码
     */
    private String code;

    /**
     * 认证结果
     */
    private String message;

    /**
     * 字符串形式的查询结果，内容为json
     */
    private String detail;



    /**
     * get 认证结果true 成功, false 失败
     *
     * @return
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * set 认证结果true 成功, false 失败
     *
     * @param success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }


    /**
     * get 是否有异常 true 有异常, false 无异常
     *
     * @return
     */
    public Boolean getHasException() {
        return hasException;
    }

    /**
     * set 是否有异常 true 有异常, false 无异常
     *
     * @param hasException
     */
    public void setHasException(Boolean hasException) {
        this.hasException = hasException;
    }


    /**
     * get 认证结果状态码
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * set 认证结果状态码
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * get 认证结果
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 认证结果
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * get 字符串形式的查询结果，内容为json
     *
     * @return
     */
    public String getDetail() {
        return detail;
    }

    /**
     * set 字符串形式的查询结果，内容为json
     *
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }



    /**
     * set 认证结果true 成功, false 失败
     *
     * @param success
     */
    public QueryBankListResult success(Boolean success) {
        this.success = success;
        return this;
    }


    /**
     * set 是否有异常 true 有异常, false 无异常
     *
     * @param hasException
     */
    public QueryBankListResult hasException(Boolean hasException) {
        this.hasException = hasException;
        return this;
    }


    /**
     * set 认证结果状态码
     *
     * @param code
     */
    public QueryBankListResult code(String code) {
        this.code = code;
        return this;
    }


    /**
     * set 认证结果
     *
     * @param message
     */
    public QueryBankListResult message(String message) {
        this.message = message;
        return this;
    }


    /**
     * set 字符串形式的查询结果，内容为json
     *
     * @param detail
     */
    public QueryBankListResult detail(String detail) {
        this.detail = detail;
        return this;
    }


}