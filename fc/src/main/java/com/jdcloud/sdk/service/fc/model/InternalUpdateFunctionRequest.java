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
 * Function
 * 函数 相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.fc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.fc.model.InternalCode;
import com.jdcloud.sdk.service.fc.model.Environment;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改 function

 */
public class InternalUpdateFunctionRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 修改后的代码
     */
    private InternalCode code;

    /**
     * 修改后的超时时间
     */
    private Integer timeout;

    /**
     * 修改后的运行时语言
     */
    private String runtime;

    /**
     * 修改后的函数执行入口
     */
    private String handler;

    /**
     * 修改后的描述
     */
    private String description;

    /**
     * 修改后的环境变量
     */
    
    private List<Environment> envs;
    /**
     * 修改后的cpu
     */
    private Number cpu;

    /**
     * 修改后的内存
     */
    private Integer memorySize;

    /**
     * 修改后的磁盘
     */
    private Integer diskSize;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Service Name
     * Required:true
     */
    @Required
    private String serviceName;

    /**
     * Function Name
     * Required:true
     */
    @Required
    private String functionName;



    /**
     * get 修改后的代码
     *
     * @return
     */
    public InternalCode getCode() {
        return code;
    }

    /**
     * set 修改后的代码
     *
     * @param code
     */
    public void setCode(InternalCode code) {
        this.code = code;
    }


    /**
     * get 修改后的超时时间
     *
     * @return
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * set 修改后的超时时间
     *
     * @param timeout
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }


    /**
     * get 修改后的运行时语言
     *
     * @return
     */
    public String getRuntime() {
        return runtime;
    }

    /**
     * set 修改后的运行时语言
     *
     * @param runtime
     */
    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }


    /**
     * get 修改后的函数执行入口
     *
     * @return
     */
    public String getHandler() {
        return handler;
    }

    /**
     * set 修改后的函数执行入口
     *
     * @param handler
     */
    public void setHandler(String handler) {
        this.handler = handler;
    }


    /**
     * get 修改后的描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 修改后的描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
    * get 修改后的环境变量
    *
    * @return
    */
    public List<Environment> getEnvs() {
        return envs;
    }

    /**
    * set 修改后的环境变量
    *
    * @param envs
    */
    public void setEnvs(List<Environment> envs) {
        this.envs = envs;
    }


    /**
     * get 修改后的cpu
     *
     * @return
     */
    public Number getCpu() {
        return cpu;
    }

    /**
     * set 修改后的cpu
     *
     * @param cpu
     */
    public void setCpu(Number cpu) {
        this.cpu = cpu;
    }


    /**
     * get 修改后的内存
     *
     * @return
     */
    public Integer getMemorySize() {
        return memorySize;
    }

    /**
     * set 修改后的内存
     *
     * @param memorySize
     */
    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }


    /**
     * get 修改后的磁盘
     *
     * @return
     */
    public Integer getDiskSize() {
        return diskSize;
    }

    /**
     * set 修改后的磁盘
     *
     * @param diskSize
     */
    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }


    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get Service Name
     *
     * @return
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * set Service Name
     *
     * @param serviceName
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * get Function Name
     *
     * @return
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * set Function Name
     *
     * @param functionName
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }



    /**
     * set 修改后的代码
     *
     * @param code
     */
    public InternalUpdateFunctionRequest code(InternalCode code) {
        this.code = code;
        return this;
    }


    /**
     * set 修改后的超时时间
     *
     * @param timeout
     */
    public InternalUpdateFunctionRequest timeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }


    /**
     * set 修改后的运行时语言
     *
     * @param runtime
     */
    public InternalUpdateFunctionRequest runtime(String runtime) {
        this.runtime = runtime;
        return this;
    }


    /**
     * set 修改后的函数执行入口
     *
     * @param handler
     */
    public InternalUpdateFunctionRequest handler(String handler) {
        this.handler = handler;
        return this;
    }


    /**
     * set 修改后的描述
     *
     * @param description
     */
    public InternalUpdateFunctionRequest description(String description) {
        this.description = description;
        return this;
    }


    /**
    * set 修改后的环境变量
    *
    * @param envs
    */
    public InternalUpdateFunctionRequest envs(List<Environment> envs) {
        this.envs = envs;
        return this;
    }


    /**
     * set 修改后的cpu
     *
     * @param cpu
     */
    public InternalUpdateFunctionRequest cpu(Number cpu) {
        this.cpu = cpu;
        return this;
    }


    /**
     * set 修改后的内存
     *
     * @param memorySize
     */
    public InternalUpdateFunctionRequest memorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }


    /**
     * set 修改后的磁盘
     *
     * @param diskSize
     */
    public InternalUpdateFunctionRequest diskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public InternalUpdateFunctionRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set Service Name
     *
     * @param serviceName
     */
    public InternalUpdateFunctionRequest serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }


    /**
     * set Function Name
     *
     * @param functionName
     */
    public InternalUpdateFunctionRequest functionName(String functionName) {
        this.functionName = functionName;
        return this;
    }



    /**
     * add item to 修改后的环境变量
     *
     * @param env
     */
    public void addEnv(Environment env) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        this.envs.add(env);
    }
}