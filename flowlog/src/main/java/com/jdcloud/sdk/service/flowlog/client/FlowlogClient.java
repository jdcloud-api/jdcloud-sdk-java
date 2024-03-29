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
 * 京东云VPC使用的流日志
 * 流日志API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.flowlog.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.flowlog.model.DescribeFlowLogRequest;
import com.jdcloud.sdk.service.flowlog.model.DescribeFlowLogResponse;
import com.jdcloud.sdk.service.flowlog.client.DescribeFlowLogExecutor;
import com.jdcloud.sdk.service.flowlog.model.StartFlowLogRequest;
import com.jdcloud.sdk.service.flowlog.model.StartFlowLogResponse;
import com.jdcloud.sdk.service.flowlog.client.StartFlowLogExecutor;
import com.jdcloud.sdk.service.flowlog.model.StopFlowLogRequest;
import com.jdcloud.sdk.service.flowlog.model.StopFlowLogResponse;
import com.jdcloud.sdk.service.flowlog.client.StopFlowLogExecutor;
import com.jdcloud.sdk.service.flowlog.model.RemoveCollectResourcesRequest;
import com.jdcloud.sdk.service.flowlog.model.RemoveCollectResourcesResponse;
import com.jdcloud.sdk.service.flowlog.client.RemoveCollectResourcesExecutor;
import com.jdcloud.sdk.service.flowlog.model.CreateFlowLogRequest;
import com.jdcloud.sdk.service.flowlog.model.CreateFlowLogResponse;
import com.jdcloud.sdk.service.flowlog.client.CreateFlowLogExecutor;
import com.jdcloud.sdk.service.flowlog.model.ModifyFlowLogRequest;
import com.jdcloud.sdk.service.flowlog.model.ModifyFlowLogResponse;
import com.jdcloud.sdk.service.flowlog.client.ModifyFlowLogExecutor;
import com.jdcloud.sdk.service.flowlog.model.DeleteFlowLogRequest;
import com.jdcloud.sdk.service.flowlog.model.DeleteFlowLogResponse;
import com.jdcloud.sdk.service.flowlog.client.DeleteFlowLogExecutor;
import com.jdcloud.sdk.service.flowlog.model.DescribeFlowLogsRequest;
import com.jdcloud.sdk.service.flowlog.model.DescribeFlowLogsResponse;
import com.jdcloud.sdk.service.flowlog.client.DescribeFlowLogsExecutor;
import com.jdcloud.sdk.service.flowlog.model.AddCollectResourcesRequest;
import com.jdcloud.sdk.service.flowlog.model.AddCollectResourcesResponse;
import com.jdcloud.sdk.service.flowlog.client.AddCollectResourcesExecutor;
import com.jdcloud.sdk.service.flowlog.model.DescribeQuotaRequest;
import com.jdcloud.sdk.service.flowlog.model.DescribeQuotaResponse;
import com.jdcloud.sdk.service.flowlog.client.DescribeQuotaExecutor;
import com.jdcloud.sdk.service.flowlog.model.DescribeCollectResourcesRequest;
import com.jdcloud.sdk.service.flowlog.model.DescribeCollectResourcesResponse;
import com.jdcloud.sdk.service.flowlog.client.DescribeCollectResourcesExecutor;

/**
 * flowlogClient
 */
public class FlowlogClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.11";
    public final static String DefaultEndpoint = "flowlog.jdcloud-api.com";
    public final static String ServiceName = "flowlog";
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

    private FlowlogClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 本接口用于查询流日志资源详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeFlowLogResponse describeFlowLog(DescribeFlowLogRequest request) throws JdcloudSdkException {
        return new DescribeFlowLogExecutor().client(this).execute(request);
    }

    /**
     * 本接口用于启动采集流日志
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StartFlowLogResponse startFlowLog(StartFlowLogRequest request) throws JdcloudSdkException {
        return new StartFlowLogExecutor().client(this).execute(request);
    }

    /**
     * 本接口用于停止采集流日志
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StopFlowLogResponse stopFlowLog(StopFlowLogRequest request) throws JdcloudSdkException {
        return new StopFlowLogExecutor().client(this).execute(request);
    }

    /**
     * 本接口用于移除流日志的采集资源
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RemoveCollectResourcesResponse removeCollectResources(RemoveCollectResourcesRequest request) throws JdcloudSdkException {
        return new RemoveCollectResourcesExecutor().client(this).execute(request);
    }

    /**
     * 本接口用于创建流日志资源
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateFlowLogResponse createFlowLog(CreateFlowLogRequest request) throws JdcloudSdkException {
        return new CreateFlowLogExecutor().client(this).execute(request);
    }

    /**
     * 本接口用于修改流日志资源，包括流日志的名称、描述、采集时间间隔
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyFlowLogResponse modifyFlowLog(ModifyFlowLogRequest request) throws JdcloudSdkException {
        return new ModifyFlowLogExecutor().client(this).execute(request);
    }

    /**
     * 本接口用于删除流日志，删除前请先停止流日志（stopFlowlog）
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteFlowLogResponse deleteFlowLog(DeleteFlowLogRequest request) throws JdcloudSdkException {
        return new DeleteFlowLogExecutor().client(this).execute(request);
    }

    /**
     * 本接口用于查询流日志资源列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeFlowLogsResponse describeFlowLogs(DescribeFlowLogsRequest request) throws JdcloudSdkException {
        return new DescribeFlowLogsExecutor().client(this).execute(request);
    }

    /**
     * 本接口用于添加需要采集流日志的资源
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddCollectResourcesResponse addCollectResources(AddCollectResourcesRequest request) throws JdcloudSdkException {
        return new AddCollectResourcesExecutor().client(this).execute(request);
    }

    /**
     * 查询配额信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeQuotaResponse describeQuota(DescribeQuotaRequest request) throws JdcloudSdkException {
        return new DescribeQuotaExecutor().client(this).execute(request);
    }

    /**
     * 本接口用于查询流日志采集的资源列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCollectResourcesResponse describeCollectResources(DescribeCollectResourcesRequest request) throws JdcloudSdkException {
        return new DescribeCollectResourcesExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public FlowlogClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private FlowlogClient flowlogClient;

        public DefaultBuilder() {
            flowlogClient = new FlowlogClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            flowlogClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            flowlogClient.httpRequestConfig = config;
            return this;
        }

        public FlowlogClient build() throws JdcloudSdkException {

            if (flowlogClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                flowlogClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (flowlogClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("FlowlogClient build error: jdcloud credentials provider not set");
                }
            }
            if (flowlogClient.httpRequestConfig == null) {
                flowlogClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (flowlogClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("FlowlogClient build error: http request config not set");
                }
            }
            return flowlogClient;
        }

        public Builder environment(Environment environment) {
            flowlogClient.environment = environment;
            return this;
        }
    }
}
