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
 * 图片检测相关接口
 * API related to image scan
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.censor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 图片同步检测v2
 */
public class ImageScanV2Request extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 指定检测场景
     */
    private List<ImageTaskV2> images;

    /**
     * 接口版本v4.1
     */
    private String version;

    /**
     * 业务bizType，请联系客户经理获取
     */
    private String bizType;

    /**
     * 接口指定过检分类，可多选，过检分类列表：100：色情，110：性感低俗，200：广告，210：二维码，260：广告法，300：暴恐，400：违禁，500：涉政，800：恶心类，900：其他，1100：涉价值观响应结果
     */
    private List<String> checkLabels;


    /**
     * get 指定检测场景
     *
     * @return
     */
    public List<ImageTaskV2> getImages() {
        return images;
    }

    /**
     * set 指定检测场景
     *
     * @param images
     */
    public void setImages(List<ImageTaskV2> images) {
        this.images = images;
    }

    /**
     * get 接口版本v4.1
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     * set 接口版本v4.1
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * get 业务bizType，请联系客户经理获取
     *
     * @return
     */
    public String getBizType() {
        return bizType;
    }

    /**
     * set 业务bizType，请联系客户经理获取
     *
     * @param bizType
     */
    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    /**
     * get 接口指定过检分类，可多选，过检分类列表：100：色情，110：性感低俗，200：广告，210：二维码，260：广告法，300：暴恐，400：违禁，500：涉政，800：恶心类，900：其他，1100：涉价值观响应结果
     *
     * @return
     */
    public List<String> getCheckLabels() {
        return checkLabels;
    }

    /**
     * set 接口指定过检分类，可多选，过检分类列表：100：色情，110：性感低俗，200：广告，210：二维码，260：广告法，300：暴恐，400：违禁，500：涉政，800：恶心类，900：其他，1100：涉价值观响应结果
     *
     * @param checkLabels
     */
    public void setCheckLabels(List<String> checkLabels) {
        this.checkLabels = checkLabels;
    }


    /**
     * set 指定检测场景
     *
     * @param images
     */
    public ImageScanV2Request images(List<ImageTaskV2> images) {
        this.images = images;
        return this;
    }

    /**
     * set 接口版本v4.1
     *
     * @param version
     */
    public ImageScanV2Request version(String version) {
        this.version = version;
        return this;
    }

    /**
     * set 业务bizType，请联系客户经理获取
     *
     * @param bizType
     */
    public ImageScanV2Request bizType(String bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * set 接口指定过检分类，可多选，过检分类列表：100：色情，110：性感低俗，200：广告，210：二维码，260：广告法，300：暴恐，400：违禁，500：涉政，800：恶心类，900：其他，1100：涉价值观响应结果
     *
     * @param checkLabels
     */
    public ImageScanV2Request checkLabels(List<String> checkLabels) {
        this.checkLabels = checkLabels;
        return this;
    }


    /**
     * add item to 指定检测场景
     *
     * @param image
     */
    public void addImage(ImageTaskV2 image) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(image);
    }

    /**
     * add item to 接口指定过检分类，可多选，过检分类列表：100：色情，110：性感低俗，200：广告，210：二维码，260：广告法，300：暴恐，400：违禁，500：涉政，800：恶心类，900：其他，1100：涉价值观响应结果
     *
     * @param checkLabel
     */
    public void addCheckLabel(String checkLabel) {
        if (this.checkLabels == null) {
            this.checkLabels = new ArrayList<>();
        }
        this.checkLabels.add(checkLabel);
    }

}