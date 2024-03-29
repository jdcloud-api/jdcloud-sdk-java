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
 * 数据库备份服务
 * 数据库备份服务接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dbs.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.dbs.model.Filter;
import com.jdcloud.sdk.service.dbs.model.Sort;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询已经注册的所有的 DBS agent
 */
public class DescribeAgentsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 过滤参数，多个过滤参数之间的关系为“与”(and)
支持以下属性的过滤：
hostName, 支持operator选项：eq, like
hostIP, 支持operator选项：eq, like

     */
    private List<Filter> filters;

    /**
     * 排序参数
     */
    private List<Sort> sorts;

    /**
     * 显示数据的页码，默认为1，取值范围：[-1,∞)。pageNumber为-1时，返回所有数据页码；超过总页数时，显示最后一页
     */
    private Integer pageNumber;

    /**
     * 每页显示的数据条数，默认为10，取值范围：[10,100]，且为10的整数倍
     */
    private Integer pageSize;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》]
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 过滤参数，多个过滤参数之间的关系为“与”(and)
支持以下属性的过滤：
hostName, 支持operator选项：eq, like
hostIP, 支持operator选项：eq, like

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set 过滤参数，多个过滤参数之间的关系为“与”(and)
支持以下属性的过滤：
hostName, 支持operator选项：eq, like
hostIP, 支持operator选项：eq, like

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 排序参数
     *
     * @return
     */
    public List<Sort> getSorts() {
        return sorts;
    }

    /**
     * set 排序参数
     *
     * @param sorts
     */
    public void setSorts(List<Sort> sorts) {
        this.sorts = sorts;
    }

    /**
     * get 显示数据的页码，默认为1，取值范围：[-1,∞)。pageNumber为-1时，返回所有数据页码；超过总页数时，显示最后一页
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 显示数据的页码，默认为1，取值范围：[-1,∞)。pageNumber为-1时，返回所有数据页码；超过总页数时，显示最后一页
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 每页显示的数据条数，默认为10，取值范围：[10,100]，且为10的整数倍
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页显示的数据条数，默认为10，取值范围：[10,100]，且为10的整数倍
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 过滤参数，多个过滤参数之间的关系为“与”(and)
支持以下属性的过滤：
hostName, 支持operator选项：eq, like
hostIP, 支持operator选项：eq, like

     *
     * @param filters
     */
    public DescribeAgentsRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 排序参数
     *
     * @param sorts
     */
    public DescribeAgentsRequest sorts(List<Sort> sorts) {
        this.sorts = sorts;
        return this;
    }

    /**
     * set 显示数据的页码，默认为1，取值范围：[-1,∞)。pageNumber为-1时，返回所有数据页码；超过总页数时，显示最后一页
     *
     * @param pageNumber
     */
    public DescribeAgentsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 每页显示的数据条数，默认为10，取值范围：[10,100]，且为10的整数倍
     *
     * @param pageSize
     */
    public DescribeAgentsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @param regionId
     */
    public DescribeAgentsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 过滤参数，多个过滤参数之间的关系为“与”(and)
支持以下属性的过滤：
hostName, 支持operator选项：eq, like
hostIP, 支持operator选项：eq, like

     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }

    /**
     * add item to 排序参数
     *
     * @param sort
     */
    public void addSort(Sort sort) {
        if (this.sorts == null) {
            this.sorts = new ArrayList<>();
        }
        this.sorts.add(sort);
    }

}