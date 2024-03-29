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

/**
 * listWafFilterCfg
 */
public class ListWafFilterCfg  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * WAF实例id
     */
    private String wafInstanceId;

    /**
     * 域名
     */
    private String domain;

    /**
     * 所属条件的id
     */
    private String conditionId;

    /**
     * 名称
     */
    private String conditionName;

    /**
     * 匹配类型
     */
    private String conditionType;

    /**
     * 过滤器配置
     */
    
    private List<FilterCfg> filters;


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
     * get 所属条件的id
     *
     * @return
     */
    public String getConditionId() {
        return conditionId;
    }

    /**
     * set 所属条件的id
     *
     * @param conditionId
     */
    public void setConditionId(String conditionId) {
        this.conditionId = conditionId;
    }


    /**
     * get 名称
     *
     * @return
     */
    public String getConditionName() {
        return conditionName;
    }

    /**
     * set 名称
     *
     * @param conditionName
     */
    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }


    /**
     * get 匹配类型
     *
     * @return
     */
    public String getConditionType() {
        return conditionType;
    }

    /**
     * set 匹配类型
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
     * set WAF实例id
     *
     * @param wafInstanceId
     */
    public ListWafFilterCfg wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }


    /**
     * set 域名
     *
     * @param domain
     */
    public ListWafFilterCfg domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * set 所属条件的id
     *
     * @param conditionId
     */
    public ListWafFilterCfg conditionId(String conditionId) {
        this.conditionId = conditionId;
        return this;
    }


    /**
     * set 名称
     *
     * @param conditionName
     */
    public ListWafFilterCfg conditionName(String conditionName) {
        this.conditionName = conditionName;
        return this;
    }


    /**
     * set 匹配类型
     *
     * @param conditionType
     */
    public ListWafFilterCfg conditionType(String conditionType) {
        this.conditionType = conditionType;
        return this;
    }


    /**
    * set 过滤器配置
    *
    * @param filters
    */
    public ListWafFilterCfg filters(List<FilterCfg> filters) {
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