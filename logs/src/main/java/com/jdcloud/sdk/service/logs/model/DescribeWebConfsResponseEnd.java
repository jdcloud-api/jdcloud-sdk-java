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

package com.jdcloud.sdk.service.logs.model;

import java.util.List;
import java.util.ArrayList;

/**
 * describeWebConfsResponseEnd
 */
public class DescribeWebConfsResponseEnd  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * WebConf列表
     */
    
    private List<WebConfEnd> data;


    /**
    * get WebConf列表
    *
    * @return
    */
    public List<WebConfEnd> getData() {
        return data;
    }

    /**
    * set WebConf列表
    *
    * @param data
    */
    public void setData(List<WebConfEnd> data) {
        this.data = data;
    }



    /**
    * set WebConf列表
    *
    * @param data
    */
    public DescribeWebConfsResponseEnd data(List<WebConfEnd> data) {
        this.data = data;
        return this;
    }



    /**
     * add item to WebConf列表
     *
     * @param data
     */
    public void addData(WebConfEnd data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }
}