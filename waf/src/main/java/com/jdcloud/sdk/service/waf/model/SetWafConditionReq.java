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
 * setWafConditionReq
 */
public class SetWafConditionReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 0:新增，大于0:更新
     */
    private Integer id;

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
     * 条件名称，新增时必须
     */
    private String conditionName;

    /**
     * 匹配类型，&quot;str&quot;/&quot;regex&quot;/&quot;geo&quot;/&quot;size&quot;/&quot;ip&quot;/&quot;SQLi&quot;/&quot;XSS&quot;
     * Required:true
     */
    @Required
    private String conditionType;

    /**
     * 过滤器配置
     * Required:true
     */
    @Required
    
    private List<FilterCfg> filters;


    /**
     * get 0:新增，大于0:更新
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 0:新增，大于0:更新
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


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
     * get 条件名称，新增时必须
     *
     * @return
     */
    public String getConditionName() {
        return conditionName;
    }

    /**
     * set 条件名称，新增时必须
     *
     * @param conditionName
     */
    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }


    /**
     * get 匹配类型，&quot;str&quot;/&quot;regex&quot;/&quot;geo&quot;/&quot;size&quot;/&quot;ip&quot;/&quot;SQLi&quot;/&quot;XSS&quot;
     *
     * @return
     */
    public String getConditionType() {
        return conditionType;
    }

    /**
     * set 匹配类型，&quot;str&quot;/&quot;regex&quot;/&quot;geo&quot;/&quot;size&quot;/&quot;ip&quot;/&quot;SQLi&quot;/&quot;XSS&quot;
     *
     * @param conditionType
     */
    public void setConditionType(String conditionType) {
        this.conditionType = conditionType;
    }


    /**
    * get 过滤器配置
    *
    * @return
    */
    public List<FilterCfg> getFilters() {
        return filters;
    }

    /**
    * set 过滤器配置
    *
    * @param filters
    */
    public void setFilters(List<FilterCfg> filters) {
        this.filters = filters;
    }



    /**
     * set 0:新增，大于0:更新
     *
     * @param id
     */
    public SetWafConditionReq id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set WAF实例id
     *
     * @param wafInstanceId
     */
    public SetWafConditionReq wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }


    /**
     * set 域名
     *
     * @param domain
     */
    public SetWafConditionReq domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * set 条件名称，新增时必须
     *
     * @param conditionName
     */
    public SetWafConditionReq conditionName(String conditionName) {
        this.conditionName = conditionName;
        return this;
    }


    /**
     * set 匹配类型，&quot;str&quot;/&quot;regex&quot;/&quot;geo&quot;/&quot;size&quot;/&quot;ip&quot;/&quot;SQLi&quot;/&quot;XSS&quot;
     *
     * @param conditionType
     */
    public SetWafConditionReq conditionType(String conditionType) {
        this.conditionType = conditionType;
        return this;
    }


    /**
    * set 过滤器配置
    *
    * @param filters
    */
    public SetWafConditionReq filters(List<FilterCfg> filters) {
        this.filters = filters;
        return this;
    }



    /**
     * add item to 过滤器配置
     *
     * @param filter
     */
    public void addFilter(FilterCfg filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }
}