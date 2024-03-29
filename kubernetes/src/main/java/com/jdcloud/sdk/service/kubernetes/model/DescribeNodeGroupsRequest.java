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
 * NodeGroup
 * 工作节点组相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.kubernetes.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.kubernetes.model.TagFilter;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询工作节点组列表
 */
public class DescribeNodeGroupsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码；默认为1
     */
    private Integer pageNumber;

    /**
     * 分页大小；默认为20；取值范围[10, 100]
     */
    private Integer pageSize;

    /**
     * Tag筛选条件
     */
    
    private List<TagFilter> tags;
    /**
     * name - 节点组名称，模糊匹配，支持单个
id - 节点组 id，支持多个
clusterId - 根据 clusterId 查询
clusterName - 根据 cluster 名称查询

     */
    
    private List<Filter> filters;
    /**
     * 地域 ID
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
     * get 分页大小；默认为20；取值范围[10, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；默认为20；取值范围[10, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
    * get Tag筛选条件
    *
    * @return
    */
    public List<TagFilter> getTags() {
        return tags;
    }

    /**
    * set Tag筛选条件
    *
    * @param tags
    */
    public void setTags(List<TagFilter> tags) {
        this.tags = tags;
    }


    /**
    * get name - 节点组名称，模糊匹配，支持单个
id - 节点组 id，支持多个
clusterId - 根据 clusterId 查询
clusterName - 根据 cluster 名称查询

    *
    * @return
    */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
    * set name - 节点组名称，模糊匹配，支持单个
id - 节点组 id，支持多个
clusterId - 根据 clusterId 查询
clusterName - 根据 cluster 名称查询

    *
    * @param filters
    */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }


    /**
     * get 地域 ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 ID
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
    public DescribeNodeGroupsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 分页大小；默认为20；取值范围[10, 100]
     *
     * @param pageSize
     */
    public DescribeNodeGroupsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
    * set Tag筛选条件
    *
    * @param tags
    */
    public DescribeNodeGroupsRequest tags(List<TagFilter> tags) {
        this.tags = tags;
        return this;
    }


    /**
    * set name - 节点组名称，模糊匹配，支持单个
id - 节点组 id，支持多个
clusterId - 根据 clusterId 查询
clusterName - 根据 cluster 名称查询

    *
    * @param filters
    */
    public DescribeNodeGroupsRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public DescribeNodeGroupsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to Tag筛选条件
     *
     * @param tag
     */
    public void addTag(TagFilter tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

    /**
     * add item to name - 节点组名称，模糊匹配，支持单个
id - 节点组 id，支持多个
clusterId - 根据 clusterId 查询
clusterName - 根据 cluster 名称查询

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