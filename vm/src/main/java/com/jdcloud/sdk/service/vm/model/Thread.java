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


/**
 * thread
 */
public class Thread  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * cpu id
     */
    private Integer id;

    /**
     * physical cpu pinned to
     */
    private String pin;



    /**
     * get cpu id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set cpu id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * get physical cpu pinned to
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set physical cpu pinned to
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }



    /**
     * set cpu id
     *
     * @param id
     */
    public Thread id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set physical cpu pinned to
     *
     * @param pin
     */
    public Thread pin(String pin) {
        this.pin = pin;
        return this;
    }


}