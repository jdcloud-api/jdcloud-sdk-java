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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * setHeaderReq
 */
public class SetHeaderReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * wafInstanceId
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
     * 0表示黑名单，1表示白名单
     */
    private Integer iswhite;

    /**
     * 白名单不检查指定Web防护规则id, 多个逗号分隔
     */
    private String skipRuleId;

    /**
     * header配置
     * Required:true
     */
    @Required
    
    private List<KeyValCfg> headers;


    /**
     * get wafInstanceId
     *
     * @return
     */
    public String getWafInstanceId() {
        return wafInstanceId;
    }

    /**
     * set wafInstanceId
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
     * get 0表示黑名单，1表示白名单
     *
     * @return
     */
    public Integer getIswhite() {
        return iswhite;
    }

    /**
     * set 0表示黑名单，1表示白名单
     *
     * @param iswhite
     */
    public void setIswhite(Integer iswhite) {
        this.iswhite = iswhite;
    }


    /**
     * get 白名单不检查指定Web防护规则id, 多个逗号分隔
     *
     * @return
     */
    public String getSkipRuleId() {
        return skipRuleId;
    }

    /**
     * set 白名单不检查指定Web防护规则id, 多个逗号分隔
     *
     * @param skipRuleId
     */
    public void setSkipRuleId(String skipRuleId) {
        this.skipRuleId = skipRuleId;
    }


    /**
    * get header配置
    *
    * @return
    */
    public List<KeyValCfg> getHeaders() {
        return headers;
    }

    /**
    * set header配置
    *
    * @param headers
    */
    public void setHeaders(List<KeyValCfg> headers) {
        this.headers = headers;
    }



    /**
     * set wafInstanceId
     *
     * @param wafInstanceId
     */
    public SetHeaderReq wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }


    /**
     * set 域名
     *
     * @param domain
     */
    public SetHeaderReq domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * set 0表示黑名单，1表示白名单
     *
     * @param iswhite
     */
    public SetHeaderReq iswhite(Integer iswhite) {
        this.iswhite = iswhite;
        return this;
    }


    /**
     * set 白名单不检查指定Web防护规则id, 多个逗号分隔
     *
     * @param skipRuleId
     */
    public SetHeaderReq skipRuleId(String skipRuleId) {
        this.skipRuleId = skipRuleId;
        return this;
    }


    /**
    * set header配置
    *
    * @param headers
    */
    public SetHeaderReq headers(List<KeyValCfg> headers) {
        this.headers = headers;
        return this;
    }



    /**
     * add item to header配置
     *
     * @param header
     */
    public void addHeader(KeyValCfg header) {
        if (this.headers == null) {
            this.headers = new ArrayList<>();
        }
        this.headers.add(header);
    }
}