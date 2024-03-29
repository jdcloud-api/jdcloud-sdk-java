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

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;

/**
 * numa
 */
public class Numa  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * numa id
     */
    private Integer id;

    /**
     * cpus of numa
     */
    
    private List<Core> cores;


    /**
     * get numa id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set numa id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
    * get cpus of numa
    *
    * @return
    */
    public List<Core> getCores() {
        return cores;
    }

    /**
    * set cpus of numa
    *
    * @param cores
    */
    public void setCores(List<Core> cores) {
        this.cores = cores;
    }



    /**
     * set numa id
     *
     * @param id
     */
    public Numa id(Integer id) {
        this.id = id;
        return this;
    }


    /**
    * set cpus of numa
    *
    * @param cores
    */
    public Numa cores(List<Core> cores) {
        this.cores = cores;
        return this;
    }



    /**
     * add item to cpus of numa
     *
     * @param core
     */
    public void addCore(Core core) {
        if (this.cores == null) {
            this.cores = new ArrayList<>();
        }
        this.cores.add(core);
    }
}