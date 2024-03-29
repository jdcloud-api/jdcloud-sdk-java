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
 * 实例管理
 * 实例管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.clickhouse.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 内部查询实例状态
 */
public class InternalDescribeInstanceResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前实例是否已开启云盘扩容锁，如已开启，返回true，如未开启，返回false
     */
    private Boolean cloudStorageLock;

    /**
     * 当前实例是否已开启参数组锁，如已开启，返回true，如未开启，返回false
     */
    private Boolean parametersGroupLock;


    /**
     * get 当前实例是否已开启云盘扩容锁，如已开启，返回true，如未开启，返回false
     *
     * @return
     */
    public Boolean getCloudStorageLock() {
        return cloudStorageLock;
    }

    /**
     * set 当前实例是否已开启云盘扩容锁，如已开启，返回true，如未开启，返回false
     *
     * @param cloudStorageLock
     */
    public void setCloudStorageLock(Boolean cloudStorageLock) {
        this.cloudStorageLock = cloudStorageLock;
    }

    /**
     * get 当前实例是否已开启参数组锁，如已开启，返回true，如未开启，返回false
     *
     * @return
     */
    public Boolean getParametersGroupLock() {
        return parametersGroupLock;
    }

    /**
     * set 当前实例是否已开启参数组锁，如已开启，返回true，如未开启，返回false
     *
     * @param parametersGroupLock
     */
    public void setParametersGroupLock(Boolean parametersGroupLock) {
        this.parametersGroupLock = parametersGroupLock;
    }


    /**
     * set 当前实例是否已开启云盘扩容锁，如已开启，返回true，如未开启，返回false
     *
     * @param cloudStorageLock
     */
    public InternalDescribeInstanceResult cloudStorageLock(Boolean cloudStorageLock) {
        this.cloudStorageLock = cloudStorageLock;
        return this;
    }

    /**
     * set 当前实例是否已开启参数组锁，如已开启，返回true，如未开启，返回false
     *
     * @param parametersGroupLock
     */
    public InternalDescribeInstanceResult parametersGroupLock(Boolean parametersGroupLock) {
        this.parametersGroupLock = parametersGroupLock;
        return this;
    }


}