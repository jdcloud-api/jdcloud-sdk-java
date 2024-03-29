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
 * fc
 * funtion 服务
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.fc.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.fc.model.DescribeFunctionsRequest;
import com.jdcloud.sdk.service.fc.model.DescribeFunctionsResponse;
import com.jdcloud.sdk.service.fc.client.DescribeFunctionsExecutor;
import com.jdcloud.sdk.service.fc.model.DeleteFunctionRequest;
import com.jdcloud.sdk.service.fc.model.DeleteFunctionResponse;
import com.jdcloud.sdk.service.fc.client.DeleteFunctionExecutor;
import com.jdcloud.sdk.service.fc.model.UpdateFunctionRequest;
import com.jdcloud.sdk.service.fc.model.UpdateFunctionResponse;
import com.jdcloud.sdk.service.fc.client.UpdateFunctionExecutor;
import com.jdcloud.sdk.service.fc.model.DescribeRuntimesRequest;
import com.jdcloud.sdk.service.fc.model.DescribeRuntimesResponse;
import com.jdcloud.sdk.service.fc.client.DescribeRuntimesExecutor;
import com.jdcloud.sdk.service.fc.model.UpdateTriggerRequest;
import com.jdcloud.sdk.service.fc.model.UpdateTriggerResponse;
import com.jdcloud.sdk.service.fc.client.UpdateTriggerExecutor;
import com.jdcloud.sdk.service.fc.model.CreateTriggerRequest;
import com.jdcloud.sdk.service.fc.model.CreateTriggerResponse;
import com.jdcloud.sdk.service.fc.client.CreateTriggerExecutor;
import com.jdcloud.sdk.service.fc.model.DescribeTriggerRequest;
import com.jdcloud.sdk.service.fc.model.DescribeTriggerResponse;
import com.jdcloud.sdk.service.fc.client.DescribeTriggerExecutor;
import com.jdcloud.sdk.service.fc.model.DeleteTriggerRequest;
import com.jdcloud.sdk.service.fc.model.DeleteTriggerResponse;
import com.jdcloud.sdk.service.fc.client.DeleteTriggerExecutor;
import com.jdcloud.sdk.service.fc.model.DescribeFunctionRequest;
import com.jdcloud.sdk.service.fc.model.DescribeFunctionResponse;
import com.jdcloud.sdk.service.fc.client.DescribeFunctionExecutor;
import com.jdcloud.sdk.service.fc.model.InvokeFunctionRequest;
import com.jdcloud.sdk.service.fc.model.InvokeFunctionResponse;
import com.jdcloud.sdk.service.fc.client.InvokeFunctionExecutor;
import com.jdcloud.sdk.service.fc.model.DescribeServiceRequest;
import com.jdcloud.sdk.service.fc.model.DescribeServiceResponse;
import com.jdcloud.sdk.service.fc.client.DescribeServiceExecutor;
import com.jdcloud.sdk.service.fc.model.DescribeInstanceTypesRequest;
import com.jdcloud.sdk.service.fc.model.DescribeInstanceTypesResponse;
import com.jdcloud.sdk.service.fc.client.DescribeInstanceTypesExecutor;
import com.jdcloud.sdk.service.fc.model.CreateFunctionRequest;
import com.jdcloud.sdk.service.fc.model.CreateFunctionResponse;
import com.jdcloud.sdk.service.fc.client.CreateFunctionExecutor;
import com.jdcloud.sdk.service.fc.model.DescribeTriggersRequest;
import com.jdcloud.sdk.service.fc.model.DescribeTriggersResponse;
import com.jdcloud.sdk.service.fc.client.DescribeTriggersExecutor;
import com.jdcloud.sdk.service.fc.model.CreateServiceRequest;
import com.jdcloud.sdk.service.fc.model.CreateServiceResponse;
import com.jdcloud.sdk.service.fc.client.CreateServiceExecutor;
import com.jdcloud.sdk.service.fc.model.UpdateServiceRequest;
import com.jdcloud.sdk.service.fc.model.UpdateServiceResponse;
import com.jdcloud.sdk.service.fc.client.UpdateServiceExecutor;
import com.jdcloud.sdk.service.fc.model.DescribeFunctionCodeRequest;
import com.jdcloud.sdk.service.fc.model.DescribeFunctionCodeResponse;
import com.jdcloud.sdk.service.fc.client.DescribeFunctionCodeExecutor;
import com.jdcloud.sdk.service.fc.model.DeleteServiceRequest;
import com.jdcloud.sdk.service.fc.model.DeleteServiceResponse;
import com.jdcloud.sdk.service.fc.client.DeleteServiceExecutor;
import com.jdcloud.sdk.service.fc.model.DescribeServicesRequest;
import com.jdcloud.sdk.service.fc.model.DescribeServicesResponse;
import com.jdcloud.sdk.service.fc.client.DescribeServicesExecutor;

/**
 * fcClient
 */
public class FcClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.11";
    public final static String DefaultEndpoint = "fc.jdcloud-api.com";
    public final static String ServiceName = "fc";
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

    private FcClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 批量查询 function 的详细信息&lt;br&gt;
此接口支持分页查询，默认每页20条。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeFunctionsResponse describeFunctions(DescribeFunctionsRequest request) throws JdcloudSdkException {
        return new DescribeFunctionsExecutor().client(this).execute(request);
    }

    /**
     * 删除function
 [MFA enabled]
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteFunctionResponse deleteFunction(DeleteFunctionRequest request) throws JdcloudSdkException {
        return new DeleteFunctionExecutor().client(this).execute(request);
    }

    /**
     * 修改 function

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateFunctionResponse updateFunction(UpdateFunctionRequest request) throws JdcloudSdkException {
        return new UpdateFunctionExecutor().client(this).execute(request);
    }

    /**
     * 获取所有的runtime

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeRuntimesResponse describeRuntimes(DescribeRuntimesRequest request) throws JdcloudSdkException {
        return new DescribeRuntimesExecutor().client(this).execute(request);
    }

    /**
     * 修改触发器配置

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateTriggerResponse updateTrigger(UpdateTriggerRequest request) throws JdcloudSdkException {
        return new UpdateTriggerExecutor().client(this).execute(request);
    }

    /**
     * 创建触发器。
目前支持的触发器类型有：
- oss

## 注意事项
- 一个函数下最多同时存在10个触发器。
- oss类型触发器会在对应的bucket中添加一个事件通知，若该bucket中已存在相同事件类型的事件通知，触发器可能无法生效。
- 创建多个相同类型的oss触发器，当对应的事件发生时，只有一个触发器会被调用。
- 若人为修改或删除了bucket中的事件通知，可能导致oss触发器失效。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateTriggerResponse createTrigger(CreateTriggerRequest request) throws JdcloudSdkException {
        return new CreateTriggerExecutor().client(this).execute(request);
    }

    /**
     * 查询一个触发器的详细信息。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeTriggerResponse describeTrigger(DescribeTriggerRequest request) throws JdcloudSdkException {
        return new DescribeTriggerExecutor().client(this).execute(request);
    }

    /**
     * 删除触发器。
 [MFA enabled]
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteTriggerResponse deleteTrigger(DeleteTriggerRequest request) throws JdcloudSdkException {
        return new DeleteTriggerExecutor().client(this).execute(request);
    }

    /**
     * 查询一个 函数 的详细信息

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeFunctionResponse describeFunction(DescribeFunctionRequest request) throws JdcloudSdkException {
        return new DescribeFunctionExecutor().client(this).execute(request);
    }

    /**
     * 触发函数执行

可以添加header参数 &#x60;x-fc-invocation-type&#x60;指定调用方式。
- Async 异步调用
- Sync 同步调用（暂不支持）

异步调用函数时，请求会立即返回 requestId。 &lt;br&gt;

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public InvokeFunctionResponse invokeFunction(InvokeFunctionRequest request) throws JdcloudSdkException {
        return new InvokeFunctionExecutor().client(this).execute(request);
    }

    /**
     * 查询一个 service 的详细信息

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeServiceResponse describeService(DescribeServiceRequest request) throws JdcloudSdkException {
        return new DescribeServiceExecutor().client(this).execute(request);
    }

    /**
     * 批量查询 instanceTypes 的详细信息&lt;br&gt;&#x60;
此接口支持分页查询，默认每页20条。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceTypesResponse describeInstanceTypes(DescribeInstanceTypesRequest request) throws JdcloudSdkException {
        return new DescribeInstanceTypesExecutor().client(this).execute(request);
    }

    /**
     * 创建函数

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateFunctionResponse createFunction(CreateFunctionRequest request) throws JdcloudSdkException {
        return new CreateFunctionExecutor().client(this).execute(request);
    }

    /**
     * 获取函数下所有触发器的详细信息。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeTriggersResponse describeTriggers(DescribeTriggersRequest request) throws JdcloudSdkException {
        return new DescribeTriggersExecutor().client(this).execute(request);
    }

    /**
     * 创建服务

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateServiceResponse createService(CreateServiceRequest request) throws JdcloudSdkException {
        return new CreateServiceExecutor().client(this).execute(request);
    }

    /**
     * 修改 service

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateServiceResponse updateService(UpdateServiceRequest request) throws JdcloudSdkException {
        return new UpdateServiceExecutor().client(this).execute(request);
    }

    /**
     * 查询一个 function 的代码地址

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeFunctionCodeResponse describeFunctionCode(DescribeFunctionCodeRequest request) throws JdcloudSdkException {
        return new DescribeFunctionCodeExecutor().client(this).execute(request);
    }

    /**
     * 删除service
 [MFA enabled]
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteServiceResponse deleteService(DeleteServiceRequest request) throws JdcloudSdkException {
        return new DeleteServiceExecutor().client(this).execute(request);
    }

    /**
     * 批量查询 service 的详细信息&lt;br&gt;
此接口支持分页查询，默认每页20条。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeServicesResponse describeServices(DescribeServicesRequest request) throws JdcloudSdkException {
        return new DescribeServicesExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public FcClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private FcClient fcClient;

        public DefaultBuilder() {
            fcClient = new FcClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            fcClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            fcClient.httpRequestConfig = config;
            return this;
        }

        public FcClient build() throws JdcloudSdkException {

            if (fcClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                fcClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (fcClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("FcClient build error: jdcloud credentials provider not set");
                }
            }
            if (fcClient.httpRequestConfig == null) {
                fcClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (fcClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("FcClient build error: http request config not set");
                }
            }
            return fcClient;
        }

        public Builder environment(Environment environment) {
            fcClient.environment = environment;
            return this;
        }
    }
}
