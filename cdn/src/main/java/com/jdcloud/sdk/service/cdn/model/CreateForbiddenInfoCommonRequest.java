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
 * 域名url封禁类接口
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
 * 设置封禁
 */
public class CreateForbiddenInfoCommonRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 封禁类型，domain:域名封禁,url:url封禁
     */
    private String forbiddenType;

    /**
     * 封禁域名
     */
    private String forbiddenDomain;

    /**
     * 封禁url,多个以;隔开。单url最大字符长度1024,以/开头，内容中不包含逗号.forbiddenType为url时需传入
     */
    private String forbiddenUrl;

    /**
     * 封禁原因
     */
    private String reason;

    /**
     * y,n y表示是，n表示否,默认n。forbiddenType为domain时可传入，若为y表示封禁该域名后，不允许添加该域名的根域名以及根域名下的所有子域名
     */
    private String linkOther;

    /**
     * forbiddenType为url时可传入。即当forbiddenDomain为域名组共享缓存主域名时，是否同步操作共享缓存从域名下的url,0:仅操作本域名,1:同步操作共享缓存域名,默认为0。
     */
    private String shareCacheDomainFlag;

    /**
     * forbiddenType为url时有效。用于封禁前缀识别的URL,应为单个特殊字符，如：~
     */
    private String token;



    /**
     * get 封禁类型，domain:域名封禁,url:url封禁
     *
     * @return
     */
    public String getForbiddenType() {
        return forbiddenType;
    }

    /**
     * set 封禁类型，domain:域名封禁,url:url封禁
     *
     * @param forbiddenType
     */
    public void setForbiddenType(String forbiddenType) {
        this.forbiddenType = forbiddenType;
    }


    /**
     * get 封禁域名
     *
     * @return
     */
    public String getForbiddenDomain() {
        return forbiddenDomain;
    }

    /**
     * set 封禁域名
     *
     * @param forbiddenDomain
     */
    public void setForbiddenDomain(String forbiddenDomain) {
        this.forbiddenDomain = forbiddenDomain;
    }


    /**
     * get 封禁url,多个以;隔开。单url最大字符长度1024,以/开头，内容中不包含逗号.forbiddenType为url时需传入
     *
     * @return
     */
    public String getForbiddenUrl() {
        return forbiddenUrl;
    }

    /**
     * set 封禁url,多个以;隔开。单url最大字符长度1024,以/开头，内容中不包含逗号.forbiddenType为url时需传入
     *
     * @param forbiddenUrl
     */
    public void setForbiddenUrl(String forbiddenUrl) {
        this.forbiddenUrl = forbiddenUrl;
    }


    /**
     * get 封禁原因
     *
     * @return
     */
    public String getReason() {
        return reason;
    }

    /**
     * set 封禁原因
     *
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }


    /**
     * get y,n y表示是，n表示否,默认n。forbiddenType为domain时可传入，若为y表示封禁该域名后，不允许添加该域名的根域名以及根域名下的所有子域名
     *
     * @return
     */
    public String getLinkOther() {
        return linkOther;
    }

    /**
     * set y,n y表示是，n表示否,默认n。forbiddenType为domain时可传入，若为y表示封禁该域名后，不允许添加该域名的根域名以及根域名下的所有子域名
     *
     * @param linkOther
     */
    public void setLinkOther(String linkOther) {
        this.linkOther = linkOther;
    }


    /**
     * get forbiddenType为url时可传入。即当forbiddenDomain为域名组共享缓存主域名时，是否同步操作共享缓存从域名下的url,0:仅操作本域名,1:同步操作共享缓存域名,默认为0。
     *
     * @return
     */
    public String getShareCacheDomainFlag() {
        return shareCacheDomainFlag;
    }

    /**
     * set forbiddenType为url时可传入。即当forbiddenDomain为域名组共享缓存主域名时，是否同步操作共享缓存从域名下的url,0:仅操作本域名,1:同步操作共享缓存域名,默认为0。
     *
     * @param shareCacheDomainFlag
     */
    public void setShareCacheDomainFlag(String shareCacheDomainFlag) {
        this.shareCacheDomainFlag = shareCacheDomainFlag;
    }


    /**
     * get forbiddenType为url时有效。用于封禁前缀识别的URL,应为单个特殊字符，如：~
     *
     * @return
     */
    public String getToken() {
        return token;
    }

    /**
     * set forbiddenType为url时有效。用于封禁前缀识别的URL,应为单个特殊字符，如：~
     *
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }



    /**
     * set 封禁类型，domain:域名封禁,url:url封禁
     *
     * @param forbiddenType
     */
    public CreateForbiddenInfoCommonRequest forbiddenType(String forbiddenType) {
        this.forbiddenType = forbiddenType;
        return this;
    }


    /**
     * set 封禁域名
     *
     * @param forbiddenDomain
     */
    public CreateForbiddenInfoCommonRequest forbiddenDomain(String forbiddenDomain) {
        this.forbiddenDomain = forbiddenDomain;
        return this;
    }


    /**
     * set 封禁url,多个以;隔开。单url最大字符长度1024,以/开头，内容中不包含逗号.forbiddenType为url时需传入
     *
     * @param forbiddenUrl
     */
    public CreateForbiddenInfoCommonRequest forbiddenUrl(String forbiddenUrl) {
        this.forbiddenUrl = forbiddenUrl;
        return this;
    }


    /**
     * set 封禁原因
     *
     * @param reason
     */
    public CreateForbiddenInfoCommonRequest reason(String reason) {
        this.reason = reason;
        return this;
    }


    /**
     * set y,n y表示是，n表示否,默认n。forbiddenType为domain时可传入，若为y表示封禁该域名后，不允许添加该域名的根域名以及根域名下的所有子域名
     *
     * @param linkOther
     */
    public CreateForbiddenInfoCommonRequest linkOther(String linkOther) {
        this.linkOther = linkOther;
        return this;
    }


    /**
     * set forbiddenType为url时可传入。即当forbiddenDomain为域名组共享缓存主域名时，是否同步操作共享缓存从域名下的url,0:仅操作本域名,1:同步操作共享缓存域名,默认为0。
     *
     * @param shareCacheDomainFlag
     */
    public CreateForbiddenInfoCommonRequest shareCacheDomainFlag(String shareCacheDomainFlag) {
        this.shareCacheDomainFlag = shareCacheDomainFlag;
        return this;
    }


    /**
     * set forbiddenType为url时有效。用于封禁前缀识别的URL,应为单个特殊字符，如：~
     *
     * @param token
     */
    public CreateForbiddenInfoCommonRequest token(String token) {
        this.token = token;
        return this;
    }


}