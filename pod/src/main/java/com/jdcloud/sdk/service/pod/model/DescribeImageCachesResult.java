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
 * ImageCache
 * 镜像缓存相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.pod.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.pod.model.ImageCache;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 批量查询镜像缓存。支持分页查询，默认每页20条。
 */
public class DescribeImageCachesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * imageCaches
     */
    
    private List<ImageCache> imageCaches;
    /**
     * totalCount
     */
    private Number totalCount;



    /**
    * get imageCaches
    *
    * @return
    */
    public List<ImageCache> getImageCaches() {
        return imageCaches;
    }

    /**
    * set imageCaches
    *
    * @param imageCaches
    */
    public void setImageCaches(List<ImageCache> imageCaches) {
        this.imageCaches = imageCaches;
    }


    /**
     * get totalCount
     *
     * @return
     */
    public Number getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Number totalCount) {
        this.totalCount = totalCount;
    }



    /**
    * set imageCaches
    *
    * @param imageCaches
    */
    public DescribeImageCachesResult imageCaches(List<ImageCache> imageCaches) {
        this.imageCaches = imageCaches;
        return this;
    }


    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribeImageCachesResult totalCount(Number totalCount) {
        this.totalCount = totalCount;
        return this;
    }



    /**
     * add item to imageCaches
     *
     * @param imageCache
     */
    public void addImageCache(ImageCache imageCache) {
        if (this.imageCaches == null) {
            this.imageCaches = new ArrayList<>();
        }
        this.imageCaches.add(imageCache);
    }
}