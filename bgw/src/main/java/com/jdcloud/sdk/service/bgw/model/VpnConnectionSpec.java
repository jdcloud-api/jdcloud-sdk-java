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

package com.jdcloud.sdk.service.bgw.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.charge.model.ChargeSpec;

/**
 * vpnConnectionSpec
 */
public class VpnConnectionSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * VPN连接的名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     * Required:true
     */
    @Required
    private String vpnConnectionName;

    /**
     * VPN连接的描述，允许输入UTF-8编码下的全部字符，不超过256字符。
     */
    private String description;

    /**
     * 边界网关的Id
     * Required:true
     */
    @Required
    private String bgwId;

    /**
     * 客户网关的Id
     * Required:true
     */
    @Required
    private String cgwId;

    /**
     * “是否使用BGP路由，取值范围为：false（不使能）、true（使能），默认为：true”
     */
    private Boolean bgpEnabled;

    /**
     * 本地的BGP ASN号，支持16位的私有ASN，取值范围为：64512~65534，默认从BGW继承65000
     */
    private Integer localAsn;

    /**
     * VPN连接的2个公网IP线路信息。当BGW为标准BGW时，忽略此参数。当BGW为边缘BGW时，可配置2个公网IP线路，其值可通过调用describeEdgeIpProviders获取不同边缘节点的边缘公网IP线路信息，不指定provider时，系统会自动选择describeEdgeIpProviders获取的此边缘节点第1顺序的线路作为第1个provider，边缘节点第2顺序的线路作为第2个provider，特殊情况：当获取的线路只有1个时，provider2&#x3D;provider1
     */
    
    private List<String> providers;
    /**
     * 计费配置，仅支持按用量，默认按用量
     */
    private ChargeSpec chargeSpec;



    /**
     * get VPN连接的名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @return
     */
    public String getVpnConnectionName() {
        return vpnConnectionName;
    }

    /**
     * set VPN连接的名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @param vpnConnectionName
     */
    public void setVpnConnectionName(String vpnConnectionName) {
        this.vpnConnectionName = vpnConnectionName;
    }


    /**
     * get VPN连接的描述，允许输入UTF-8编码下的全部字符，不超过256字符。
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set VPN连接的描述，允许输入UTF-8编码下的全部字符，不超过256字符。
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 边界网关的Id
     *
     * @return
     */
    public String getBgwId() {
        return bgwId;
    }

    /**
     * set 边界网关的Id
     *
     * @param bgwId
     */
    public void setBgwId(String bgwId) {
        this.bgwId = bgwId;
    }


    /**
     * get 客户网关的Id
     *
     * @return
     */
    public String getCgwId() {
        return cgwId;
    }

    /**
     * set 客户网关的Id
     *
     * @param cgwId
     */
    public void setCgwId(String cgwId) {
        this.cgwId = cgwId;
    }


    /**
     * get “是否使用BGP路由，取值范围为：false（不使能）、true（使能），默认为：true”
     *
     * @return
     */
    public Boolean getBgpEnabled() {
        return bgpEnabled;
    }

    /**
     * set “是否使用BGP路由，取值范围为：false（不使能）、true（使能），默认为：true”
     *
     * @param bgpEnabled
     */
    public void setBgpEnabled(Boolean bgpEnabled) {
        this.bgpEnabled = bgpEnabled;
    }


    /**
     * get 本地的BGP ASN号，支持16位的私有ASN，取值范围为：64512~65534，默认从BGW继承65000
     *
     * @return
     */
    public Integer getLocalAsn() {
        return localAsn;
    }

    /**
     * set 本地的BGP ASN号，支持16位的私有ASN，取值范围为：64512~65534，默认从BGW继承65000
     *
     * @param localAsn
     */
    public void setLocalAsn(Integer localAsn) {
        this.localAsn = localAsn;
    }


    /**
    * get VPN连接的2个公网IP线路信息。当BGW为标准BGW时，忽略此参数。当BGW为边缘BGW时，可配置2个公网IP线路，其值可通过调用describeEdgeIpProviders获取不同边缘节点的边缘公网IP线路信息，不指定provider时，系统会自动选择describeEdgeIpProviders获取的此边缘节点第1顺序的线路作为第1个provider，边缘节点第2顺序的线路作为第2个provider，特殊情况：当获取的线路只有1个时，provider2&#x3D;provider1
    *
    * @return
    */
    public List<String> getProviders() {
        return providers;
    }

    /**
    * set VPN连接的2个公网IP线路信息。当BGW为标准BGW时，忽略此参数。当BGW为边缘BGW时，可配置2个公网IP线路，其值可通过调用describeEdgeIpProviders获取不同边缘节点的边缘公网IP线路信息，不指定provider时，系统会自动选择describeEdgeIpProviders获取的此边缘节点第1顺序的线路作为第1个provider，边缘节点第2顺序的线路作为第2个provider，特殊情况：当获取的线路只有1个时，provider2&#x3D;provider1
    *
    * @param providers
    */
    public void setProviders(List<String> providers) {
        this.providers = providers;
    }


    /**
     * get 计费配置，仅支持按用量，默认按用量
     *
     * @return
     */
    public ChargeSpec getChargeSpec() {
        return chargeSpec;
    }

    /**
     * set 计费配置，仅支持按用量，默认按用量
     *
     * @param chargeSpec
     */
    public void setChargeSpec(ChargeSpec chargeSpec) {
        this.chargeSpec = chargeSpec;
    }



    /**
     * set VPN连接的名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @param vpnConnectionName
     */
    public VpnConnectionSpec vpnConnectionName(String vpnConnectionName) {
        this.vpnConnectionName = vpnConnectionName;
        return this;
    }


    /**
     * set VPN连接的描述，允许输入UTF-8编码下的全部字符，不超过256字符。
     *
     * @param description
     */
    public VpnConnectionSpec description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 边界网关的Id
     *
     * @param bgwId
     */
    public VpnConnectionSpec bgwId(String bgwId) {
        this.bgwId = bgwId;
        return this;
    }


    /**
     * set 客户网关的Id
     *
     * @param cgwId
     */
    public VpnConnectionSpec cgwId(String cgwId) {
        this.cgwId = cgwId;
        return this;
    }


    /**
     * set “是否使用BGP路由，取值范围为：false（不使能）、true（使能），默认为：true”
     *
     * @param bgpEnabled
     */
    public VpnConnectionSpec bgpEnabled(Boolean bgpEnabled) {
        this.bgpEnabled = bgpEnabled;
        return this;
    }


    /**
     * set 本地的BGP ASN号，支持16位的私有ASN，取值范围为：64512~65534，默认从BGW继承65000
     *
     * @param localAsn
     */
    public VpnConnectionSpec localAsn(Integer localAsn) {
        this.localAsn = localAsn;
        return this;
    }


    /**
    * set VPN连接的2个公网IP线路信息。当BGW为标准BGW时，忽略此参数。当BGW为边缘BGW时，可配置2个公网IP线路，其值可通过调用describeEdgeIpProviders获取不同边缘节点的边缘公网IP线路信息，不指定provider时，系统会自动选择describeEdgeIpProviders获取的此边缘节点第1顺序的线路作为第1个provider，边缘节点第2顺序的线路作为第2个provider，特殊情况：当获取的线路只有1个时，provider2&#x3D;provider1
    *
    * @param providers
    */
    public VpnConnectionSpec providers(List<String> providers) {
        this.providers = providers;
        return this;
    }


    /**
     * set 计费配置，仅支持按用量，默认按用量
     *
     * @param chargeSpec
     */
    public VpnConnectionSpec chargeSpec(ChargeSpec chargeSpec) {
        this.chargeSpec = chargeSpec;
        return this;
    }



    /**
     * add item to VPN连接的2个公网IP线路信息。当BGW为标准BGW时，忽略此参数。当BGW为边缘BGW时，可配置2个公网IP线路，其值可通过调用describeEdgeIpProviders获取不同边缘节点的边缘公网IP线路信息，不指定provider时，系统会自动选择describeEdgeIpProviders获取的此边缘节点第1顺序的线路作为第1个provider，边缘节点第2顺序的线路作为第2个provider，特殊情况：当获取的线路只有1个时，provider2&#x3D;provider1
     *
     * @param provider
     */
    public void addProvider(String provider) {
        if (this.providers == null) {
            this.providers = new ArrayList<>();
        }
        this.providers.add(provider);
    }
}