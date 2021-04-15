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
 * yunding-subnet
 * 云鼎-子网相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.yunding.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询子网列表
 */
public class DescribeSubnetsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码, 默认为1, 取值范围：[1,∞), 页码超过总页数时, 显示最后一页
     */
    private Integer pageNumber;

    /**
     * 分页大小，默认为20，取值范围：[10,100]
     */
    private Integer pageSize;

    /**
     * 子网类型，主机等资源子网：1；LB子网：2；数据库子网：3
     */
    private Integer type;

    /**
     * subnetIds - subnet ID列表，支持多个
subnetNames - subnet名称列表，支持多个
routeTableId	- 子网关联路由表Id，支持单个
aclId - 子网关联acl Id，支持单个
vpcId - 子网所属VPC Id，支持单个

     */
    private List<Filter> filters;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 页码, 默认为1, 取值范围：[1,∞), 页码超过总页数时, 显示最后一页
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码, 默认为1, 取值范围：[1,∞), 页码超过总页数时, 显示最后一页
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小，默认为20，取值范围：[10,100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小，默认为20，取值范围：[10,100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 子网类型，主机等资源子网：1；LB子网：2；数据库子网：3
     *
     * @return
     */
    public Integer getType() {
        return type;
    }

    /**
     * set 子网类型，主机等资源子网：1；LB子网：2；数据库子网：3
     *
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * get subnetIds - subnet ID列表，支持多个
subnetNames - subnet名称列表，支持多个
routeTableId	- 子网关联路由表Id，支持单个
aclId - 子网关联acl Id，支持单个
vpcId - 子网所属VPC Id，支持单个

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set subnetIds - subnet ID列表，支持多个
subnetNames - subnet名称列表，支持多个
routeTableId	- 子网关联路由表Id，支持单个
aclId - 子网关联acl Id，支持单个
vpcId - 子网所属VPC Id，支持单个

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 页码, 默认为1, 取值范围：[1,∞), 页码超过总页数时, 显示最后一页
     *
     * @param pageNumber
     */
    public DescribeSubnetsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小，默认为20，取值范围：[10,100]
     *
     * @param pageSize
     */
    public DescribeSubnetsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 子网类型，主机等资源子网：1；LB子网：2；数据库子网：3
     *
     * @param type
     */
    public DescribeSubnetsRequest type(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * set subnetIds - subnet ID列表，支持多个
subnetNames - subnet名称列表，支持多个
routeTableId	- 子网关联路由表Id，支持单个
aclId - 子网关联acl Id，支持单个
vpcId - 子网所属VPC Id，支持单个

     *
     * @param filters
     */
    public DescribeSubnetsRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public DescribeSubnetsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to subnetIds - subnet ID列表，支持多个
subnetNames - subnet名称列表，支持多个
routeTableId	- 子网关联路由表Id，支持单个
aclId - 子网关联acl Id，支持单个
vpcId - 子网所属VPC Id，支持单个

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