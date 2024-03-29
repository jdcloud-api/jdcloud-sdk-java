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
 * CDN对接SSL相关接口
 * SSL数字证书相关信息接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查看证书列表
 */
public class GetSslCertListRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 第几页，从1开始计数
     */
    private Integer pageNumber;

    /**
     * 每页显示的数目
     */
    private Integer pageSize;

    /**
     * 域名，支持按照域名检索证书
     */
    private String domain;



    /**
     * get 第几页，从1开始计数
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 第几页，从1开始计数
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * get 每页显示的数目
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页显示的数目
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * get 域名，支持按照域名检索证书
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 域名，支持按照域名检索证书
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }



    /**
     * set 第几页，从1开始计数
     *
     * @param pageNumber
     */
    public GetSslCertListRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 每页显示的数目
     *
     * @param pageSize
     */
    public GetSslCertListRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set 域名，支持按照域名检索证书
     *
     * @param domain
     */
    public GetSslCertListRequest domain(String domain) {
        this.domain = domain;
        return this;
    }


}