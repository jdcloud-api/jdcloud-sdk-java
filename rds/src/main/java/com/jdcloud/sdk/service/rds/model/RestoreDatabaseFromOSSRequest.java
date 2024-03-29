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
 * 数据库管理
 * 数据库管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 从上传到OSS的备份文件中恢复单个数据库&lt;br&gt;- 仅支持SQL Server
 */
public class RestoreDatabaseFromOSSRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户上传到对象存储OSS上的备份文件的路径。&lt;br&gt;例如用户备份上传的bucket为db_backup，文件为test_server/db1.bak，那么ossULR为db_backup/test_server/db1.bak。&lt;br&gt;**授权说明**：需要授予账户ID：785455908940，对这个bucket的读取权限，具体步骤可以查看[文档](https://docs.jdcloud.com/cn/object-storage-service/set-bucket-policy-2)。
     * Required:true
     */
    @Required
    private String ossURL;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * RDS 实例ID，唯一标识一个RDS实例
     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * 库名称
     * Required:true
     */
    @Required
    private String dbName;



    /**
     * get 用户上传到对象存储OSS上的备份文件的路径。&lt;br&gt;例如用户备份上传的bucket为db_backup，文件为test_server/db1.bak，那么ossULR为db_backup/test_server/db1.bak。&lt;br&gt;**授权说明**：需要授予账户ID：785455908940，对这个bucket的读取权限，具体步骤可以查看[文档](https://docs.jdcloud.com/cn/object-storage-service/set-bucket-policy-2)。
     *
     * @return
     */
    public String getOssURL() {
        return ossURL;
    }

    /**
     * set 用户上传到对象存储OSS上的备份文件的路径。&lt;br&gt;例如用户备份上传的bucket为db_backup，文件为test_server/db1.bak，那么ossULR为db_backup/test_server/db1.bak。&lt;br&gt;**授权说明**：需要授予账户ID：785455908940，对这个bucket的读取权限，具体步骤可以查看[文档](https://docs.jdcloud.com/cn/object-storage-service/set-bucket-policy-2)。
     *
     * @param ossURL
     */
    public void setOssURL(String ossURL) {
        this.ossURL = ossURL;
    }


    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get RDS 实例ID，唯一标识一个RDS实例
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * get 库名称
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 库名称
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }



    /**
     * set 用户上传到对象存储OSS上的备份文件的路径。&lt;br&gt;例如用户备份上传的bucket为db_backup，文件为test_server/db1.bak，那么ossULR为db_backup/test_server/db1.bak。&lt;br&gt;**授权说明**：需要授予账户ID：785455908940，对这个bucket的读取权限，具体步骤可以查看[文档](https://docs.jdcloud.com/cn/object-storage-service/set-bucket-policy-2)。
     *
     * @param ossURL
     */
    public RestoreDatabaseFromOSSRequest ossURL(String ossURL) {
        this.ossURL = ossURL;
        return this;
    }


    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public RestoreDatabaseFromOSSRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public RestoreDatabaseFromOSSRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * set 库名称
     *
     * @param dbName
     */
    public RestoreDatabaseFromOSSRequest dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }


}