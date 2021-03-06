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
 * 修订版本
 * 提供修订版本的创建、查询、删除、修改、查重功能。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.apigateway.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除单个修订版本
 */
public class DeleteRevisionRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 分组ID
     * Required:true
     */
    @Required
    private String apiGroupId;

    /**
     * 版本ID
     * Required:true
     */
    @Required
    private String revisionId;


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
     * get 分组ID
     *
     * @return
     */
    public String getApiGroupId() {
        return apiGroupId;
    }

    /**
     * set 分组ID
     *
     * @param apiGroupId
     */
    public void setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
    }

    /**
     * get 版本ID
     *
     * @return
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * set 版本ID
     *
     * @param revisionId
     */
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DeleteRevisionRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 分组ID
     *
     * @param apiGroupId
     */
    public DeleteRevisionRequest apiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }

    /**
     * set 版本ID
     *
     * @param revisionId
     */
    public DeleteRevisionRequest revisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }


}