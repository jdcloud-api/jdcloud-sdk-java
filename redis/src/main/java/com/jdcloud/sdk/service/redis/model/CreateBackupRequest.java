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
 * Redis Instance API
 * 缓存Redis实例的创建、删除、修改基本信息、设置密码、变配、实例列表、备份、配置参数等接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建并执行缓存Redis实例的备份任务，只能为手动备份，可设置备份文件名称
 */
public class CreateBackupRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 备份文件名称，只支持英文数字和下划线的组合，长度不超过32个字符
     * Required:true
     */
    @Required
    private String fileName;

    /**
     * 备份类型：手动备份为1，只能为手动备份
     * Required:true
     */
    @Required
    private Integer backupType;

    /**
     * 缓存Redis实例所在区域的Region ID。目前有华北-北京、华南-广州、华东-上海三个区域，Region ID分别为cn-north-1、cn-south-1、cn-east-2
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 缓存Redis实例ID，是访问实例的唯一标识
     * Required:true
     */
    @Required
    private String cacheInstanceId;



    /**
     * get 备份文件名称，只支持英文数字和下划线的组合，长度不超过32个字符
     *
     * @return
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * set 备份文件名称，只支持英文数字和下划线的组合，长度不超过32个字符
     *
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    /**
     * get 备份类型：手动备份为1，只能为手动备份
     *
     * @return
     */
    public Integer getBackupType() {
        return backupType;
    }

    /**
     * set 备份类型：手动备份为1，只能为手动备份
     *
     * @param backupType
     */
    public void setBackupType(Integer backupType) {
        this.backupType = backupType;
    }


    /**
     * get 缓存Redis实例所在区域的Region ID。目前有华北-北京、华南-广州、华东-上海三个区域，Region ID分别为cn-north-1、cn-south-1、cn-east-2
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 缓存Redis实例所在区域的Region ID。目前有华北-北京、华南-广州、华东-上海三个区域，Region ID分别为cn-north-1、cn-south-1、cn-east-2
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 缓存Redis实例ID，是访问实例的唯一标识
     *
     * @return
     */
    public String getCacheInstanceId() {
        return cacheInstanceId;
    }

    /**
     * set 缓存Redis实例ID，是访问实例的唯一标识
     *
     * @param cacheInstanceId
     */
    public void setCacheInstanceId(String cacheInstanceId) {
        this.cacheInstanceId = cacheInstanceId;
    }



    /**
     * set 备份文件名称，只支持英文数字和下划线的组合，长度不超过32个字符
     *
     * @param fileName
     */
    public CreateBackupRequest fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }


    /**
     * set 备份类型：手动备份为1，只能为手动备份
     *
     * @param backupType
     */
    public CreateBackupRequest backupType(Integer backupType) {
        this.backupType = backupType;
        return this;
    }


    /**
     * set 缓存Redis实例所在区域的Region ID。目前有华北-北京、华南-广州、华东-上海三个区域，Region ID分别为cn-north-1、cn-south-1、cn-east-2
     *
     * @param regionId
     */
    public CreateBackupRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 缓存Redis实例ID，是访问实例的唯一标识
     *
     * @param cacheInstanceId
     */
    public CreateBackupRequest cacheInstanceId(String cacheInstanceId) {
        this.cacheInstanceId = cacheInstanceId;
        return this;
    }


}