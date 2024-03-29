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

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;

/**
 * snowLeopardBackSourceInfo
 */
public class SnowLeopardBackSourceInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ips
     */
    
    private List<SnowLeopardIpSourceInfo> ips;
    /**
     * domain
     */
    
    private List<SnowLeopardDomainSourceInfo> domain;
    /**
     * ossSource
     */
    private String ossSource;



    /**
    * get ips
    *
    * @return
    */
    public List<SnowLeopardIpSourceInfo> getIps() {
        return ips;
    }

    /**
    * set ips
    *
    * @param ips
    */
    public void setIps(List<SnowLeopardIpSourceInfo> ips) {
        this.ips = ips;
    }


    /**
    * get domain
    *
    * @return
    */
    public List<SnowLeopardDomainSourceInfo> getDomain() {
        return domain;
    }

    /**
    * set domain
    *
    * @param domain
    */
    public void setDomain(List<SnowLeopardDomainSourceInfo> domain) {
        this.domain = domain;
    }


    /**
     * get ossSource
     *
     * @return
     */
    public String getOssSource() {
        return ossSource;
    }

    /**
     * set ossSource
     *
     * @param ossSource
     */
    public void setOssSource(String ossSource) {
        this.ossSource = ossSource;
    }



    /**
    * set ips
    *
    * @param ips
    */
    public SnowLeopardBackSourceInfo ips(List<SnowLeopardIpSourceInfo> ips) {
        this.ips = ips;
        return this;
    }


    /**
    * set domain
    *
    * @param domain
    */
    public SnowLeopardBackSourceInfo domain(List<SnowLeopardDomainSourceInfo> domain) {
        this.domain = domain;
        return this;
    }


    /**
     * set ossSource
     *
     * @param ossSource
     */
    public SnowLeopardBackSourceInfo ossSource(String ossSource) {
        this.ossSource = ossSource;
        return this;
    }



    /**
     * add item to ips
     *
     * @param ip
     */
    public void addIp(SnowLeopardIpSourceInfo ip) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        this.ips.add(ip);
    }

    /**
     * add item to domain
     *
     * @param domain
     */
    public void addDomain(SnowLeopardDomainSourceInfo domain) {
        if (this.domain == null) {
            this.domain = new ArrayList<>();
        }
        this.domain.add(domain);
    }
}