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

package com.jdcloud.sdk.service.fc.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * 函数代码
 */
public class InternalCode  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 存放函数代码ZIP包的OSS Bucket名称。
     * Required:true
     */
    @Required
    private String ossBucketName;

    /**
     * 存放函数代码ZIP包的OSS Object名称。
     * Required:true
     */
    @Required
    private String ossObjectName;

    /**
     * 部署包的 sha256 hash。
     * Required:true
     */
    @Required
    private String codeCheckSum;

    /**
     * 代码包大小。
     * Required:true
     */
    @Required
    private Integer codeSize;



    /**
     * get 存放函数代码ZIP包的OSS Bucket名称。
     *
     * @return
     */
    public String getOssBucketName() {
        return ossBucketName;
    }

    /**
     * set 存放函数代码ZIP包的OSS Bucket名称。
     *
     * @param ossBucketName
     */
    public void setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
    }


    /**
     * get 存放函数代码ZIP包的OSS Object名称。
     *
     * @return
     */
    public String getOssObjectName() {
        return ossObjectName;
    }

    /**
     * set 存放函数代码ZIP包的OSS Object名称。
     *
     * @param ossObjectName
     */
    public void setOssObjectName(String ossObjectName) {
        this.ossObjectName = ossObjectName;
    }


    /**
     * get 部署包的 sha256 hash。
     *
     * @return
     */
    public String getCodeCheckSum() {
        return codeCheckSum;
    }

    /**
     * set 部署包的 sha256 hash。
     *
     * @param codeCheckSum
     */
    public void setCodeCheckSum(String codeCheckSum) {
        this.codeCheckSum = codeCheckSum;
    }


    /**
     * get 代码包大小。
     *
     * @return
     */
    public Integer getCodeSize() {
        return codeSize;
    }

    /**
     * set 代码包大小。
     *
     * @param codeSize
     */
    public void setCodeSize(Integer codeSize) {
        this.codeSize = codeSize;
    }



    /**
     * set 存放函数代码ZIP包的OSS Bucket名称。
     *
     * @param ossBucketName
     */
    public InternalCode ossBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }


    /**
     * set 存放函数代码ZIP包的OSS Object名称。
     *
     * @param ossObjectName
     */
    public InternalCode ossObjectName(String ossObjectName) {
        this.ossObjectName = ossObjectName;
        return this;
    }


    /**
     * set 部署包的 sha256 hash。
     *
     * @param codeCheckSum
     */
    public InternalCode codeCheckSum(String codeCheckSum) {
        this.codeCheckSum = codeCheckSum;
        return this;
    }


    /**
     * set 代码包大小。
     *
     * @param codeSize
     */
    public InternalCode codeSize(Integer codeSize) {
        this.codeSize = codeSize;
        return this;
    }


}