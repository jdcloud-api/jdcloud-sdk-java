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
 * shards
 */
public class Shards  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分片名
     */
    private String index;

    /**
     * 各个副本域名
     */
    private List<String> replicaDomainNames;


    /**
     * get 分片名
     *
     * @return
     */
    public String getIndex() {
        return index;
    }

    /**
     * set 分片名
     *
     * @param index
     */
    public void setIndex(String index) {
        this.index = index;
    }

    /**
     * get 各个副本域名
     *
     * @return
     */
    public List<String> getReplicaDomainNames() {
        return replicaDomainNames;
    }

    /**
     * set 各个副本域名
     *
     * @param replicaDomainNames
     */
    public void setReplicaDomainNames(List<String> replicaDomainNames) {
        this.replicaDomainNames = replicaDomainNames;
    }


    /**
     * set 分片名
     *
     * @param index
     */
    public Shards index(String index) {
        this.index = index;
        return this;
    }

    /**
     * set 各个副本域名
     *
     * @param replicaDomainNames
     */
    public Shards replicaDomainNames(List<String> replicaDomainNames) {
        this.replicaDomainNames = replicaDomainNames;
        return this;
    }


    /**
     * add item to 各个副本域名
     *
     * @param replicaDomainName
     */
    public void addReplicaDomainName(String replicaDomainName) {
        if (this.replicaDomainNames == null) {
            this.replicaDomainNames = new ArrayList<>();
        }
        this.replicaDomainNames.add(replicaDomainName);
    }

}