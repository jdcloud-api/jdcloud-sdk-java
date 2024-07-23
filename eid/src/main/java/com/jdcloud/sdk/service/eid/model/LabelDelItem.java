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

package com.jdcloud.sdk.service.eid.model;


/**
 * labelDelItem
 */
public class LabelDelItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标签id
     */
    private Integer ids;



    /**
     * get 标签id
     *
     * @return
     */
    public Integer getIds() {
        return ids;
    }

    /**
     * set 标签id
     *
     * @param ids
     */
    public void setIds(Integer ids) {
        this.ids = ids;
    }



    /**
     * set 标签id
     *
     * @param ids
     */
    public LabelDelItem ids(Integer ids) {
        this.ids = ids;
        return this;
    }


}