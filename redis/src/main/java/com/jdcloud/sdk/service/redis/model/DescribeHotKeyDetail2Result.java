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
 * Redis Instance API
 * 缓存Redis实例的创建、删除、修改基本信息、设置密码、变配、实例列表、备份、配置参数等接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.redis.model.RedisHotKey;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询热key分析详情
 */
public class DescribeHotKeyDetail2Result extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * hotHeys
     */
    private List<RedisHotKey> hotHeys;

    /**
     * 热key总数量
     */
    private Integer totalCount;


    /**
     * get hotHeys
     *
     * @return
     */
    public List<RedisHotKey> getHotHeys() {
        return hotHeys;
    }

    /**
     * set hotHeys
     *
     * @param hotHeys
     */
    public void setHotHeys(List<RedisHotKey> hotHeys) {
        this.hotHeys = hotHeys;
    }

    /**
     * get 热key总数量
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 热key总数量
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set hotHeys
     *
     * @param hotHeys
     */
    public DescribeHotKeyDetail2Result hotHeys(List<RedisHotKey> hotHeys) {
        this.hotHeys = hotHeys;
        return this;
    }

    /**
     * set 热key总数量
     *
     * @param totalCount
     */
    public DescribeHotKeyDetail2Result totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to hotHeys
     *
     * @param hotHey
     */
    public void addHotHey(RedisHotKey hotHey) {
        if (this.hotHeys == null) {
            this.hotHeys = new ArrayList<>();
        }
        this.hotHeys.add(hotHey);
    }

}