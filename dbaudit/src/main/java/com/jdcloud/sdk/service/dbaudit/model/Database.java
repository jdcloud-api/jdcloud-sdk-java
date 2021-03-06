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

package com.jdcloud.sdk.service.dbaudit.model;


/**
 * 数据库描述
 */
public class Database  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据库ID
     */
    private String dbId;

    /**
     * 数据库名称,长度限制32字节,允许英文字母,数字,下划线,中划线和中文
     */
    private String dbName;

    /**
     * 数据库的描述,长度限制128字节
     */
    private String dbDesc;

    /**
     * 数据库端口
     */
    private Integer dbPort;

    /**
     * 数据库版本
     */
    private String dbVersion;

    /**
     * 数据库类型: 
0-&gt;Oracle
1-&gt;SQLServer
2-&gt;DB2
3-&gt;MySQL
4-&gt;Cache
5-&gt;Sybase
6-&gt;DM7
7-&gt;Informix
9-&gt;人大金仓
10-&gt;Teradata
11-&gt;Postgresql
12-&gt;Gbase
16-&gt;Hive
17-&gt;MongoDB

     */
    private Integer dbType;

    /**
     * 审计端口
     */
    private Integer agentPort;

    /**
     * 数据库地址，如 ip:port 或 域名:port
     */
    private String dbAddr;

    /**
     * 数据库启用状态, 0 停用 1 运行中 2 创建中 3 创建失败
     */
    private Integer state;


    /**
     * get 数据库ID
     *
     * @return
     */
    public String getDbId() {
        return dbId;
    }

    /**
     * set 数据库ID
     *
     * @param dbId
     */
    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    /**
     * get 数据库名称,长度限制32字节,允许英文字母,数字,下划线,中划线和中文
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 数据库名称,长度限制32字节,允许英文字母,数字,下划线,中划线和中文
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * get 数据库的描述,长度限制128字节
     *
     * @return
     */
    public String getDbDesc() {
        return dbDesc;
    }

    /**
     * set 数据库的描述,长度限制128字节
     *
     * @param dbDesc
     */
    public void setDbDesc(String dbDesc) {
        this.dbDesc = dbDesc;
    }

    /**
     * get 数据库端口
     *
     * @return
     */
    public Integer getDbPort() {
        return dbPort;
    }

    /**
     * set 数据库端口
     *
     * @param dbPort
     */
    public void setDbPort(Integer dbPort) {
        this.dbPort = dbPort;
    }

    /**
     * get 数据库版本
     *
     * @return
     */
    public String getDbVersion() {
        return dbVersion;
    }

    /**
     * set 数据库版本
     *
     * @param dbVersion
     */
    public void setDbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
    }

    /**
     * get 数据库类型: 
0-&gt;Oracle
1-&gt;SQLServer
2-&gt;DB2
3-&gt;MySQL
4-&gt;Cache
5-&gt;Sybase
6-&gt;DM7
7-&gt;Informix
9-&gt;人大金仓
10-&gt;Teradata
11-&gt;Postgresql
12-&gt;Gbase
16-&gt;Hive
17-&gt;MongoDB

     *
     * @return
     */
    public Integer getDbType() {
        return dbType;
    }

    /**
     * set 数据库类型: 
0-&gt;Oracle
1-&gt;SQLServer
2-&gt;DB2
3-&gt;MySQL
4-&gt;Cache
5-&gt;Sybase
6-&gt;DM7
7-&gt;Informix
9-&gt;人大金仓
10-&gt;Teradata
11-&gt;Postgresql
12-&gt;Gbase
16-&gt;Hive
17-&gt;MongoDB

     *
     * @param dbType
     */
    public void setDbType(Integer dbType) {
        this.dbType = dbType;
    }

    /**
     * get 审计端口
     *
     * @return
     */
    public Integer getAgentPort() {
        return agentPort;
    }

    /**
     * set 审计端口
     *
     * @param agentPort
     */
    public void setAgentPort(Integer agentPort) {
        this.agentPort = agentPort;
    }

    /**
     * get 数据库地址，如 ip:port 或 域名:port
     *
     * @return
     */
    public String getDbAddr() {
        return dbAddr;
    }

    /**
     * set 数据库地址，如 ip:port 或 域名:port
     *
     * @param dbAddr
     */
    public void setDbAddr(String dbAddr) {
        this.dbAddr = dbAddr;
    }

    /**
     * get 数据库启用状态, 0 停用 1 运行中 2 创建中 3 创建失败
     *
     * @return
     */
    public Integer getState() {
        return state;
    }

    /**
     * set 数据库启用状态, 0 停用 1 运行中 2 创建中 3 创建失败
     *
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }


    /**
     * set 数据库ID
     *
     * @param dbId
     */
    public Database dbId(String dbId) {
        this.dbId = dbId;
        return this;
    }

    /**
     * set 数据库名称,长度限制32字节,允许英文字母,数字,下划线,中划线和中文
     *
     * @param dbName
     */
    public Database dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * set 数据库的描述,长度限制128字节
     *
     * @param dbDesc
     */
    public Database dbDesc(String dbDesc) {
        this.dbDesc = dbDesc;
        return this;
    }

    /**
     * set 数据库端口
     *
     * @param dbPort
     */
    public Database dbPort(Integer dbPort) {
        this.dbPort = dbPort;
        return this;
    }

    /**
     * set 数据库版本
     *
     * @param dbVersion
     */
    public Database dbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
        return this;
    }

    /**
     * set 数据库类型: 
0-&gt;Oracle
1-&gt;SQLServer
2-&gt;DB2
3-&gt;MySQL
4-&gt;Cache
5-&gt;Sybase
6-&gt;DM7
7-&gt;Informix
9-&gt;人大金仓
10-&gt;Teradata
11-&gt;Postgresql
12-&gt;Gbase
16-&gt;Hive
17-&gt;MongoDB

     *
     * @param dbType
     */
    public Database dbType(Integer dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * set 审计端口
     *
     * @param agentPort
     */
    public Database agentPort(Integer agentPort) {
        this.agentPort = agentPort;
        return this;
    }

    /**
     * set 数据库地址，如 ip:port 或 域名:port
     *
     * @param dbAddr
     */
    public Database dbAddr(String dbAddr) {
        this.dbAddr = dbAddr;
        return this;
    }

    /**
     * set 数据库启用状态, 0 停用 1 运行中 2 创建中 3 创建失败
     *
     * @param state
     */
    public Database state(Integer state) {
        this.state = state;
        return this;
    }


}