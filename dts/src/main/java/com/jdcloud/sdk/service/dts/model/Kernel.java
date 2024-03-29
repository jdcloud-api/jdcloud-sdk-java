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

package com.jdcloud.sdk.service.dts.model;


/**
 * kernel
 */
public class Kernel  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Kernel 名称
     */
    private String name;

    /**
     * topology详情
     */
    private Object topology;

    /**
     * configurationOption
     */
    private ConfigurationOption configurationOption;

    /**
     * columnOption
     */
    private ColumnOption columnOption;



    /**
     * get Kernel 名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set Kernel 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get topology详情
     *
     * @return
     */
    public Object getTopology() {
        return topology;
    }

    /**
     * set topology详情
     *
     * @param topology
     */
    public void setTopology(Object topology) {
        this.topology = topology;
    }


    /**
     * get configurationOption
     *
     * @return
     */
    public ConfigurationOption getConfigurationOption() {
        return configurationOption;
    }

    /**
     * set configurationOption
     *
     * @param configurationOption
     */
    public void setConfigurationOption(ConfigurationOption configurationOption) {
        this.configurationOption = configurationOption;
    }


    /**
     * get columnOption
     *
     * @return
     */
    public ColumnOption getColumnOption() {
        return columnOption;
    }

    /**
     * set columnOption
     *
     * @param columnOption
     */
    public void setColumnOption(ColumnOption columnOption) {
        this.columnOption = columnOption;
    }



    /**
     * set Kernel 名称
     *
     * @param name
     */
    public Kernel name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set topology详情
     *
     * @param topology
     */
    public Kernel topology(Object topology) {
        this.topology = topology;
        return this;
    }


    /**
     * set configurationOption
     *
     * @param configurationOption
     */
    public Kernel configurationOption(ConfigurationOption configurationOption) {
        this.configurationOption = configurationOption;
        return this;
    }


    /**
     * set columnOption
     *
     * @param columnOption
     */
    public Kernel columnOption(ColumnOption columnOption) {
        this.columnOption = columnOption;
        return this;
    }


}