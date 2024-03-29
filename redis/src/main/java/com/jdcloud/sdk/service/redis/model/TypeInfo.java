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

package com.jdcloud.sdk.service.redis.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 类型信息
 */
public class TypeInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例类型：目前支持标准版（master-slave）、集群版（cluster）
     */
    private String instanceType;

    /**
     * 规格列表
     */
    
    private List<SpecInfo> specs;


    /**
     * get 实例类型：目前支持标准版（master-slave）、集群版（cluster）
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例类型：目前支持标准版（master-slave）、集群版（cluster）
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }


    /**
    * get 规格列表
    *
    * @return
    */
    public List<SpecInfo> getSpecs() {
        return specs;
    }

    /**
    * set 规格列表
    *
    * @param specs
    */
    public void setSpecs(List<SpecInfo> specs) {
        this.specs = specs;
    }



    /**
     * set 实例类型：目前支持标准版（master-slave）、集群版（cluster）
     *
     * @param instanceType
     */
    public TypeInfo instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }


    /**
    * set 规格列表
    *
    * @param specs
    */
    public TypeInfo specs(List<SpecInfo> specs) {
        this.specs = specs;
        return this;
    }



    /**
     * add item to 规格列表
     *
     * @param spec
     */
    public void addSpec(SpecInfo spec) {
        if (this.specs == null) {
            this.specs = new ArrayList<>();
        }
        this.specs.add(spec);
    }
}