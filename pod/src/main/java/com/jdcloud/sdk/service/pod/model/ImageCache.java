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

package com.jdcloud.sdk.service.pod.model;


/**
 * 镜像缓存详情
 */
public class ImageCache  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 镜像缓存ID。
     */
    private String imageCacheId;

    /**
     * 镜像缓存名称。
     */
    private String name;

    /**
     * 缓存大小
     */
    private Integer size;

    /**
     * 镜像名称。
     */
    private String imageName;

    /**
     * 创建时间。
     */
    private String createTime;

    /**
     * 到期时间。
     */
    private String expireDateTime;

    /**
     * 最后一次匹配的时间。
     */
    private String lastMatchedTime;

    /**
     * 使用次数。
     */
    private Integer useCount;

    /**
     * 快照Id
     */
    private String snapShotId;

    /**
     * 状态
     */
    private String status;



    /**
     * get 镜像缓存ID。
     *
     * @return
     */
    public String getImageCacheId() {
        return imageCacheId;
    }

    /**
     * set 镜像缓存ID。
     *
     * @param imageCacheId
     */
    public void setImageCacheId(String imageCacheId) {
        this.imageCacheId = imageCacheId;
    }


    /**
     * get 镜像缓存名称。
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 镜像缓存名称。
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 缓存大小
     *
     * @return
     */
    public Integer getSize() {
        return size;
    }

    /**
     * set 缓存大小
     *
     * @param size
     */
    public void setSize(Integer size) {
        this.size = size;
    }


    /**
     * get 镜像名称。
     *
     * @return
     */
    public String getImageName() {
        return imageName;
    }

    /**
     * set 镜像名称。
     *
     * @param imageName
     */
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }


    /**
     * get 创建时间。
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间。
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 到期时间。
     *
     * @return
     */
    public String getExpireDateTime() {
        return expireDateTime;
    }

    /**
     * set 到期时间。
     *
     * @param expireDateTime
     */
    public void setExpireDateTime(String expireDateTime) {
        this.expireDateTime = expireDateTime;
    }


    /**
     * get 最后一次匹配的时间。
     *
     * @return
     */
    public String getLastMatchedTime() {
        return lastMatchedTime;
    }

    /**
     * set 最后一次匹配的时间。
     *
     * @param lastMatchedTime
     */
    public void setLastMatchedTime(String lastMatchedTime) {
        this.lastMatchedTime = lastMatchedTime;
    }


    /**
     * get 使用次数。
     *
     * @return
     */
    public Integer getUseCount() {
        return useCount;
    }

    /**
     * set 使用次数。
     *
     * @param useCount
     */
    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }


    /**
     * get 快照Id
     *
     * @return
     */
    public String getSnapShotId() {
        return snapShotId;
    }

    /**
     * set 快照Id
     *
     * @param snapShotId
     */
    public void setSnapShotId(String snapShotId) {
        this.snapShotId = snapShotId;
    }


    /**
     * get 状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }



    /**
     * set 镜像缓存ID。
     *
     * @param imageCacheId
     */
    public ImageCache imageCacheId(String imageCacheId) {
        this.imageCacheId = imageCacheId;
        return this;
    }


    /**
     * set 镜像缓存名称。
     *
     * @param name
     */
    public ImageCache name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 缓存大小
     *
     * @param size
     */
    public ImageCache size(Integer size) {
        this.size = size;
        return this;
    }


    /**
     * set 镜像名称。
     *
     * @param imageName
     */
    public ImageCache imageName(String imageName) {
        this.imageName = imageName;
        return this;
    }


    /**
     * set 创建时间。
     *
     * @param createTime
     */
    public ImageCache createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 到期时间。
     *
     * @param expireDateTime
     */
    public ImageCache expireDateTime(String expireDateTime) {
        this.expireDateTime = expireDateTime;
        return this;
    }


    /**
     * set 最后一次匹配的时间。
     *
     * @param lastMatchedTime
     */
    public ImageCache lastMatchedTime(String lastMatchedTime) {
        this.lastMatchedTime = lastMatchedTime;
        return this;
    }


    /**
     * set 使用次数。
     *
     * @param useCount
     */
    public ImageCache useCount(Integer useCount) {
        this.useCount = useCount;
        return this;
    }


    /**
     * set 快照Id
     *
     * @param snapShotId
     */
    public ImageCache snapShotId(String snapShotId) {
        this.snapShotId = snapShotId;
        return this;
    }


    /**
     * set 状态
     *
     * @param status
     */
    public ImageCache status(String status) {
        this.status = status;
        return this;
    }


}