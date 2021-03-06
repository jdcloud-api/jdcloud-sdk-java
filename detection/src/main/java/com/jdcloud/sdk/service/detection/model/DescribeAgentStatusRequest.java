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
 * Availability-Monitoring-APIs
 * 可用性监控相关接口，提供创建、查询、修改、删除可用性监控任务等功能
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.detection.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.detection.model.Filter;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询可用性监控agent状态
 */
public class DescribeAgentStatusRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * agent id列表
uuid - agent id，精确匹配，支持多个
     * Required:true
     */
    @Required
    private List<Filter> filters;


    /**
     * get agent id列表
uuid - agent id，精确匹配，支持多个
     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set agent id列表
uuid - agent id，精确匹配，支持多个
     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }


    /**
     * set agent id列表
uuid - agent id，精确匹配，支持多个
     *
     * @param filters
     */
    public DescribeAgentStatusRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
     * add item to agent id列表
uuid - agent id，精确匹配，支持多个
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