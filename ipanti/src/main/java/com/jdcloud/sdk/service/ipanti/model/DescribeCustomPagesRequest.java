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
 * Anti DDoS Pro Instance APIs
 * Anti DDoS Pro Instance APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询自定义页面列表
 */
public class DescribeCustomPagesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自定义页面状态, 可取值approving: 审批中, refused: 审批不通过, approved: 审批通过, 为空时查询全部
     */
    private String status;

    /**
     * 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例 ID
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 自定义页面状态, 可取值approving: 审批中, refused: 审批不通过, approved: 审批通过, 为空时查询全部
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 自定义页面状态, 可取值approving: 审批中, refused: 审批不通过, approved: 审批通过, 为空时查询全部
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 实例 ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例 ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 自定义页面状态, 可取值approving: 审批中, refused: 审批不通过, approved: 审批通过, 为空时查询全部
     *
     * @param status
     */
    public DescribeCustomPagesRequest status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @param regionId
     */
    public DescribeCustomPagesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 实例 ID
     *
     * @param instanceId
     */
    public DescribeCustomPagesRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}