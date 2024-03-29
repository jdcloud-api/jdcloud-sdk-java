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
 * relatedDomains
 */
public class RelatedDomains  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名
     */
    private String domainName;

    /**
     * （关联域名类型）publish或play
     */
    private String domainType;

    /**
     * 该相关域名的rtmp格式
     */
    
    private List<String> rtmpUrls;
    /**
     * 该相关域名的flv格式
     */
    
    private List<String> flvUrls;
    /**
     * 该相关域名的hls格式
     */
    
    private List<String> hlsUrls;


    /**
     * get 域名
     *
     * @return
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * set 域名
     *
     * @param domainName
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }


    /**
     * get （关联域名类型）publish或play
     *
     * @return
     */
    public String getDomainType() {
        return domainType;
    }

    /**
     * set （关联域名类型）publish或play
     *
     * @param domainType
     */
    public void setDomainType(String domainType) {
        this.domainType = domainType;
    }


    /**
    * get 该相关域名的rtmp格式
    *
    * @return
    */
    public List<String> getRtmpUrls() {
        return rtmpUrls;
    }

    /**
    * set 该相关域名的rtmp格式
    *
    * @param rtmpUrls
    */
    public void setRtmpUrls(List<String> rtmpUrls) {
        this.rtmpUrls = rtmpUrls;
    }


    /**
    * get 该相关域名的flv格式
    *
    * @return
    */
    public List<String> getFlvUrls() {
        return flvUrls;
    }

    /**
    * set 该相关域名的flv格式
    *
    * @param flvUrls
    */
    public void setFlvUrls(List<String> flvUrls) {
        this.flvUrls = flvUrls;
    }


    /**
    * get 该相关域名的hls格式
    *
    * @return
    */
    public List<String> getHlsUrls() {
        return hlsUrls;
    }

    /**
    * set 该相关域名的hls格式
    *
    * @param hlsUrls
    */
    public void setHlsUrls(List<String> hlsUrls) {
        this.hlsUrls = hlsUrls;
    }



    /**
     * set 域名
     *
     * @param domainName
     */
    public RelatedDomains domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }


    /**
     * set （关联域名类型）publish或play
     *
     * @param domainType
     */
    public RelatedDomains domainType(String domainType) {
        this.domainType = domainType;
        return this;
    }


    /**
    * set 该相关域名的rtmp格式
    *
    * @param rtmpUrls
    */
    public RelatedDomains rtmpUrls(List<String> rtmpUrls) {
        this.rtmpUrls = rtmpUrls;
        return this;
    }


    /**
    * set 该相关域名的flv格式
    *
    * @param flvUrls
    */
    public RelatedDomains flvUrls(List<String> flvUrls) {
        this.flvUrls = flvUrls;
        return this;
    }


    /**
    * set 该相关域名的hls格式
    *
    * @param hlsUrls
    */
    public RelatedDomains hlsUrls(List<String> hlsUrls) {
        this.hlsUrls = hlsUrls;
        return this;
    }



    /**
     * add item to 该相关域名的rtmp格式
     *
     * @param rtmpUrl
     */
    public void addRtmpUrl(String rtmpUrl) {
        if (this.rtmpUrls == null) {
            this.rtmpUrls = new ArrayList<>();
        }
        this.rtmpUrls.add(rtmpUrl);
    }

    /**
     * add item to 该相关域名的flv格式
     *
     * @param flvUrl
     */
    public void addFlvUrl(String flvUrl) {
        if (this.flvUrls == null) {
            this.flvUrls = new ArrayList<>();
        }
        this.flvUrls.add(flvUrl);
    }

    /**
     * add item to 该相关域名的hls格式
     *
     * @param hlsUrl
     */
    public void addHlsUrl(String hlsUrl) {
        if (this.hlsUrls == null) {
            this.hlsUrls = new ArrayList<>();
        }
        this.hlsUrls.add(hlsUrl);
    }
}