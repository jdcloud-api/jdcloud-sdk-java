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

package com.jdcloud.sdk.service.disk.model;


/**
 * sort
 */
public class Sort  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 排序条件的名称
     */
    private String name;

    /**
     * 排序条件的方向 0:升序 1:降序
     */
    private Integer direction;



    /**
     * get 排序条件的名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 排序条件的名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 排序条件的方向 0:升序 1:降序
     *
     * @return
     */
    public Integer getDirection() {
        return direction;
    }

    /**
     * set 排序条件的方向 0:升序 1:降序
     *
     * @param direction
     */
    public void setDirection(Integer direction) {
        this.direction = direction;
    }



    /**
     * set 排序条件的名称
     *
     * @param name
     */
    public Sort name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 排序条件的方向 0:升序 1:降序
     *
     * @param direction
     */
    public Sort direction(Integer direction) {
        this.direction = direction;
        return this;
    }


}