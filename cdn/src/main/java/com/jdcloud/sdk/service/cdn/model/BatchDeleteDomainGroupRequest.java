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
 * 域名操作类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 批量删除域名组
 */
public class BatchDeleteDomainGroupRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ids
     * Required:true
     */
    @Required
    
    private List<Long> ids;


    /**
    * get ids
    *
    * @return
    */
    public List<Long> getIds() {
        return ids;
    }

    /**
    * set ids
    *
    * @param ids
    */
    public void setIds(List<Long> ids) {
        this.ids = ids;
    }



    /**
    * set ids
    *
    * @param ids
    */
    public BatchDeleteDomainGroupRequest ids(List<Long> ids) {
        this.ids = ids;
        return this;
    }



    /**
     * add item to ids
     *
     * @param id
     */
    public void addId(Long id) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(id);
    }
}