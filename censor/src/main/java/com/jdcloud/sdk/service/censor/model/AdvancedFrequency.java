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
 * advancedFrequency
 */
public class AdvancedFrequency  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 视频时长区间分割，单位为秒
     */
    private List<Integer> durationPoints;

    /**
     * 视频时长区间对应的截帧频率，可设置范围为0.5~600秒
     */
    private List<Float> frequencies;


    /**
     * get 视频时长区间分割，单位为秒
     *
     * @return
     */
    public List<Integer> getDurationPoints() {
        return durationPoints;
    }

    /**
     * set 视频时长区间分割，单位为秒
     *
     * @param durationPoints
     */
    public void setDurationPoints(List<Integer> durationPoints) {
        this.durationPoints = durationPoints;
    }

    /**
     * get 视频时长区间对应的截帧频率，可设置范围为0.5~600秒
     *
     * @return
     */
    public List<Float> getFrequencies() {
        return frequencies;
    }

    /**
     * set 视频时长区间对应的截帧频率，可设置范围为0.5~600秒
     *
     * @param frequencies
     */
    public void setFrequencies(List<Float> frequencies) {
        this.frequencies = frequencies;
    }


    /**
     * set 视频时长区间分割，单位为秒
     *
     * @param durationPoints
     */
    public AdvancedFrequency durationPoints(List<Integer> durationPoints) {
        this.durationPoints = durationPoints;
        return this;
    }

    /**
     * set 视频时长区间对应的截帧频率，可设置范围为0.5~600秒
     *
     * @param frequencies
     */
    public AdvancedFrequency frequencies(List<Float> frequencies) {
        this.frequencies = frequencies;
        return this;
    }


    /**
     * add item to 视频时长区间分割，单位为秒
     *
     * @param durationPoint
     */
    public void addDurationPoint(Integer durationPoint) {
        if (this.durationPoints == null) {
            this.durationPoints = new ArrayList<>();
        }
        this.durationPoints.add(durationPoint);
    }

    /**
     * add item to 视频时长区间对应的截帧频率，可设置范围为0.5~600秒
     *
     * @param frequencie
     */
    public void addFrequencie(Float frequencie) {
        if (this.frequencies == null) {
            this.frequencies = new ArrayList<>();
        }
        this.frequencies.add(frequencie);
    }

}