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
 * 数据库备份服务
 * 数据库备份服务接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dbs.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.dbs.model.BackupPlan;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询备份计划概要
 */
public class DescribeBackupPlansResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * totalCount
     */
    private Integer totalCount;

    /**
     * backupPlans
     */
    private List<BackupPlan> backupPlans;


    /**
     * get totalCount
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * get backupPlans
     *
     * @return
     */
    public List<BackupPlan> getBackupPlans() {
        return backupPlans;
    }

    /**
     * set backupPlans
     *
     * @param backupPlans
     */
    public void setBackupPlans(List<BackupPlan> backupPlans) {
        this.backupPlans = backupPlans;
    }


    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribeBackupPlansResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set backupPlans
     *
     * @param backupPlans
     */
    public DescribeBackupPlansResult backupPlans(List<BackupPlan> backupPlans) {
        this.backupPlans = backupPlans;
        return this;
    }


    /**
     * add item to backupPlans
     *
     * @param backupPlan
     */
    public void addBackupPlan(BackupPlan backupPlan) {
        if (this.backupPlans == null) {
            this.backupPlans = new ArrayList<>();
        }
        this.backupPlans.add(backupPlan);
    }

}