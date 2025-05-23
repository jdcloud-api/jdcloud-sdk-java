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
 * RoomStream
 * 用户推流记录
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.openjrtc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.openjrtc.model.StreamInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询房间内推流信息列表
允许通过条件过滤查询，支持的过滤字段如下：
           - status[eq] 在线状态 1-在线 2-离线
           - kind[eq] 在线状态 1-音频流 2-视频流 100-数据流
           - deviceType[eq]  推流设备类型 kind&#x3D;1时,取值: 1-默认音频 2-蓝牙 3-手机音频 4-文件音频; kind&#x3D;2时,取值: 1-前置摄像头 2-后置摄像头 3-屏幕共享 4-文件视频;
           - userIds[eq] 业务接入方用户体系定义的且在JRTC系统内注册过的userId,userId个数上限为50
           - startTime[eq] 用户推流开始时间-UTC时间  startTime,endTime同时指定时生效
           - endTime[eq]   用户推流结束时间-UTC时间  startTime,endTime同时指定时生效

 */
public class DescribeStreamInfosByUserRoomIdResult extends JdcloudResult implements java.io.Serializable {

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
    private Integer totalElements;

    /**
     * 总页数
     */
    private Integer totalPages;

    /**
     * 推流信息列表
     */
    
    private List<StreamInfo> content;


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
    public Integer getTotalElements() {
        return totalElements;
    }

    /**
     * set 查询总数
     *
     * @param totalElements
     */
    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }


    /**
     * get 总页数
     *
     * @return
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * set 总页数
     *
     * @param totalPages
     */
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }


    /**
    * get 推流信息列表
    *
    * @return
    */
    public List<StreamInfo> getContent() {
        return content;
    }

    /**
    * set 推流信息列表
    *
    * @param content
    */
    public void setContent(List<StreamInfo> content) {
        this.content = content;
    }



    /**
     * set 当前页码
     *
     * @param pageNumber
     */
    public DescribeStreamInfosByUserRoomIdResult pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 每页数量
     *
     * @param pageSize
     */
    public DescribeStreamInfosByUserRoomIdResult pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set 查询总数
     *
     * @param totalElements
     */
    public DescribeStreamInfosByUserRoomIdResult totalElements(Integer totalElements) {
        this.totalElements = totalElements;
        return this;
    }


    /**
     * set 总页数
     *
     * @param totalPages
     */
    public DescribeStreamInfosByUserRoomIdResult totalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }


    /**
    * set 推流信息列表
    *
    * @param content
    */
    public DescribeStreamInfosByUserRoomIdResult content(List<StreamInfo> content) {
        this.content = content;
        return this;
    }



    /**
     * add item to 推流信息列表
     *
     * @param content
     */
    public void addContent(StreamInfo content) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(content);
    }
}