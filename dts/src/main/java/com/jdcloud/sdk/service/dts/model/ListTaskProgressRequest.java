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
 * 数据传输服务
 * 数据传输服务相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dts.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.service.common.model.Sort;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 任务传输进度列表
 */
public class ListTaskProgressRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码；默认为1，取值范围：-1，[1,∞)；-1时返回全部页码。
     */
    private Integer pageNumber;

    /**
     * 分页大小；默认为10；取值范围[1, 100]
     */
    private Integer pageSize;

    /**
     * filters
     */
    
    private List<Filter> filters;
    /**
     * createTime - 创建时间,asc（正序），desc（倒序）

     */
    
    private List<Sort> sorts;
    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》]
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 页码；默认为1，取值范围：-1，[1,∞)；-1时返回全部页码。
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认为1，取值范围：-1，[1,∞)；-1时返回全部页码。
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * get 分页大小；默认为10；取值范围[1, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；默认为10；取值范围[1, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
    * get filters
    *
    * @return
    */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
    * set filters
    *
    * @param filters
    */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }


    /**
    * get createTime - 创建时间,asc（正序），desc（倒序）

    *
    * @return
    */
    public List<Sort> getSorts() {
        return sorts;
    }

    /**
    * set createTime - 创建时间,asc（正序），desc（倒序）

    *
    * @param sorts
    */
    public void setSorts(List<Sort> sorts) {
        this.sorts = sorts;
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
     * set 页码；默认为1，取值范围：-1，[1,∞)；-1时返回全部页码。
     *
     * @param pageNumber
     */
    public ListTaskProgressRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 分页大小；默认为10；取值范围[1, 100]
     *
     * @param pageSize
     */
    public ListTaskProgressRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
    * set filters
    *
    * @param filters
    */
    public ListTaskProgressRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
    * set createTime - 创建时间,asc（正序），desc（倒序）

    *
    * @param sorts
    */
    public ListTaskProgressRequest sorts(List<Sort> sorts) {
        this.sorts = sorts;
        return this;
    }


    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @param regionId
     */
    public ListTaskProgressRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to filters
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
     * add item to createTime - 创建时间,asc（正序），desc（倒序）

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