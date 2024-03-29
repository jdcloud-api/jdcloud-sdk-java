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
 * 快照相关接口
 * 快照相关接口，提供创建快照，查询快照信息，删除快照，修改快照信息等功能。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.disk.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.disk.model.SnapshotSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * -   为指定云硬盘创建快照，新生成的快照的状态为creating。
-   同一地域下单用户快照的配额为15块。
-   为保证数据完整性，请您在创建快照之前，停止对云硬盘进行写入操作，以保证快照数据的完整性。
-   在执行创建快照前，建议您对云硬盘进行卸载操作，创建快照后再重新挂载到云主机上。
-   手动快照的生命周期独立于云硬盘，请您及时删除不需要的快照。
-   创建快照所需时间取决于云硬盘容量的大小，云硬盘容量越大耗时越长。

 */
public class CreateSnapshotRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 创建快照规格
     * Required:true
     */
    @Required
    private SnapshotSpec snapshotSpec;

    /**
     * 幂等性校验参数
     * Required:true
     */
    @Required
    private String clientToken;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 创建快照规格
     *
     * @return
     */
    public SnapshotSpec getSnapshotSpec() {
        return snapshotSpec;
    }

    /**
     * set 创建快照规格
     *
     * @param snapshotSpec
     */
    public void setSnapshotSpec(SnapshotSpec snapshotSpec) {
        this.snapshotSpec = snapshotSpec;
    }


    /**
     * get 幂等性校验参数
     *
     * @return
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * set 幂等性校验参数
     *
     * @param clientToken
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }


    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 创建快照规格
     *
     * @param snapshotSpec
     */
    public CreateSnapshotRequest snapshotSpec(SnapshotSpec snapshotSpec) {
        this.snapshotSpec = snapshotSpec;
        return this;
    }


    /**
     * set 幂等性校验参数
     *
     * @param clientToken
     */
    public CreateSnapshotRequest clientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public CreateSnapshotRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}