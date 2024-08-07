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

package com.jdcloud.sdk.service.cloudauth.model;

import java.util.List;
import java.util.ArrayList;

/**
 * data
 */
public class Data  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务状态（0：初始化，1：进行中，2：已完成）
     */
    private Integer status;

    /**
     * 描述
     */
    private String comment;

    /**
     * 详细信息
     */
    
    private List<RepairedAddressDetail> repairedAddressDetails;


    /**
     * get 任务状态（0：初始化，1：进行中，2：已完成）
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 任务状态（0：初始化，1：进行中，2：已完成）
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }


    /**
     * get 描述
     *
     * @return
     */
    public String getComment() {
        return comment;
    }

    /**
     * set 描述
     *
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }


    /**
    * get 详细信息
    *
    * @return
    */
    public List<RepairedAddressDetail> getRepairedAddressDetails() {
        return repairedAddressDetails;
    }

    /**
    * set 详细信息
    *
    * @param repairedAddressDetails
    */
    public void setRepairedAddressDetails(List<RepairedAddressDetail> repairedAddressDetails) {
        this.repairedAddressDetails = repairedAddressDetails;
    }



    /**
     * set 任务状态（0：初始化，1：进行中，2：已完成）
     *
     * @param status
     */
    public Data status(Integer status) {
        this.status = status;
        return this;
    }


    /**
     * set 描述
     *
     * @param comment
     */
    public Data comment(String comment) {
        this.comment = comment;
        return this;
    }


    /**
    * set 详细信息
    *
    * @param repairedAddressDetails
    */
    public Data repairedAddressDetails(List<RepairedAddressDetail> repairedAddressDetails) {
        this.repairedAddressDetails = repairedAddressDetails;
        return this;
    }



    /**
     * add item to 详细信息
     *
     * @param repairedAddressDetail
     */
    public void addRepairedAddressDetail(RepairedAddressDetail repairedAddressDetail) {
        if (this.repairedAddressDetails == null) {
            this.repairedAddressDetails = new ArrayList<>();
        }
        this.repairedAddressDetails.add(repairedAddressDetail);
    }
}