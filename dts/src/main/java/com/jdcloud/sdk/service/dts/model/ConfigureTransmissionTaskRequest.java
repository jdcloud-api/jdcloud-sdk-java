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
 * 数据传输服务
 * 数据传输服务相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dts.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.dts.model.PipelineOptions;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.dts.model.TransmissionEndpoint;
import com.jdcloud.sdk.service.dts.model.TransmissionCheckpoint;
import com.jdcloud.sdk.service.dts.model.CustomOptions;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 配置数据传输任务
 */
public class ConfigureTransmissionTaskRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 传输任务模式：可选值：structureInitialization、dataInitialization、dataSynchronization，分别对应结构初始化，全量数据初始化，增量数据传输
     */
    
    private List<String> transmissionMode;
    /**
     * 目标端执行策略，对于目标MySQL，支持：覆盖写入 mysql-replace-engine，冲突检测 conflict-detect-engine
     */
    private String destExecutionStrategy;

    /**
     * 任务设置
     */
    private PipelineOptions options;

    /**
     * 待传输的对象
     * Required:true
     */
    @Required
    private Object transmissionObject;

    /**
     * 任务名称，名称只支持中文、数字、大小写字母及英文下划线“_”及中划线“-”，不超过32字符
     * Required:true
     */
    @Required
    private String taskName;

    /**
     * 源端连接信息
     * Required:true
     */
    @Required
    private TransmissionEndpoint source;

    /**
     * 目标端连接信息
     * Required:true
     */
    @Required
    private TransmissionEndpoint destination;

    /**
     * 增量数据传输的启动位点
     */
    private TransmissionCheckpoint checkPoint;

    /**
     * 任务自定义设置
     */
    private CustomOptions customOptions;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》]
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * DTS数据传输任务ID
     * Required:true
     */
    @Required
    private String taskId;



    /**
    * get 传输任务模式：可选值：structureInitialization、dataInitialization、dataSynchronization，分别对应结构初始化，全量数据初始化，增量数据传输
    *
    * @return
    */
    public List<String> getTransmissionMode() {
        return transmissionMode;
    }

    /**
    * set 传输任务模式：可选值：structureInitialization、dataInitialization、dataSynchronization，分别对应结构初始化，全量数据初始化，增量数据传输
    *
    * @param transmissionMode
    */
    public void setTransmissionMode(List<String> transmissionMode) {
        this.transmissionMode = transmissionMode;
    }


    /**
     * get 目标端执行策略，对于目标MySQL，支持：覆盖写入 mysql-replace-engine，冲突检测 conflict-detect-engine
     *
     * @return
     */
    public String getDestExecutionStrategy() {
        return destExecutionStrategy;
    }

    /**
     * set 目标端执行策略，对于目标MySQL，支持：覆盖写入 mysql-replace-engine，冲突检测 conflict-detect-engine
     *
     * @param destExecutionStrategy
     */
    public void setDestExecutionStrategy(String destExecutionStrategy) {
        this.destExecutionStrategy = destExecutionStrategy;
    }


    /**
     * get 任务设置
     *
     * @return
     */
    public PipelineOptions getOptions() {
        return options;
    }

    /**
     * set 任务设置
     *
     * @param options
     */
    public void setOptions(PipelineOptions options) {
        this.options = options;
    }


    /**
     * get 待传输的对象
     *
     * @return
     */
    public Object getTransmissionObject() {
        return transmissionObject;
    }

    /**
     * set 待传输的对象
     *
     * @param transmissionObject
     */
    public void setTransmissionObject(Object transmissionObject) {
        this.transmissionObject = transmissionObject;
    }


    /**
     * get 任务名称，名称只支持中文、数字、大小写字母及英文下划线“_”及中划线“-”，不超过32字符
     *
     * @return
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * set 任务名称，名称只支持中文、数字、大小写字母及英文下划线“_”及中划线“-”，不超过32字符
     *
     * @param taskName
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }


    /**
     * get 源端连接信息
     *
     * @return
     */
    public TransmissionEndpoint getSource() {
        return source;
    }

    /**
     * set 源端连接信息
     *
     * @param source
     */
    public void setSource(TransmissionEndpoint source) {
        this.source = source;
    }


    /**
     * get 目标端连接信息
     *
     * @return
     */
    public TransmissionEndpoint getDestination() {
        return destination;
    }

    /**
     * set 目标端连接信息
     *
     * @param destination
     */
    public void setDestination(TransmissionEndpoint destination) {
        this.destination = destination;
    }


    /**
     * get 增量数据传输的启动位点
     *
     * @return
     */
    public TransmissionCheckpoint getCheckPoint() {
        return checkPoint;
    }

    /**
     * set 增量数据传输的启动位点
     *
     * @param checkPoint
     */
    public void setCheckPoint(TransmissionCheckpoint checkPoint) {
        this.checkPoint = checkPoint;
    }


    /**
     * get 任务自定义设置
     *
     * @return
     */
    public CustomOptions getCustomOptions() {
        return customOptions;
    }

    /**
     * set 任务自定义设置
     *
     * @param customOptions
     */
    public void setCustomOptions(CustomOptions customOptions) {
        this.customOptions = customOptions;
    }


    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get DTS数据传输任务ID
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set DTS数据传输任务ID
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }



    /**
    * set 传输任务模式：可选值：structureInitialization、dataInitialization、dataSynchronization，分别对应结构初始化，全量数据初始化，增量数据传输
    *
    * @param transmissionMode
    */
    public ConfigureTransmissionTaskRequest transmissionMode(List<String> transmissionMode) {
        this.transmissionMode = transmissionMode;
        return this;
    }


    /**
     * set 目标端执行策略，对于目标MySQL，支持：覆盖写入 mysql-replace-engine，冲突检测 conflict-detect-engine
     *
     * @param destExecutionStrategy
     */
    public ConfigureTransmissionTaskRequest destExecutionStrategy(String destExecutionStrategy) {
        this.destExecutionStrategy = destExecutionStrategy;
        return this;
    }


    /**
     * set 任务设置
     *
     * @param options
     */
    public ConfigureTransmissionTaskRequest options(PipelineOptions options) {
        this.options = options;
        return this;
    }


    /**
     * set 待传输的对象
     *
     * @param transmissionObject
     */
    public ConfigureTransmissionTaskRequest transmissionObject(Object transmissionObject) {
        this.transmissionObject = transmissionObject;
        return this;
    }


    /**
     * set 任务名称，名称只支持中文、数字、大小写字母及英文下划线“_”及中划线“-”，不超过32字符
     *
     * @param taskName
     */
    public ConfigureTransmissionTaskRequest taskName(String taskName) {
        this.taskName = taskName;
        return this;
    }


    /**
     * set 源端连接信息
     *
     * @param source
     */
    public ConfigureTransmissionTaskRequest source(TransmissionEndpoint source) {
        this.source = source;
        return this;
    }


    /**
     * set 目标端连接信息
     *
     * @param destination
     */
    public ConfigureTransmissionTaskRequest destination(TransmissionEndpoint destination) {
        this.destination = destination;
        return this;
    }


    /**
     * set 增量数据传输的启动位点
     *
     * @param checkPoint
     */
    public ConfigureTransmissionTaskRequest checkPoint(TransmissionCheckpoint checkPoint) {
        this.checkPoint = checkPoint;
        return this;
    }


    /**
     * set 任务自定义设置
     *
     * @param customOptions
     */
    public ConfigureTransmissionTaskRequest customOptions(CustomOptions customOptions) {
        this.customOptions = customOptions;
        return this;
    }


    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @param regionId
     */
    public ConfigureTransmissionTaskRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set DTS数据传输任务ID
     *
     * @param taskId
     */
    public ConfigureTransmissionTaskRequest taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }



    /**
     * add item to 传输任务模式：可选值：structureInitialization、dataInitialization、dataSynchronization，分别对应结构初始化，全量数据初始化，增量数据传输
     *
     * @param transmissionMode
     */
    public void addTransmissionMode(String transmissionMode) {
        if (this.transmissionMode == null) {
            this.transmissionMode = new ArrayList<>();
        }
        this.transmissionMode.add(transmissionMode);
    }
}