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
 * 京东云DDoS防护包相关接口
 * 京东云DDoS防护包相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.antipro.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.antipro.model.DescribeInstanceRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeInstanceResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeInstanceExecutor;
import com.jdcloud.sdk.service.antipro.model.AddProtectedIpRequest;
import com.jdcloud.sdk.service.antipro.model.AddProtectedIpResponse;
import com.jdcloud.sdk.service.antipro.client.AddProtectedIpExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeIpSetsRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeIpSetsResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeIpSetsExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeCpsIpResourcesRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeCpsIpResourcesResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeCpsIpResourcesExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeAttackSourceRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeAttackSourceResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeAttackSourceExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeInstanceAclEnableRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeInstanceAclEnableResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeInstanceAclEnableExecutor;
import com.jdcloud.sdk.service.antipro.model.ModifyInstanceRequest;
import com.jdcloud.sdk.service.antipro.model.ModifyInstanceResponse;
import com.jdcloud.sdk.service.antipro.client.ModifyInstanceExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeProtectionRuleRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeProtectionRuleResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeProtectionRuleExecutor;
import com.jdcloud.sdk.service.antipro.model.ModifyAclPriorityRequest;
import com.jdcloud.sdk.service.antipro.model.ModifyAclPriorityResponse;
import com.jdcloud.sdk.service.antipro.client.ModifyAclPriorityExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeInstancesRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeInstancesResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeInstancesExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeAttackLogsRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeAttackLogsResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeAttackLogsExecutor;
import com.jdcloud.sdk.service.antipro.model.EnableInstanceAclRequest;
import com.jdcloud.sdk.service.antipro.model.EnableInstanceAclResponse;
import com.jdcloud.sdk.service.antipro.client.EnableInstanceAclExecutor;
import com.jdcloud.sdk.service.antipro.model.DisableAclRequest;
import com.jdcloud.sdk.service.antipro.model.DisableAclResponse;
import com.jdcloud.sdk.service.antipro.client.DisableAclExecutor;
import com.jdcloud.sdk.service.antipro.model.CreateIpSetRequest;
import com.jdcloud.sdk.service.antipro.model.CreateIpSetResponse;
import com.jdcloud.sdk.service.antipro.client.CreateIpSetExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribePortSetRequest;
import com.jdcloud.sdk.service.antipro.model.DescribePortSetResponse;
import com.jdcloud.sdk.service.antipro.client.DescribePortSetExecutor;
import com.jdcloud.sdk.service.antipro.model.DeleteIpSetRequest;
import com.jdcloud.sdk.service.antipro.model.DeleteIpSetResponse;
import com.jdcloud.sdk.service.antipro.client.DeleteIpSetExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeElasticIpResourcesRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeElasticIpResourcesResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeElasticIpResourcesExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeOperationRecordsRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeOperationRecordsResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeOperationRecordsExecutor;
import com.jdcloud.sdk.service.antipro.model.CreateInstanceRequest;
import com.jdcloud.sdk.service.antipro.model.CreateInstanceResponse;
import com.jdcloud.sdk.service.antipro.client.CreateInstanceExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeCcsIpResourcesRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeCcsIpResourcesResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeCcsIpResourcesExecutor;
import com.jdcloud.sdk.service.antipro.model.DeleteProtectedIpRequest;
import com.jdcloud.sdk.service.antipro.model.DeleteProtectedIpResponse;
import com.jdcloud.sdk.service.antipro.client.DeleteProtectedIpExecutor;
import com.jdcloud.sdk.service.antipro.model.ModifyAclRequest;
import com.jdcloud.sdk.service.antipro.model.ModifyAclResponse;
import com.jdcloud.sdk.service.antipro.client.ModifyAclExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeIpMonitorFlowRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeIpMonitorFlowResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeIpMonitorFlowExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeGeoAreasRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeGeoAreasResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeGeoAreasExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeAttackStatisticsRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeAttackStatisticsResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeAttackStatisticsExecutor;
import com.jdcloud.sdk.service.antipro.model.CreateAclRequest;
import com.jdcloud.sdk.service.antipro.model.CreateAclResponse;
import com.jdcloud.sdk.service.antipro.client.CreateAclExecutor;
import com.jdcloud.sdk.service.antipro.model.DeleteAclRequest;
import com.jdcloud.sdk.service.antipro.model.DeleteAclResponse;
import com.jdcloud.sdk.service.antipro.client.DeleteAclExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeAclsRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeAclsResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeAclsExecutor;
import com.jdcloud.sdk.service.antipro.model.DeletePortSetRequest;
import com.jdcloud.sdk.service.antipro.model.DeletePortSetResponse;
import com.jdcloud.sdk.service.antipro.client.DeletePortSetExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeInstanceAclCntRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeInstanceAclCntResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeInstanceAclCntExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeProtectionOutlineRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeProtectionOutlineResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeProtectionOutlineExecutor;
import com.jdcloud.sdk.service.antipro.model.CreatePortSetRequest;
import com.jdcloud.sdk.service.antipro.model.CreatePortSetResponse;
import com.jdcloud.sdk.service.antipro.client.CreatePortSetExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeWafIpResourcesRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeWafIpResourcesResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeWafIpResourcesExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeIpSetRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeIpSetResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeIpSetExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribePortSetsRequest;
import com.jdcloud.sdk.service.antipro.model.DescribePortSetsResponse;
import com.jdcloud.sdk.service.antipro.client.DescribePortSetsExecutor;
import com.jdcloud.sdk.service.antipro.model.ModifyInstanceNameRequest;
import com.jdcloud.sdk.service.antipro.model.ModifyInstanceNameResponse;
import com.jdcloud.sdk.service.antipro.client.ModifyInstanceNameExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeProtectedIpListRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeProtectedIpListResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeProtectedIpListExecutor;
import com.jdcloud.sdk.service.antipro.model.DisableInstanceAclRequest;
import com.jdcloud.sdk.service.antipro.model.DisableInstanceAclResponse;
import com.jdcloud.sdk.service.antipro.client.DisableInstanceAclExecutor;
import com.jdcloud.sdk.service.antipro.model.EnableAclRequest;
import com.jdcloud.sdk.service.antipro.model.EnableAclResponse;
import com.jdcloud.sdk.service.antipro.client.EnableAclExecutor;
import com.jdcloud.sdk.service.antipro.model.ModifyIpSetRequest;
import com.jdcloud.sdk.service.antipro.model.ModifyIpSetResponse;
import com.jdcloud.sdk.service.antipro.client.ModifyIpSetExecutor;
import com.jdcloud.sdk.service.antipro.model.CheckInstanceNameRequest;
import com.jdcloud.sdk.service.antipro.model.CheckInstanceNameResponse;
import com.jdcloud.sdk.service.antipro.client.CheckInstanceNameExecutor;
import com.jdcloud.sdk.service.antipro.model.ModifyPortSetRequest;
import com.jdcloud.sdk.service.antipro.model.ModifyPortSetResponse;
import com.jdcloud.sdk.service.antipro.client.ModifyPortSetExecutor;
import com.jdcloud.sdk.service.antipro.model.DescribeAttackTypeCountRequest;
import com.jdcloud.sdk.service.antipro.model.DescribeAttackTypeCountResponse;
import com.jdcloud.sdk.service.antipro.client.DescribeAttackTypeCountExecutor;
import com.jdcloud.sdk.service.antipro.model.ModifyProtectionRuleRequest;
import com.jdcloud.sdk.service.antipro.model.ModifyProtectionRuleResponse;
import com.jdcloud.sdk.service.antipro.client.ModifyProtectionRuleExecutor;

/**
 * antiproClient
 */
public class AntiproClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.4";
    public final static String DefaultEndpoint = "antipro.jdcloud-api.com";
    public final static String ServiceName = "antipro";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private AntiproClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 查询防护包实例
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws JdcloudSdkException {
        return new DescribeInstanceExecutor().client(this).execute(request);
    }

    /**
     * 添加防护包防护 IP. &lt;br&gt;- 防护包仅能防护防护包实例所在区域的公网 IP, 且该公网 IP 未被其他防护包防护, 如果已经被其他防护包防护, 请先调用删除防护包防护 IP 接口删除防护 IP&lt;br&gt;- 防护包可添加的防护 IP 个数小于等于防护包的可防护 IP 数量减去已防护的 IP 数量&lt;br&gt;- 使用 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-protection-package/api/describeelasticipresources&#39;&gt;describeElasticIpResources&lt;/a&gt; 接口查询防护包可防护的弹性公网 IP&lt;br&gt;- 使用 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-protection-package/api/describecpsipresources&#39;&gt;describeCpsIpResources&lt;/a&gt; 接口查询防护包可防护的云物理服务器公网 IP&lt;br&gt;- 使用 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-protection-package/api/describewafipresources&#39;&gt;describeWafIpResources&lt;/a&gt; 接口查询防护包可防护的Web应用防火墙公网 IP&lt;br&gt;- 使用 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-protection-package/api/describeccsipresources&#39;&gt;describeCcsIpResources&lt;/a&gt; 接口查询防护包可防护的托管区公网 IP
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddProtectedIpResponse addProtectedIp(AddProtectedIpRequest request) throws JdcloudSdkException {
        return new AddProtectedIpExecutor().client(this).execute(request);
    }

    /**
     * 查询实例的 IP 库列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeIpSetsResponse describeIpSets(DescribeIpSetsRequest request) throws JdcloudSdkException {
        return new DescribeIpSetsExecutor().client(this).execute(request);
    }

    /**
     * 查询 DDoS 防护包可防护的云物理服务器公网 IP(包括云物理服务器弹性公网 IP 及云物理服务器基础网络实例的公网 IP)
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCpsIpResourcesResponse describeCpsIpResources(DescribeCpsIpResourcesRequest request) throws JdcloudSdkException {
        return new DescribeCpsIpResourcesExecutor().client(this).execute(request);
    }

    /**
     * 查询攻击来源
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAttackSourceResponse describeAttackSource(DescribeAttackSourceRequest request) throws JdcloudSdkException {
        return new DescribeAttackSourceExecutor().client(this).execute(request);
    }

    /**
     * 查询实例的访问控制规则总开关状态
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceAclEnableResponse describeInstanceAclEnable(DescribeInstanceAclEnableRequest request) throws JdcloudSdkException {
        return new DescribeInstanceAclEnableExecutor().client(this).execute(request);
    }

    /**
     * 升级防护包实例
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyInstanceResponse modifyInstance(ModifyInstanceRequest request) throws JdcloudSdkException {
        return new ModifyInstanceExecutor().client(this).execute(request);
    }

    /**
     * 获取防护包实例或 IP 的防护规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeProtectionRuleResponse describeProtectionRule(DescribeProtectionRuleRequest request) throws JdcloudSdkException {
        return new DescribeProtectionRuleExecutor().client(this).execute(request);
    }

    /**
     * 修改访问控制规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyAclPriorityResponse modifyAclPriority(ModifyAclPriorityRequest request) throws JdcloudSdkException {
        return new ModifyAclPriorityExecutor().client(this).execute(request);
    }

    /**
     * 查询防护包实例列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws JdcloudSdkException {
        return new DescribeInstancesExecutor().client(this).execute(request);
    }

    /**
     * 查询攻击记录, 参数 ip 优先级大于 instanceId. &lt;br&gt;- 指定 ip 参数时, 忽略 instanceId 参数, 查询 ip 相关攻击记录. &lt;br&gt;- 未指定 ip 时, 查询 instanceId 指定实例相关攻击记录. &lt;br&gt;- ip 和 instanceId 均未指定时, 查询用户所有公网 IP 攻击记录
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAttackLogsResponse describeAttackLogs(DescribeAttackLogsRequest request) throws JdcloudSdkException {
        return new DescribeAttackLogsExecutor().client(this).execute(request);
    }

    /**
     * 打开实例的访问控制规则总开关
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EnableInstanceAclResponse enableInstanceAcl(EnableInstanceAclRequest request) throws JdcloudSdkException {
        return new EnableInstanceAclExecutor().client(this).execute(request);
    }

    /**
     * 关闭实例的访问控制规则. 支持批量操作, 批量操作时 aclId 传多个, 以 &#39;,&#39; 分隔
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisableAclResponse disableAcl(DisableAclRequest request) throws JdcloudSdkException {
        return new DisableAclExecutor().client(this).execute(request);
    }

    /**
     * 创建实例的 IP 库
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateIpSetResponse createIpSet(CreateIpSetRequest request) throws JdcloudSdkException {
        return new CreateIpSetExecutor().client(this).execute(request);
    }

    /**
     * 查询实例的端口库
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribePortSetResponse describePortSet(DescribePortSetRequest request) throws JdcloudSdkException {
        return new DescribePortSetExecutor().client(this).execute(request);
    }

    /**
     * 删除实例的 IP 库. 支持批量操作, 批量操作时 ipSetId 传多个, 以 &#39;,&#39; 分隔. IP 黑白名单规则被引用时不允许删除
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteIpSetResponse deleteIpSet(DeleteIpSetRequest request) throws JdcloudSdkException {
        return new DeleteIpSetExecutor().client(this).execute(request);
    }

    /**
     * 查询 DDoS 防护包可防护的私有网络弹性公网 IP(不包括运营商级 NAT 保留地址和 IPv6)
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeElasticIpResourcesResponse describeElasticIpResources(DescribeElasticIpResourcesRequest request) throws JdcloudSdkException {
        return new DescribeElasticIpResourcesExecutor().client(this).execute(request);
    }

    /**
     * 查询操作日志
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeOperationRecordsResponse describeOperationRecords(DescribeOperationRecordsRequest request) throws JdcloudSdkException {
        return new DescribeOperationRecordsExecutor().client(this).execute(request);
    }

    /**
     * 创建防护包实例
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws JdcloudSdkException {
        return new CreateInstanceExecutor().client(this).execute(request);
    }

    /**
     * 查询 DDoS 防护包可防护的托管区公网 IP
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCcsIpResourcesResponse describeCcsIpResources(DescribeCcsIpResourcesRequest request) throws JdcloudSdkException {
        return new DescribeCcsIpResourcesExecutor().client(this).execute(request);
    }

    /**
     * 删除防护包防护 IP
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteProtectedIpResponse deleteProtectedIp(DeleteProtectedIpRequest request) throws JdcloudSdkException {
        return new DeleteProtectedIpExecutor().client(this).execute(request);
    }

    /**
     * 修改访问控制规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyAclResponse modifyAcl(ModifyAclRequest request) throws JdcloudSdkException {
        return new ModifyAclExecutor().client(this).execute(request);
    }

    /**
     * 查询公网 IP 的监控流量
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeIpMonitorFlowResponse describeIpMonitorFlow(DescribeIpMonitorFlowRequest request) throws JdcloudSdkException {
        return new DescribeIpMonitorFlowExecutor().client(this).execute(request);
    }

    /**
     * 查询防护规则 Geo 拦截可设置区域
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeGeoAreasResponse describeGeoAreas(DescribeGeoAreasRequest request) throws JdcloudSdkException {
        return new DescribeGeoAreasExecutor().client(this).execute(request);
    }

    /**
     * 攻击记录统计, 参数 ip 优先级大于 instanceId. &lt;br&gt;- 指定 ip 参数时, 忽略 instanceId 参数, 统计 ip 的攻击情况. &lt;br&gt;- 未指定 ip 时, 统计 instanceId 指定实例相关攻击情况. &lt;br&gt;- ip 和 instanceId 均未指定时, 查询用户所有公网 IP 攻击情况
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAttackStatisticsResponse describeAttackStatistics(DescribeAttackStatisticsRequest request) throws JdcloudSdkException {
        return new DescribeAttackStatisticsExecutor().client(this).execute(request);
    }

    /**
     * 创建访问控制规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateAclResponse createAcl(CreateAclRequest request) throws JdcloudSdkException {
        return new CreateAclExecutor().client(this).execute(request);
    }

    /**
     * 删除实例的访问控制规则. 支持批量操作, 批量操作时 aclId个, 以 &#39;,&#39; 分隔
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteAclResponse deleteAcl(DeleteAclRequest request) throws JdcloudSdkException {
        return new DeleteAclExecutor().client(this).execute(request);
    }

    /**
     * 查询防护包实例的访问控制列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAclsResponse describeAcls(DescribeAclsRequest request) throws JdcloudSdkException {
        return new DescribeAclsExecutor().client(this).execute(request);
    }

    /**
     * 删除实例的端口库. 支持批量操作, 批量操作时 ipSetId 传多个, 以 &#39;,&#39; 分隔. IP 黑白名单规则被引用时不允许删除
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeletePortSetResponse deletePortSet(DeletePortSetRequest request) throws JdcloudSdkException {
        return new DeletePortSetExecutor().client(this).execute(request);
    }

    /**
     * 查询已添加的访问控制规则数量
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceAclCntResponse describeInstanceAclCnt(DescribeInstanceAclCntRequest request) throws JdcloudSdkException {
        return new DescribeInstanceAclCntExecutor().client(this).execute(request);
    }

    /**
     * 防护包防护信息概要
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeProtectionOutlineResponse describeProtectionOutline(DescribeProtectionOutlineRequest request) throws JdcloudSdkException {
        return new DescribeProtectionOutlineExecutor().client(this).execute(request);
    }

    /**
     * 创建实例的端口库
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreatePortSetResponse createPortSet(CreatePortSetRequest request) throws JdcloudSdkException {
        return new CreatePortSetExecutor().client(this).execute(request);
    }

    /**
     * 查询 DDoS 防护包可防护的Web应用防护墙 IP
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeWafIpResourcesResponse describeWafIpResources(DescribeWafIpResourcesRequest request) throws JdcloudSdkException {
        return new DescribeWafIpResourcesExecutor().client(this).execute(request);
    }

    /**
     * 查询实例的 IP 库
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeIpSetResponse describeIpSet(DescribeIpSetRequest request) throws JdcloudSdkException {
        return new DescribeIpSetExecutor().client(this).execute(request);
    }

    /**
     * 查询实例的端口库列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribePortSetsResponse describePortSets(DescribePortSetsRequest request) throws JdcloudSdkException {
        return new DescribePortSetsExecutor().client(this).execute(request);
    }

    /**
     * 修改防护包实例名称
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyInstanceNameResponse modifyInstanceName(ModifyInstanceNameRequest request) throws JdcloudSdkException {
        return new ModifyInstanceNameExecutor().client(this).execute(request);
    }

    /**
     * 查询已防护 IP 列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeProtectedIpListResponse describeProtectedIpList(DescribeProtectedIpListRequest request) throws JdcloudSdkException {
        return new DescribeProtectedIpListExecutor().client(this).execute(request);
    }

    /**
     * 关闭实例的访问控制规则总开关
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisableInstanceAclResponse disableInstanceAcl(DisableInstanceAclRequest request) throws JdcloudSdkException {
        return new DisableInstanceAclExecutor().client(this).execute(request);
    }

    /**
     * 打开实例的访问控制规则. 支持批量操作, 批量操作时 aclId 传多个, 以 &#39;,&#39; 分隔
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EnableAclResponse enableAcl(EnableAclRequest request) throws JdcloudSdkException {
        return new EnableAclExecutor().client(this).execute(request);
    }

    /**
     * 修改实例的 IP 库
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyIpSetResponse modifyIpSet(ModifyIpSetRequest request) throws JdcloudSdkException {
        return new ModifyIpSetExecutor().client(this).execute(request);
    }

    /**
     * 检测实例名称是否可用, 防护包实例名称不可重复
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CheckInstanceNameResponse checkInstanceName(CheckInstanceNameRequest request) throws JdcloudSdkException {
        return new CheckInstanceNameExecutor().client(this).execute(request);
    }

    /**
     * 修改实例的端口库
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyPortSetResponse modifyPortSet(ModifyPortSetRequest request) throws JdcloudSdkException {
        return new ModifyPortSetExecutor().client(this).execute(request);
    }

    /**
     * 查询各类型攻击次数, 参数 ip 优先级大于 instanceId. &lt;br&gt;- 指定 ip 参数时, 忽略 instanceId 参数, 查询 ip 相关攻击记录的各类型攻击次数&lt;br&gt;- 未指定 ip 时, 查询 instanceId 指定实例相关攻击记录的各类型攻击次数&lt;br&gt;- ip 和 instanceId 均未指定时, 查询用户所有公网 IP 攻击记录的各类型攻击次数
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAttackTypeCountResponse describeAttackTypeCount(DescribeAttackTypeCountRequest request) throws JdcloudSdkException {
        return new DescribeAttackTypeCountExecutor().client(this).execute(request);
    }

    /**
     * 修改防护包实例或 IP 的防护规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyProtectionRuleResponse modifyProtectionRule(ModifyProtectionRuleRequest request) throws JdcloudSdkException {
        return new ModifyProtectionRuleExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public AntiproClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private AntiproClient antiproClient;

        public DefaultBuilder() {
            antiproClient = new AntiproClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            antiproClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            antiproClient.httpRequestConfig = config;
            return this;
        }

        public AntiproClient build() throws JdcloudSdkException {

            if (antiproClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                antiproClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (antiproClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("AntiproClient build error: jdcloud credentials provider not set");
                }
            }
            if (antiproClient.httpRequestConfig == null) {
                antiproClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (antiproClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("AntiproClient build error: http request config not set");
                }
            }
            return antiproClient;
        }

        public Builder environment(Environment environment) {
            antiproClient.environment = environment;
            return this;
        }
    }
}
