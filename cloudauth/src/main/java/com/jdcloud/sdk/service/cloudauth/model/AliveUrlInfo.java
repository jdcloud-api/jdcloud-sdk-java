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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cloudauth.model;


/**
 * aliveUrlInfo
 */
public class AliveUrlInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 状态码
     */
    private String code;

    /**
     * 状态信息
     */
    private String message;

    /**
     * 采集页面URL
     */
    private String url;

    /**
     * token(获取检测结果时需要用到)
     */
    private String token;



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
     * get 状态信息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 状态信息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * get 采集页面URL
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set 采集页面URL
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }


    /**
     * get token(获取检测结果时需要用到)
     *
     * @return
     */
    public String getToken() {
        return token;
    }

    /**
     * set token(获取检测结果时需要用到)
     *
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }



    /**
     * set 状态码
     *
     * @param code
     */
    public AliveUrlInfo code(String code) {
        this.code = code;
        return this;
    }


    /**
     * set 状态信息
     *
     * @param message
     */
    public AliveUrlInfo message(String message) {
        this.message = message;
        return this;
    }


    /**
     * set 采集页面URL
     *
     * @param url
     */
    public AliveUrlInfo url(String url) {
        this.url = url;
        return this;
    }


    /**
     * set token(获取检测结果时需要用到)
     *
     * @param token
     */
    public AliveUrlInfo token(String token) {
        this.token = token;
        return this;
    }


}