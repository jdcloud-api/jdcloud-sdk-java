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
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建一个镜像缓存信息。镜像缓存加速是将镜像预先拉取到一个云盘中并制作为云盘快照，
用户在创建Pod/NC时，若使用的镜像已经有镜像缓存，则可以直接基于该镜像缓存对应的快照制作云盘，并挂载为该容器的系统盘，避免重复拉取镜像并加快创建速度。

 */
public class CreateImageCacheResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * imageCacheId
     */
    
    private List<String> imageCacheId;


    /**
    * get imageCacheId
    *
    * @return
    */
    public List<String> getImageCacheId() {
        return imageCacheId;
    }

    /**
    * set imageCacheId
    *
    * @param imageCacheId
    */
    public void setImageCacheId(List<String> imageCacheId) {
        this.imageCacheId = imageCacheId;
    }



    /**
    * set imageCacheId
    *
    * @param imageCacheId
    */
    public CreateImageCacheResult imageCacheId(List<String> imageCacheId) {
        this.imageCacheId = imageCacheId;
        return this;
    }



    /**
     * add item to imageCacheId
     *
     * @param imageCacheId
     */
    public void addImageCacheId(String imageCacheId) {
        if (this.imageCacheId == null) {
            this.imageCacheId = new ArrayList<>();
        }
        this.imageCacheId.add(imageCacheId);
    }
}