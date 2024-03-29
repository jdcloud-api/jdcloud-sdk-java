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

package com.jdcloud.sdk.service.smartdba.model;

import java.util.List;
import java.util.ArrayList;

/**
 * sessionForKill
 */
public class SessionForKill  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》]
     */
    private String regionId;

    /**
     * rds实例id
     */
    private String instanceId;

    /**
     * 需要kill的session id列表
     */
    private List<Integer> sessionList;


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
     * get rds实例id
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set rds实例id
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 需要kill的session id列表
     *
     * @return
     */
    public List<Integer> getSessionList() {
        return sessionList;
    }

    /**
     * set 需要kill的session id列表
     *
     * @param sessionList
     */
    public void setSessionList(List<Integer> sessionList) {
        this.sessionList = sessionList;
    }


    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @param regionId
     */
    public SessionForKill regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set rds实例id
     *
     * @param instanceId
     */
    public SessionForKill instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 需要kill的session id列表
     *
     * @param sessionList
     */
    public SessionForKill sessionList(List<Integer> sessionList) {
        this.sessionList = sessionList;
        return this;
    }


    /**
     * add item to 需要kill的session id列表
     *
     * @param sessionList
     */
    public void addSessionList(Integer sessionList) {
        if (this.sessionList == null) {
            this.sessionList = new ArrayList<>();
        }
        this.sessionList.add(sessionList);
    }

}