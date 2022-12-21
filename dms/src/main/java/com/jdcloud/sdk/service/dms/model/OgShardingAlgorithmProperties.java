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

package com.jdcloud.sdk.service.dms.model;


/**
 * ogShardingAlgorithmProperties
 */
public class OgShardingAlgorithmProperties  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 算法名称 MOD:取模,HASH_MOD:哈希取模,VOLUME_RANGE:基于分片容量的范围分片算法,BOUNDARY_RANGE:基于分片边界的范围分片算法,AUTO_INTERVAL:自动时间段分片算法。
     */
    private String shardingAlgorithmType;

    /**
     * 切分数量，算法为MOD/HASH_MOD时传入。
     */
    private Integer shardingCount;

    /**
     * 开始范围，算法为VOLUME_RANGE时传入。
     */
    private Integer rangeLower;

    /**
     * 终止范围，算法为VOLUME_RANGE时传入。
     */
    private Integer rangeUpper;

    /**
     * 范围分片容量，算法为VOLUME_RANGE时传入。
     */
    private Integer shardingVolume;

    /**
     * 分片范围边界，算法为BOUNDARY_RANGE时传入。
     */
    private String shardingRanges;

    /**
     * 开始时间，算法为AUTO_INTERVAL/INTERVAL时传入。
     */
    private String dateTimeLower;

    /**
     * 结束时间，算法为AUTO_INTERVAL/INTERVAL时传入。
     */
    private String dateTimeUpper;

    /**
     * 单一分片能承载的最大时间，算法为AUTO_INTERVAL时传入，单位为秒。
     */
    private Integer shardingSeconds;

    /**
     * 是否容许在线切分查询，算法为inline时传入（非必须）。
     */
    private Boolean allowRangeQueryWithInlineSharding;

    /**
     * 时间格式，算法为interval时传入(分表后缀 传yyyy/yyyyMM/yyyyMMdd....)。
     */
    private String datetimePattern;

    /**
     * 后缀模式，算法为interval时传入(分表后缀 传yyyy/yyyyMM/yyyyMMdd)。
     */
    private String shardingSuffixPattern;

    /**
     * 分片时间间隔数量，算法为interval时传入。
     */
    private Integer dateTimeIntervalAmount;

    /**
     * 分片时间间隔单位，算法为interval时传入（YEARS/MONTHS/WEEKS/DAYS/HOURS/MINUTES/SECONDS）。
     */
    private String dateTimeIntervalUnit;



    /**
     * get 算法名称 MOD:取模,HASH_MOD:哈希取模,VOLUME_RANGE:基于分片容量的范围分片算法,BOUNDARY_RANGE:基于分片边界的范围分片算法,AUTO_INTERVAL:自动时间段分片算法。
     *
     * @return
     */
    public String getShardingAlgorithmType() {
        return shardingAlgorithmType;
    }

    /**
     * set 算法名称 MOD:取模,HASH_MOD:哈希取模,VOLUME_RANGE:基于分片容量的范围分片算法,BOUNDARY_RANGE:基于分片边界的范围分片算法,AUTO_INTERVAL:自动时间段分片算法。
     *
     * @param shardingAlgorithmType
     */
    public void setShardingAlgorithmType(String shardingAlgorithmType) {
        this.shardingAlgorithmType = shardingAlgorithmType;
    }


    /**
     * get 切分数量，算法为MOD/HASH_MOD时传入。
     *
     * @return
     */
    public Integer getShardingCount() {
        return shardingCount;
    }

    /**
     * set 切分数量，算法为MOD/HASH_MOD时传入。
     *
     * @param shardingCount
     */
    public void setShardingCount(Integer shardingCount) {
        this.shardingCount = shardingCount;
    }


    /**
     * get 开始范围，算法为VOLUME_RANGE时传入。
     *
     * @return
     */
    public Integer getRangeLower() {
        return rangeLower;
    }

    /**
     * set 开始范围，算法为VOLUME_RANGE时传入。
     *
     * @param rangeLower
     */
    public void setRangeLower(Integer rangeLower) {
        this.rangeLower = rangeLower;
    }


    /**
     * get 终止范围，算法为VOLUME_RANGE时传入。
     *
     * @return
     */
    public Integer getRangeUpper() {
        return rangeUpper;
    }

    /**
     * set 终止范围，算法为VOLUME_RANGE时传入。
     *
     * @param rangeUpper
     */
    public void setRangeUpper(Integer rangeUpper) {
        this.rangeUpper = rangeUpper;
    }


    /**
     * get 范围分片容量，算法为VOLUME_RANGE时传入。
     *
     * @return
     */
    public Integer getShardingVolume() {
        return shardingVolume;
    }

    /**
     * set 范围分片容量，算法为VOLUME_RANGE时传入。
     *
     * @param shardingVolume
     */
    public void setShardingVolume(Integer shardingVolume) {
        this.shardingVolume = shardingVolume;
    }


    /**
     * get 分片范围边界，算法为BOUNDARY_RANGE时传入。
     *
     * @return
     */
    public String getShardingRanges() {
        return shardingRanges;
    }

    /**
     * set 分片范围边界，算法为BOUNDARY_RANGE时传入。
     *
     * @param shardingRanges
     */
    public void setShardingRanges(String shardingRanges) {
        this.shardingRanges = shardingRanges;
    }


    /**
     * get 开始时间，算法为AUTO_INTERVAL/INTERVAL时传入。
     *
     * @return
     */
    public String getDateTimeLower() {
        return dateTimeLower;
    }

    /**
     * set 开始时间，算法为AUTO_INTERVAL/INTERVAL时传入。
     *
     * @param dateTimeLower
     */
    public void setDateTimeLower(String dateTimeLower) {
        this.dateTimeLower = dateTimeLower;
    }


    /**
     * get 结束时间，算法为AUTO_INTERVAL/INTERVAL时传入。
     *
     * @return
     */
    public String getDateTimeUpper() {
        return dateTimeUpper;
    }

    /**
     * set 结束时间，算法为AUTO_INTERVAL/INTERVAL时传入。
     *
     * @param dateTimeUpper
     */
    public void setDateTimeUpper(String dateTimeUpper) {
        this.dateTimeUpper = dateTimeUpper;
    }


    /**
     * get 单一分片能承载的最大时间，算法为AUTO_INTERVAL时传入，单位为秒。
     *
     * @return
     */
    public Integer getShardingSeconds() {
        return shardingSeconds;
    }

    /**
     * set 单一分片能承载的最大时间，算法为AUTO_INTERVAL时传入，单位为秒。
     *
     * @param shardingSeconds
     */
    public void setShardingSeconds(Integer shardingSeconds) {
        this.shardingSeconds = shardingSeconds;
    }


    /**
     * get 是否容许在线切分查询，算法为inline时传入（非必须）。
     *
     * @return
     */
    public Boolean getAllowRangeQueryWithInlineSharding() {
        return allowRangeQueryWithInlineSharding;
    }

    /**
     * set 是否容许在线切分查询，算法为inline时传入（非必须）。
     *
     * @param allowRangeQueryWithInlineSharding
     */
    public void setAllowRangeQueryWithInlineSharding(Boolean allowRangeQueryWithInlineSharding) {
        this.allowRangeQueryWithInlineSharding = allowRangeQueryWithInlineSharding;
    }


    /**
     * get 时间格式，算法为interval时传入(分表后缀 传yyyy/yyyyMM/yyyyMMdd....)。
     *
     * @return
     */
    public String getDatetimePattern() {
        return datetimePattern;
    }

    /**
     * set 时间格式，算法为interval时传入(分表后缀 传yyyy/yyyyMM/yyyyMMdd....)。
     *
     * @param datetimePattern
     */
    public void setDatetimePattern(String datetimePattern) {
        this.datetimePattern = datetimePattern;
    }


    /**
     * get 后缀模式，算法为interval时传入(分表后缀 传yyyy/yyyyMM/yyyyMMdd)。
     *
     * @return
     */
    public String getShardingSuffixPattern() {
        return shardingSuffixPattern;
    }

    /**
     * set 后缀模式，算法为interval时传入(分表后缀 传yyyy/yyyyMM/yyyyMMdd)。
     *
     * @param shardingSuffixPattern
     */
    public void setShardingSuffixPattern(String shardingSuffixPattern) {
        this.shardingSuffixPattern = shardingSuffixPattern;
    }


    /**
     * get 分片时间间隔数量，算法为interval时传入。
     *
     * @return
     */
    public Integer getDateTimeIntervalAmount() {
        return dateTimeIntervalAmount;
    }

    /**
     * set 分片时间间隔数量，算法为interval时传入。
     *
     * @param dateTimeIntervalAmount
     */
    public void setDateTimeIntervalAmount(Integer dateTimeIntervalAmount) {
        this.dateTimeIntervalAmount = dateTimeIntervalAmount;
    }


    /**
     * get 分片时间间隔单位，算法为interval时传入（YEARS/MONTHS/WEEKS/DAYS/HOURS/MINUTES/SECONDS）。
     *
     * @return
     */
    public String getDateTimeIntervalUnit() {
        return dateTimeIntervalUnit;
    }

    /**
     * set 分片时间间隔单位，算法为interval时传入（YEARS/MONTHS/WEEKS/DAYS/HOURS/MINUTES/SECONDS）。
     *
     * @param dateTimeIntervalUnit
     */
    public void setDateTimeIntervalUnit(String dateTimeIntervalUnit) {
        this.dateTimeIntervalUnit = dateTimeIntervalUnit;
    }



    /**
     * set 算法名称 MOD:取模,HASH_MOD:哈希取模,VOLUME_RANGE:基于分片容量的范围分片算法,BOUNDARY_RANGE:基于分片边界的范围分片算法,AUTO_INTERVAL:自动时间段分片算法。
     *
     * @param shardingAlgorithmType
     */
    public OgShardingAlgorithmProperties shardingAlgorithmType(String shardingAlgorithmType) {
        this.shardingAlgorithmType = shardingAlgorithmType;
        return this;
    }


    /**
     * set 切分数量，算法为MOD/HASH_MOD时传入。
     *
     * @param shardingCount
     */
    public OgShardingAlgorithmProperties shardingCount(Integer shardingCount) {
        this.shardingCount = shardingCount;
        return this;
    }


    /**
     * set 开始范围，算法为VOLUME_RANGE时传入。
     *
     * @param rangeLower
     */
    public OgShardingAlgorithmProperties rangeLower(Integer rangeLower) {
        this.rangeLower = rangeLower;
        return this;
    }


    /**
     * set 终止范围，算法为VOLUME_RANGE时传入。
     *
     * @param rangeUpper
     */
    public OgShardingAlgorithmProperties rangeUpper(Integer rangeUpper) {
        this.rangeUpper = rangeUpper;
        return this;
    }


    /**
     * set 范围分片容量，算法为VOLUME_RANGE时传入。
     *
     * @param shardingVolume
     */
    public OgShardingAlgorithmProperties shardingVolume(Integer shardingVolume) {
        this.shardingVolume = shardingVolume;
        return this;
    }


    /**
     * set 分片范围边界，算法为BOUNDARY_RANGE时传入。
     *
     * @param shardingRanges
     */
    public OgShardingAlgorithmProperties shardingRanges(String shardingRanges) {
        this.shardingRanges = shardingRanges;
        return this;
    }


    /**
     * set 开始时间，算法为AUTO_INTERVAL/INTERVAL时传入。
     *
     * @param dateTimeLower
     */
    public OgShardingAlgorithmProperties dateTimeLower(String dateTimeLower) {
        this.dateTimeLower = dateTimeLower;
        return this;
    }


    /**
     * set 结束时间，算法为AUTO_INTERVAL/INTERVAL时传入。
     *
     * @param dateTimeUpper
     */
    public OgShardingAlgorithmProperties dateTimeUpper(String dateTimeUpper) {
        this.dateTimeUpper = dateTimeUpper;
        return this;
    }


    /**
     * set 单一分片能承载的最大时间，算法为AUTO_INTERVAL时传入，单位为秒。
     *
     * @param shardingSeconds
     */
    public OgShardingAlgorithmProperties shardingSeconds(Integer shardingSeconds) {
        this.shardingSeconds = shardingSeconds;
        return this;
    }


    /**
     * set 是否容许在线切分查询，算法为inline时传入（非必须）。
     *
     * @param allowRangeQueryWithInlineSharding
     */
    public OgShardingAlgorithmProperties allowRangeQueryWithInlineSharding(Boolean allowRangeQueryWithInlineSharding) {
        this.allowRangeQueryWithInlineSharding = allowRangeQueryWithInlineSharding;
        return this;
    }


    /**
     * set 时间格式，算法为interval时传入(分表后缀 传yyyy/yyyyMM/yyyyMMdd....)。
     *
     * @param datetimePattern
     */
    public OgShardingAlgorithmProperties datetimePattern(String datetimePattern) {
        this.datetimePattern = datetimePattern;
        return this;
    }


    /**
     * set 后缀模式，算法为interval时传入(分表后缀 传yyyy/yyyyMM/yyyyMMdd)。
     *
     * @param shardingSuffixPattern
     */
    public OgShardingAlgorithmProperties shardingSuffixPattern(String shardingSuffixPattern) {
        this.shardingSuffixPattern = shardingSuffixPattern;
        return this;
    }


    /**
     * set 分片时间间隔数量，算法为interval时传入。
     *
     * @param dateTimeIntervalAmount
     */
    public OgShardingAlgorithmProperties dateTimeIntervalAmount(Integer dateTimeIntervalAmount) {
        this.dateTimeIntervalAmount = dateTimeIntervalAmount;
        return this;
    }


    /**
     * set 分片时间间隔单位，算法为interval时传入（YEARS/MONTHS/WEEKS/DAYS/HOURS/MINUTES/SECONDS）。
     *
     * @param dateTimeIntervalUnit
     */
    public OgShardingAlgorithmProperties dateTimeIntervalUnit(String dateTimeIntervalUnit) {
        this.dateTimeIntervalUnit = dateTimeIntervalUnit;
        return this;
    }


}