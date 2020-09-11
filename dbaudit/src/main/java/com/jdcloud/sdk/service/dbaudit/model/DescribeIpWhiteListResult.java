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
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取此实例的所有IP白名单列表
 */
public class DescribeIpWhiteListResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ipWhileList
     */
    private List<String> ipWhileList;

    /**
     * IP白名单记录的数量
     */
    private Integer totalCount;


    /**
     * get ipWhileList
     *
     * @return
     */
    public List<String> getIpWhileList() {
        return ipWhileList;
    }

    /**
     * set ipWhileList
     *
     * @param ipWhileList
     */
    public void setIpWhileList(List<String> ipWhileList) {
        this.ipWhileList = ipWhileList;
    }

    /**
     * get IP白名单记录的数量
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set IP白名单记录的数量
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set ipWhileList
     *
     * @param ipWhileList
     */
    public DescribeIpWhiteListResult ipWhileList(List<String> ipWhileList) {
        this.ipWhileList = ipWhileList;
        return this;
    }

    /**
     * set IP白名单记录的数量
     *
     * @param totalCount
     */
    public DescribeIpWhiteListResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to ipWhileList
     *
     * @param ipWhileList
     */
    public void addIpWhileList(String ipWhileList) {
        if (this.ipWhileList == null) {
            this.ipWhileList = new ArrayList<>();
        }
        this.ipWhileList.add(ipWhileList);
    }

}