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

import com.jdcloud.sdk.annotation.Required;

/**
 * 绑定/解绑 策略 与 Disk 的操作类
 */
public class PolicyDiskRelationOp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 磁盘ID
     * Required:true
     */
    @Required
    private String diskId;

    /**
     * 磁盘地域ID
     * Required:true
     */
    @Required
    private String diskRegion;

    /**
     * 快照策略ID
     * Required:true
     */
    @Required
    private String policyId;

    /**
     * 联系组id
     * Required:true
     */
    @Required
    private Integer op;



    /**
     * get 磁盘ID
     *
     * @return
     */
    public String getDiskId() {
        return diskId;
    }

    /**
     * set 磁盘ID
     *
     * @param diskId
     */
    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }


    /**
     * get 磁盘地域ID
     *
     * @return
     */
    public String getDiskRegion() {
        return diskRegion;
    }

    /**
     * set 磁盘地域ID
     *
     * @param diskRegion
     */
    public void setDiskRegion(String diskRegion) {
        this.diskRegion = diskRegion;
    }


    /**
     * get 快照策略ID
     *
     * @return
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * set 快照策略ID
     *
     * @param policyId
     */
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }


    /**
     * get 联系组id
     *
     * @return
     */
    public Integer getOp() {
        return op;
    }

    /**
     * set 联系组id
     *
     * @param op
     */
    public void setOp(Integer op) {
        this.op = op;
    }



    /**
     * set 磁盘ID
     *
     * @param diskId
     */
    public PolicyDiskRelationOp diskId(String diskId) {
        this.diskId = diskId;
        return this;
    }


    /**
     * set 磁盘地域ID
     *
     * @param diskRegion
     */
    public PolicyDiskRelationOp diskRegion(String diskRegion) {
        this.diskRegion = diskRegion;
        return this;
    }


    /**
     * set 快照策略ID
     *
     * @param policyId
     */
    public PolicyDiskRelationOp policyId(String policyId) {
        this.policyId = policyId;
        return this;
    }


    /**
     * set 联系组id
     *
     * @param op
     */
    public PolicyDiskRelationOp op(Integer op) {
        this.op = op;
        return this;
    }


}