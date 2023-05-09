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
 * Log-Analytics
 * Analytics data for a zone/instance
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.starshield.model.Item;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 分组统计。
 */
public class GroupByResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * items
     */
    
    private List<Item> items;


    /**
    * get items
    *
    * @return
    */
    public List<Item> getItems() {
        return items;
    }

    /**
    * set items
    *
    * @param items
    */
    public void setItems(List<Item> items) {
        this.items = items;
    }



    /**
    * set items
    *
    * @param items
    */
    public GroupByResult items(List<Item> items) {
        this.items = items;
        return this;
    }



    /**
     * add item to items
     *
     * @param item
     */
    public void addItem(Item item) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(item);
    }
}