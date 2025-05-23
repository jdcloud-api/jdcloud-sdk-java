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

package com.jdcloud.sdk.service.shenhaiplatform.model;


/**
 * workspaceBundleProjectReq
 */
public class WorkspaceBundleProjectReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 工作空间code
     */
    private String workspaceCode;

    /**
     * 引擎类型
     */
    private String engineType;

    /**
     * bundleDevProjectReq
     */
    private BundleProjectReq bundleDevProjectReq;

    /**
     * bundleProdProjectReq
     */
    private BundleProjectReq bundleProdProjectReq;



    /**
     * get 工作空间code
     *
     * @return
     */
    public String getWorkspaceCode() {
        return workspaceCode;
    }

    /**
     * set 工作空间code
     *
     * @param workspaceCode
     */
    public void setWorkspaceCode(String workspaceCode) {
        this.workspaceCode = workspaceCode;
    }


    /**
     * get 引擎类型
     *
     * @return
     */
    public String getEngineType() {
        return engineType;
    }

    /**
     * set 引擎类型
     *
     * @param engineType
     */
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }


    /**
     * get bundleDevProjectReq
     *
     * @return
     */
    public BundleProjectReq getBundleDevProjectReq() {
        return bundleDevProjectReq;
    }

    /**
     * set bundleDevProjectReq
     *
     * @param bundleDevProjectReq
     */
    public void setBundleDevProjectReq(BundleProjectReq bundleDevProjectReq) {
        this.bundleDevProjectReq = bundleDevProjectReq;
    }


    /**
     * get bundleProdProjectReq
     *
     * @return
     */
    public BundleProjectReq getBundleProdProjectReq() {
        return bundleProdProjectReq;
    }

    /**
     * set bundleProdProjectReq
     *
     * @param bundleProdProjectReq
     */
    public void setBundleProdProjectReq(BundleProjectReq bundleProdProjectReq) {
        this.bundleProdProjectReq = bundleProdProjectReq;
    }



    /**
     * set 工作空间code
     *
     * @param workspaceCode
     */
    public WorkspaceBundleProjectReq workspaceCode(String workspaceCode) {
        this.workspaceCode = workspaceCode;
        return this;
    }


    /**
     * set 引擎类型
     *
     * @param engineType
     */
    public WorkspaceBundleProjectReq engineType(String engineType) {
        this.engineType = engineType;
        return this;
    }


    /**
     * set bundleDevProjectReq
     *
     * @param bundleDevProjectReq
     */
    public WorkspaceBundleProjectReq bundleDevProjectReq(BundleProjectReq bundleDevProjectReq) {
        this.bundleDevProjectReq = bundleDevProjectReq;
        return this;
    }


    /**
     * set bundleProdProjectReq
     *
     * @param bundleProdProjectReq
     */
    public WorkspaceBundleProjectReq bundleProdProjectReq(BundleProjectReq bundleProdProjectReq) {
        this.bundleProdProjectReq = bundleProdProjectReq;
        return this;
    }


}