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

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 更新域名配置
 */
public class SetDomainConfigRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * http类型,只能为http或者https
     */
    private String httpType;

    /**
     * 回源类型
     */
    private String backSourceType;

    /**
     * 有三种类型：default、http、https
     */
    private String jumpType;

    /**
     * dash鉴权相关配置
     */
    private String jcdnTimeAnti;

    /**
     * 回源鉴权相关配置
     */
    private String hdrCtrl;

    /**
     * 头条header配置
     */
    private String toutiaoHeader;

    /**
     * 用户域名
     * Required:true
     */
    @Required
    private String domain;



    /**
     * get http类型,只能为http或者https
     *
     * @return
     */
    public String getHttpType() {
        return httpType;
    }

    /**
     * set http类型,只能为http或者https
     *
     * @param httpType
     */
    public void setHttpType(String httpType) {
        this.httpType = httpType;
    }


    /**
     * get 回源类型
     *
     * @return
     */
    public String getBackSourceType() {
        return backSourceType;
    }

    /**
     * set 回源类型
     *
     * @param backSourceType
     */
    public void setBackSourceType(String backSourceType) {
        this.backSourceType = backSourceType;
    }


    /**
     * get 有三种类型：default、http、https
     *
     * @return
     */
    public String getJumpType() {
        return jumpType;
    }

    /**
     * set 有三种类型：default、http、https
     *
     * @param jumpType
     */
    public void setJumpType(String jumpType) {
        this.jumpType = jumpType;
    }


    /**
     * get dash鉴权相关配置
     *
     * @return
     */
    public String getJcdnTimeAnti() {
        return jcdnTimeAnti;
    }

    /**
     * set dash鉴权相关配置
     *
     * @param jcdnTimeAnti
     */
    public void setJcdnTimeAnti(String jcdnTimeAnti) {
        this.jcdnTimeAnti = jcdnTimeAnti;
    }


    /**
     * get 回源鉴权相关配置
     *
     * @return
     */
    public String getHdrCtrl() {
        return hdrCtrl;
    }

    /**
     * set 回源鉴权相关配置
     *
     * @param hdrCtrl
     */
    public void setHdrCtrl(String hdrCtrl) {
        this.hdrCtrl = hdrCtrl;
    }


    /**
     * get 头条header配置
     *
     * @return
     */
    public String getToutiaoHeader() {
        return toutiaoHeader;
    }

    /**
     * set 头条header配置
     *
     * @param toutiaoHeader
     */
    public void setToutiaoHeader(String toutiaoHeader) {
        this.toutiaoHeader = toutiaoHeader;
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
     * set http类型,只能为http或者https
     *
     * @param httpType
     */
    public SetDomainConfigRequest httpType(String httpType) {
        this.httpType = httpType;
        return this;
    }


    /**
     * set 回源类型
     *
     * @param backSourceType
     */
    public SetDomainConfigRequest backSourceType(String backSourceType) {
        this.backSourceType = backSourceType;
        return this;
    }


    /**
     * set 有三种类型：default、http、https
     *
     * @param jumpType
     */
    public SetDomainConfigRequest jumpType(String jumpType) {
        this.jumpType = jumpType;
        return this;
    }


    /**
     * set dash鉴权相关配置
     *
     * @param jcdnTimeAnti
     */
    public SetDomainConfigRequest jcdnTimeAnti(String jcdnTimeAnti) {
        this.jcdnTimeAnti = jcdnTimeAnti;
        return this;
    }


    /**
     * set 回源鉴权相关配置
     *
     * @param hdrCtrl
     */
    public SetDomainConfigRequest hdrCtrl(String hdrCtrl) {
        this.hdrCtrl = hdrCtrl;
        return this;
    }


    /**
     * set 头条header配置
     *
     * @param toutiaoHeader
     */
    public SetDomainConfigRequest toutiaoHeader(String toutiaoHeader) {
        this.toutiaoHeader = toutiaoHeader;
        return this;
    }


    /**
     * set 用户域名
     *
     * @param domain
     */
    public SetDomainConfigRequest domain(String domain) {
        this.domain = domain;
        return this;
    }


}