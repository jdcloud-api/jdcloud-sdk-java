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

package com.jdcloud.sdk.service.censor.model;


/**
 * audioLabelItem
 */
public class AudioLabelItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类信息，100：色情，200：广告，260：广告法，300：暴恐，400：违禁，500：涉政，600：谩骂，1100：涉价值观
     */
    private Integer label;

    /**
     * 分类级别，0：通过，1：嫌疑，2：不通过
     */
    private Integer level;

    /**
     * 细分类，详细编码请参考下方对应细分类编码
     */
    private AudioLabelItemDetail details;

    /**
     * 细分类，详细编码请参考下方对应细分类编码
     */
    private String subLabel;


    /**
     * get 分类信息，100：色情，200：广告，260：广告法，300：暴恐，400：违禁，500：涉政，600：谩骂，1100：涉价值观
     *
     * @return
     */
    public Integer getLabel() {
        return label;
    }

    /**
     * set 分类信息，100：色情，200：广告，260：广告法，300：暴恐，400：违禁，500：涉政，600：谩骂，1100：涉价值观
     *
     * @param label
     */
    public void setLabel(Integer label) {
        this.label = label;
    }

    /**
     * get 分类级别，0：通过，1：嫌疑，2：不通过
     *
     * @return
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * set 分类级别，0：通过，1：嫌疑，2：不通过
     *
     * @param level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * get 细分类，详细编码请参考下方对应细分类编码
     *
     * @return
     */
    public AudioLabelItemDetail getDetails() {
        return details;
    }

    /**
     * set 细分类，详细编码请参考下方对应细分类编码
     *
     * @param details
     */
    public void setDetails(AudioLabelItemDetail details) {
        this.details = details;
    }

    /**
     * get 细分类，详细编码请参考下方对应细分类编码
     *
     * @return
     */
    public String getSubLabel() {
        return subLabel;
    }

    /**
     * set 细分类，详细编码请参考下方对应细分类编码
     *
     * @param subLabel
     */
    public void setSubLabel(String subLabel) {
        this.subLabel = subLabel;
    }


    /**
     * set 分类信息，100：色情，200：广告，260：广告法，300：暴恐，400：违禁，500：涉政，600：谩骂，1100：涉价值观
     *
     * @param label
     */
    public AudioLabelItem label(Integer label) {
        this.label = label;
        return this;
    }

    /**
     * set 分类级别，0：通过，1：嫌疑，2：不通过
     *
     * @param level
     */
    public AudioLabelItem level(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * set 细分类，详细编码请参考下方对应细分类编码
     *
     * @param details
     */
    public AudioLabelItem details(AudioLabelItemDetail details) {
        this.details = details;
        return this;
    }

    /**
     * set 细分类，详细编码请参考下方对应细分类编码
     *
     * @param subLabel
     */
    public AudioLabelItem subLabel(String subLabel) {
        this.subLabel = subLabel;
        return this;
    }


}