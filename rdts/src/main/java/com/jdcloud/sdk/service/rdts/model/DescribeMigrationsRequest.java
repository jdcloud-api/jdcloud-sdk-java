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
 * rdts
 * rdts api
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rdts.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.service.common.model.Sort;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 迁移任务列表，可分页、可排序、可搜索、可过滤
 */
public class DescribeMigrationsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码：取值范围[1,∞)，默认为1
     */
    private Integer pageNumber;

    /**
     * 分页大小：取值范围[10,100]，默认为10
     */
    private Integer pageSize;

    /**
     * 过滤条件：
- instanceIds：迁移任务ID，精确匹配，可选择多个
- migrationName：迁移任务名称，模糊匹配
- migrationStatuses：迁移任务状态，精确匹配，可选择多个（具体可参考迁移任务详情中的迁移状态）

     */
    private List<Filter> filters;

    /**
     * 排序属性：
- createdTime：按创建时间排序(asc表示按时间正序，desc表示按时间倒序)

     */
    private List<Sort> sorts;

    /**
     * 迁移任务所在区域的Region ID。华北-北京(cn-north-1)，华东-上海(cn-east-2)，华南-广州(cn-south-1)
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 页码：取值范围[1,∞)，默认为1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码：取值范围[1,∞)，默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小：取值范围[10,100]，默认为10
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小：取值范围[10,100]，默认为10
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 过滤条件：
- instanceIds：迁移任务ID，精确匹配，可选择多个
- migrationName：迁移任务名称，模糊匹配
- migrationStatuses：迁移任务状态，精确匹配，可选择多个（具体可参考迁移任务详情中的迁移状态）

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set 过滤条件：
- instanceIds：迁移任务ID，精确匹配，可选择多个
- migrationName：迁移任务名称，模糊匹配
- migrationStatuses：迁移任务状态，精确匹配，可选择多个（具体可参考迁移任务详情中的迁移状态）

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 排序属性：
- createdTime：按创建时间排序(asc表示按时间正序，desc表示按时间倒序)

     *
     * @return
     */
    public List<Sort> getSorts() {
        return sorts;
    }

    /**
     * set 排序属性：
- createdTime：按创建时间排序(asc表示按时间正序，desc表示按时间倒序)

     *
     * @param sorts
     */
    public void setSorts(List<Sort> sorts) {
        this.sorts = sorts;
    }

    /**
     * get 迁移任务所在区域的Region ID。华北-北京(cn-north-1)，华东-上海(cn-east-2)，华南-广州(cn-south-1)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 迁移任务所在区域的Region ID。华北-北京(cn-north-1)，华东-上海(cn-east-2)，华南-广州(cn-south-1)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 页码：取值范围[1,∞)，默认为1
     *
     * @param pageNumber
     */
    public DescribeMigrationsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小：取值范围[10,100]，默认为10
     *
     * @param pageSize
     */
    public DescribeMigrationsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 过滤条件：
- instanceIds：迁移任务ID，精确匹配，可选择多个
- migrationName：迁移任务名称，模糊匹配
- migrationStatuses：迁移任务状态，精确匹配，可选择多个（具体可参考迁移任务详情中的迁移状态）

     *
     * @param filters
     */
    public DescribeMigrationsRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 排序属性：
- createdTime：按创建时间排序(asc表示按时间正序，desc表示按时间倒序)

     *
     * @param sorts
     */
    public DescribeMigrationsRequest sorts(List<Sort> sorts) {
        this.sorts = sorts;
        return this;
    }

    /**
     * set 迁移任务所在区域的Region ID。华北-北京(cn-north-1)，华东-上海(cn-east-2)，华南-广州(cn-south-1)
     *
     * @param regionId
     */
    public DescribeMigrationsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 过滤条件：
- instanceIds：迁移任务ID，精确匹配，可选择多个
- migrationName：迁移任务名称，模糊匹配
- migrationStatuses：迁移任务状态，精确匹配，可选择多个（具体可参考迁移任务详情中的迁移状态）

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
     * add item to 排序属性：
- createdTime：按创建时间排序(asc表示按时间正序，desc表示按时间倒序)

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