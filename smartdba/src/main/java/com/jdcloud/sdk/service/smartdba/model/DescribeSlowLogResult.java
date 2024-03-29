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
 * Slow-Log
 * 慢日志相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.smartdba.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.smartdba.model.SlowLog;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取当前实例指定时间的慢SQL明细
 */
public class DescribeSlowLogResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * data
     */
    private List<SlowLog> data;

    /**
     * 总数
     */
    private Integer totalCount;


    /**
     * get data
     *
     * @return
     */
    public List<SlowLog> getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(List<SlowLog> data) {
        this.data = data;
    }

    /**
     * get 总数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 总数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set data
     *
     * @param data
     */
    public DescribeSlowLogResult data(List<SlowLog> data) {
        this.data = data;
        return this;
    }

    /**
     * set 总数
     *
     * @param totalCount
     */
    public DescribeSlowLogResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to data
     *
     * @param data
     */
    public void addData(SlowLog data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }

}