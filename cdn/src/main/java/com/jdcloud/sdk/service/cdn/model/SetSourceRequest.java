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
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设置源站信息
 */
public class SetSourceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 回源类型只能是[ips,domain,oss]中的一种
     */
    private String sourceType;

    /**
     * 回源方式,只能是[https,http]中的一种,默认http
     */
    private String backSourceType;

    /**
     * 加速区域,必须是[mainland,nonMainland,all]中的一种,分别代表大陆,海外+中国港澳台,全球
     */
    private String accelerateRegion;

    /**
     * ipSource
     */
    
    private List<IpSourceInfo> ipSource;
    /**
     * domainSource
     */
    
    private List<DomainSourceInfo> domainSource;
    /**
     * oss回源域名
     */
    private String ossSource;

    /**
     * 默认回源host
     */
    private String defaultSourceHost;

    /**
     * 用户域名
     * Required:true
     */
    @Required
    private String domain;



    /**
     * get 回源类型只能是[ips,domain,oss]中的一种
     *
     * @return
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * set 回源类型只能是[ips,domain,oss]中的一种
     *
     * @param sourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }


    /**
     * get 回源方式,只能是[https,http]中的一种,默认http
     *
     * @return
     */
    public String getBackSourceType() {
        return backSourceType;
    }

    /**
     * set 回源方式,只能是[https,http]中的一种,默认http
     *
     * @param backSourceType
     */
    public void setBackSourceType(String backSourceType) {
        this.backSourceType = backSourceType;
    }


    /**
     * get 加速区域,必须是[mainland,nonMainland,all]中的一种,分别代表大陆,海外+中国港澳台,全球
     *
     * @return
     */
    public String getAccelerateRegion() {
        return accelerateRegion;
    }

    /**
     * set 加速区域,必须是[mainland,nonMainland,all]中的一种,分别代表大陆,海外+中国港澳台,全球
     *
     * @param accelerateRegion
     */
    public void setAccelerateRegion(String accelerateRegion) {
        this.accelerateRegion = accelerateRegion;
    }


    /**
    * get ipSource
    *
    * @return
    */
    public List<IpSourceInfo> getIpSource() {
        return ipSource;
    }

    /**
    * set ipSource
    *
    * @param ipSource
    */
    public void setIpSource(List<IpSourceInfo> ipSource) {
        this.ipSource = ipSource;
    }


    /**
    * get domainSource
    *
    * @return
    */
    public List<DomainSourceInfo> getDomainSource() {
        return domainSource;
    }

    /**
    * set domainSource
    *
    * @param domainSource
    */
    public void setDomainSource(List<DomainSourceInfo> domainSource) {
        this.domainSource = domainSource;
    }


    /**
     * get oss回源域名
     *
     * @return
     */
    public String getOssSource() {
        return ossSource;
    }

    /**
     * set oss回源域名
     *
     * @param ossSource
     */
    public void setOssSource(String ossSource) {
        this.ossSource = ossSource;
    }


    /**
     * get 默认回源host
     *
     * @return
     */
    public String getDefaultSourceHost() {
        return defaultSourceHost;
    }

    /**
     * set 默认回源host
     *
     * @param defaultSourceHost
     */
    public void setDefaultSourceHost(String defaultSourceHost) {
        this.defaultSourceHost = defaultSourceHost;
    }


    /**
     * get 用户域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }



    /**
     * set 回源类型只能是[ips,domain,oss]中的一种
     *
     * @param sourceType
     */
    public SetSourceRequest sourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }


    /**
     * set 回源方式,只能是[https,http]中的一种,默认http
     *
     * @param backSourceType
     */
    public SetSourceRequest backSourceType(String backSourceType) {
        this.backSourceType = backSourceType;
        return this;
    }


    /**
     * set 加速区域,必须是[mainland,nonMainland,all]中的一种,分别代表大陆,海外+中国港澳台,全球
     *
     * @param accelerateRegion
     */
    public SetSourceRequest accelerateRegion(String accelerateRegion) {
        this.accelerateRegion = accelerateRegion;
        return this;
    }


    /**
    * set ipSource
    *
    * @param ipSource
    */
    public SetSourceRequest ipSource(List<IpSourceInfo> ipSource) {
        this.ipSource = ipSource;
        return this;
    }


    /**
    * set domainSource
    *
    * @param domainSource
    */
    public SetSourceRequest domainSource(List<DomainSourceInfo> domainSource) {
        this.domainSource = domainSource;
        return this;
    }


    /**
     * set oss回源域名
     *
     * @param ossSource
     */
    public SetSourceRequest ossSource(String ossSource) {
        this.ossSource = ossSource;
        return this;
    }


    /**
     * set 默认回源host
     *
     * @param defaultSourceHost
     */
    public SetSourceRequest defaultSourceHost(String defaultSourceHost) {
        this.defaultSourceHost = defaultSourceHost;
        return this;
    }


    /**
     * set 用户域名
     *
     * @param domain
     */
    public SetSourceRequest domain(String domain) {
        this.domain = domain;
        return this;
    }



    /**
     * add item to ipSource
     *
     * @param ipSource
     */
    public void addIpSource(IpSourceInfo ipSource) {
        if (this.ipSource == null) {
            this.ipSource = new ArrayList<>();
        }
        this.ipSource.add(ipSource);
    }

    /**
     * add item to domainSource
     *
     * @param domainSource
     */
    public void addDomainSource(DomainSourceInfo domainSource) {
        if (this.domainSource == null) {
            this.domainSource = new ArrayList<>();
        }
        this.domainSource.add(domainSource);
    }
}