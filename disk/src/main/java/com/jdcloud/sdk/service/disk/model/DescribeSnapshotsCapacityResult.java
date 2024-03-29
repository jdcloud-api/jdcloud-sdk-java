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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.disk.model.SnapshotCapacity;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询快照容量
 */
public class DescribeSnapshotsCapacityResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * capacities
     */
    
    private List<SnapshotCapacity> capacities;


    /**
    * get capacities
    *
    * @return
    */
    public List<SnapshotCapacity> getCapacities() {
        return capacities;
    }

    /**
    * set capacities
    *
    * @param capacities
    */
    public void setCapacities(List<SnapshotCapacity> capacities) {
        this.capacities = capacities;
    }



    /**
    * set capacities
    *
    * @param capacities
    */
    public DescribeSnapshotsCapacityResult capacities(List<SnapshotCapacity> capacities) {
        this.capacities = capacities;
        return this;
    }



    /**
     * add item to capacities
     *
     * @param capacitie
     */
    public void addCapacitie(SnapshotCapacity capacitie) {
        if (this.capacities == null) {
            this.capacities = new ArrayList<>();
        }
        this.capacities.add(capacitie);
    }
}