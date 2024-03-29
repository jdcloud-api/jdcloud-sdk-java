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

package com.jdcloud.sdk.service.clickhouse.model;

import java.util.List;
import java.util.ArrayList;

/**
 * monitorSpec
 */
public class MonitorSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规格代码
     */
    private List<Flavor> flavors;


    /**
     * get 规格代码
     *
     * @return
     */
    public List<Flavor> getFlavors() {
        return flavors;
    }

    /**
     * set 规格代码
     *
     * @param flavors
     */
    public void setFlavors(List<Flavor> flavors) {
        this.flavors = flavors;
    }


    /**
     * set 规格代码
     *
     * @param flavors
     */
    public MonitorSpec flavors(List<Flavor> flavors) {
        this.flavors = flavors;
        return this;
    }


    /**
     * add item to 规格代码
     *
     * @param flavor
     */
    public void addFlavor(Flavor flavor) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavor);
    }

}