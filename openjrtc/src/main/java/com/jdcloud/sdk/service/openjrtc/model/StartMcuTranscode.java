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

package com.jdcloud.sdk.service.openjrtc.model;

import java.util.List;
import java.util.ArrayList;

/**
 * startMcuTranscode
 */
public class StartMcuTranscode  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用ID
     */
    private String appId;

    /**
     * 业务接入方定义的且在JRTC系统内注册过的房间号
     */
    private String userRoomId;

    /**
     * 布局模板 1-九宫格 2-左右屏幕分享 3-上下屏幕分享 4-画中画
     */
    private Integer layoutTemplate;

    /**
     * 主人员userId
     */
    private String mainUserId;

    /**
     * 1:摄像头  2：屏幕分享
     */
    private Integer mainVideoStreamType;

    /**
     * 是否显示音频图标 0：不显示  1:显示
     */
    private Integer showAudioIcon;

    /**
     * 是否显示昵称  0：不显示  1:显示
     */
    private Integer showNickName;

    /**
     * 输出类型 1：录制 2：旁路转推
     */
    private Integer outputType;

    /**
     * 输出录制文件的名称
     */
    private String outputName;

    /**
     * 输出录制文件的格式：mp4、flv、m3u8；为空时默认m3u8。
     */
    private String outputRecordFormat;

    /**
     * 转推直播地址（outputType&#x3D;2生效）
     */
    private String pushLiveUrl;

    /**
     * 参与混流人员参数；为空时，默认使用房间参会人进行混流
     */
    
    private List<McuUser> mcuUserInfos;
    /**
     * 输出格式
     */
    private OutputEncode outputEncode;

    /**
     * 水印信息
     */
    private WaterMarkInfo waterMarkInfo;



    /**
     * get 应用ID
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set 应用ID
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }


    /**
     * get 业务接入方定义的且在JRTC系统内注册过的房间号
     *
     * @return
     */
    public String getUserRoomId() {
        return userRoomId;
    }

    /**
     * set 业务接入方定义的且在JRTC系统内注册过的房间号
     *
     * @param userRoomId
     */
    public void setUserRoomId(String userRoomId) {
        this.userRoomId = userRoomId;
    }


    /**
     * get 布局模板 1-九宫格 2-左右屏幕分享 3-上下屏幕分享 4-画中画
     *
     * @return
     */
    public Integer getLayoutTemplate() {
        return layoutTemplate;
    }

    /**
     * set 布局模板 1-九宫格 2-左右屏幕分享 3-上下屏幕分享 4-画中画
     *
     * @param layoutTemplate
     */
    public void setLayoutTemplate(Integer layoutTemplate) {
        this.layoutTemplate = layoutTemplate;
    }


    /**
     * get 主人员userId
     *
     * @return
     */
    public String getMainUserId() {
        return mainUserId;
    }

    /**
     * set 主人员userId
     *
     * @param mainUserId
     */
    public void setMainUserId(String mainUserId) {
        this.mainUserId = mainUserId;
    }


    /**
     * get 1:摄像头  2：屏幕分享
     *
     * @return
     */
    public Integer getMainVideoStreamType() {
        return mainVideoStreamType;
    }

    /**
     * set 1:摄像头  2：屏幕分享
     *
     * @param mainVideoStreamType
     */
    public void setMainVideoStreamType(Integer mainVideoStreamType) {
        this.mainVideoStreamType = mainVideoStreamType;
    }


    /**
     * get 是否显示音频图标 0：不显示  1:显示
     *
     * @return
     */
    public Integer getShowAudioIcon() {
        return showAudioIcon;
    }

    /**
     * set 是否显示音频图标 0：不显示  1:显示
     *
     * @param showAudioIcon
     */
    public void setShowAudioIcon(Integer showAudioIcon) {
        this.showAudioIcon = showAudioIcon;
    }


    /**
     * get 是否显示昵称  0：不显示  1:显示
     *
     * @return
     */
    public Integer getShowNickName() {
        return showNickName;
    }

    /**
     * set 是否显示昵称  0：不显示  1:显示
     *
     * @param showNickName
     */
    public void setShowNickName(Integer showNickName) {
        this.showNickName = showNickName;
    }


    /**
     * get 输出类型 1：录制 2：旁路转推
     *
     * @return
     */
    public Integer getOutputType() {
        return outputType;
    }

    /**
     * set 输出类型 1：录制 2：旁路转推
     *
     * @param outputType
     */
    public void setOutputType(Integer outputType) {
        this.outputType = outputType;
    }


    /**
     * get 输出录制文件的名称
     *
     * @return
     */
    public String getOutputName() {
        return outputName;
    }

    /**
     * set 输出录制文件的名称
     *
     * @param outputName
     */
    public void setOutputName(String outputName) {
        this.outputName = outputName;
    }


    /**
     * get 输出录制文件的格式：mp4、flv、m3u8；为空时默认m3u8。
     *
     * @return
     */
    public String getOutputRecordFormat() {
        return outputRecordFormat;
    }

    /**
     * set 输出录制文件的格式：mp4、flv、m3u8；为空时默认m3u8。
     *
     * @param outputRecordFormat
     */
    public void setOutputRecordFormat(String outputRecordFormat) {
        this.outputRecordFormat = outputRecordFormat;
    }


    /**
     * get 转推直播地址（outputType&#x3D;2生效）
     *
     * @return
     */
    public String getPushLiveUrl() {
        return pushLiveUrl;
    }

    /**
     * set 转推直播地址（outputType&#x3D;2生效）
     *
     * @param pushLiveUrl
     */
    public void setPushLiveUrl(String pushLiveUrl) {
        this.pushLiveUrl = pushLiveUrl;
    }


    /**
    * get 参与混流人员参数；为空时，默认使用房间参会人进行混流
    *
    * @return
    */
    public List<McuUser> getMcuUserInfos() {
        return mcuUserInfos;
    }

    /**
    * set 参与混流人员参数；为空时，默认使用房间参会人进行混流
    *
    * @param mcuUserInfos
    */
    public void setMcuUserInfos(List<McuUser> mcuUserInfos) {
        this.mcuUserInfos = mcuUserInfos;
    }


    /**
     * get 输出格式
     *
     * @return
     */
    public OutputEncode getOutputEncode() {
        return outputEncode;
    }

    /**
     * set 输出格式
     *
     * @param outputEncode
     */
    public void setOutputEncode(OutputEncode outputEncode) {
        this.outputEncode = outputEncode;
    }


    /**
     * get 水印信息
     *
     * @return
     */
    public WaterMarkInfo getWaterMarkInfo() {
        return waterMarkInfo;
    }

    /**
     * set 水印信息
     *
     * @param waterMarkInfo
     */
    public void setWaterMarkInfo(WaterMarkInfo waterMarkInfo) {
        this.waterMarkInfo = waterMarkInfo;
    }



    /**
     * set 应用ID
     *
     * @param appId
     */
    public StartMcuTranscode appId(String appId) {
        this.appId = appId;
        return this;
    }


    /**
     * set 业务接入方定义的且在JRTC系统内注册过的房间号
     *
     * @param userRoomId
     */
    public StartMcuTranscode userRoomId(String userRoomId) {
        this.userRoomId = userRoomId;
        return this;
    }


    /**
     * set 布局模板 1-九宫格 2-左右屏幕分享 3-上下屏幕分享 4-画中画
     *
     * @param layoutTemplate
     */
    public StartMcuTranscode layoutTemplate(Integer layoutTemplate) {
        this.layoutTemplate = layoutTemplate;
        return this;
    }


    /**
     * set 主人员userId
     *
     * @param mainUserId
     */
    public StartMcuTranscode mainUserId(String mainUserId) {
        this.mainUserId = mainUserId;
        return this;
    }


    /**
     * set 1:摄像头  2：屏幕分享
     *
     * @param mainVideoStreamType
     */
    public StartMcuTranscode mainVideoStreamType(Integer mainVideoStreamType) {
        this.mainVideoStreamType = mainVideoStreamType;
        return this;
    }


    /**
     * set 是否显示音频图标 0：不显示  1:显示
     *
     * @param showAudioIcon
     */
    public StartMcuTranscode showAudioIcon(Integer showAudioIcon) {
        this.showAudioIcon = showAudioIcon;
        return this;
    }


    /**
     * set 是否显示昵称  0：不显示  1:显示
     *
     * @param showNickName
     */
    public StartMcuTranscode showNickName(Integer showNickName) {
        this.showNickName = showNickName;
        return this;
    }


    /**
     * set 输出类型 1：录制 2：旁路转推
     *
     * @param outputType
     */
    public StartMcuTranscode outputType(Integer outputType) {
        this.outputType = outputType;
        return this;
    }


    /**
     * set 输出录制文件的名称
     *
     * @param outputName
     */
    public StartMcuTranscode outputName(String outputName) {
        this.outputName = outputName;
        return this;
    }


    /**
     * set 输出录制文件的格式：mp4、flv、m3u8；为空时默认m3u8。
     *
     * @param outputRecordFormat
     */
    public StartMcuTranscode outputRecordFormat(String outputRecordFormat) {
        this.outputRecordFormat = outputRecordFormat;
        return this;
    }


    /**
     * set 转推直播地址（outputType&#x3D;2生效）
     *
     * @param pushLiveUrl
     */
    public StartMcuTranscode pushLiveUrl(String pushLiveUrl) {
        this.pushLiveUrl = pushLiveUrl;
        return this;
    }


    /**
    * set 参与混流人员参数；为空时，默认使用房间参会人进行混流
    *
    * @param mcuUserInfos
    */
    public StartMcuTranscode mcuUserInfos(List<McuUser> mcuUserInfos) {
        this.mcuUserInfos = mcuUserInfos;
        return this;
    }


    /**
     * set 输出格式
     *
     * @param outputEncode
     */
    public StartMcuTranscode outputEncode(OutputEncode outputEncode) {
        this.outputEncode = outputEncode;
        return this;
    }


    /**
     * set 水印信息
     *
     * @param waterMarkInfo
     */
    public StartMcuTranscode waterMarkInfo(WaterMarkInfo waterMarkInfo) {
        this.waterMarkInfo = waterMarkInfo;
        return this;
    }



    /**
     * add item to 参与混流人员参数；为空时，默认使用房间参会人进行混流
     *
     * @param mcuUserInfo
     */
    public void addMcuUserInfo(McuUser mcuUserInfo) {
        if (this.mcuUserInfos == null) {
            this.mcuUserInfos = new ArrayList<>();
        }
        this.mcuUserInfos.add(mcuUserInfo);
    }
}