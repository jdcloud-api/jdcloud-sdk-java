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
 * SCDN相关接口
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
import com.jdcloud.sdk.service.cdn.model.WafRegionsModel;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询waf地域信息
 */
public class QueryWafRegionsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * china
     */
    
    private List<WafRegionsModel> china;
    /**
     * foreign
     */
    
    private List<WafRegionsModel> foreign;


    /**
    * get china
    *
    * @return
    */
    public List<WafRegionsModel> getChina() {
        return china;
    }

    /**
    * set china
    *
    * @param china
    */
    public void setChina(List<WafRegionsModel> china) {
        this.china = china;
    }


    /**
    * get foreign
    *
    * @return
    */
    public List<WafRegionsModel> getForeign() {
        return foreign;
    }

    /**
    * set foreign
    *
    * @param foreign
    */
    public void setForeign(List<WafRegionsModel> foreign) {
        this.foreign = foreign;
    }



    /**
    * set china
    *
    * @param china
    */
    public QueryWafRegionsResult china(List<WafRegionsModel> china) {
        this.china = china;
        return this;
    }


    /**
    * set foreign
    *
    * @param foreign
    */
    public QueryWafRegionsResult foreign(List<WafRegionsModel> foreign) {
        this.foreign = foreign;
        return this;
    }



    /**
     * add item to china
     *
     * @param china
     */
    public void addChina(WafRegionsModel china) {
        if (this.china == null) {
            this.china = new ArrayList<>();
        }
        this.china.add(china);
    }

    /**
     * add item to foreign
     *
     * @param foreign
     */
    public void addForeign(WafRegionsModel foreign) {
        if (this.foreign == null) {
            this.foreign = new ArrayList<>();
        }
        this.foreign.add(foreign);
    }
}