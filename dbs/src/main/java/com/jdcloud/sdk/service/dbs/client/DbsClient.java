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
 * 数据库备份服务 DBS
 * 数据库备份服务
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dbs.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.dbs.model.DeleteBackupPlanRequest;
import com.jdcloud.sdk.service.dbs.model.DeleteBackupPlanResponse;
import com.jdcloud.sdk.service.dbs.client.DeleteBackupPlanExecutor;
import com.jdcloud.sdk.service.dbs.model.InitBackupPlanRequest;
import com.jdcloud.sdk.service.dbs.model.InitBackupPlanResponse;
import com.jdcloud.sdk.service.dbs.client.InitBackupPlanExecutor;
import com.jdcloud.sdk.service.dbs.model.BackupFileRequest;
import com.jdcloud.sdk.service.dbs.model.BackupFileResponse;
import com.jdcloud.sdk.service.dbs.client.BackupFileExecutor;
import com.jdcloud.sdk.service.dbs.model.DescribePhysicalBackupsRequest;
import com.jdcloud.sdk.service.dbs.model.DescribePhysicalBackupsResponse;
import com.jdcloud.sdk.service.dbs.client.DescribePhysicalBackupsExecutor;
import com.jdcloud.sdk.service.dbs.model.DescribeAgentsRequest;
import com.jdcloud.sdk.service.dbs.model.DescribeAgentsResponse;
import com.jdcloud.sdk.service.dbs.client.DescribeAgentsExecutor;
import com.jdcloud.sdk.service.dbs.model.UpdateShouldDelBackupsRequest;
import com.jdcloud.sdk.service.dbs.model.UpdateShouldDelBackupsResponse;
import com.jdcloud.sdk.service.dbs.client.UpdateShouldDelBackupsExecutor;
import com.jdcloud.sdk.service.dbs.model.GetShouldDelBackupsRequest;
import com.jdcloud.sdk.service.dbs.model.GetShouldDelBackupsResponse;
import com.jdcloud.sdk.service.dbs.client.GetShouldDelBackupsExecutor;
import com.jdcloud.sdk.service.dbs.model.RestoreLogicalBackupRequest;
import com.jdcloud.sdk.service.dbs.model.RestoreLogicalBackupResponse;
import com.jdcloud.sdk.service.dbs.client.RestoreLogicalBackupExecutor;
import com.jdcloud.sdk.service.dbs.model.DescribeLogicalBackupsRequest;
import com.jdcloud.sdk.service.dbs.model.DescribeLogicalBackupsResponse;
import com.jdcloud.sdk.service.dbs.client.DescribeLogicalBackupsExecutor;
import com.jdcloud.sdk.service.dbs.model.ReportPrecheckRequest;
import com.jdcloud.sdk.service.dbs.model.ReportPrecheckResponse;
import com.jdcloud.sdk.service.dbs.client.ReportPrecheckExecutor;
import com.jdcloud.sdk.service.dbs.model.DescribePreCheckRequest;
import com.jdcloud.sdk.service.dbs.model.DescribePreCheckResponse;
import com.jdcloud.sdk.service.dbs.client.DescribePreCheckExecutor;
import com.jdcloud.sdk.service.dbs.model.RestorePhysicalBackupRequest;
import com.jdcloud.sdk.service.dbs.model.RestorePhysicalBackupResponse;
import com.jdcloud.sdk.service.dbs.client.RestorePhysicalBackupExecutor;
import com.jdcloud.sdk.service.dbs.model.StartBackupPlanRequest;
import com.jdcloud.sdk.service.dbs.model.StartBackupPlanResponse;
import com.jdcloud.sdk.service.dbs.client.StartBackupPlanExecutor;
import com.jdcloud.sdk.service.dbs.model.ModifyBackupPolicyRequest;
import com.jdcloud.sdk.service.dbs.model.ModifyBackupPolicyResponse;
import com.jdcloud.sdk.service.dbs.client.ModifyBackupPolicyExecutor;
import com.jdcloud.sdk.service.dbs.model.CreateLogicalBackupRequest;
import com.jdcloud.sdk.service.dbs.model.CreateLogicalBackupResponse;
import com.jdcloud.sdk.service.dbs.client.CreateLogicalBackupExecutor;
import com.jdcloud.sdk.service.dbs.model.ModifyTaskRequest;
import com.jdcloud.sdk.service.dbs.model.ModifyTaskResponse;
import com.jdcloud.sdk.service.dbs.client.ModifyTaskExecutor;
import com.jdcloud.sdk.service.dbs.model.DescribeAgentAttributesRequest;
import com.jdcloud.sdk.service.dbs.model.DescribeAgentAttributesResponse;
import com.jdcloud.sdk.service.dbs.client.DescribeAgentAttributesExecutor;
import com.jdcloud.sdk.service.dbs.model.CreateBackupPlanRequest;
import com.jdcloud.sdk.service.dbs.model.CreateBackupPlanResponse;
import com.jdcloud.sdk.service.dbs.client.CreateBackupPlanExecutor;
import com.jdcloud.sdk.service.dbs.model.AgentPlansRequest;
import com.jdcloud.sdk.service.dbs.model.AgentPlansResponse;
import com.jdcloud.sdk.service.dbs.client.AgentPlansExecutor;
import com.jdcloud.sdk.service.dbs.model.DeleteBackupRequest;
import com.jdcloud.sdk.service.dbs.model.DeleteBackupResponse;
import com.jdcloud.sdk.service.dbs.client.DeleteBackupExecutor;
import com.jdcloud.sdk.service.dbs.model.GetLastBackupBinlogRequest;
import com.jdcloud.sdk.service.dbs.model.GetLastBackupBinlogResponse;
import com.jdcloud.sdk.service.dbs.client.GetLastBackupBinlogExecutor;
import com.jdcloud.sdk.service.dbs.model.DescribeBackupPlansRequest;
import com.jdcloud.sdk.service.dbs.model.DescribeBackupPlansResponse;
import com.jdcloud.sdk.service.dbs.client.DescribeBackupPlansExecutor;
import com.jdcloud.sdk.service.dbs.model.DescribeRestoreTasksRequest;
import com.jdcloud.sdk.service.dbs.model.DescribeRestoreTasksResponse;
import com.jdcloud.sdk.service.dbs.client.DescribeRestoreTasksExecutor;
import com.jdcloud.sdk.service.dbs.model.RestoreToTimeRequest;
import com.jdcloud.sdk.service.dbs.model.RestoreToTimeResponse;
import com.jdcloud.sdk.service.dbs.client.RestoreToTimeExecutor;
import com.jdcloud.sdk.service.dbs.model.DescribeBackupPlanAttributesRequest;
import com.jdcloud.sdk.service.dbs.model.DescribeBackupPlanAttributesResponse;
import com.jdcloud.sdk.service.dbs.client.DescribeBackupPlanAttributesExecutor;
import com.jdcloud.sdk.service.dbs.model.DescribeBinlogBackupsRequest;
import com.jdcloud.sdk.service.dbs.model.DescribeBinlogBackupsResponse;
import com.jdcloud.sdk.service.dbs.client.DescribeBinlogBackupsExecutor;
import com.jdcloud.sdk.service.dbs.model.AgentRegisterRequest;
import com.jdcloud.sdk.service.dbs.model.AgentRegisterResponse;
import com.jdcloud.sdk.service.dbs.client.AgentRegisterExecutor;
import com.jdcloud.sdk.service.dbs.model.AgentTasksRequest;
import com.jdcloud.sdk.service.dbs.model.AgentTasksResponse;
import com.jdcloud.sdk.service.dbs.client.AgentTasksExecutor;
import com.jdcloud.sdk.service.dbs.model.CreatePhysicalBackupRequest;
import com.jdcloud.sdk.service.dbs.model.CreatePhysicalBackupResponse;
import com.jdcloud.sdk.service.dbs.client.CreatePhysicalBackupExecutor;
import com.jdcloud.sdk.service.dbs.model.ModifyBackupObjectsRequest;
import com.jdcloud.sdk.service.dbs.model.ModifyBackupObjectsResponse;
import com.jdcloud.sdk.service.dbs.client.ModifyBackupObjectsExecutor;
import com.jdcloud.sdk.service.dbs.model.StopBackupPlanRequest;
import com.jdcloud.sdk.service.dbs.model.StopBackupPlanResponse;
import com.jdcloud.sdk.service.dbs.client.StopBackupPlanExecutor;
import com.jdcloud.sdk.service.dbs.model.ModifySourceEndpointRequest;
import com.jdcloud.sdk.service.dbs.model.ModifySourceEndpointResponse;
import com.jdcloud.sdk.service.dbs.client.ModifySourceEndpointExecutor;
import com.jdcloud.sdk.service.dbs.model.ReportTaskRequest;
import com.jdcloud.sdk.service.dbs.model.ReportTaskResponse;
import com.jdcloud.sdk.service.dbs.client.ReportTaskExecutor;

/**
 * dbsClient
 */
public class DbsClient extends JdcloudClient {

    public final static String ApiVersion = "v2";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.8";
    public final static String DefaultEndpoint = "dbs.jdcloud-api.com";
    public final static String ServiceName = "dbs";
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

    private DbsClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 删除备份计划
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteBackupPlanResponse deleteBackupPlan(DeleteBackupPlanRequest request) throws JdcloudSdkException {
        return new DeleteBackupPlanExecutor().client(this).execute(request);
    }

    /**
     * 初始化备份策略
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public InitBackupPlanResponse initBackupPlan(InitBackupPlanRequest request) throws JdcloudSdkException {
        return new InitBackupPlanExecutor().client(this).execute(request);
    }

    /**
     * 上传备份文件信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public BackupFileResponse backupFile(BackupFileRequest request) throws JdcloudSdkException {
        return new BackupFileExecutor().client(this).execute(request);
    }

    /**
     * 查询所有的物理备份结果
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribePhysicalBackupsResponse describePhysicalBackups(DescribePhysicalBackupsRequest request) throws JdcloudSdkException {
        return new DescribePhysicalBackupsExecutor().client(this).execute(request);
    }

    /**
     * 查询已经注册的所有的 DBS agent
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAgentsResponse describeAgents(DescribeAgentsRequest request) throws JdcloudSdkException {
        return new DescribeAgentsExecutor().client(this).execute(request);
    }

    /**
     * 设置超过保留时长的备份文件的状态为已删除
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateShouldDelBackupsResponse updateShouldDelBackups(UpdateShouldDelBackupsRequest request) throws JdcloudSdkException {
        return new UpdateShouldDelBackupsExecutor().client(this).execute(request);
    }

    /**
     * 获取超过保留时长即需要删除的备份文件
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetShouldDelBackupsResponse getShouldDelBackups(GetShouldDelBackupsRequest request) throws JdcloudSdkException {
        return new GetShouldDelBackupsExecutor().client(this).execute(request);
    }

    /**
     * 根据逻辑备份进行全量恢复
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RestoreLogicalBackupResponse restoreLogicalBackup(RestoreLogicalBackupRequest request) throws JdcloudSdkException {
        return new RestoreLogicalBackupExecutor().client(this).execute(request);
    }

    /**
     * 查询所有的逻辑备份结果
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeLogicalBackupsResponse describeLogicalBackups(DescribeLogicalBackupsRequest request) throws JdcloudSdkException {
        return new DescribeLogicalBackupsExecutor().client(this).execute(request);
    }

    /**
     * 上报预检查结果
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ReportPrecheckResponse reportPrecheck(ReportPrecheckRequest request) throws JdcloudSdkException {
        return new ReportPrecheckExecutor().client(this).execute(request);
    }

    /**
     * 查询预检查任务详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribePreCheckResponse describePreCheck(DescribePreCheckRequest request) throws JdcloudSdkException {
        return new DescribePreCheckExecutor().client(this).execute(request);
    }

    /**
     * 根据物理备份进行全量恢复
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RestorePhysicalBackupResponse restorePhysicalBackup(RestorePhysicalBackupRequest request) throws JdcloudSdkException {
        return new RestorePhysicalBackupExecutor().client(this).execute(request);
    }

    /**
     * 启动备份计划
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StartBackupPlanResponse startBackupPlan(StartBackupPlanRequest request) throws JdcloudSdkException {
        return new StartBackupPlanExecutor().client(this).execute(request);
    }

    /**
     * 修改备份策略
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws JdcloudSdkException {
        return new ModifyBackupPolicyExecutor().client(this).execute(request);
    }

    /**
     * 手动触发逻辑备份
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateLogicalBackupResponse createLogicalBackup(CreateLogicalBackupRequest request) throws JdcloudSdkException {
        return new CreateLogicalBackupExecutor().client(this).execute(request);
    }

    /**
     * 修改任务状态
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyTaskResponse modifyTask(ModifyTaskRequest request) throws JdcloudSdkException {
        return new ModifyTaskExecutor().client(this).execute(request);
    }

    /**
     * 查询 agent 详细信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAgentAttributesResponse describeAgentAttributes(DescribeAgentAttributesRequest request) throws JdcloudSdkException {
        return new DescribeAgentAttributesExecutor().client(this).execute(request);
    }

    /**
     * 创建备份计划
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateBackupPlanResponse createBackupPlan(CreateBackupPlanRequest request) throws JdcloudSdkException {
        return new CreateBackupPlanExecutor().client(this).execute(request);
    }

    /**
     * 获取agent的备份计划
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AgentPlansResponse agentPlans(AgentPlansRequest request) throws JdcloudSdkException {
        return new AgentPlansExecutor().client(this).execute(request);
    }

    /**
     * 删除手动触发生成的备份文件
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteBackupResponse deleteBackup(DeleteBackupRequest request) throws JdcloudSdkException {
        return new DeleteBackupExecutor().client(this).execute(request);
    }

    /**
     * 获取该备份计划最近备份成功的 binlog 文件
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetLastBackupBinlogResponse getLastBackupBinlog(GetLastBackupBinlogRequest request) throws JdcloudSdkException {
        return new GetLastBackupBinlogExecutor().client(this).execute(request);
    }

    /**
     * 查询备份计划概要
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeBackupPlansResponse describeBackupPlans(DescribeBackupPlansRequest request) throws JdcloudSdkException {
        return new DescribeBackupPlansExecutor().client(this).execute(request);
    }

    /**
     * 查询当前备份计划下最近1年的恢复任务，按创建任务时间倒序排列
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeRestoreTasksResponse describeRestoreTasks(DescribeRestoreTasksRequest request) throws JdcloudSdkException {
        return new DescribeRestoreTasksExecutor().client(this).execute(request);
    }

    /**
     * 将数据库实例根据物理备份和binlog备份恢复到指定的时间点。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RestoreToTimeResponse restoreToTime(RestoreToTimeRequest request) throws JdcloudSdkException {
        return new RestoreToTimeExecutor().client(this).execute(request);
    }

    /**
     * 查询备份计划详细信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeBackupPlanAttributesResponse describeBackupPlanAttributes(DescribeBackupPlanAttributesRequest request) throws JdcloudSdkException {
        return new DescribeBackupPlanAttributesExecutor().client(this).execute(request);
    }

    /**
     * 查询所有的binlog备份结果
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeBinlogBackupsResponse describeBinlogBackups(DescribeBinlogBackupsRequest request) throws JdcloudSdkException {
        return new DescribeBinlogBackupsExecutor().client(this).execute(request);
    }

    /**
     * Agent 注册接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AgentRegisterResponse agentRegister(AgentRegisterRequest request) throws JdcloudSdkException {
        return new AgentRegisterExecutor().client(this).execute(request);
    }

    /**
     * 获取agent的任务
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AgentTasksResponse agentTasks(AgentTasksRequest request) throws JdcloudSdkException {
        return new AgentTasksExecutor().client(this).execute(request);
    }

    /**
     * 手动触发物理备份
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreatePhysicalBackupResponse createPhysicalBackup(CreatePhysicalBackupRequest request) throws JdcloudSdkException {
        return new CreatePhysicalBackupExecutor().client(this).execute(request);
    }

    /**
     * 修改备份策略之逻辑备份的库表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyBackupObjectsResponse modifyBackupObjects(ModifyBackupObjectsRequest request) throws JdcloudSdkException {
        return new ModifyBackupObjectsExecutor().client(this).execute(request);
    }

    /**
     * 停止备份计划
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StopBackupPlanResponse stopBackupPlan(StopBackupPlanRequest request) throws JdcloudSdkException {
        return new StopBackupPlanExecutor().client(this).execute(request);
    }

    /**
     * 修改备份策略之数据源的账号密码等
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifySourceEndpointResponse modifySourceEndpoint(ModifySourceEndpointRequest request) throws JdcloudSdkException {
        return new ModifySourceEndpointExecutor().client(this).execute(request);
    }

    /**
     * 上报任务的状态
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ReportTaskResponse reportTask(ReportTaskRequest request) throws JdcloudSdkException {
        return new ReportTaskExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public DbsClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private DbsClient dbsClient;

        public DefaultBuilder() {
            dbsClient = new DbsClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            dbsClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            dbsClient.httpRequestConfig = config;
            return this;
        }

        public DbsClient build() throws JdcloudSdkException {

            if (dbsClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                dbsClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (dbsClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("DbsClient build error: jdcloud credentials provider not set");
                }
            }
            if (dbsClient.httpRequestConfig == null) {
                dbsClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (dbsClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("DbsClient build error: http request config not set");
                }
            }
            return dbsClient;
        }

        public Builder environment(Environment environment) {
            dbsClient.environment = environment;
            return this;
        }
    }
}