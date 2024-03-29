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

package com.jdcloud.sdk.service.cdn.model;


/**
 * oSSAuthInfo
 */
public class OSSAuthInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 密钥
     */
    private String accessKey;

    /**
     * 密钥的加密密钥
     */
    private String secretKey;

    /**
     * 默认为/tt-video
     */
    private String bucketName;

    /**
     * objectName
     */
    private String objectName;



    /**
     * get 密钥
     *
     * @return
     */
    public String getAccessKey() {
        return accessKey;
    }

    /**
     * set 密钥
     *
     * @param accessKey
     */
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }


    /**
     * get 密钥的加密密钥
     *
     * @return
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * set 密钥的加密密钥
     *
     * @param secretKey
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }


    /**
     * get 默认为/tt-video
     *
     * @return
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * set 默认为/tt-video
     *
     * @param bucketName
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }


    /**
     * get objectName
     *
     * @return
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * set objectName
     *
     * @param objectName
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }



    /**
     * set 密钥
     *
     * @param accessKey
     */
    public OSSAuthInfo accessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }


    /**
     * set 密钥的加密密钥
     *
     * @param secretKey
     */
    public OSSAuthInfo secretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }


    /**
     * set 默认为/tt-video
     *
     * @param bucketName
     */
    public OSSAuthInfo bucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }


    /**
     * set objectName
     *
     * @param objectName
     */
    public OSSAuthInfo objectName(String objectName) {
        this.objectName = objectName;
        return this;
    }


}