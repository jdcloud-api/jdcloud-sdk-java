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
 * 域名操作类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询域名组详情
 */
public class QueryDomainGroupDetailResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * domains
     */
    
    private List<String> domains;
    /**
     * 主域名
     */
    private String primaryDomain;

    /**
     * 是否共享缓存
     */
    private String shareCache;

    /**
     * 域名组名称
     */
    private String domainGroupName;



    /**
    * get domains
    *
    * @return
    */
    public List<String> getDomains() {
        return domains;
    }

    /**
    * set domains
    *
    * @param domains
    */
    public void setDomains(List<String> domains) {
        this.domains = domains;
    }


    /**
     * get 主域名
     *
     * @return
     */
    public String getPrimaryDomain() {
        return primaryDomain;
    }

    /**
     * set 主域名
     *
     * @param primaryDomain
     */
    public void setPrimaryDomain(String primaryDomain) {
        this.primaryDomain = primaryDomain;
    }


    /**
     * get 是否共享缓存
     *
     * @return
     */
    public String getShareCache() {
        return shareCache;
    }

    /**
     * set 是否共享缓存
     *
     * @param shareCache
     */
    public void setShareCache(String shareCache) {
        this.shareCache = shareCache;
    }


    /**
     * get 域名组名称
     *
     * @return
     */
    public String getDomainGroupName() {
        return domainGroupName;
    }

    /**
     * set 域名组名称
     *
     * @param domainGroupName
     */
    public void setDomainGroupName(String domainGroupName) {
        this.domainGroupName = domainGroupName;
    }



    /**
    * set domains
    *
    * @param domains
    */
    public QueryDomainGroupDetailResult domains(List<String> domains) {
        this.domains = domains;
        return this;
    }


    /**
     * set 主域名
     *
     * @param primaryDomain
     */
    public QueryDomainGroupDetailResult primaryDomain(String primaryDomain) {
        this.primaryDomain = primaryDomain;
        return this;
    }


    /**
     * set 是否共享缓存
     *
     * @param shareCache
     */
    public QueryDomainGroupDetailResult shareCache(String shareCache) {
        this.shareCache = shareCache;
        return this;
    }


    /**
     * set 域名组名称
     *
     * @param domainGroupName
     */
    public QueryDomainGroupDetailResult domainGroupName(String domainGroupName) {
        this.domainGroupName = domainGroupName;
        return this;
    }



    /**
     * add item to domains
     *
     * @param domain
     */
    public void addDomain(String domain) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domain);
    }
}