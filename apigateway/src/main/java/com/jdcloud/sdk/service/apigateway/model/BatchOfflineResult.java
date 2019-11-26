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
 * 部署列表
 * 提供部署信息的创建、查询、下线、修改等功能。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.apigateway.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.ErrorItem;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 批量下线
 */
public class BatchOfflineResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 操作成功的资源个数
     */
    private Integer successCount;

    /**
     * failed
     */
    private List<ErrorItem> failed;


    /**
     * get 操作成功的资源个数
     *
     * @return
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    /**
     * set 操作成功的资源个数
     *
     * @param successCount
     */
    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    /**
     * get failed
     *
     * @return
     */
    public List<ErrorItem> getFailed() {
        return failed;
    }

    /**
     * set failed
     *
     * @param failed
     */
    public void setFailed(List<ErrorItem> failed) {
        this.failed = failed;
    }


    /**
     * set 操作成功的资源个数
     *
     * @param successCount
     */
    public BatchOfflineResult successCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * set failed
     *
     * @param failed
     */
    public BatchOfflineResult failed(List<ErrorItem> failed) {
        this.failed = failed;
        return this;
    }


    /**
     * add item to failed
     *
     * @param failed
     */
    public void addFailed(ErrorItem failed) {
        if (this.failed == null) {
            this.failed = new ArrayList<>();
        }
        this.failed.add(failed);
    }

}