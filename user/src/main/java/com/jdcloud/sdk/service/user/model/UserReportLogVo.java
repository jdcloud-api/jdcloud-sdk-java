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

package com.jdcloud.sdk.service.user.model;


/**
 * userReportLogVo
 */
public class UserReportLogVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * pin
     */
    private String pin;

    /**
     * 历史版本
     */
    private String updateTime;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 备注
     */
    private String remark;



    /**
     * get id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * get pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 历史版本
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 历史版本
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * get 操作人
     *
     * @return
     */
    public String getOperator() {
        return operator;
    }

    /**
     * set 操作人
     *
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }


    /**
     * get 备注
     *
     * @return
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set 备注
     *
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }



    /**
     * set id
     *
     * @param id
     */
    public UserReportLogVo id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set pin
     *
     * @param pin
     */
    public UserReportLogVo pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 历史版本
     *
     * @param updateTime
     */
    public UserReportLogVo updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set 操作人
     *
     * @param operator
     */
    public UserReportLogVo operator(String operator) {
        this.operator = operator;
        return this;
    }


    /**
     * set 备注
     *
     * @param remark
     */
    public UserReportLogVo remark(String remark) {
        this.remark = remark;
        return this;
    }


}