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

package com.jdcloud.sdk.service.iam.model;

import java.util.List;
import java.util.ArrayList;

/**
 * conditionMappingVo
 */
public class ConditionMappingVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 条件键Key
     */
    private String conditionKey;

    /**
     * 符合条件键的值列表
     */
    
    private List<String> values;


    /**
     * get 条件键Key
     *
     * @return
     */
    public String getConditionKey() {
        return conditionKey;
    }

    /**
     * set 条件键Key
     *
     * @param conditionKey
     */
    public void setConditionKey(String conditionKey) {
        this.conditionKey = conditionKey;
    }


    /**
    * get 符合条件键的值列表
    *
    * @return
    */
    public List<String> getValues() {
        return values;
    }

    /**
    * set 符合条件键的值列表
    *
    * @param values
    */
    public void setValues(List<String> values) {
        this.values = values;
    }



    /**
     * set 条件键Key
     *
     * @param conditionKey
     */
    public ConditionMappingVo conditionKey(String conditionKey) {
        this.conditionKey = conditionKey;
        return this;
    }


    /**
    * set 符合条件键的值列表
    *
    * @param values
    */
    public ConditionMappingVo values(List<String> values) {
        this.values = values;
        return this;
    }



    /**
     * add item to 符合条件键的值列表
     *
     * @param value
     */
    public void addValue(String value) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(value);
    }
}