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
 * 云硬盘相关接口
 * 云硬盘相关接口，提供批量创建云硬盘，查询云硬盘，删除云硬盘，对云硬盘进行扩容，修改云硬盘信息以及使用快照恢复云硬盘等功能。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.disk.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.disk.model.PolicyDiskRelationOpResult;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * -   创建一块或多块按配置或者按使用时长付费的云硬盘。
-   云硬盘类型包括高效云盘(premium-hdd)、SSD云盘(ssd)、通用型SSD(ssd.gp1)、性能型SSD(ssd.io1)、容量型HDD(hdd.std1)。
-   计费方式默认为按配置付费。
-   创建完成后，云硬盘状态为 available。
-   可选参数快照 ID用于从快照创建新盘。
-   批量创建时，云硬盘的命名为 硬盘名称-数字，例如 myDisk-1，myDisk-2。
-   maxCount为最大努力，不保证一定能达到maxCount。
-   userTags 为创建云盘时打的标签

 */
public class CreateDisksResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * policyRelations
     */
    
    private List<PolicyDiskRelationOpResult> policyRelations;
    /**
     * diskIds
     */
    
    private List<String> diskIds;
    /**
     * 标签结果信息
     */
    private String tagmsg;



    /**
    * get policyRelations
    *
    * @return
    */
    public List<PolicyDiskRelationOpResult> getPolicyRelations() {
        return policyRelations;
    }

    /**
    * set policyRelations
    *
    * @param policyRelations
    */
    public void setPolicyRelations(List<PolicyDiskRelationOpResult> policyRelations) {
        this.policyRelations = policyRelations;
    }


    /**
    * get diskIds
    *
    * @return
    */
    public List<String> getDiskIds() {
        return diskIds;
    }

    /**
    * set diskIds
    *
    * @param diskIds
    */
    public void setDiskIds(List<String> diskIds) {
        this.diskIds = diskIds;
    }


    /**
     * get 标签结果信息
     *
     * @return
     */
    public String getTagmsg() {
        return tagmsg;
    }

    /**
     * set 标签结果信息
     *
     * @param tagmsg
     */
    public void setTagmsg(String tagmsg) {
        this.tagmsg = tagmsg;
    }



    /**
    * set policyRelations
    *
    * @param policyRelations
    */
    public CreateDisksResult policyRelations(List<PolicyDiskRelationOpResult> policyRelations) {
        this.policyRelations = policyRelations;
        return this;
    }


    /**
    * set diskIds
    *
    * @param diskIds
    */
    public CreateDisksResult diskIds(List<String> diskIds) {
        this.diskIds = diskIds;
        return this;
    }


    /**
     * set 标签结果信息
     *
     * @param tagmsg
     */
    public CreateDisksResult tagmsg(String tagmsg) {
        this.tagmsg = tagmsg;
        return this;
    }



    /**
     * add item to policyRelations
     *
     * @param policyRelation
     */
    public void addPolicyRelation(PolicyDiskRelationOpResult policyRelation) {
        if (this.policyRelations == null) {
            this.policyRelations = new ArrayList<>();
        }
        this.policyRelations.add(policyRelation);
    }

    /**
     * add item to diskIds
     *
     * @param diskId
     */
    public void addDiskId(String diskId) {
        if (this.diskIds == null) {
            this.diskIds = new ArrayList<>();
        }
        this.diskIds.add(diskId);
    }
}