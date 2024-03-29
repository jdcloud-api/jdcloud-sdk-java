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

package com.jdcloud.sdk.service.vm.model;


/**
 * 云主机镜像详细信息。
 */
public class ExpiredImage  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 镜像ID。
     */
    private String imageId;

    /**
     * 镜像名称。
     */
    private String name;

    /**
     * 镜像的操作系统平台名称。
取值范围：&#x60;Ubuntu、CentOS、Windows Server、Other Linux、Other Windows&#x60;。

     */
    private String platform;

    /**
     * 镜像架构。取值范围：&#x60;x86_64、arm64&#x60;。
     */
    private String architecture;

    /**
     * 镜像的操作系统类型。取值范围：&#x60;windows、linux&#x60;。
     */
    private String osType;

    /**
     * 镜像状态。参考 [镜像状态](https://docs.jdcloud.com/virtual-machines/api/image_status)。
     */
    private String status;

    /**
     * 镜像的创建时间。
     */
    private String createTime;

    /**
     * 镜像描述。
     */
    private String desc;

    /**
     * 镜像支持的系统盘类型。取值范围：
&#x60;localDisk&#x60;：本地盘系统盘。
&#x60;cloudDisk&#x60;：云盘系统盘。

     */
    private String rootDeviceType;

    /**
     * 该镜像拥有者的用户PIN。
     */
    private String ownerPin;

    /**
     * 镜像过期时间，空表示永久有效。
     */
    private String expiredTime;

    /**
     * 创建来源。
     */
    private String createFrom;

    /**
     * 镜像来源，取值范围：
&#x60;public&#x60;：官方镜像。
&#x60;thirdparty&#x60;：镜像市场镜像。
&#x60;private&#x60;：用户自己的私有镜像。
&#x60;shared&#x60;：其他用户分享的镜像。
&#x60;community&#x60;：社区镜像。

     */
    private String imageSource;

    /**
     * 镜像的使用权限。取值范围：
&#x60;all&#x60;：没有限制，所有人均可以使用。
&#x60;specifiedUsers&#x60;：只有共享用户可以使用。
&#x60;ownerOnly&#x60;：镜像拥有者自己可以使用。
     */
    private String launchPermission;



    /**
     * get 镜像ID。
     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set 镜像ID。
     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }


    /**
     * get 镜像名称。
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 镜像名称。
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 镜像的操作系统平台名称。
取值范围：&#x60;Ubuntu、CentOS、Windows Server、Other Linux、Other Windows&#x60;。

     *
     * @return
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * set 镜像的操作系统平台名称。
取值范围：&#x60;Ubuntu、CentOS、Windows Server、Other Linux、Other Windows&#x60;。

     *
     * @param platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }


    /**
     * get 镜像架构。取值范围：&#x60;x86_64、arm64&#x60;。
     *
     * @return
     */
    public String getArchitecture() {
        return architecture;
    }

    /**
     * set 镜像架构。取值范围：&#x60;x86_64、arm64&#x60;。
     *
     * @param architecture
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }


    /**
     * get 镜像的操作系统类型。取值范围：&#x60;windows、linux&#x60;。
     *
     * @return
     */
    public String getOsType() {
        return osType;
    }

    /**
     * set 镜像的操作系统类型。取值范围：&#x60;windows、linux&#x60;。
     *
     * @param osType
     */
    public void setOsType(String osType) {
        this.osType = osType;
    }


    /**
     * get 镜像状态。参考 [镜像状态](https://docs.jdcloud.com/virtual-machines/api/image_status)。
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 镜像状态。参考 [镜像状态](https://docs.jdcloud.com/virtual-machines/api/image_status)。
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get 镜像的创建时间。
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 镜像的创建时间。
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 镜像描述。
     *
     * @return
     */
    public String getDesc() {
        return desc;
    }

    /**
     * set 镜像描述。
     *
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }


    /**
     * get 镜像支持的系统盘类型。取值范围：
&#x60;localDisk&#x60;：本地盘系统盘。
&#x60;cloudDisk&#x60;：云盘系统盘。

     *
     * @return
     */
    public String getRootDeviceType() {
        return rootDeviceType;
    }

    /**
     * set 镜像支持的系统盘类型。取值范围：
&#x60;localDisk&#x60;：本地盘系统盘。
&#x60;cloudDisk&#x60;：云盘系统盘。

     *
     * @param rootDeviceType
     */
    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }


    /**
     * get 该镜像拥有者的用户PIN。
     *
     * @return
     */
    public String getOwnerPin() {
        return ownerPin;
    }

    /**
     * set 该镜像拥有者的用户PIN。
     *
     * @param ownerPin
     */
    public void setOwnerPin(String ownerPin) {
        this.ownerPin = ownerPin;
    }


    /**
     * get 镜像过期时间，空表示永久有效。
     *
     * @return
     */
    public String getExpiredTime() {
        return expiredTime;
    }

    /**
     * set 镜像过期时间，空表示永久有效。
     *
     * @param expiredTime
     */
    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }


    /**
     * get 创建来源。
     *
     * @return
     */
    public String getCreateFrom() {
        return createFrom;
    }

    /**
     * set 创建来源。
     *
     * @param createFrom
     */
    public void setCreateFrom(String createFrom) {
        this.createFrom = createFrom;
    }


    /**
     * get 镜像来源，取值范围：
&#x60;public&#x60;：官方镜像。
&#x60;thirdparty&#x60;：镜像市场镜像。
&#x60;private&#x60;：用户自己的私有镜像。
&#x60;shared&#x60;：其他用户分享的镜像。
&#x60;community&#x60;：社区镜像。

     *
     * @return
     */
    public String getImageSource() {
        return imageSource;
    }

    /**
     * set 镜像来源，取值范围：
&#x60;public&#x60;：官方镜像。
&#x60;thirdparty&#x60;：镜像市场镜像。
&#x60;private&#x60;：用户自己的私有镜像。
&#x60;shared&#x60;：其他用户分享的镜像。
&#x60;community&#x60;：社区镜像。

     *
     * @param imageSource
     */
    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }


    /**
     * get 镜像的使用权限。取值范围：
&#x60;all&#x60;：没有限制，所有人均可以使用。
&#x60;specifiedUsers&#x60;：只有共享用户可以使用。
&#x60;ownerOnly&#x60;：镜像拥有者自己可以使用。
     *
     * @return
     */
    public String getLaunchPermission() {
        return launchPermission;
    }

    /**
     * set 镜像的使用权限。取值范围：
&#x60;all&#x60;：没有限制，所有人均可以使用。
&#x60;specifiedUsers&#x60;：只有共享用户可以使用。
&#x60;ownerOnly&#x60;：镜像拥有者自己可以使用。
     *
     * @param launchPermission
     */
    public void setLaunchPermission(String launchPermission) {
        this.launchPermission = launchPermission;
    }



    /**
     * set 镜像ID。
     *
     * @param imageId
     */
    public ExpiredImage imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }


    /**
     * set 镜像名称。
     *
     * @param name
     */
    public ExpiredImage name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 镜像的操作系统平台名称。
取值范围：&#x60;Ubuntu、CentOS、Windows Server、Other Linux、Other Windows&#x60;。

     *
     * @param platform
     */
    public ExpiredImage platform(String platform) {
        this.platform = platform;
        return this;
    }


    /**
     * set 镜像架构。取值范围：&#x60;x86_64、arm64&#x60;。
     *
     * @param architecture
     */
    public ExpiredImage architecture(String architecture) {
        this.architecture = architecture;
        return this;
    }


    /**
     * set 镜像的操作系统类型。取值范围：&#x60;windows、linux&#x60;。
     *
     * @param osType
     */
    public ExpiredImage osType(String osType) {
        this.osType = osType;
        return this;
    }


    /**
     * set 镜像状态。参考 [镜像状态](https://docs.jdcloud.com/virtual-machines/api/image_status)。
     *
     * @param status
     */
    public ExpiredImage status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set 镜像的创建时间。
     *
     * @param createTime
     */
    public ExpiredImage createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 镜像描述。
     *
     * @param desc
     */
    public ExpiredImage desc(String desc) {
        this.desc = desc;
        return this;
    }


    /**
     * set 镜像支持的系统盘类型。取值范围：
&#x60;localDisk&#x60;：本地盘系统盘。
&#x60;cloudDisk&#x60;：云盘系统盘。

     *
     * @param rootDeviceType
     */
    public ExpiredImage rootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
        return this;
    }


    /**
     * set 该镜像拥有者的用户PIN。
     *
     * @param ownerPin
     */
    public ExpiredImage ownerPin(String ownerPin) {
        this.ownerPin = ownerPin;
        return this;
    }


    /**
     * set 镜像过期时间，空表示永久有效。
     *
     * @param expiredTime
     */
    public ExpiredImage expiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }


    /**
     * set 创建来源。
     *
     * @param createFrom
     */
    public ExpiredImage createFrom(String createFrom) {
        this.createFrom = createFrom;
        return this;
    }


    /**
     * set 镜像来源，取值范围：
&#x60;public&#x60;：官方镜像。
&#x60;thirdparty&#x60;：镜像市场镜像。
&#x60;private&#x60;：用户自己的私有镜像。
&#x60;shared&#x60;：其他用户分享的镜像。
&#x60;community&#x60;：社区镜像。

     *
     * @param imageSource
     */
    public ExpiredImage imageSource(String imageSource) {
        this.imageSource = imageSource;
        return this;
    }


    /**
     * set 镜像的使用权限。取值范围：
&#x60;all&#x60;：没有限制，所有人均可以使用。
&#x60;specifiedUsers&#x60;：只有共享用户可以使用。
&#x60;ownerOnly&#x60;：镜像拥有者自己可以使用。
     *
     * @param launchPermission
     */
    public ExpiredImage launchPermission(String launchPermission) {
        this.launchPermission = launchPermission;
        return this;
    }


}