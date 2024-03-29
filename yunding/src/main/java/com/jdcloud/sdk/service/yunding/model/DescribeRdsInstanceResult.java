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
 * yunding-rds
 * 云鼎-云数据库管理相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.yunding.model;

import com.jdcloud.sdk.service.yunding.model.DBInstanceAttribute;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询RDS实例（MySQL、SQL Server等）的详细信息以及MySQL只读实例详细信息
 */
public class DescribeRdsInstanceResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dbInstanceAttributes
     */
    private DBInstanceAttribute dbInstanceAttributes;



    /**
     * get dbInstanceAttributes
     *
     * @return
     */
    public DBInstanceAttribute getDbInstanceAttributes() {
        return dbInstanceAttributes;
    }

    /**
     * set dbInstanceAttributes
     *
     * @param dbInstanceAttributes
     */
    public void setDbInstanceAttributes(DBInstanceAttribute dbInstanceAttributes) {
        this.dbInstanceAttributes = dbInstanceAttributes;
    }



    /**
     * set dbInstanceAttributes
     *
     * @param dbInstanceAttributes
     */
    public DescribeRdsInstanceResult dbInstanceAttributes(DBInstanceAttribute dbInstanceAttributes) {
        this.dbInstanceAttributes = dbInstanceAttributes;
        return this;
    }


}