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

package com.jdcloud.sdk.service.iam.model;

import java.util.List;
import java.util.ArrayList;

/**
 * baseProductRegionVo
 */
public class BaseProductRegionVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品编码
     */
    private String serviceCode;

    /**
     * az信息
     */
    
    private List<RegionAzVo> regionAzVos;


    /**
     * get 产品编码
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品编码
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
    * get az信息
    *
    * @return
    */
    public List<RegionAzVo> getRegionAzVos() {
        return regionAzVos;
    }

    /**
    * set az信息
    *
    * @param regionAzVos
    */
    public void setRegionAzVos(List<RegionAzVo> regionAzVos) {
        this.regionAzVos = regionAzVos;
    }



    /**
     * set 产品编码
     *
     * @param serviceCode
     */
    public BaseProductRegionVo serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
    * set az信息
    *
    * @param regionAzVos
    */
    public BaseProductRegionVo regionAzVos(List<RegionAzVo> regionAzVos) {
        this.regionAzVos = regionAzVos;
        return this;
    }



    /**
     * add item to az信息
     *
     * @param regionAzVo
     */
    public void addRegionAzVo(RegionAzVo regionAzVo) {
        if (this.regionAzVos == null) {
            this.regionAzVos = new ArrayList<>();
        }
        this.regionAzVos.add(regionAzVo);
    }
}