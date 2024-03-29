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

package com.jdcloud.sdk.service.disk.model;


/**
 * diskSpecification
 */
public class DiskSpecification  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云硬盘类型
     */
    private String diskType;

    /**
     * 支持的最小尺寸，单位为 GiB
     */
    private Integer minSizeGB;

    /**
     * 支持的最大尺寸，单位为 GiB
     */
    private Integer maxSizeGB;

    /**
     * 步长尺寸，单位为 GiB
     */
    private Integer stepSizeGB;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 类型名称
     */
    private String diskTypeName;

    /**
     * 默认的iops数量(基础iops数量)
     */
    private Integer defaultIOPS;

    /**
     * iops步长增量
     */
    private Float stepIOPS;

    /**
     * 最大iops数量
     */
    private Integer maxIOPS;

    /**
     * 默认的吞吐量
     */
    private Integer defaultThroughput;

    /**
     * 吞吐量步长增量
     */
    private Float stepThroughput;

    /**
     * 最大吞吐量
     */
    private Integer maxThroughput;

    /**
     * 是否开启IOPS可调整
     */
    private Boolean scalableIOPS;

    /**
     * 最大iops步长
     */
    private Integer maxStepIOPS;



    /**
     * get 云硬盘类型
     *
     * @return
     */
    public String getDiskType() {
        return diskType;
    }

    /**
     * set 云硬盘类型
     *
     * @param diskType
     */
    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }


    /**
     * get 支持的最小尺寸，单位为 GiB
     *
     * @return
     */
    public Integer getMinSizeGB() {
        return minSizeGB;
    }

    /**
     * set 支持的最小尺寸，单位为 GiB
     *
     * @param minSizeGB
     */
    public void setMinSizeGB(Integer minSizeGB) {
        this.minSizeGB = minSizeGB;
    }


    /**
     * get 支持的最大尺寸，单位为 GiB
     *
     * @return
     */
    public Integer getMaxSizeGB() {
        return maxSizeGB;
    }

    /**
     * set 支持的最大尺寸，单位为 GiB
     *
     * @param maxSizeGB
     */
    public void setMaxSizeGB(Integer maxSizeGB) {
        this.maxSizeGB = maxSizeGB;
    }


    /**
     * get 步长尺寸，单位为 GiB
     *
     * @return
     */
    public Integer getStepSizeGB() {
        return stepSizeGB;
    }

    /**
     * set 步长尺寸，单位为 GiB
     *
     * @param stepSizeGB
     */
    public void setStepSizeGB(Integer stepSizeGB) {
        this.stepSizeGB = stepSizeGB;
    }


    /**
     * get 描述信息
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述信息
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 类型名称
     *
     * @return
     */
    public String getDiskTypeName() {
        return diskTypeName;
    }

    /**
     * set 类型名称
     *
     * @param diskTypeName
     */
    public void setDiskTypeName(String diskTypeName) {
        this.diskTypeName = diskTypeName;
    }


    /**
     * get 默认的iops数量(基础iops数量)
     *
     * @return
     */
    public Integer getDefaultIOPS() {
        return defaultIOPS;
    }

    /**
     * set 默认的iops数量(基础iops数量)
     *
     * @param defaultIOPS
     */
    public void setDefaultIOPS(Integer defaultIOPS) {
        this.defaultIOPS = defaultIOPS;
    }


    /**
     * get iops步长增量
     *
     * @return
     */
    public Float getStepIOPS() {
        return stepIOPS;
    }

    /**
     * set iops步长增量
     *
     * @param stepIOPS
     */
    public void setStepIOPS(Float stepIOPS) {
        this.stepIOPS = stepIOPS;
    }


    /**
     * get 最大iops数量
     *
     * @return
     */
    public Integer getMaxIOPS() {
        return maxIOPS;
    }

    /**
     * set 最大iops数量
     *
     * @param maxIOPS
     */
    public void setMaxIOPS(Integer maxIOPS) {
        this.maxIOPS = maxIOPS;
    }


    /**
     * get 默认的吞吐量
     *
     * @return
     */
    public Integer getDefaultThroughput() {
        return defaultThroughput;
    }

    /**
     * set 默认的吞吐量
     *
     * @param defaultThroughput
     */
    public void setDefaultThroughput(Integer defaultThroughput) {
        this.defaultThroughput = defaultThroughput;
    }


    /**
     * get 吞吐量步长增量
     *
     * @return
     */
    public Float getStepThroughput() {
        return stepThroughput;
    }

    /**
     * set 吞吐量步长增量
     *
     * @param stepThroughput
     */
    public void setStepThroughput(Float stepThroughput) {
        this.stepThroughput = stepThroughput;
    }


    /**
     * get 最大吞吐量
     *
     * @return
     */
    public Integer getMaxThroughput() {
        return maxThroughput;
    }

    /**
     * set 最大吞吐量
     *
     * @param maxThroughput
     */
    public void setMaxThroughput(Integer maxThroughput) {
        this.maxThroughput = maxThroughput;
    }


    /**
     * get 是否开启IOPS可调整
     *
     * @return
     */
    public Boolean getScalableIOPS() {
        return scalableIOPS;
    }

    /**
     * set 是否开启IOPS可调整
     *
     * @param scalableIOPS
     */
    public void setScalableIOPS(Boolean scalableIOPS) {
        this.scalableIOPS = scalableIOPS;
    }


    /**
     * get 最大iops步长
     *
     * @return
     */
    public Integer getMaxStepIOPS() {
        return maxStepIOPS;
    }

    /**
     * set 最大iops步长
     *
     * @param maxStepIOPS
     */
    public void setMaxStepIOPS(Integer maxStepIOPS) {
        this.maxStepIOPS = maxStepIOPS;
    }



    /**
     * set 云硬盘类型
     *
     * @param diskType
     */
    public DiskSpecification diskType(String diskType) {
        this.diskType = diskType;
        return this;
    }


    /**
     * set 支持的最小尺寸，单位为 GiB
     *
     * @param minSizeGB
     */
    public DiskSpecification minSizeGB(Integer minSizeGB) {
        this.minSizeGB = minSizeGB;
        return this;
    }


    /**
     * set 支持的最大尺寸，单位为 GiB
     *
     * @param maxSizeGB
     */
    public DiskSpecification maxSizeGB(Integer maxSizeGB) {
        this.maxSizeGB = maxSizeGB;
        return this;
    }


    /**
     * set 步长尺寸，单位为 GiB
     *
     * @param stepSizeGB
     */
    public DiskSpecification stepSizeGB(Integer stepSizeGB) {
        this.stepSizeGB = stepSizeGB;
        return this;
    }


    /**
     * set 描述信息
     *
     * @param description
     */
    public DiskSpecification description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 类型名称
     *
     * @param diskTypeName
     */
    public DiskSpecification diskTypeName(String diskTypeName) {
        this.diskTypeName = diskTypeName;
        return this;
    }


    /**
     * set 默认的iops数量(基础iops数量)
     *
     * @param defaultIOPS
     */
    public DiskSpecification defaultIOPS(Integer defaultIOPS) {
        this.defaultIOPS = defaultIOPS;
        return this;
    }


    /**
     * set iops步长增量
     *
     * @param stepIOPS
     */
    public DiskSpecification stepIOPS(Float stepIOPS) {
        this.stepIOPS = stepIOPS;
        return this;
    }


    /**
     * set 最大iops数量
     *
     * @param maxIOPS
     */
    public DiskSpecification maxIOPS(Integer maxIOPS) {
        this.maxIOPS = maxIOPS;
        return this;
    }


    /**
     * set 默认的吞吐量
     *
     * @param defaultThroughput
     */
    public DiskSpecification defaultThroughput(Integer defaultThroughput) {
        this.defaultThroughput = defaultThroughput;
        return this;
    }


    /**
     * set 吞吐量步长增量
     *
     * @param stepThroughput
     */
    public DiskSpecification stepThroughput(Float stepThroughput) {
        this.stepThroughput = stepThroughput;
        return this;
    }


    /**
     * set 最大吞吐量
     *
     * @param maxThroughput
     */
    public DiskSpecification maxThroughput(Integer maxThroughput) {
        this.maxThroughput = maxThroughput;
        return this;
    }


    /**
     * set 是否开启IOPS可调整
     *
     * @param scalableIOPS
     */
    public DiskSpecification scalableIOPS(Boolean scalableIOPS) {
        this.scalableIOPS = scalableIOPS;
        return this;
    }


    /**
     * set 最大iops步长
     *
     * @param maxStepIOPS
     */
    public DiskSpecification maxStepIOPS(Integer maxStepIOPS) {
        this.maxStepIOPS = maxStepIOPS;
        return this;
    }


}