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
 * Instance Interface
 * Instance Interface
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dbaudit.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取数据库审计实例列表
pageNumber: 页码
pageSize: 每页数量
nameFilter: 按名称查询
filters: 按instanceId 查询，只支持eq，单个instanceId匹配

 */
public class DescribeInstanceListRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码；默认为1
     */
    private Integer pageNumber;

    /**
     * 分页大小；默认为10；取值范围[10, 100]
     */
    private Integer pageSize;

    /**
     * 列表过滤条件：数据库审计名称
     */
    private String nameFilter;

    /**
     * 按instanceId 过滤
     */
    private List<Filter> filters;

    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 页码；默认为1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小；默认为10；取值范围[10, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；默认为10；取值范围[10, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 列表过滤条件：数据库审计名称
     *
     * @return
     */
    public String getNameFilter() {
        return nameFilter;
    }

    /**
     * set 列表过滤条件：数据库审计名称
     *
     * @param nameFilter
     */
    public void setNameFilter(String nameFilter) {
        this.nameFilter = nameFilter;
    }

    /**
     * get 按instanceId 过滤
     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set 按instanceId 过滤
     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 地域 Id
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public DescribeInstanceListRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小；默认为10；取值范围[10, 100]
     *
     * @param pageSize
     */
    public DescribeInstanceListRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 列表过滤条件：数据库审计名称
     *
     * @param nameFilter
     */
    public DescribeInstanceListRequest nameFilter(String nameFilter) {
        this.nameFilter = nameFilter;
        return this;
    }

    /**
     * set 按instanceId 过滤
     *
     * @param filters
     */
    public DescribeInstanceListRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public DescribeInstanceListRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 按instanceId 过滤
     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }

}