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
 * Instance-Management
 * 实例管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.tidb.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.tidb.model.DescribeParam;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查看TiDB实例的配置参数
 */
public class DescribeParametersResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * parameters
     */
    
    private List<DescribeParam> parameters;


    /**
    * get parameters
    *
    * @return
    */
    public List<DescribeParam> getParameters() {
        return parameters;
    }

    /**
    * set parameters
    *
    * @param parameters
    */
    public void setParameters(List<DescribeParam> parameters) {
        this.parameters = parameters;
    }



    /**
    * set parameters
    *
    * @param parameters
    */
    public DescribeParametersResult parameters(List<DescribeParam> parameters) {
        this.parameters = parameters;
        return this;
    }



    /**
     * add item to parameters
     *
     * @param parameter
     */
    public void addParameter(DescribeParam parameter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parameter);
    }
}