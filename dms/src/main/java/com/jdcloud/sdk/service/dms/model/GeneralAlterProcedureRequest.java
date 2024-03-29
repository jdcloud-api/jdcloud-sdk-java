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
 * DmsProcedure
 * 存储过程相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dms.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 生成修改存储过程sql语句，支持Mysql
 */
public class GeneralAlterProcedureRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据源id
     */
    private Integer dataSourceId;

    /**
     * 数据库名称。
     */
    private String dbName;

    /**
     * 原存储过程名称。
     */
    private String originProcedureName;

    /**
     * 存储过程名称。
     */
    private String procedureName;

    /**
     * 定义者。
     */
    private String definer;

    /**
     * 安全性，DEFAULT(&quot;DEFAULT&quot;, 1),DEFINER(&quot;DEFINER&quot;, 2), INVOKER(&quot;INVOKER&quot;, 3);
     */
    private String procedureSecurity;

    /**
     * 数据访问，DEFAULT(&quot;DEFAULT&quot;, 1),NO_SQL(&quot;NO_SQL&quot;, 2), CONTAINS_SQL(&quot;CONTAINS_SQL&quot;, 3), READS_SQL_DATA(&quot;READS_SQL_DATA&quot;, 4), MODIFIES_SQL_DATA(&quot;MODIFIES_SQL_DATA&quot;, 5);
     */
    private String dataAccess;

    /**
     * 确定性。
     */
    private Boolean deterministic;

    /**
     * 存储过程定义SQL。
     */
    private String definitionSql;

    /**
     * 创建存储过程定义完整SQL。
     */
    private String completeSql;

    /**
     * 参数列表。
     */
    
    private List<Parameter> parameters;
    /**
     * 注释
     */
    private String comment;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 数据源id
     *
     * @return
     */
    public Integer getDataSourceId() {
        return dataSourceId;
    }

    /**
     * set 数据源id
     *
     * @param dataSourceId
     */
    public void setDataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
    }


    /**
     * get 数据库名称。
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 数据库名称。
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }


    /**
     * get 原存储过程名称。
     *
     * @return
     */
    public String getOriginProcedureName() {
        return originProcedureName;
    }

    /**
     * set 原存储过程名称。
     *
     * @param originProcedureName
     */
    public void setOriginProcedureName(String originProcedureName) {
        this.originProcedureName = originProcedureName;
    }


    /**
     * get 存储过程名称。
     *
     * @return
     */
    public String getProcedureName() {
        return procedureName;
    }

    /**
     * set 存储过程名称。
     *
     * @param procedureName
     */
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }


    /**
     * get 定义者。
     *
     * @return
     */
    public String getDefiner() {
        return definer;
    }

    /**
     * set 定义者。
     *
     * @param definer
     */
    public void setDefiner(String definer) {
        this.definer = definer;
    }


    /**
     * get 安全性，DEFAULT(&quot;DEFAULT&quot;, 1),DEFINER(&quot;DEFINER&quot;, 2), INVOKER(&quot;INVOKER&quot;, 3);
     *
     * @return
     */
    public String getProcedureSecurity() {
        return procedureSecurity;
    }

    /**
     * set 安全性，DEFAULT(&quot;DEFAULT&quot;, 1),DEFINER(&quot;DEFINER&quot;, 2), INVOKER(&quot;INVOKER&quot;, 3);
     *
     * @param procedureSecurity
     */
    public void setProcedureSecurity(String procedureSecurity) {
        this.procedureSecurity = procedureSecurity;
    }


    /**
     * get 数据访问，DEFAULT(&quot;DEFAULT&quot;, 1),NO_SQL(&quot;NO_SQL&quot;, 2), CONTAINS_SQL(&quot;CONTAINS_SQL&quot;, 3), READS_SQL_DATA(&quot;READS_SQL_DATA&quot;, 4), MODIFIES_SQL_DATA(&quot;MODIFIES_SQL_DATA&quot;, 5);
     *
     * @return
     */
    public String getDataAccess() {
        return dataAccess;
    }

    /**
     * set 数据访问，DEFAULT(&quot;DEFAULT&quot;, 1),NO_SQL(&quot;NO_SQL&quot;, 2), CONTAINS_SQL(&quot;CONTAINS_SQL&quot;, 3), READS_SQL_DATA(&quot;READS_SQL_DATA&quot;, 4), MODIFIES_SQL_DATA(&quot;MODIFIES_SQL_DATA&quot;, 5);
     *
     * @param dataAccess
     */
    public void setDataAccess(String dataAccess) {
        this.dataAccess = dataAccess;
    }


    /**
     * get 确定性。
     *
     * @return
     */
    public Boolean getDeterministic() {
        return deterministic;
    }

    /**
     * set 确定性。
     *
     * @param deterministic
     */
    public void setDeterministic(Boolean deterministic) {
        this.deterministic = deterministic;
    }


    /**
     * get 存储过程定义SQL。
     *
     * @return
     */
    public String getDefinitionSql() {
        return definitionSql;
    }

    /**
     * set 存储过程定义SQL。
     *
     * @param definitionSql
     */
    public void setDefinitionSql(String definitionSql) {
        this.definitionSql = definitionSql;
    }


    /**
     * get 创建存储过程定义完整SQL。
     *
     * @return
     */
    public String getCompleteSql() {
        return completeSql;
    }

    /**
     * set 创建存储过程定义完整SQL。
     *
     * @param completeSql
     */
    public void setCompleteSql(String completeSql) {
        this.completeSql = completeSql;
    }


    /**
    * get 参数列表。
    *
    * @return
    */
    public List<Parameter> getParameters() {
        return parameters;
    }

    /**
    * set 参数列表。
    *
    * @param parameters
    */
    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }


    /**
     * get 注释
     *
     * @return
     */
    public String getComment() {
        return comment;
    }

    /**
     * set 注释
     *
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
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
     * set 数据源id
     *
     * @param dataSourceId
     */
    public GeneralAlterProcedureRequest dataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }


    /**
     * set 数据库名称。
     *
     * @param dbName
     */
    public GeneralAlterProcedureRequest dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }


    /**
     * set 原存储过程名称。
     *
     * @param originProcedureName
     */
    public GeneralAlterProcedureRequest originProcedureName(String originProcedureName) {
        this.originProcedureName = originProcedureName;
        return this;
    }


    /**
     * set 存储过程名称。
     *
     * @param procedureName
     */
    public GeneralAlterProcedureRequest procedureName(String procedureName) {
        this.procedureName = procedureName;
        return this;
    }


    /**
     * set 定义者。
     *
     * @param definer
     */
    public GeneralAlterProcedureRequest definer(String definer) {
        this.definer = definer;
        return this;
    }


    /**
     * set 安全性，DEFAULT(&quot;DEFAULT&quot;, 1),DEFINER(&quot;DEFINER&quot;, 2), INVOKER(&quot;INVOKER&quot;, 3);
     *
     * @param procedureSecurity
     */
    public GeneralAlterProcedureRequest procedureSecurity(String procedureSecurity) {
        this.procedureSecurity = procedureSecurity;
        return this;
    }


    /**
     * set 数据访问，DEFAULT(&quot;DEFAULT&quot;, 1),NO_SQL(&quot;NO_SQL&quot;, 2), CONTAINS_SQL(&quot;CONTAINS_SQL&quot;, 3), READS_SQL_DATA(&quot;READS_SQL_DATA&quot;, 4), MODIFIES_SQL_DATA(&quot;MODIFIES_SQL_DATA&quot;, 5);
     *
     * @param dataAccess
     */
    public GeneralAlterProcedureRequest dataAccess(String dataAccess) {
        this.dataAccess = dataAccess;
        return this;
    }


    /**
     * set 确定性。
     *
     * @param deterministic
     */
    public GeneralAlterProcedureRequest deterministic(Boolean deterministic) {
        this.deterministic = deterministic;
        return this;
    }


    /**
     * set 存储过程定义SQL。
     *
     * @param definitionSql
     */
    public GeneralAlterProcedureRequest definitionSql(String definitionSql) {
        this.definitionSql = definitionSql;
        return this;
    }


    /**
     * set 创建存储过程定义完整SQL。
     *
     * @param completeSql
     */
    public GeneralAlterProcedureRequest completeSql(String completeSql) {
        this.completeSql = completeSql;
        return this;
    }


    /**
    * set 参数列表。
    *
    * @param parameters
    */
    public GeneralAlterProcedureRequest parameters(List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }


    /**
     * set 注释
     *
     * @param comment
     */
    public GeneralAlterProcedureRequest comment(String comment) {
        this.comment = comment;
        return this;
    }


    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public GeneralAlterProcedureRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to 参数列表。
     *
     * @param parameter
     */
    public void addParameter(Parameter parameter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parameter);
    }
}