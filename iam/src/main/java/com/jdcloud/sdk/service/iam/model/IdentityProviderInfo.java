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

package com.jdcloud.sdk.service.iam.model;


/**
 * identityProviderInfo
 */
public class IdentityProviderInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 身份提供商名称，支持4~64位的字母，数字以及-和_, 以字母开头
     */
    private String name;

    /**
     * 协议类型,目前支持SAML20
     */
    private String protocolType;

    /**
     * 描述，0~256个字符
     */
    private String description;

    /**
     * 身份提供商元数据
     */
    private String metadata;

    /**
     * 京东云资源标识(jrn)
     */
    private String jrn;

    /**
     * IdP登录地址
     */
    private String forwardIdPUrl;



    /**
     * get 身份提供商名称，支持4~64位的字母，数字以及-和_, 以字母开头
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 身份提供商名称，支持4~64位的字母，数字以及-和_, 以字母开头
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 协议类型,目前支持SAML20
     *
     * @return
     */
    public String getProtocolType() {
        return protocolType;
    }

    /**
     * set 协议类型,目前支持SAML20
     *
     * @param protocolType
     */
    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }


    /**
     * get 描述，0~256个字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述，0~256个字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 身份提供商元数据
     *
     * @return
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * set 身份提供商元数据
     *
     * @param metadata
     */
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }


    /**
     * get 京东云资源标识(jrn)
     *
     * @return
     */
    public String getJrn() {
        return jrn;
    }

    /**
     * set 京东云资源标识(jrn)
     *
     * @param jrn
     */
    public void setJrn(String jrn) {
        this.jrn = jrn;
    }


    /**
     * get IdP登录地址
     *
     * @return
     */
    public String getForwardIdPUrl() {
        return forwardIdPUrl;
    }

    /**
     * set IdP登录地址
     *
     * @param forwardIdPUrl
     */
    public void setForwardIdPUrl(String forwardIdPUrl) {
        this.forwardIdPUrl = forwardIdPUrl;
    }



    /**
     * set 身份提供商名称，支持4~64位的字母，数字以及-和_, 以字母开头
     *
     * @param name
     */
    public IdentityProviderInfo name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 协议类型,目前支持SAML20
     *
     * @param protocolType
     */
    public IdentityProviderInfo protocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }


    /**
     * set 描述，0~256个字符
     *
     * @param description
     */
    public IdentityProviderInfo description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 身份提供商元数据
     *
     * @param metadata
     */
    public IdentityProviderInfo metadata(String metadata) {
        this.metadata = metadata;
        return this;
    }


    /**
     * set 京东云资源标识(jrn)
     *
     * @param jrn
     */
    public IdentityProviderInfo jrn(String jrn) {
        this.jrn = jrn;
        return this;
    }


    /**
     * set IdP登录地址
     *
     * @param forwardIdPUrl
     */
    public IdentityProviderInfo forwardIdPUrl(String forwardIdPUrl) {
        this.forwardIdPUrl = forwardIdPUrl;
        return this;
    }


}