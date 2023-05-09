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
 * Log-Analytics
 * Analytics data for a zone/instance
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.starshield.model.AccessLog;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 访问日志.
 */
public class AccessLogResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * total
     */
    private Number total;

    /**
     * dataList
     */
    
    private List<AccessLog> dataList;


    /**
     * get total
     *
     * @return
     */
    public Number getTotal() {
        return total;
    }

    /**
     * set total
     *
     * @param total
     */
    public void setTotal(Number total) {
        this.total = total;
    }


    /**
    * get dataList
    *
    * @return
    */
    public List<AccessLog> getDataList() {
        return dataList;
    }

    /**
    * set dataList
    *
    * @param dataList
    */
    public void setDataList(List<AccessLog> dataList) {
        this.dataList = dataList;
    }



    /**
     * set total
     *
     * @param total
     */
    public AccessLogResult total(Number total) {
        this.total = total;
        return this;
    }


    /**
    * set dataList
    *
    * @param dataList
    */
    public AccessLogResult dataList(List<AccessLog> dataList) {
        this.dataList = dataList;
        return this;
    }



    /**
     * add item to dataList
     *
     * @param dataList
     */
    public void addDataList(AccessLog dataList) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataList);
    }
}