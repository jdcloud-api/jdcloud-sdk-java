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
 * pod 中的容器状态
 */
public class ContainerStatus  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 容器名称
     */
    private String name;

    /**
     * 容器被重新启动的次数
     */
    private Integer restartCount;

    /**
     * 容器是否通过了就绪探针探测
     */
    private Boolean ready;

    /**
     * 关于容器当前状态详细信息
     */
    private ContainerState state;

    /**
     * 关于容器最后一次termination详细信息
     */
    private ContainerState lastState;



    /**
     * get 容器名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 容器名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 容器被重新启动的次数
     *
     * @return
     */
    public Integer getRestartCount() {
        return restartCount;
    }

    /**
     * set 容器被重新启动的次数
     *
     * @param restartCount
     */
    public void setRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
    }


    /**
     * get 容器是否通过了就绪探针探测
     *
     * @return
     */
    public Boolean getReady() {
        return ready;
    }

    /**
     * set 容器是否通过了就绪探针探测
     *
     * @param ready
     */
    public void setReady(Boolean ready) {
        this.ready = ready;
    }


    /**
     * get 关于容器当前状态详细信息
     *
     * @return
     */
    public ContainerState getState() {
        return state;
    }

    /**
     * set 关于容器当前状态详细信息
     *
     * @param state
     */
    public void setState(ContainerState state) {
        this.state = state;
    }


    /**
     * get 关于容器最后一次termination详细信息
     *
     * @return
     */
    public ContainerState getLastState() {
        return lastState;
    }

    /**
     * set 关于容器最后一次termination详细信息
     *
     * @param lastState
     */
    public void setLastState(ContainerState lastState) {
        this.lastState = lastState;
    }



    /**
     * set 容器名称
     *
     * @param name
     */
    public ContainerStatus name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 容器被重新启动的次数
     *
     * @param restartCount
     */
    public ContainerStatus restartCount(Integer restartCount) {
        this.restartCount = restartCount;
        return this;
    }


    /**
     * set 容器是否通过了就绪探针探测
     *
     * @param ready
     */
    public ContainerStatus ready(Boolean ready) {
        this.ready = ready;
        return this;
    }


    /**
     * set 关于容器当前状态详细信息
     *
     * @param state
     */
    public ContainerStatus state(ContainerState state) {
        this.state = state;
        return this;
    }


    /**
     * set 关于容器最后一次termination详细信息
     *
     * @param lastState
     */
    public ContainerStatus lastState(ContainerState lastState) {
        this.lastState = lastState;
        return this;
    }


}