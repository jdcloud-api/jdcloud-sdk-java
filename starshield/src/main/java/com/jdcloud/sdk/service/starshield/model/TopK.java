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

package com.jdcloud.sdk.service.starshield.model;

import java.util.List;
import java.util.ArrayList;

/**
 * topK
 */
public class TopK  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 排名前K的项。
     */
    
    private List<Item> topK;


    /**
    * get 排名前K的项。
    *
    * @return
    */
    public List<Item> getTopK() {
        return topK;
    }

    /**
    * set 排名前K的项。
    *
    * @param topK
    */
    public void setTopK(List<Item> topK) {
        this.topK = topK;
    }



    /**
    * set 排名前K的项。
    *
    * @param topK
    */
    public TopK topK(List<Item> topK) {
        this.topK = topK;
        return this;
    }



    /**
     * add item to 排名前K的项。
     *
     * @param topK
     */
    public void addTopK(Item topK) {
        if (this.topK == null) {
            this.topK = new ArrayList<>();
        }
        this.topK.add(topK);
    }
}