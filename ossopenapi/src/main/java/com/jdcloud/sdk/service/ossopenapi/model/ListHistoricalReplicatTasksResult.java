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
 * history replicator task
 * 同步历史数据API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ossopenapi.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.ossopenapi.model.HistoryReplicationTaskInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 根据bucket名称获取该bucket下的同步任务列表
 */
public class ListHistoricalReplicatTasksResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * historyReplicationTaskInfoList
     */
    private List<HistoryReplicationTaskInfo> historyReplicationTaskInfoList;

    /**
     * 下次查询开始的object
     */
    private String nextMarker;


    /**
     * get historyReplicationTaskInfoList
     *
     * @return
     */
    public List<HistoryReplicationTaskInfo> getHistoryReplicationTaskInfoList() {
        return historyReplicationTaskInfoList;
    }

    /**
     * set historyReplicationTaskInfoList
     *
     * @param historyReplicationTaskInfoList
     */
    public void setHistoryReplicationTaskInfoList(List<HistoryReplicationTaskInfo> historyReplicationTaskInfoList) {
        this.historyReplicationTaskInfoList = historyReplicationTaskInfoList;
    }

    /**
     * get 下次查询开始的object
     *
     * @return
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * set 下次查询开始的object
     *
     * @param nextMarker
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }


    /**
     * set historyReplicationTaskInfoList
     *
     * @param historyReplicationTaskInfoList
     */
    public ListHistoricalReplicatTasksResult historyReplicationTaskInfoList(List<HistoryReplicationTaskInfo> historyReplicationTaskInfoList) {
        this.historyReplicationTaskInfoList = historyReplicationTaskInfoList;
        return this;
    }

    /**
     * set 下次查询开始的object
     *
     * @param nextMarker
     */
    public ListHistoricalReplicatTasksResult nextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }


    /**
     * add item to historyReplicationTaskInfoList
     *
     * @param historyReplicationTaskInfoList
     */
    public void addHistoryReplicationTaskInfoList(HistoryReplicationTaskInfo historyReplicationTaskInfoList) {
        if (this.historyReplicationTaskInfoList == null) {
            this.historyReplicationTaskInfoList = new ArrayList<>();
        }
        this.historyReplicationTaskInfoList.add(historyReplicationTaskInfoList);
    }

}