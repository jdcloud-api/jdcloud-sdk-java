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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * 缓存Redis实例的一个备份文件对象
 */
public class Backup  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 备份操作ID
     * Required:true
     */
    @Required
    private String baseId;

    /**
     * 备份文件的名称
     * Required:true
     */
    @Required
    private String backupFileName;

    /**
     * 备份文件对应的实例ID
     * Required:true
     */
    @Required
    private String cacheInstanceId;

    /**
     * 备份开始时间（ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ）
     * Required:true
     */
    @Required
    private String backupStartTime;

    /**
     * 备份结束时间（ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ）
     * Required:true
     */
    @Required
    private String backupEndTime;

    /**
     * 备份类型，1表示手动备份，0表示自动备份
     * Required:true
     */
    @Required
    private Integer backupType;

    /**
     * 备份文件总字节大小，如果实例是集群版，则表示每个分片备份文件大小的总和
     * Required:true
     */
    @Required
    private Long backupSize;

    /**
     * 备份任务状态状态，0表示备份中，1表示失败，2表示成功
     * Required:true
     */
    @Required
    private Integer backupStatus;

    /**
     * 备份文件下载地址（已废弃，调用获取备份文件下载地址接口获取）
     * Required:true
     */
    @Required
    private String backupDownloadURL;



    /**
     * get 备份操作ID
     *
     * @return
     */
    public String getBaseId() {
        return baseId;
    }

    /**
     * set 备份操作ID
     *
     * @param baseId
     */
    public void setBaseId(String baseId) {
        this.baseId = baseId;
    }


    /**
     * get 备份文件的名称
     *
     * @return
     */
    public String getBackupFileName() {
        return backupFileName;
    }

    /**
     * set 备份文件的名称
     *
     * @param backupFileName
     */
    public void setBackupFileName(String backupFileName) {
        this.backupFileName = backupFileName;
    }


    /**
     * get 备份文件对应的实例ID
     *
     * @return
     */
    public String getCacheInstanceId() {
        return cacheInstanceId;
    }

    /**
     * set 备份文件对应的实例ID
     *
     * @param cacheInstanceId
     */
    public void setCacheInstanceId(String cacheInstanceId) {
        this.cacheInstanceId = cacheInstanceId;
    }


    /**
     * get 备份开始时间（ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ）
     *
     * @return
     */
    public String getBackupStartTime() {
        return backupStartTime;
    }

    /**
     * set 备份开始时间（ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ）
     *
     * @param backupStartTime
     */
    public void setBackupStartTime(String backupStartTime) {
        this.backupStartTime = backupStartTime;
    }


    /**
     * get 备份结束时间（ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ）
     *
     * @return
     */
    public String getBackupEndTime() {
        return backupEndTime;
    }

    /**
     * set 备份结束时间（ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ）
     *
     * @param backupEndTime
     */
    public void setBackupEndTime(String backupEndTime) {
        this.backupEndTime = backupEndTime;
    }


    /**
     * get 备份类型，1表示手动备份，0表示自动备份
     *
     * @return
     */
    public Integer getBackupType() {
        return backupType;
    }

    /**
     * set 备份类型，1表示手动备份，0表示自动备份
     *
     * @param backupType
     */
    public void setBackupType(Integer backupType) {
        this.backupType = backupType;
    }


    /**
     * get 备份文件总字节大小，如果实例是集群版，则表示每个分片备份文件大小的总和
     *
     * @return
     */
    public Long getBackupSize() {
        return backupSize;
    }

    /**
     * set 备份文件总字节大小，如果实例是集群版，则表示每个分片备份文件大小的总和
     *
     * @param backupSize
     */
    public void setBackupSize(Long backupSize) {
        this.backupSize = backupSize;
    }


    /**
     * get 备份任务状态状态，0表示备份中，1表示失败，2表示成功
     *
     * @return
     */
    public Integer getBackupStatus() {
        return backupStatus;
    }

    /**
     * set 备份任务状态状态，0表示备份中，1表示失败，2表示成功
     *
     * @param backupStatus
     */
    public void setBackupStatus(Integer backupStatus) {
        this.backupStatus = backupStatus;
    }


    /**
     * get 备份文件下载地址（已废弃，调用获取备份文件下载地址接口获取）
     *
     * @return
     */
    public String getBackupDownloadURL() {
        return backupDownloadURL;
    }

    /**
     * set 备份文件下载地址（已废弃，调用获取备份文件下载地址接口获取）
     *
     * @param backupDownloadURL
     */
    public void setBackupDownloadURL(String backupDownloadURL) {
        this.backupDownloadURL = backupDownloadURL;
    }



    /**
     * set 备份操作ID
     *
     * @param baseId
     */
    public Backup baseId(String baseId) {
        this.baseId = baseId;
        return this;
    }


    /**
     * set 备份文件的名称
     *
     * @param backupFileName
     */
    public Backup backupFileName(String backupFileName) {
        this.backupFileName = backupFileName;
        return this;
    }


    /**
     * set 备份文件对应的实例ID
     *
     * @param cacheInstanceId
     */
    public Backup cacheInstanceId(String cacheInstanceId) {
        this.cacheInstanceId = cacheInstanceId;
        return this;
    }


    /**
     * set 备份开始时间（ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ）
     *
     * @param backupStartTime
     */
    public Backup backupStartTime(String backupStartTime) {
        this.backupStartTime = backupStartTime;
        return this;
    }


    /**
     * set 备份结束时间（ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ）
     *
     * @param backupEndTime
     */
    public Backup backupEndTime(String backupEndTime) {
        this.backupEndTime = backupEndTime;
        return this;
    }


    /**
     * set 备份类型，1表示手动备份，0表示自动备份
     *
     * @param backupType
     */
    public Backup backupType(Integer backupType) {
        this.backupType = backupType;
        return this;
    }


    /**
     * set 备份文件总字节大小，如果实例是集群版，则表示每个分片备份文件大小的总和
     *
     * @param backupSize
     */
    public Backup backupSize(Long backupSize) {
        this.backupSize = backupSize;
        return this;
    }


    /**
     * set 备份任务状态状态，0表示备份中，1表示失败，2表示成功
     *
     * @param backupStatus
     */
    public Backup backupStatus(Integer backupStatus) {
        this.backupStatus = backupStatus;
        return this;
    }


    /**
     * set 备份文件下载地址（已废弃，调用获取备份文件下载地址接口获取）
     *
     * @param backupDownloadURL
     */
    public Backup backupDownloadURL(String backupDownloadURL) {
        this.backupDownloadURL = backupDownloadURL;
        return this;
    }


}