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

package com.jdcloud.sdk.service.vm.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.charge.model.ChargeSpec;

/**
 * elasticIpSpec
 */
public class ElasticIpSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 弹性公网IP的限速（单位：Mbps），计费类型为按配置时，取值范围为[1-1000]；计费类型为按流量时，取值范围为[1-200]
     * Required:true
     */
    @Required
    private Integer bandwidthMbps;

    /**
     * IP线路信息。当IP类型为标准公网IP时，取值为bgp或no_bgp，cn-north-1：bgp；cn-south-1：bgp；cn-east-1：bgp；cn-east-2：bgp。当IP类型为边缘公网IP时，其值可通过调用describeEdgeIpProviders、获取不同边缘节点的边缘公网IP线路信息
     * Required:true
     */
    @Required
    private String provider;

    /**
     * 计费配置。边缘公网IP支持包年包月、按配置；标准公网IP支持包年包月、按配置、按流量
     */
    private ChargeSpec chargeSpec;



    /**
     * get 弹性公网IP的限速（单位：Mbps），计费类型为按配置时，取值范围为[1-1000]；计费类型为按流量时，取值范围为[1-200]
     *
     * @return
     */
    public Integer getBandwidthMbps() {
        return bandwidthMbps;
    }

    /**
     * set 弹性公网IP的限速（单位：Mbps），计费类型为按配置时，取值范围为[1-1000]；计费类型为按流量时，取值范围为[1-200]
     *
     * @param bandwidthMbps
     */
    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }


    /**
     * get IP线路信息。当IP类型为标准公网IP时，取值为bgp或no_bgp，cn-north-1：bgp；cn-south-1：bgp；cn-east-1：bgp；cn-east-2：bgp。当IP类型为边缘公网IP时，其值可通过调用describeEdgeIpProviders、获取不同边缘节点的边缘公网IP线路信息
     *
     * @return
     */
    public String getProvider() {
        return provider;
    }

    /**
     * set IP线路信息。当IP类型为标准公网IP时，取值为bgp或no_bgp，cn-north-1：bgp；cn-south-1：bgp；cn-east-1：bgp；cn-east-2：bgp。当IP类型为边缘公网IP时，其值可通过调用describeEdgeIpProviders、获取不同边缘节点的边缘公网IP线路信息
     *
     * @param provider
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }


    /**
     * get 计费配置。边缘公网IP支持包年包月、按配置；标准公网IP支持包年包月、按配置、按流量
     *
     * @return
     */
    public ChargeSpec getChargeSpec() {
        return chargeSpec;
    }

    /**
     * set 计费配置。边缘公网IP支持包年包月、按配置；标准公网IP支持包年包月、按配置、按流量
     *
     * @param chargeSpec
     */
    public void setChargeSpec(ChargeSpec chargeSpec) {
        this.chargeSpec = chargeSpec;
    }



    /**
     * set 弹性公网IP的限速（单位：Mbps），计费类型为按配置时，取值范围为[1-1000]；计费类型为按流量时，取值范围为[1-200]
     *
     * @param bandwidthMbps
     */
    public ElasticIpSpec bandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
        return this;
    }


    /**
     * set IP线路信息。当IP类型为标准公网IP时，取值为bgp或no_bgp，cn-north-1：bgp；cn-south-1：bgp；cn-east-1：bgp；cn-east-2：bgp。当IP类型为边缘公网IP时，其值可通过调用describeEdgeIpProviders、获取不同边缘节点的边缘公网IP线路信息
     *
     * @param provider
     */
    public ElasticIpSpec provider(String provider) {
        this.provider = provider;
        return this;
    }


    /**
     * set 计费配置。边缘公网IP支持包年包月、按配置；标准公网IP支持包年包月、按配置、按流量
     *
     * @param chargeSpec
     */
    public ElasticIpSpec chargeSpec(ChargeSpec chargeSpec) {
        this.chargeSpec = chargeSpec;
        return this;
    }


}