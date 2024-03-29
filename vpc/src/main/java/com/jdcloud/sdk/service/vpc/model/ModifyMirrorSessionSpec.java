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

package com.jdcloud.sdk.service.vpc.model;


/**
 * modifyMirrorSessionSpec
 */
public class ModifyMirrorSessionSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 镜像名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     */
    private String mirrorSessionName;

    /**
     * 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     */
    private String description;

    /**
     * 镜像目的
     */
    private MirrorResource mirrorResourceDestination;

    /**
     * VXLAN ID，1-16777215
     */
    private Number vni;

    /**
     * 镜像会话优先级，1-32768
     */
    private Number priority;

    /**
     * mirrorFilterId
     */
    private String mirrorFilterId;



    /**
     * get 镜像名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @return
     */
    public String getMirrorSessionName() {
        return mirrorSessionName;
    }

    /**
     * set 镜像名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @param mirrorSessionName
     */
    public void setMirrorSessionName(String mirrorSessionName) {
        this.mirrorSessionName = mirrorSessionName;
    }


    /**
     * get 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 镜像目的
     *
     * @return
     */
    public MirrorResource getMirrorResourceDestination() {
        return mirrorResourceDestination;
    }

    /**
     * set 镜像目的
     *
     * @param mirrorResourceDestination
     */
    public void setMirrorResourceDestination(MirrorResource mirrorResourceDestination) {
        this.mirrorResourceDestination = mirrorResourceDestination;
    }


    /**
     * get VXLAN ID，1-16777215
     *
     * @return
     */
    public Number getVni() {
        return vni;
    }

    /**
     * set VXLAN ID，1-16777215
     *
     * @param vni
     */
    public void setVni(Number vni) {
        this.vni = vni;
    }


    /**
     * get 镜像会话优先级，1-32768
     *
     * @return
     */
    public Number getPriority() {
        return priority;
    }

    /**
     * set 镜像会话优先级，1-32768
     *
     * @param priority
     */
    public void setPriority(Number priority) {
        this.priority = priority;
    }


    /**
     * get mirrorFilterId
     *
     * @return
     */
    public String getMirrorFilterId() {
        return mirrorFilterId;
    }

    /**
     * set mirrorFilterId
     *
     * @param mirrorFilterId
     */
    public void setMirrorFilterId(String mirrorFilterId) {
        this.mirrorFilterId = mirrorFilterId;
    }



    /**
     * set 镜像名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @param mirrorSessionName
     */
    public ModifyMirrorSessionSpec mirrorSessionName(String mirrorSessionName) {
        this.mirrorSessionName = mirrorSessionName;
        return this;
    }


    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public ModifyMirrorSessionSpec description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 镜像目的
     *
     * @param mirrorResourceDestination
     */
    public ModifyMirrorSessionSpec mirrorResourceDestination(MirrorResource mirrorResourceDestination) {
        this.mirrorResourceDestination = mirrorResourceDestination;
        return this;
    }


    /**
     * set VXLAN ID，1-16777215
     *
     * @param vni
     */
    public ModifyMirrorSessionSpec vni(Number vni) {
        this.vni = vni;
        return this;
    }


    /**
     * set 镜像会话优先级，1-32768
     *
     * @param priority
     */
    public ModifyMirrorSessionSpec priority(Number priority) {
        this.priority = priority;
        return this;
    }


    /**
     * set mirrorFilterId
     *
     * @param mirrorFilterId
     */
    public ModifyMirrorSessionSpec mirrorFilterId(String mirrorFilterId) {
        this.mirrorFilterId = mirrorFilterId;
        return this;
    }


}