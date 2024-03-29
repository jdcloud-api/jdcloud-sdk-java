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

package com.jdcloud.sdk.service.bastion.model;


/**
 * aZSaleStatusVo
 */
public class AZSaleStatusVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 可用区
     */
    private String label;

    /**
     * 可用区
     */
    private String value;

    /**
     * 是否售罄 (0未售罄 1售罄)
     */
    private Integer canSale;

    /**
     * 是否可见(1可见 0不可见)
     */
    private Integer visible;



    /**
     * get 可用区
     *
     * @return
     */
    public String getLabel() {
        return label;
    }

    /**
     * set 可用区
     *
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }


    /**
     * get 可用区
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set 可用区
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * get 是否售罄 (0未售罄 1售罄)
     *
     * @return
     */
    public Integer getCanSale() {
        return canSale;
    }

    /**
     * set 是否售罄 (0未售罄 1售罄)
     *
     * @param canSale
     */
    public void setCanSale(Integer canSale) {
        this.canSale = canSale;
    }


    /**
     * get 是否可见(1可见 0不可见)
     *
     * @return
     */
    public Integer getVisible() {
        return visible;
    }

    /**
     * set 是否可见(1可见 0不可见)
     *
     * @param visible
     */
    public void setVisible(Integer visible) {
        this.visible = visible;
    }



    /**
     * set 可用区
     *
     * @param label
     */
    public AZSaleStatusVo label(String label) {
        this.label = label;
        return this;
    }


    /**
     * set 可用区
     *
     * @param value
     */
    public AZSaleStatusVo value(String value) {
        this.value = value;
        return this;
    }


    /**
     * set 是否售罄 (0未售罄 1售罄)
     *
     * @param canSale
     */
    public AZSaleStatusVo canSale(Integer canSale) {
        this.canSale = canSale;
        return this;
    }


    /**
     * set 是否可见(1可见 0不可见)
     *
     * @param visible
     */
    public AZSaleStatusVo visible(Integer visible) {
        this.visible = visible;
        return this;
    }


}