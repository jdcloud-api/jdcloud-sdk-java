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

package com.jdcloud.sdk.service.waf.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * setIntSemReq
 */
public class SetIntSemReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * WAF实例id
     * Required:true
     */
    @Required
    private String wafInstanceId;

    /**
     * 域名
     * Required:true
     */
    @Required
    private String domain;

    /**
     * 0表示禁止，1表示激活，默认为0
     */
    private Integer enableIntSem;

    /**
     * 模式，forbidden:拦截模式 或 notice:检测模式
     * Required:true
     */
    @Required
    private String intSemMode;



    /**
     * get WAF实例id
     *
     * @return
     */
    public String getWafInstanceId() {
        return wafInstanceId;
    }

    /**
     * set WAF实例id
     *
     * @param wafInstanceId
     */
    public void setWafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
    }


    /**
     * get 域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * get 0表示禁止，1表示激活，默认为0
     *
     * @return
     */
    public Integer getEnableIntSem() {
        return enableIntSem;
    }

    /**
     * set 0表示禁止，1表示激活，默认为0
     *
     * @param enableIntSem
     */
    public void setEnableIntSem(Integer enableIntSem) {
        this.enableIntSem = enableIntSem;
    }


    /**
     * get 模式，forbidden:拦截模式 或 notice:检测模式
     *
     * @return
     */
    public String getIntSemMode() {
        return intSemMode;
    }

    /**
     * set 模式，forbidden:拦截模式 或 notice:检测模式
     *
     * @param intSemMode
     */
    public void setIntSemMode(String intSemMode) {
        this.intSemMode = intSemMode;
    }



    /**
     * set WAF实例id
     *
     * @param wafInstanceId
     */
    public SetIntSemReq wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }


    /**
     * set 域名
     *
     * @param domain
     */
    public SetIntSemReq domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * set 0表示禁止，1表示激活，默认为0
     *
     * @param enableIntSem
     */
    public SetIntSemReq enableIntSem(Integer enableIntSem) {
        this.enableIntSem = enableIntSem;
        return this;
    }


    /**
     * set 模式，forbidden:拦截模式 或 notice:检测模式
     *
     * @param intSemMode
     */
    public SetIntSemReq intSemMode(String intSemMode) {
        this.intSemMode = intSemMode;
        return this;
    }


}