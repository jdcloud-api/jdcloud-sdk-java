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
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改备份策略
 */
public class ModifyBackupPolicyRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 周期类型，目前仅支持weekly
     */
    private String fullBackupPeriod;

    /**
     * 进行全量备份的日期, 备份周期为 weekly 时可以取 0-6 分别对应的是周日到周六
     */
    private List<Integer> fullBackupDays;

    /**
     * 全量备份的开始时间，精确到分,UTC时间格式，例如：23:30Z
     */
    private String fullBackupStartTime;

    /**
     * 全量备份保存天数，支持7-3650 天，默认7天
     */
    private Integer fullBackupRetentionPeriod;

    /**
     * 日志备份保存天数，支持7-3650 天，默认7天
     */
    private Integer logBackupRetentionPeriod;

    /**
     * 是否开启日志备份；true：开启；false：关闭
     */
    private Boolean enableBackupLogs;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》]
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 备份计划ID
     * Required:true
     */
    @Required
    private String backupPlanId;


    /**
     * get 周期类型，目前仅支持weekly
     *
     * @return
     */
    public String getFullBackupPeriod() {
        return fullBackupPeriod;
    }

    /**
     * set 周期类型，目前仅支持weekly
     *
     * @param fullBackupPeriod
     */
    public void setFullBackupPeriod(String fullBackupPeriod) {
        this.fullBackupPeriod = fullBackupPeriod;
    }

    /**
     * get 进行全量备份的日期, 备份周期为 weekly 时可以取 0-6 分别对应的是周日到周六
     *
     * @return
     */
    public List<Integer> getFullBackupDays() {
        return fullBackupDays;
    }

    /**
     * set 进行全量备份的日期, 备份周期为 weekly 时可以取 0-6 分别对应的是周日到周六
     *
     * @param fullBackupDays
     */
    public void setFullBackupDays(List<Integer> fullBackupDays) {
        this.fullBackupDays = fullBackupDays;
    }

    /**
     * get 全量备份的开始时间，精确到分,UTC时间格式，例如：23:30Z
     *
     * @return
     */
    public String getFullBackupStartTime() {
        return fullBackupStartTime;
    }

    /**
     * set 全量备份的开始时间，精确到分,UTC时间格式，例如：23:30Z
     *
     * @param fullBackupStartTime
     */
    public void setFullBackupStartTime(String fullBackupStartTime) {
        this.fullBackupStartTime = fullBackupStartTime;
    }

    /**
     * get 全量备份保存天数，支持7-3650 天，默认7天
     *
     * @return
     */
    public Integer getFullBackupRetentionPeriod() {
        return fullBackupRetentionPeriod;
    }

    /**
     * set 全量备份保存天数，支持7-3650 天，默认7天
     *
     * @param fullBackupRetentionPeriod
     */
    public void setFullBackupRetentionPeriod(Integer fullBackupRetentionPeriod) {
        this.fullBackupRetentionPeriod = fullBackupRetentionPeriod;
    }

    /**
     * get 日志备份保存天数，支持7-3650 天，默认7天
     *
     * @return
     */
    public Integer getLogBackupRetentionPeriod() {
        return logBackupRetentionPeriod;
    }

    /**
     * set 日志备份保存天数，支持7-3650 天，默认7天
     *
     * @param logBackupRetentionPeriod
     */
    public void setLogBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
        this.logBackupRetentionPeriod = logBackupRetentionPeriod;
    }

    /**
     * get 是否开启日志备份；true：开启；false：关闭
     *
     * @return
     */
    public Boolean getEnableBackupLogs() {
        return enableBackupLogs;
    }

    /**
     * set 是否开启日志备份；true：开启；false：关闭
     *
     * @param enableBackupLogs
     */
    public void setEnableBackupLogs(Boolean enableBackupLogs) {
        this.enableBackupLogs = enableBackupLogs;
    }

    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 备份计划ID
     *
     * @return
     */
    public String getBackupPlanId() {
        return backupPlanId;
    }

    /**
     * set 备份计划ID
     *
     * @param backupPlanId
     */
    public void setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
    }


    /**
     * set 周期类型，目前仅支持weekly
     *
     * @param fullBackupPeriod
     */
    public ModifyBackupPolicyRequest fullBackupPeriod(String fullBackupPeriod) {
        this.fullBackupPeriod = fullBackupPeriod;
        return this;
    }

    /**
     * set 进行全量备份的日期, 备份周期为 weekly 时可以取 0-6 分别对应的是周日到周六
     *
     * @param fullBackupDays
     */
    public ModifyBackupPolicyRequest fullBackupDays(List<Integer> fullBackupDays) {
        this.fullBackupDays = fullBackupDays;
        return this;
    }

    /**
     * set 全量备份的开始时间，精确到分,UTC时间格式，例如：23:30Z
     *
     * @param fullBackupStartTime
     */
    public ModifyBackupPolicyRequest fullBackupStartTime(String fullBackupStartTime) {
        this.fullBackupStartTime = fullBackupStartTime;
        return this;
    }

    /**
     * set 全量备份保存天数，支持7-3650 天，默认7天
     *
     * @param fullBackupRetentionPeriod
     */
    public ModifyBackupPolicyRequest fullBackupRetentionPeriod(Integer fullBackupRetentionPeriod) {
        this.fullBackupRetentionPeriod = fullBackupRetentionPeriod;
        return this;
    }

    /**
     * set 日志备份保存天数，支持7-3650 天，默认7天
     *
     * @param logBackupRetentionPeriod
     */
    public ModifyBackupPolicyRequest logBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
        this.logBackupRetentionPeriod = logBackupRetentionPeriod;
        return this;
    }

    /**
     * set 是否开启日志备份；true：开启；false：关闭
     *
     * @param enableBackupLogs
     */
    public ModifyBackupPolicyRequest enableBackupLogs(Boolean enableBackupLogs) {
        this.enableBackupLogs = enableBackupLogs;
        return this;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @param regionId
     */
    public ModifyBackupPolicyRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 备份计划ID
     *
     * @param backupPlanId
     */
    public ModifyBackupPolicyRequest backupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }


    /**
     * add item to 进行全量备份的日期, 备份周期为 weekly 时可以取 0-6 分别对应的是周日到周六
     *
     * @param fullBackupDay
     */
    public void addFullBackupDay(Integer fullBackupDay) {
        if (this.fullBackupDays == null) {
            this.fullBackupDays = new ArrayList<>();
        }
        this.fullBackupDays.add(fullBackupDay);
    }

}