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
 * accessUserlogModel
 */
public class AccessUserlogModel  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名
     */
    private String domain;

    /**
     * 日志对象
     */
    
    private List<DomainlogModel> urls;


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
    * get 日志对象
    *
    * @return
    */
    public List<DomainlogModel> getUrls() {
        return urls;
    }

    /**
    * set 日志对象
    *
    * @param urls
    */
    public void setUrls(List<DomainlogModel> urls) {
        this.urls = urls;
    }



    /**
     * set 域名
     *
     * @param domain
     */
    public AccessUserlogModel domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
    * set 日志对象
    *
    * @param urls
    */
    public AccessUserlogModel urls(List<DomainlogModel> urls) {
        this.urls = urls;
        return this;
    }



    /**
     * add item to 日志对象
     *
     * @param url
     */
    public void addUrl(DomainlogModel url) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(url);
    }
}