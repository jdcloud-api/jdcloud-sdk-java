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
 * textResultDetailV2
 */
public class TextResultDetailV2  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 反垃圾结果
     */
    private AntispamResult antispam;

    /**
     * 情感分析结果
     */
    private EmotionAnalysisResult emotionAnalysis;

    /**
     * 反作弊结果
     */
    private AnticheatResult anticheat;


    /**
     * get 反垃圾结果
     *
     * @return
     */
    public AntispamResult getAntispam() {
        return antispam;
    }

    /**
     * set 反垃圾结果
     *
     * @param antispam
     */
    public void setAntispam(AntispamResult antispam) {
        this.antispam = antispam;
    }

    /**
     * get 情感分析结果
     *
     * @return
     */
    public EmotionAnalysisResult getEmotionAnalysis() {
        return emotionAnalysis;
    }

    /**
     * set 情感分析结果
     *
     * @param emotionAnalysis
     */
    public void setEmotionAnalysis(EmotionAnalysisResult emotionAnalysis) {
        this.emotionAnalysis = emotionAnalysis;
    }

    /**
     * get 反作弊结果
     *
     * @return
     */
    public AnticheatResult getAnticheat() {
        return anticheat;
    }

    /**
     * set 反作弊结果
     *
     * @param anticheat
     */
    public void setAnticheat(AnticheatResult anticheat) {
        this.anticheat = anticheat;
    }


    /**
     * set 反垃圾结果
     *
     * @param antispam
     */
    public TextResultDetailV2 antispam(AntispamResult antispam) {
        this.antispam = antispam;
        return this;
    }

    /**
     * set 情感分析结果
     *
     * @param emotionAnalysis
     */
    public TextResultDetailV2 emotionAnalysis(EmotionAnalysisResult emotionAnalysis) {
        this.emotionAnalysis = emotionAnalysis;
        return this;
    }

    /**
     * set 反作弊结果
     *
     * @param anticheat
     */
    public TextResultDetailV2 anticheat(AnticheatResult anticheat) {
        this.anticheat = anticheat;
        return this;
    }


}