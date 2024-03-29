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

package com.jdcloud.sdk.service.dh.model;

import java.util.List;
import java.util.ArrayList;

/**
 * socket
 */
public class Socket  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * socket id
     */
    private Integer id;

    /**
     * cores of socket
     */
    
    private List<Core> cores;


    /**
     * get socket id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set socket id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
    * get cores of socket
    *
    * @return
    */
    public List<Core> getCores() {
        return cores;
    }

    /**
    * set cores of socket
    *
    * @param cores
    */
    public void setCores(List<Core> cores) {
        this.cores = cores;
    }



    /**
     * set socket id
     *
     * @param id
     */
    public Socket id(Integer id) {
        this.id = id;
        return this;
    }


    /**
    * set cores of socket
    *
    * @param cores
    */
    public Socket cores(List<Core> cores) {
        this.cores = cores;
        return this;
    }



    /**
     * add item to cores of socket
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