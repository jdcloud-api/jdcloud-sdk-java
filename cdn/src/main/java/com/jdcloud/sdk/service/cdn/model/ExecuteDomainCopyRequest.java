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

import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 域名一键复制配置
 */
public class ExecuteDomainCopyRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 源域名
     */
    private String domain;

    /**
     * 待复制的域名列表,多个以&quot;,&quot;分隔,且不超过20个
     */
    private String copyDomains;

    /**
     * 待复制的配置项名字,区分大小写.配置项的含义：originConfig：回源配置信息;refererConfig：referer防盗链;urlAuthConfig：URL鉴权;userAgentConfig：UA访问控制;ipBlackListConfig：IP黑名单;cacheConfig：缓存配置;schemeFollowOriConfig：协议跟随回源;oriFollowRedirectConfig：回源跟随302;filterParamsConfig：过滤参数;rangeConfig：range回源;videoDraftConfig：视频拖拽;httpsConfig：Https配置;httpHeaderConfig：HttpHeader设置;otherConfig：其他配置
     */
    private String configKeys;



    /**
     * get 源域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 源域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * get 待复制的域名列表,多个以&quot;,&quot;分隔,且不超过20个
     *
     * @return
     */
    public String getCopyDomains() {
        return copyDomains;
    }

    /**
     * set 待复制的域名列表,多个以&quot;,&quot;分隔,且不超过20个
     *
     * @param copyDomains
     */
    public void setCopyDomains(String copyDomains) {
        this.copyDomains = copyDomains;
    }


    /**
     * get 待复制的配置项名字,区分大小写.配置项的含义：originConfig：回源配置信息;refererConfig：referer防盗链;urlAuthConfig：URL鉴权;userAgentConfig：UA访问控制;ipBlackListConfig：IP黑名单;cacheConfig：缓存配置;schemeFollowOriConfig：协议跟随回源;oriFollowRedirectConfig：回源跟随302;filterParamsConfig：过滤参数;rangeConfig：range回源;videoDraftConfig：视频拖拽;httpsConfig：Https配置;httpHeaderConfig：HttpHeader设置;otherConfig：其他配置
     *
     * @return
     */
    public String getConfigKeys() {
        return configKeys;
    }

    /**
     * set 待复制的配置项名字,区分大小写.配置项的含义：originConfig：回源配置信息;refererConfig：referer防盗链;urlAuthConfig：URL鉴权;userAgentConfig：UA访问控制;ipBlackListConfig：IP黑名单;cacheConfig：缓存配置;schemeFollowOriConfig：协议跟随回源;oriFollowRedirectConfig：回源跟随302;filterParamsConfig：过滤参数;rangeConfig：range回源;videoDraftConfig：视频拖拽;httpsConfig：Https配置;httpHeaderConfig：HttpHeader设置;otherConfig：其他配置
     *
     * @param configKeys
     */
    public void setConfigKeys(String configKeys) {
        this.configKeys = configKeys;
    }



    /**
     * set 源域名
     *
     * @param domain
     */
    public ExecuteDomainCopyRequest domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * set 待复制的域名列表,多个以&quot;,&quot;分隔,且不超过20个
     *
     * @param copyDomains
     */
    public ExecuteDomainCopyRequest copyDomains(String copyDomains) {
        this.copyDomains = copyDomains;
        return this;
    }


    /**
     * set 待复制的配置项名字,区分大小写.配置项的含义：originConfig：回源配置信息;refererConfig：referer防盗链;urlAuthConfig：URL鉴权;userAgentConfig：UA访问控制;ipBlackListConfig：IP黑名单;cacheConfig：缓存配置;schemeFollowOriConfig：协议跟随回源;oriFollowRedirectConfig：回源跟随302;filterParamsConfig：过滤参数;rangeConfig：range回源;videoDraftConfig：视频拖拽;httpsConfig：Https配置;httpHeaderConfig：HttpHeader设置;otherConfig：其他配置
     *
     * @param configKeys
     */
    public ExecuteDomainCopyRequest configKeys(String configKeys) {
        this.configKeys = configKeys;
        return this;
    }


}