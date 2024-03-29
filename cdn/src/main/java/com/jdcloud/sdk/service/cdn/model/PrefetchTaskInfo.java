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

package com.jdcloud.sdk.service.cdn.model;


/**
 * prefetchTaskInfo
 */
public class PrefetchTaskInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * url
     */
    private String url;

    /**
     * 地区
     */
    private String region;

    /**
     * 运营商
     */
    private String isp;

    /**
     * 下发的目标副本数
     */
    private Integer copyNum;

    /**
     * 成功预热的副本数
     */
    private Integer successNum;

    /**
     * 文件大小
     */
    private Long fileSize;

    /**
     * 1代表控制台下发的任务,2代表热度计算下发的预热任务
     */
    private String taskType;

    /**
     * 1:active，2:表示purge中暂时停止预热
     */
    private String status;

    /**
     * 失败预热的原因
     */
    private String errInfo;

    /**
     * 热度计算下发任务的过期时间
     */
    private Long expireAt;

    /**
     * 文件id
     */
    private String fileId;

    /**
     * 地理位置
     */
    private String zone;



    /**
     * get url
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set url
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }


    /**
     * get 地区
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地区
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }


    /**
     * get 运营商
     *
     * @return
     */
    public String getIsp() {
        return isp;
    }

    /**
     * set 运营商
     *
     * @param isp
     */
    public void setIsp(String isp) {
        this.isp = isp;
    }


    /**
     * get 下发的目标副本数
     *
     * @return
     */
    public Integer getCopyNum() {
        return copyNum;
    }

    /**
     * set 下发的目标副本数
     *
     * @param copyNum
     */
    public void setCopyNum(Integer copyNum) {
        this.copyNum = copyNum;
    }


    /**
     * get 成功预热的副本数
     *
     * @return
     */
    public Integer getSuccessNum() {
        return successNum;
    }

    /**
     * set 成功预热的副本数
     *
     * @param successNum
     */
    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }


    /**
     * get 文件大小
     *
     * @return
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * set 文件大小
     *
     * @param fileSize
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * get 1代表控制台下发的任务,2代表热度计算下发的预热任务
     *
     * @return
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * set 1代表控制台下发的任务,2代表热度计算下发的预热任务
     *
     * @param taskType
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }


    /**
     * get 1:active，2:表示purge中暂时停止预热
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 1:active，2:表示purge中暂时停止预热
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get 失败预热的原因
     *
     * @return
     */
    public String getErrInfo() {
        return errInfo;
    }

    /**
     * set 失败预热的原因
     *
     * @param errInfo
     */
    public void setErrInfo(String errInfo) {
        this.errInfo = errInfo;
    }


    /**
     * get 热度计算下发任务的过期时间
     *
     * @return
     */
    public Long getExpireAt() {
        return expireAt;
    }

    /**
     * set 热度计算下发任务的过期时间
     *
     * @param expireAt
     */
    public void setExpireAt(Long expireAt) {
        this.expireAt = expireAt;
    }


    /**
     * get 文件id
     *
     * @return
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * set 文件id
     *
     * @param fileId
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }


    /**
     * get 地理位置
     *
     * @return
     */
    public String getZone() {
        return zone;
    }

    /**
     * set 地理位置
     *
     * @param zone
     */
    public void setZone(String zone) {
        this.zone = zone;
    }



    /**
     * set url
     *
     * @param url
     */
    public PrefetchTaskInfo url(String url) {
        this.url = url;
        return this;
    }


    /**
     * set 地区
     *
     * @param region
     */
    public PrefetchTaskInfo region(String region) {
        this.region = region;
        return this;
    }


    /**
     * set 运营商
     *
     * @param isp
     */
    public PrefetchTaskInfo isp(String isp) {
        this.isp = isp;
        return this;
    }


    /**
     * set 下发的目标副本数
     *
     * @param copyNum
     */
    public PrefetchTaskInfo copyNum(Integer copyNum) {
        this.copyNum = copyNum;
        return this;
    }


    /**
     * set 成功预热的副本数
     *
     * @param successNum
     */
    public PrefetchTaskInfo successNum(Integer successNum) {
        this.successNum = successNum;
        return this;
    }


    /**
     * set 文件大小
     *
     * @param fileSize
     */
    public PrefetchTaskInfo fileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }


    /**
     * set 1代表控制台下发的任务,2代表热度计算下发的预热任务
     *
     * @param taskType
     */
    public PrefetchTaskInfo taskType(String taskType) {
        this.taskType = taskType;
        return this;
    }


    /**
     * set 1:active，2:表示purge中暂时停止预热
     *
     * @param status
     */
    public PrefetchTaskInfo status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set 失败预热的原因
     *
     * @param errInfo
     */
    public PrefetchTaskInfo errInfo(String errInfo) {
        this.errInfo = errInfo;
        return this;
    }


    /**
     * set 热度计算下发任务的过期时间
     *
     * @param expireAt
     */
    public PrefetchTaskInfo expireAt(Long expireAt) {
        this.expireAt = expireAt;
        return this;
    }


    /**
     * set 文件id
     *
     * @param fileId
     */
    public PrefetchTaskInfo fileId(String fileId) {
        this.fileId = fileId;
        return this;
    }


    /**
     * set 地理位置
     *
     * @param zone
     */
    public PrefetchTaskInfo zone(String zone) {
        this.zone = zone;
        return this;
    }


}