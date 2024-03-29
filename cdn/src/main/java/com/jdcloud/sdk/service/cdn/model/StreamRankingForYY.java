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

package com.jdcloud.sdk.service.cdn.model;


/**
 * streamRankingForYY
 */
public class StreamRankingForYY  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * streamName
     */
    private String streamName;

    /**
     * ranking
     */
    private Integer ranking;

    /**
     * playerCount
     */
    private Long playerCount;



    /**
     * get streamName
     *
     * @return
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * set streamName
     *
     * @param streamName
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }


    /**
     * get ranking
     *
     * @return
     */
    public Integer getRanking() {
        return ranking;
    }

    /**
     * set ranking
     *
     * @param ranking
     */
    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }


    /**
     * get playerCount
     *
     * @return
     */
    public Long getPlayerCount() {
        return playerCount;
    }

    /**
     * set playerCount
     *
     * @param playerCount
     */
    public void setPlayerCount(Long playerCount) {
        this.playerCount = playerCount;
    }



    /**
     * set streamName
     *
     * @param streamName
     */
    public StreamRankingForYY streamName(String streamName) {
        this.streamName = streamName;
        return this;
    }


    /**
     * set ranking
     *
     * @param ranking
     */
    public StreamRankingForYY ranking(Integer ranking) {
        this.ranking = ranking;
        return this;
    }


    /**
     * set playerCount
     *
     * @param playerCount
     */
    public StreamRankingForYY playerCount(Long playerCount) {
        this.playerCount = playerCount;
        return this;
    }


}