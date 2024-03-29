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
 * 路由表
 * 路由表相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.vpc.model.RouteTable;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询路由表列表
 */
public class DescribeRouteTablesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * routeTables
     */
    
    private List<RouteTable> routeTables;
    /**
     * 总数量
     */
    private Number totalCount;



    /**
    * get routeTables
    *
    * @return
    */
    public List<RouteTable> getRouteTables() {
        return routeTables;
    }

    /**
    * set routeTables
    *
    * @param routeTables
    */
    public void setRouteTables(List<RouteTable> routeTables) {
        this.routeTables = routeTables;
    }


    /**
     * get 总数量
     *
     * @return
     */
    public Number getTotalCount() {
        return totalCount;
    }

    /**
     * set 总数量
     *
     * @param totalCount
     */
    public void setTotalCount(Number totalCount) {
        this.totalCount = totalCount;
    }



    /**
    * set routeTables
    *
    * @param routeTables
    */
    public DescribeRouteTablesResult routeTables(List<RouteTable> routeTables) {
        this.routeTables = routeTables;
        return this;
    }


    /**
     * set 总数量
     *
     * @param totalCount
     */
    public DescribeRouteTablesResult totalCount(Number totalCount) {
        this.totalCount = totalCount;
        return this;
    }



    /**
     * add item to routeTables
     *
     * @param routeTable
     */
    public void addRouteTable(RouteTable routeTable) {
        if (this.routeTables == null) {
            this.routeTables = new ArrayList<>();
        }
        this.routeTables.add(routeTable);
    }
}