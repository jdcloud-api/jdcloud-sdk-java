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
 * 域名模板管理接口
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
 * 查询模板实例列表接口
 */
public class QueryDomainTempInstListRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 根据关键字进行模糊匹配
     */
    private String instName;

    /**
     * pageNumber,默认值1
     */
    private Integer pageNumber;

    /**
     * pageSize,最大值50,默认值20
     */
    private Integer pageSize;



    /**
     * get 根据关键字进行模糊匹配
     *
     * @return
     */
    public String getInstName() {
        return instName;
    }

    /**
     * set 根据关键字进行模糊匹配
     *
     * @param instName
     */
    public void setInstName(String instName) {
        this.instName = instName;
    }


    /**
     * get pageNumber,默认值1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set pageNumber,默认值1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * get pageSize,最大值50,默认值20
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set pageSize,最大值50,默认值20
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }



    /**
     * set 根据关键字进行模糊匹配
     *
     * @param instName
     */
    public QueryDomainTempInstListRequest instName(String instName) {
        this.instName = instName;
        return this;
    }


    /**
     * set pageNumber,默认值1
     *
     * @param pageNumber
     */
    public QueryDomainTempInstListRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set pageSize,最大值50,默认值20
     *
     * @param pageSize
     */
    public QueryDomainTempInstListRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


}