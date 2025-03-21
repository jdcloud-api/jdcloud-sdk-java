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

package com.jdcloud.sdk.service.logs.model;


/**
 * agResource
 */
public class AgResource  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 高可用组 id
     */
    private String agId;

    /**
     * 高可用组 name
     */
    private String agName;

    /**
     * 区域
     */
    private String region;



    /**
     * get 高可用组 id
     *
     * @return
     */
    public String getAgId() {
        return agId;
    }

    /**
     * set 高可用组 id
     *
     * @param agId
     */
    public void setAgId(String agId) {
        this.agId = agId;
    }


    /**
     * get 高可用组 name
     *
     * @return
     */
    public String getAgName() {
        return agName;
    }

    /**
     * set 高可用组 name
     *
     * @param agName
     */
    public void setAgName(String agName) {
        this.agName = agName;
    }


    /**
     * get 区域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 区域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }



    /**
     * set 高可用组 id
     *
     * @param agId
     */
    public AgResource agId(String agId) {
        this.agId = agId;
        return this;
    }


    /**
     * set 高可用组 name
     *
     * @param agName
     */
    public AgResource agName(String agName) {
        this.agName = agName;
        return this;
    }


    /**
     * set 区域
     *
     * @param region
     */
    public AgResource region(String region) {
        this.region = region;
        return this;
    }


}