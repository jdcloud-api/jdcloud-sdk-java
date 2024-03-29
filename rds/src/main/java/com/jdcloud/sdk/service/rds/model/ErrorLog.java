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

package com.jdcloud.sdk.service.rds.model;


/**
 * errorLog
 */
public class ErrorLog  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 错误日志文件名称
     */
    private String name;

    /**
     * 错误日志文件大小，单位Byte
     */
    private Long sizeByte;

    /**
     * 错误日志最后更新时间，格式为：YYYY-MM-DD HH:mm:ss
     */
    private String lastUpdateTime;

    /**
     * 错误日志上传时间，格式为：YYYY-MM-DD HH:mm:ss
     */
    private String uploadTime;

    /**
     * 公网下载链接
     */
    private String publicURL;

    /**
     * 内网下载链接
     */
    private String internalURL;



    /**
     * get 错误日志文件名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 错误日志文件名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 错误日志文件大小，单位Byte
     *
     * @return
     */
    public Long getSizeByte() {
        return sizeByte;
    }

    /**
     * set 错误日志文件大小，单位Byte
     *
     * @param sizeByte
     */
    public void setSizeByte(Long sizeByte) {
        this.sizeByte = sizeByte;
    }


    /**
     * get 错误日志最后更新时间，格式为：YYYY-MM-DD HH:mm:ss
     *
     * @return
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * set 错误日志最后更新时间，格式为：YYYY-MM-DD HH:mm:ss
     *
     * @param lastUpdateTime
     */
    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }


    /**
     * get 错误日志上传时间，格式为：YYYY-MM-DD HH:mm:ss
     *
     * @return
     */
    public String getUploadTime() {
        return uploadTime;
    }

    /**
     * set 错误日志上传时间，格式为：YYYY-MM-DD HH:mm:ss
     *
     * @param uploadTime
     */
    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }


    /**
     * get 公网下载链接
     *
     * @return
     */
    public String getPublicURL() {
        return publicURL;
    }

    /**
     * set 公网下载链接
     *
     * @param publicURL
     */
    public void setPublicURL(String publicURL) {
        this.publicURL = publicURL;
    }


    /**
     * get 内网下载链接
     *
     * @return
     */
    public String getInternalURL() {
        return internalURL;
    }

    /**
     * set 内网下载链接
     *
     * @param internalURL
     */
    public void setInternalURL(String internalURL) {
        this.internalURL = internalURL;
    }



    /**
     * set 错误日志文件名称
     *
     * @param name
     */
    public ErrorLog name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 错误日志文件大小，单位Byte
     *
     * @param sizeByte
     */
    public ErrorLog sizeByte(Long sizeByte) {
        this.sizeByte = sizeByte;
        return this;
    }


    /**
     * set 错误日志最后更新时间，格式为：YYYY-MM-DD HH:mm:ss
     *
     * @param lastUpdateTime
     */
    public ErrorLog lastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }


    /**
     * set 错误日志上传时间，格式为：YYYY-MM-DD HH:mm:ss
     *
     * @param uploadTime
     */
    public ErrorLog uploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
        return this;
    }


    /**
     * set 公网下载链接
     *
     * @param publicURL
     */
    public ErrorLog publicURL(String publicURL) {
        this.publicURL = publicURL;
        return this;
    }


    /**
     * set 内网下载链接
     *
     * @param internalURL
     */
    public ErrorLog internalURL(String internalURL) {
        this.internalURL = internalURL;
        return this;
    }


}