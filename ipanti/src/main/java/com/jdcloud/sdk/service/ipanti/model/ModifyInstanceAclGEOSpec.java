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

import java.util.List;
import java.util.ArrayList;

/**
 * modifyInstanceAclGEOSpec
 */
public class ModifyInstanceAclGEOSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * geo 拦截地域编码列表. 查询 &lt;a href&#x3D;&quot;http://docs.jdcloud.com/anti-ddos-pro/api/describegeoareas&quot;&gt;describeGeoAreas&lt;/a&gt; 接口获取可设置的地域编码列表
     */
    private List<String> geoBlack;


    /**
     * get geo 拦截地域编码列表. 查询 &lt;a href&#x3D;&quot;http://docs.jdcloud.com/anti-ddos-pro/api/describegeoareas&quot;&gt;describeGeoAreas&lt;/a&gt; 接口获取可设置的地域编码列表
     *
     * @return
     */
    public List<String> getGeoBlack() {
        return geoBlack;
    }

    /**
     * set geo 拦截地域编码列表. 查询 &lt;a href&#x3D;&quot;http://docs.jdcloud.com/anti-ddos-pro/api/describegeoareas&quot;&gt;describeGeoAreas&lt;/a&gt; 接口获取可设置的地域编码列表
     *
     * @param geoBlack
     */
    public void setGeoBlack(List<String> geoBlack) {
        this.geoBlack = geoBlack;
    }


    /**
     * set geo 拦截地域编码列表. 查询 &lt;a href&#x3D;&quot;http://docs.jdcloud.com/anti-ddos-pro/api/describegeoareas&quot;&gt;describeGeoAreas&lt;/a&gt; 接口获取可设置的地域编码列表
     *
     * @param geoBlack
     */
    public ModifyInstanceAclGEOSpec geoBlack(List<String> geoBlack) {
        this.geoBlack = geoBlack;
        return this;
    }


    /**
     * add item to geo 拦截地域编码列表. 查询 &lt;a href&#x3D;&quot;http://docs.jdcloud.com/anti-ddos-pro/api/describegeoareas&quot;&gt;describeGeoAreas&lt;/a&gt; 接口获取可设置的地域编码列表
     *
     * @param geoBlack
     */
    public void addGeoBlack(String geoBlack) {
        if (this.geoBlack == null) {
            this.geoBlack = new ArrayList<>();
        }
        this.geoBlack.add(geoBlack);
    }

}