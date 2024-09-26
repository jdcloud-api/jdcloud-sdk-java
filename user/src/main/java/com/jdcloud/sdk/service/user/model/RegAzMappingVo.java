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

package com.jdcloud.sdk.service.user.model;


/**
 * regAzMappingVo
 */
public class RegAzMappingVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 物理可用区
     */
    private String pAz;

    /**
     * 权重
     */
    private Double weight;



    /**
     * get 物理可用区
     *
     * @return
     */
    public String getPAz() {
        return pAz;
    }

    /**
     * set 物理可用区
     *
     * @param pAz
     */
    public void setPAz(String pAz) {
        this.pAz = pAz;
    }


    /**
     * get 权重
     *
     * @return
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * set 权重
     *
     * @param weight
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }



    /**
     * set 物理可用区
     *
     * @param pAz
     */
    public RegAzMappingVo pAz(String pAz) {
        this.pAz = pAz;
        return this;
    }


    /**
     * set 权重
     *
     * @param weight
     */
    public RegAzMappingVo weight(Double weight) {
        this.weight = weight;
        return this;
    }


}