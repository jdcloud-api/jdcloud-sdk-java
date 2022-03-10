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

package com.jdcloud.sdk.service.smartdba.model;


/**
 * instanceFilter
 */
public class InstanceFilter  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例gid
     */
    private String gid;

    /**
     * 实例名称
     */
    private String instanceName;

    /**
     * 接入来源
     */
    private String dbSource;

    /**
     * 实例状态
     */
    private String status;


    /**
     * get 实例gid
     *
     * @return
     */
    public String getGid() {
        return gid;
    }

    /**
     * set 实例gid
     *
     * @param gid
     */
    public void setGid(String gid) {
        this.gid = gid;
    }

    /**
     * get 实例名称
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 实例名称
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get 接入来源
     *
     * @return
     */
    public String getDbSource() {
        return dbSource;
    }

    /**
     * set 接入来源
     *
     * @param dbSource
     */
    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }

    /**
     * get 实例状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 实例状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * set 实例gid
     *
     * @param gid
     */
    public InstanceFilter gid(String gid) {
        this.gid = gid;
        return this;
    }

    /**
     * set 实例名称
     *
     * @param instanceName
     */
    public InstanceFilter instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 接入来源
     *
     * @param dbSource
     */
    public InstanceFilter dbSource(String dbSource) {
        this.dbSource = dbSource;
        return this;
    }

    /**
     * set 实例状态
     *
     * @param status
     */
    public InstanceFilter status(String status) {
        this.status = status;
        return this;
    }


}