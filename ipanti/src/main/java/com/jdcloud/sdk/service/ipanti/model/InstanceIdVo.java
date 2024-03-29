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

package com.jdcloud.sdk.service.ipanti.model;


/**
 * instanceIdVo
 */
public class InstanceIdVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 高防实例计费资源ID
     */
    private String resourceId;

    /**
     * 高防实例ID
     */
    private String instanceId;


    /**
     * get 高防实例计费资源ID
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 高防实例计费资源ID
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 高防实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 高防实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 高防实例计费资源ID
     *
     * @param resourceId
     */
    public InstanceIdVo resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 高防实例ID
     *
     * @param instanceId
     */
    public InstanceIdVo instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}