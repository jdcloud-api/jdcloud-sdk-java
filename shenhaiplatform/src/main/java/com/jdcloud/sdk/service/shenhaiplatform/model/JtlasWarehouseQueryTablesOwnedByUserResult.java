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
 * Jtlas Warehouse Search API
 * 云仓引擎元数据查询:支持详情，分区，权限等能力
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.shenhaiplatform.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.shenhaiplatform.model.JtlasWarehouseTable;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询用户创建的表，支持基于表名模糊
 */
public class JtlasWarehouseQueryTablesOwnedByUserResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 业务响应码
     */
    private String code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * result
     */
    
    private List<JtlasWarehouseTable> result;


    /**
     * get 业务响应码
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * set 业务响应码
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * get 响应消息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 响应消息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
    * get result
    *
    * @return
    */
    public List<JtlasWarehouseTable> getResult() {
        return result;
    }

    /**
    * set result
    *
    * @param result
    */
    public void setResult(List<JtlasWarehouseTable> result) {
        this.result = result;
    }



    /**
     * set 业务响应码
     *
     * @param code
     */
    public JtlasWarehouseQueryTablesOwnedByUserResult code(String code) {
        this.code = code;
        return this;
    }


    /**
     * set 响应消息
     *
     * @param message
     */
    public JtlasWarehouseQueryTablesOwnedByUserResult message(String message) {
        this.message = message;
        return this;
    }


    /**
    * set result
    *
    * @param result
    */
    public JtlasWarehouseQueryTablesOwnedByUserResult result(List<JtlasWarehouseTable> result) {
        this.result = result;
        return this;
    }



    /**
     * add item to result
     *
     * @param result
     */
    public void addResult(JtlasWarehouseTable result) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(result);
    }
}