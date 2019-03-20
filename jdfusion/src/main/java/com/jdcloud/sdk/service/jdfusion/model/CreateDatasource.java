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

package com.jdcloud.sdk.service.jdfusion.model;


/**
 * createDatasource
 */
public class CreateDatasource  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * datasource
     */
    private DatasourceInfo datasource;


    /**
     * get datasource
     *
     * @return
     */
    public DatasourceInfo getDatasource() {
        return datasource;
    }

    /**
     * set datasource
     *
     * @param datasource
     */
    public void setDatasource(DatasourceInfo datasource) {
        this.datasource = datasource;
    }


    /**
     * set datasource
     *
     * @param datasource
     */
    public CreateDatasource datasource(DatasourceInfo datasource) {
        this.datasource = datasource;
        return this;
    }


}