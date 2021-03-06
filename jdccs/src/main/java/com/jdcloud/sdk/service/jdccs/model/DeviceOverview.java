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

package com.jdcloud.sdk.service.jdccs.model;


/**
 * 设备概览
 */
public class DeviceOverview  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设备总数目
     */
    private Integer sum;

    /**
     * 服务器总数目
     */
    private Integer server;

    /**
     * 网络设备总数目
     */
    private Integer network;

    /**
     * 存储设备总数目
     */
    private Integer storage;

    /**
     * 其它设备总数目
     */
    private Integer other;


    /**
     * get 设备总数目
     *
     * @return
     */
    public Integer getSum() {
        return sum;
    }

    /**
     * set 设备总数目
     *
     * @param sum
     */
    public void setSum(Integer sum) {
        this.sum = sum;
    }

    /**
     * get 服务器总数目
     *
     * @return
     */
    public Integer getServer() {
        return server;
    }

    /**
     * set 服务器总数目
     *
     * @param server
     */
    public void setServer(Integer server) {
        this.server = server;
    }

    /**
     * get 网络设备总数目
     *
     * @return
     */
    public Integer getNetwork() {
        return network;
    }

    /**
     * set 网络设备总数目
     *
     * @param network
     */
    public void setNetwork(Integer network) {
        this.network = network;
    }

    /**
     * get 存储设备总数目
     *
     * @return
     */
    public Integer getStorage() {
        return storage;
    }

    /**
     * set 存储设备总数目
     *
     * @param storage
     */
    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    /**
     * get 其它设备总数目
     *
     * @return
     */
    public Integer getOther() {
        return other;
    }

    /**
     * set 其它设备总数目
     *
     * @param other
     */
    public void setOther(Integer other) {
        this.other = other;
    }


    /**
     * set 设备总数目
     *
     * @param sum
     */
    public DeviceOverview sum(Integer sum) {
        this.sum = sum;
        return this;
    }

    /**
     * set 服务器总数目
     *
     * @param server
     */
    public DeviceOverview server(Integer server) {
        this.server = server;
        return this;
    }

    /**
     * set 网络设备总数目
     *
     * @param network
     */
    public DeviceOverview network(Integer network) {
        this.network = network;
        return this;
    }

    /**
     * set 存储设备总数目
     *
     * @param storage
     */
    public DeviceOverview storage(Integer storage) {
        this.storage = storage;
        return this;
    }

    /**
     * set 其它设备总数目
     *
     * @param other
     */
    public DeviceOverview other(Integer other) {
        this.other = other;
        return this;
    }


}