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

package com.jdcloud.sdk.service.detection.model;


/**
 * net
 */
public class Net  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务地址
     */
    private String url;

    /**
     * 拨测点IP
     */
    private String monitorIP;

    /**
     * 拨测点运营商
     */
    private String monitorISP;

    /**
     * 拨测点国家
     */
    private String monitorCountry;

    /**
     * 拨测点省份
     */
    private String monitorProvince;

    /**
     * 拨测点城市
     */
    private String monitorCity;

    /**
     * 拨测点DNS
     */
    private String monitorDns;

    /**
     * 错误信息
     */
    private String error;

    /**
     * 错误码
     */
    private Integer errorCode;

    /**
     * 状态 0:成功 1:失败
     */
    private Integer status;

    /**
     * DNS记录类型
     */
    private String dnsRecordType;

    /**
     * DNS记录地址
     */
    private String dnsAddress;

    /**
     * DNS解析用时
     */
    private Integer dnsQueryTime;

    /**
     * DNS详情
     */
    private String dnsDetail;

    /**
     * CANME
     */
    private String pingCname;

    /**
     * PING HOST
     */
    private String pingHost;

    /**
     * PING IP
     */
    private String pingIp;

    /**
     * PING TCP PORT
     */
    private Long pingPort;

    /**
     * PING 总包数
     */
    private Integer pingPackets;

    /**
     * PING 丢包率
     */
    private Double pingPacketsLoss;

    /**
     * PING 成功包数
     */
    private Integer pingSuccessPackets;

    /**
     * PING 失败包数
     */
    private Integer pingFailPackets;

    /**
     * PING 包大小
     */
    private Integer pingSize;

    /**
     * PING 平均耗时
     */
    private Integer pingAvgTs;

    /**
     * PING 最大耗时
     */
    private Integer pingMaxTs;

    /**
     * PING 最小耗时
     */
    private Integer pingMinTs;

    /**
     * PING Mean Deviation， ICMP包的 RTT 偏离平均值的程度
     */
    private Integer pingMDevTs;

    /**
     * PING 耗时列表, -1为请求超时  &quot;[49,49,52,46]&quot;
     */
    private String pingTsList;

    /**
     * PING ttlList列表 &quot;[48,48,48,48]&quot;
     */
    private String pingTtlList;

    /**
     * PING 平均ttl
     */
    private Integer pingTtl;

    /**
     * tracer 最大跳数
     */
    private Integer tracerMaxHop;

    /**
     * tracer 平均时延
     */
    private Long tracerAvgTs;

    /**
     * tracer cname
     */
    private String tracerCname;

    /**
     * tracer ip
     */
    private String tracerIp;

    /**
     * tracer 每一跳的信息 [{&quot;ip&quot;:&quot;10.207.0.1&quot;,&quot;cn&quot;:&quot;&quot;,&quot;ts&quot;:3}]
     */
    private String tracerHops;

    /**
     * tracer 跳跃数量
     */
    private Integer tracerHopNum;



    /**
     * get 任务地址
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set 任务地址
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }


    /**
     * get 拨测点IP
     *
     * @return
     */
    public String getMonitorIP() {
        return monitorIP;
    }

    /**
     * set 拨测点IP
     *
     * @param monitorIP
     */
    public void setMonitorIP(String monitorIP) {
        this.monitorIP = monitorIP;
    }


    /**
     * get 拨测点运营商
     *
     * @return
     */
    public String getMonitorISP() {
        return monitorISP;
    }

    /**
     * set 拨测点运营商
     *
     * @param monitorISP
     */
    public void setMonitorISP(String monitorISP) {
        this.monitorISP = monitorISP;
    }


    /**
     * get 拨测点国家
     *
     * @return
     */
    public String getMonitorCountry() {
        return monitorCountry;
    }

    /**
     * set 拨测点国家
     *
     * @param monitorCountry
     */
    public void setMonitorCountry(String monitorCountry) {
        this.monitorCountry = monitorCountry;
    }


    /**
     * get 拨测点省份
     *
     * @return
     */
    public String getMonitorProvince() {
        return monitorProvince;
    }

    /**
     * set 拨测点省份
     *
     * @param monitorProvince
     */
    public void setMonitorProvince(String monitorProvince) {
        this.monitorProvince = monitorProvince;
    }


    /**
     * get 拨测点城市
     *
     * @return
     */
    public String getMonitorCity() {
        return monitorCity;
    }

    /**
     * set 拨测点城市
     *
     * @param monitorCity
     */
    public void setMonitorCity(String monitorCity) {
        this.monitorCity = monitorCity;
    }


    /**
     * get 拨测点DNS
     *
     * @return
     */
    public String getMonitorDns() {
        return monitorDns;
    }

    /**
     * set 拨测点DNS
     *
     * @param monitorDns
     */
    public void setMonitorDns(String monitorDns) {
        this.monitorDns = monitorDns;
    }


    /**
     * get 错误信息
     *
     * @return
     */
    public String getError() {
        return error;
    }

    /**
     * set 错误信息
     *
     * @param error
     */
    public void setError(String error) {
        this.error = error;
    }


    /**
     * get 错误码
     *
     * @return
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * set 错误码
     *
     * @param errorCode
     */
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * get 状态 0:成功 1:失败
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 状态 0:成功 1:失败
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }


    /**
     * get DNS记录类型
     *
     * @return
     */
    public String getDnsRecordType() {
        return dnsRecordType;
    }

    /**
     * set DNS记录类型
     *
     * @param dnsRecordType
     */
    public void setDnsRecordType(String dnsRecordType) {
        this.dnsRecordType = dnsRecordType;
    }


    /**
     * get DNS记录地址
     *
     * @return
     */
    public String getDnsAddress() {
        return dnsAddress;
    }

    /**
     * set DNS记录地址
     *
     * @param dnsAddress
     */
    public void setDnsAddress(String dnsAddress) {
        this.dnsAddress = dnsAddress;
    }


    /**
     * get DNS解析用时
     *
     * @return
     */
    public Integer getDnsQueryTime() {
        return dnsQueryTime;
    }

    /**
     * set DNS解析用时
     *
     * @param dnsQueryTime
     */
    public void setDnsQueryTime(Integer dnsQueryTime) {
        this.dnsQueryTime = dnsQueryTime;
    }


    /**
     * get DNS详情
     *
     * @return
     */
    public String getDnsDetail() {
        return dnsDetail;
    }

    /**
     * set DNS详情
     *
     * @param dnsDetail
     */
    public void setDnsDetail(String dnsDetail) {
        this.dnsDetail = dnsDetail;
    }


    /**
     * get CANME
     *
     * @return
     */
    public String getPingCname() {
        return pingCname;
    }

    /**
     * set CANME
     *
     * @param pingCname
     */
    public void setPingCname(String pingCname) {
        this.pingCname = pingCname;
    }


    /**
     * get PING HOST
     *
     * @return
     */
    public String getPingHost() {
        return pingHost;
    }

    /**
     * set PING HOST
     *
     * @param pingHost
     */
    public void setPingHost(String pingHost) {
        this.pingHost = pingHost;
    }


    /**
     * get PING IP
     *
     * @return
     */
    public String getPingIp() {
        return pingIp;
    }

    /**
     * set PING IP
     *
     * @param pingIp
     */
    public void setPingIp(String pingIp) {
        this.pingIp = pingIp;
    }


    /**
     * get PING TCP PORT
     *
     * @return
     */
    public Long getPingPort() {
        return pingPort;
    }

    /**
     * set PING TCP PORT
     *
     * @param pingPort
     */
    public void setPingPort(Long pingPort) {
        this.pingPort = pingPort;
    }


    /**
     * get PING 总包数
     *
     * @return
     */
    public Integer getPingPackets() {
        return pingPackets;
    }

    /**
     * set PING 总包数
     *
     * @param pingPackets
     */
    public void setPingPackets(Integer pingPackets) {
        this.pingPackets = pingPackets;
    }


    /**
     * get PING 丢包率
     *
     * @return
     */
    public Double getPingPacketsLoss() {
        return pingPacketsLoss;
    }

    /**
     * set PING 丢包率
     *
     * @param pingPacketsLoss
     */
    public void setPingPacketsLoss(Double pingPacketsLoss) {
        this.pingPacketsLoss = pingPacketsLoss;
    }


    /**
     * get PING 成功包数
     *
     * @return
     */
    public Integer getPingSuccessPackets() {
        return pingSuccessPackets;
    }

    /**
     * set PING 成功包数
     *
     * @param pingSuccessPackets
     */
    public void setPingSuccessPackets(Integer pingSuccessPackets) {
        this.pingSuccessPackets = pingSuccessPackets;
    }


    /**
     * get PING 失败包数
     *
     * @return
     */
    public Integer getPingFailPackets() {
        return pingFailPackets;
    }

    /**
     * set PING 失败包数
     *
     * @param pingFailPackets
     */
    public void setPingFailPackets(Integer pingFailPackets) {
        this.pingFailPackets = pingFailPackets;
    }


    /**
     * get PING 包大小
     *
     * @return
     */
    public Integer getPingSize() {
        return pingSize;
    }

    /**
     * set PING 包大小
     *
     * @param pingSize
     */
    public void setPingSize(Integer pingSize) {
        this.pingSize = pingSize;
    }


    /**
     * get PING 平均耗时
     *
     * @return
     */
    public Integer getPingAvgTs() {
        return pingAvgTs;
    }

    /**
     * set PING 平均耗时
     *
     * @param pingAvgTs
     */
    public void setPingAvgTs(Integer pingAvgTs) {
        this.pingAvgTs = pingAvgTs;
    }


    /**
     * get PING 最大耗时
     *
     * @return
     */
    public Integer getPingMaxTs() {
        return pingMaxTs;
    }

    /**
     * set PING 最大耗时
     *
     * @param pingMaxTs
     */
    public void setPingMaxTs(Integer pingMaxTs) {
        this.pingMaxTs = pingMaxTs;
    }


    /**
     * get PING 最小耗时
     *
     * @return
     */
    public Integer getPingMinTs() {
        return pingMinTs;
    }

    /**
     * set PING 最小耗时
     *
     * @param pingMinTs
     */
    public void setPingMinTs(Integer pingMinTs) {
        this.pingMinTs = pingMinTs;
    }


    /**
     * get PING Mean Deviation， ICMP包的 RTT 偏离平均值的程度
     *
     * @return
     */
    public Integer getPingMDevTs() {
        return pingMDevTs;
    }

    /**
     * set PING Mean Deviation， ICMP包的 RTT 偏离平均值的程度
     *
     * @param pingMDevTs
     */
    public void setPingMDevTs(Integer pingMDevTs) {
        this.pingMDevTs = pingMDevTs;
    }


    /**
     * get PING 耗时列表, -1为请求超时  &quot;[49,49,52,46]&quot;
     *
     * @return
     */
    public String getPingTsList() {
        return pingTsList;
    }

    /**
     * set PING 耗时列表, -1为请求超时  &quot;[49,49,52,46]&quot;
     *
     * @param pingTsList
     */
    public void setPingTsList(String pingTsList) {
        this.pingTsList = pingTsList;
    }


    /**
     * get PING ttlList列表 &quot;[48,48,48,48]&quot;
     *
     * @return
     */
    public String getPingTtlList() {
        return pingTtlList;
    }

    /**
     * set PING ttlList列表 &quot;[48,48,48,48]&quot;
     *
     * @param pingTtlList
     */
    public void setPingTtlList(String pingTtlList) {
        this.pingTtlList = pingTtlList;
    }


    /**
     * get PING 平均ttl
     *
     * @return
     */
    public Integer getPingTtl() {
        return pingTtl;
    }

    /**
     * set PING 平均ttl
     *
     * @param pingTtl
     */
    public void setPingTtl(Integer pingTtl) {
        this.pingTtl = pingTtl;
    }


    /**
     * get tracer 最大跳数
     *
     * @return
     */
    public Integer getTracerMaxHop() {
        return tracerMaxHop;
    }

    /**
     * set tracer 最大跳数
     *
     * @param tracerMaxHop
     */
    public void setTracerMaxHop(Integer tracerMaxHop) {
        this.tracerMaxHop = tracerMaxHop;
    }


    /**
     * get tracer 平均时延
     *
     * @return
     */
    public Long getTracerAvgTs() {
        return tracerAvgTs;
    }

    /**
     * set tracer 平均时延
     *
     * @param tracerAvgTs
     */
    public void setTracerAvgTs(Long tracerAvgTs) {
        this.tracerAvgTs = tracerAvgTs;
    }


    /**
     * get tracer cname
     *
     * @return
     */
    public String getTracerCname() {
        return tracerCname;
    }

    /**
     * set tracer cname
     *
     * @param tracerCname
     */
    public void setTracerCname(String tracerCname) {
        this.tracerCname = tracerCname;
    }


    /**
     * get tracer ip
     *
     * @return
     */
    public String getTracerIp() {
        return tracerIp;
    }

    /**
     * set tracer ip
     *
     * @param tracerIp
     */
    public void setTracerIp(String tracerIp) {
        this.tracerIp = tracerIp;
    }


    /**
     * get tracer 每一跳的信息 [{&quot;ip&quot;:&quot;10.207.0.1&quot;,&quot;cn&quot;:&quot;&quot;,&quot;ts&quot;:3}]
     *
     * @return
     */
    public String getTracerHops() {
        return tracerHops;
    }

    /**
     * set tracer 每一跳的信息 [{&quot;ip&quot;:&quot;10.207.0.1&quot;,&quot;cn&quot;:&quot;&quot;,&quot;ts&quot;:3}]
     *
     * @param tracerHops
     */
    public void setTracerHops(String tracerHops) {
        this.tracerHops = tracerHops;
    }


    /**
     * get tracer 跳跃数量
     *
     * @return
     */
    public Integer getTracerHopNum() {
        return tracerHopNum;
    }

    /**
     * set tracer 跳跃数量
     *
     * @param tracerHopNum
     */
    public void setTracerHopNum(Integer tracerHopNum) {
        this.tracerHopNum = tracerHopNum;
    }



    /**
     * set 任务地址
     *
     * @param url
     */
    public Net url(String url) {
        this.url = url;
        return this;
    }


    /**
     * set 拨测点IP
     *
     * @param monitorIP
     */
    public Net monitorIP(String monitorIP) {
        this.monitorIP = monitorIP;
        return this;
    }


    /**
     * set 拨测点运营商
     *
     * @param monitorISP
     */
    public Net monitorISP(String monitorISP) {
        this.monitorISP = monitorISP;
        return this;
    }


    /**
     * set 拨测点国家
     *
     * @param monitorCountry
     */
    public Net monitorCountry(String monitorCountry) {
        this.monitorCountry = monitorCountry;
        return this;
    }


    /**
     * set 拨测点省份
     *
     * @param monitorProvince
     */
    public Net monitorProvince(String monitorProvince) {
        this.monitorProvince = monitorProvince;
        return this;
    }


    /**
     * set 拨测点城市
     *
     * @param monitorCity
     */
    public Net monitorCity(String monitorCity) {
        this.monitorCity = monitorCity;
        return this;
    }


    /**
     * set 拨测点DNS
     *
     * @param monitorDns
     */
    public Net monitorDns(String monitorDns) {
        this.monitorDns = monitorDns;
        return this;
    }


    /**
     * set 错误信息
     *
     * @param error
     */
    public Net error(String error) {
        this.error = error;
        return this;
    }


    /**
     * set 错误码
     *
     * @param errorCode
     */
    public Net errorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }


    /**
     * set 状态 0:成功 1:失败
     *
     * @param status
     */
    public Net status(Integer status) {
        this.status = status;
        return this;
    }


    /**
     * set DNS记录类型
     *
     * @param dnsRecordType
     */
    public Net dnsRecordType(String dnsRecordType) {
        this.dnsRecordType = dnsRecordType;
        return this;
    }


    /**
     * set DNS记录地址
     *
     * @param dnsAddress
     */
    public Net dnsAddress(String dnsAddress) {
        this.dnsAddress = dnsAddress;
        return this;
    }


    /**
     * set DNS解析用时
     *
     * @param dnsQueryTime
     */
    public Net dnsQueryTime(Integer dnsQueryTime) {
        this.dnsQueryTime = dnsQueryTime;
        return this;
    }


    /**
     * set DNS详情
     *
     * @param dnsDetail
     */
    public Net dnsDetail(String dnsDetail) {
        this.dnsDetail = dnsDetail;
        return this;
    }


    /**
     * set CANME
     *
     * @param pingCname
     */
    public Net pingCname(String pingCname) {
        this.pingCname = pingCname;
        return this;
    }


    /**
     * set PING HOST
     *
     * @param pingHost
     */
    public Net pingHost(String pingHost) {
        this.pingHost = pingHost;
        return this;
    }


    /**
     * set PING IP
     *
     * @param pingIp
     */
    public Net pingIp(String pingIp) {
        this.pingIp = pingIp;
        return this;
    }


    /**
     * set PING TCP PORT
     *
     * @param pingPort
     */
    public Net pingPort(Long pingPort) {
        this.pingPort = pingPort;
        return this;
    }


    /**
     * set PING 总包数
     *
     * @param pingPackets
     */
    public Net pingPackets(Integer pingPackets) {
        this.pingPackets = pingPackets;
        return this;
    }


    /**
     * set PING 丢包率
     *
     * @param pingPacketsLoss
     */
    public Net pingPacketsLoss(Double pingPacketsLoss) {
        this.pingPacketsLoss = pingPacketsLoss;
        return this;
    }


    /**
     * set PING 成功包数
     *
     * @param pingSuccessPackets
     */
    public Net pingSuccessPackets(Integer pingSuccessPackets) {
        this.pingSuccessPackets = pingSuccessPackets;
        return this;
    }


    /**
     * set PING 失败包数
     *
     * @param pingFailPackets
     */
    public Net pingFailPackets(Integer pingFailPackets) {
        this.pingFailPackets = pingFailPackets;
        return this;
    }


    /**
     * set PING 包大小
     *
     * @param pingSize
     */
    public Net pingSize(Integer pingSize) {
        this.pingSize = pingSize;
        return this;
    }


    /**
     * set PING 平均耗时
     *
     * @param pingAvgTs
     */
    public Net pingAvgTs(Integer pingAvgTs) {
        this.pingAvgTs = pingAvgTs;
        return this;
    }


    /**
     * set PING 最大耗时
     *
     * @param pingMaxTs
     */
    public Net pingMaxTs(Integer pingMaxTs) {
        this.pingMaxTs = pingMaxTs;
        return this;
    }


    /**
     * set PING 最小耗时
     *
     * @param pingMinTs
     */
    public Net pingMinTs(Integer pingMinTs) {
        this.pingMinTs = pingMinTs;
        return this;
    }


    /**
     * set PING Mean Deviation， ICMP包的 RTT 偏离平均值的程度
     *
     * @param pingMDevTs
     */
    public Net pingMDevTs(Integer pingMDevTs) {
        this.pingMDevTs = pingMDevTs;
        return this;
    }


    /**
     * set PING 耗时列表, -1为请求超时  &quot;[49,49,52,46]&quot;
     *
     * @param pingTsList
     */
    public Net pingTsList(String pingTsList) {
        this.pingTsList = pingTsList;
        return this;
    }


    /**
     * set PING ttlList列表 &quot;[48,48,48,48]&quot;
     *
     * @param pingTtlList
     */
    public Net pingTtlList(String pingTtlList) {
        this.pingTtlList = pingTtlList;
        return this;
    }


    /**
     * set PING 平均ttl
     *
     * @param pingTtl
     */
    public Net pingTtl(Integer pingTtl) {
        this.pingTtl = pingTtl;
        return this;
    }


    /**
     * set tracer 最大跳数
     *
     * @param tracerMaxHop
     */
    public Net tracerMaxHop(Integer tracerMaxHop) {
        this.tracerMaxHop = tracerMaxHop;
        return this;
    }


    /**
     * set tracer 平均时延
     *
     * @param tracerAvgTs
     */
    public Net tracerAvgTs(Long tracerAvgTs) {
        this.tracerAvgTs = tracerAvgTs;
        return this;
    }


    /**
     * set tracer cname
     *
     * @param tracerCname
     */
    public Net tracerCname(String tracerCname) {
        this.tracerCname = tracerCname;
        return this;
    }


    /**
     * set tracer ip
     *
     * @param tracerIp
     */
    public Net tracerIp(String tracerIp) {
        this.tracerIp = tracerIp;
        return this;
    }


    /**
     * set tracer 每一跳的信息 [{&quot;ip&quot;:&quot;10.207.0.1&quot;,&quot;cn&quot;:&quot;&quot;,&quot;ts&quot;:3}]
     *
     * @param tracerHops
     */
    public Net tracerHops(String tracerHops) {
        this.tracerHops = tracerHops;
        return this;
    }


    /**
     * set tracer 跳跃数量
     *
     * @param tracerHopNum
     */
    public Net tracerHopNum(Integer tracerHopNum) {
        this.tracerHopNum = tracerHopNum;
        return this;
    }


}