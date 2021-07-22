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

import java.util.List;
import java.util.ArrayList;

/**
 * audioHint
 */
public class AudioHint  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 命中的敏感词或者声纹检测的分值
     */
    private String value;

    /**
     * 命中敏感词或者声纹检测的音频时间点
     */
    private List<SegmentsItem> segments;


    /**
     * get 命中的敏感词或者声纹检测的分值
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set 命中的敏感词或者声纹检测的分值
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * get 命中敏感词或者声纹检测的音频时间点
     *
     * @return
     */
    public List<SegmentsItem> getSegments() {
        return segments;
    }

    /**
     * set 命中敏感词或者声纹检测的音频时间点
     *
     * @param segments
     */
    public void setSegments(List<SegmentsItem> segments) {
        this.segments = segments;
    }


    /**
     * set 命中的敏感词或者声纹检测的分值
     *
     * @param value
     */
    public AudioHint value(String value) {
        this.value = value;
        return this;
    }

    /**
     * set 命中敏感词或者声纹检测的音频时间点
     *
     * @param segments
     */
    public AudioHint segments(List<SegmentsItem> segments) {
        this.segments = segments;
        return this;
    }


    /**
     * add item to 命中敏感词或者声纹检测的音频时间点
     *
     * @param segment
     */
    public void addSegment(SegmentsItem segment) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        this.segments.add(segment);
    }

}