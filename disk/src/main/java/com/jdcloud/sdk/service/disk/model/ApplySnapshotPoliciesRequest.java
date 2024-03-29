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
 * 快照策略相关接口
 * 云硬盘相关接口，快照策略的创建，更新，删除，查询，绑定/解绑磁盘等接口。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.disk.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.disk.model.PolicyDiskRelationOp;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 绑定/解绑快照策略与磁盘关系
 */
public class ApplySnapshotPoliciesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 绑定/解绑操作
     */
    
    private List<PolicyDiskRelationOp> relations;
    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
    * get 绑定/解绑操作
    *
    * @return
    */
    public List<PolicyDiskRelationOp> getRelations() {
        return relations;
    }

    /**
    * set 绑定/解绑操作
    *
    * @param relations
    */
    public void setRelations(List<PolicyDiskRelationOp> relations) {
        this.relations = relations;
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
    * set 绑定/解绑操作
    *
    * @param relations
    */
    public ApplySnapshotPoliciesRequest relations(List<PolicyDiskRelationOp> relations) {
        this.relations = relations;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public ApplySnapshotPoliciesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to 绑定/解绑操作
     *
     * @param relation
     */
    public void addRelation(PolicyDiskRelationOp relation) {
        if (this.relations == null) {
            this.relations = new ArrayList<>();
        }
        this.relations.add(relation);
    }
}