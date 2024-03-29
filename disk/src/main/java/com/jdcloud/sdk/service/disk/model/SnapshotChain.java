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

package com.jdcloud.sdk.service.disk.model;


/**
 * 快照链信息
 */
public class SnapshotChain  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 快照链ID
     */
    private String diskId;

    /**
     * 快照链快照个数
     */
    private Integer snapshotTotalCount;

    /**
     * 快照链快照总容量，单位Byte
     */
    private Integer snapshotChainSize;



    /**
     * get 快照链ID
     *
     * @return
     */
    public String getDiskId() {
        return diskId;
    }

    /**
     * set 快照链ID
     *
     * @param diskId
     */
    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }


    /**
     * get 快照链快照个数
     *
     * @return
     */
    public Integer getSnapshotTotalCount() {
        return snapshotTotalCount;
    }

    /**
     * set 快照链快照个数
     *
     * @param snapshotTotalCount
     */
    public void setSnapshotTotalCount(Integer snapshotTotalCount) {
        this.snapshotTotalCount = snapshotTotalCount;
    }


    /**
     * get 快照链快照总容量，单位Byte
     *
     * @return
     */
    public Integer getSnapshotChainSize() {
        return snapshotChainSize;
    }

    /**
     * set 快照链快照总容量，单位Byte
     *
     * @param snapshotChainSize
     */
    public void setSnapshotChainSize(Integer snapshotChainSize) {
        this.snapshotChainSize = snapshotChainSize;
    }



    /**
     * set 快照链ID
     *
     * @param diskId
     */
    public SnapshotChain diskId(String diskId) {
        this.diskId = diskId;
        return this;
    }


    /**
     * set 快照链快照个数
     *
     * @param snapshotTotalCount
     */
    public SnapshotChain snapshotTotalCount(Integer snapshotTotalCount) {
        this.snapshotTotalCount = snapshotTotalCount;
        return this;
    }


    /**
     * set 快照链快照总容量，单位Byte
     *
     * @param snapshotChainSize
     */
    public SnapshotChain snapshotChainSize(Integer snapshotChainSize) {
        this.snapshotChainSize = snapshotChainSize;
        return this;
    }


}