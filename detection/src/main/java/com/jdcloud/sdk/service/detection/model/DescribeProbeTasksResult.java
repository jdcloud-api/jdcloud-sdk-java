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
import com.jdcloud.sdk.service.detection.model.TaskInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询可用性监控任务列表
 */
public class DescribeProbeTasksResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 总页数
     */
    private Long numberPages;

    /**
     * 总记录数
     */
    private Long numberRecords;

    /**
     * 当前页码
     */
    private Long pageNumber;

    /**
     * 分页大小
     */
    private Long pageSize;

    /**
     * taskInfo
     */
    private List<TaskInfo> taskInfo;

    /**
     * 该用户的总task个数，不受查询的筛选条件影响
     */
    private Long totalCount;


    /**
     * get 总页数
     *
     * @return
     */
    public Long getNumberPages() {
        return numberPages;
    }

    /**
     * set 总页数
     *
     * @param numberPages
     */
    public void setNumberPages(Long numberPages) {
        this.numberPages = numberPages;
    }

    /**
     * get 总记录数
     *
     * @return
     */
    public Long getNumberRecords() {
        return numberRecords;
    }

    /**
     * set 总记录数
     *
     * @param numberRecords
     */
    public void setNumberRecords(Long numberRecords) {
        this.numberRecords = numberRecords;
    }

    /**
     * get 当前页码
     *
     * @return
     */
    public Long getPageNumber() {
        return pageNumber;
    }

    /**
     * set 当前页码
     *
     * @param pageNumber
     */
    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小
     *
     * @return
     */
    public Long getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小
     *
     * @param pageSize
     */
    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get taskInfo
     *
     * @return
     */
    public List<TaskInfo> getTaskInfo() {
        return taskInfo;
    }

    /**
     * set taskInfo
     *
     * @param taskInfo
     */
    public void setTaskInfo(List<TaskInfo> taskInfo) {
        this.taskInfo = taskInfo;
    }

    /**
     * get 该用户的总task个数，不受查询的筛选条件影响
     *
     * @return
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * set 该用户的总task个数，不受查询的筛选条件影响
     *
     * @param totalCount
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set 总页数
     *
     * @param numberPages
     */
    public DescribeProbeTasksResult numberPages(Long numberPages) {
        this.numberPages = numberPages;
        return this;
    }

    /**
     * set 总记录数
     *
     * @param numberRecords
     */
    public DescribeProbeTasksResult numberRecords(Long numberRecords) {
        this.numberRecords = numberRecords;
        return this;
    }

    /**
     * set 当前页码
     *
     * @param pageNumber
     */
    public DescribeProbeTasksResult pageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小
     *
     * @param pageSize
     */
    public DescribeProbeTasksResult pageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set taskInfo
     *
     * @param taskInfo
     */
    public DescribeProbeTasksResult taskInfo(List<TaskInfo> taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }

    /**
     * set 该用户的总task个数，不受查询的筛选条件影响
     *
     * @param totalCount
     */
    public DescribeProbeTasksResult totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to taskInfo
     *
     * @param taskInfo
     */
    public void addTaskInfo(TaskInfo taskInfo) {
        if (this.taskInfo == null) {
            this.taskInfo = new ArrayList<>();
        }
        this.taskInfo.add(taskInfo);
    }

}