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
 * listProxycacheUrlCfg
 */
public class ListProxycacheUrlCfg  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 总数
     */
    private Integer total;

    /**
     * urls
     */
    
    private List<ListProxycacheUrl> urls;


    /**
     * get 总数
     *
     * @return
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * set 总数
     *
     * @param total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }


    /**
    * get urls
    *
    * @return
    */
    public List<ListProxycacheUrl> getUrls() {
        return urls;
    }

    /**
    * set urls
    *
    * @param urls
    */
    public void setUrls(List<ListProxycacheUrl> urls) {
        this.urls = urls;
    }



    /**
     * set 总数
     *
     * @param total
     */
    public ListProxycacheUrlCfg total(Integer total) {
        this.total = total;
        return this;
    }


    /**
    * set urls
    *
    * @param urls
    */
    public ListProxycacheUrlCfg urls(List<ListProxycacheUrl> urls) {
        this.urls = urls;
        return this;
    }



    /**
     * add item to urls
     *
     * @param url
     */
    public void addUrl(ListProxycacheUrl url) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(url);
    }
}