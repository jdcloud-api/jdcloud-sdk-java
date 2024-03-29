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

package com.jdcloud.sdk.service.iotlink.model;


/**
 * cardBindStatusResp
 */
public class CardBindStatusResp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询结果
     */
    private String result;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误描述
     */
    private String errorDes;

    /**
     * 最近一次的分离时间
     */
    private String sepTime;



    /**
     * get 查询结果
     *
     * @return
     */
    public String getResult() {
        return result;
    }

    /**
     * set 查询结果
     *
     * @param result
     */
    public void setResult(String result) {
        this.result = result;
    }


    /**
     * get 错误码
     *
     * @return
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * set 错误码
     *
     * @param errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * get 错误描述
     *
     * @return
     */
    public String getErrorDes() {
        return errorDes;
    }

    /**
     * set 错误描述
     *
     * @param errorDes
     */
    public void setErrorDes(String errorDes) {
        this.errorDes = errorDes;
    }


    /**
     * get 最近一次的分离时间
     *
     * @return
     */
    public String getSepTime() {
        return sepTime;
    }

    /**
     * set 最近一次的分离时间
     *
     * @param sepTime
     */
    public void setSepTime(String sepTime) {
        this.sepTime = sepTime;
    }



    /**
     * set 查询结果
     *
     * @param result
     */
    public CardBindStatusResp result(String result) {
        this.result = result;
        return this;
    }


    /**
     * set 错误码
     *
     * @param errorCode
     */
    public CardBindStatusResp errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }


    /**
     * set 错误描述
     *
     * @param errorDes
     */
    public CardBindStatusResp errorDes(String errorDes) {
        this.errorDes = errorDes;
        return this;
    }


    /**
     * set 最近一次的分离时间
     *
     * @param sepTime
     */
    public CardBindStatusResp sepTime(String sepTime) {
        this.sepTime = sepTime;
        return this;
    }


}