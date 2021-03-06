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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.live.model.LiveStreamPublishInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询推流码率、帧率
 */
public class DescribeLiveStreamPublishInfoByPageResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前页码
     */
    private Integer pageNumber;

    /**
     * 每页数量
     */
    private Integer pageSize;

    /**
     * 查询总数
     */
    private Integer totalCount;

    /**
     * publishInfoList
     */
    private List<LiveStreamPublishInfo> publishInfoList;


    /**
     * get 当前页码
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 当前页码
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 每页数量
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页数量
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 查询总数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 查询总数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * get publishInfoList
     *
     * @return
     */
    public List<LiveStreamPublishInfo> getPublishInfoList() {
        return publishInfoList;
    }

    /**
     * set publishInfoList
     *
     * @param publishInfoList
     */
    public void setPublishInfoList(List<LiveStreamPublishInfo> publishInfoList) {
        this.publishInfoList = publishInfoList;
    }


    /**
     * set 当前页码
     *
     * @param pageNumber
     */
    public DescribeLiveStreamPublishInfoByPageResult pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 每页数量
     *
     * @param pageSize
     */
    public DescribeLiveStreamPublishInfoByPageResult pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 查询总数
     *
     * @param totalCount
     */
    public DescribeLiveStreamPublishInfoByPageResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set publishInfoList
     *
     * @param publishInfoList
     */
    public DescribeLiveStreamPublishInfoByPageResult publishInfoList(List<LiveStreamPublishInfo> publishInfoList) {
        this.publishInfoList = publishInfoList;
        return this;
    }


    /**
     * add item to publishInfoList
     *
     * @param publishInfoList
     */
    public void addPublishInfoList(LiveStreamPublishInfo publishInfoList) {
        if (this.publishInfoList == null) {
            this.publishInfoList = new ArrayList<>();
        }
        this.publishInfoList.add(publishInfoList);
    }

}