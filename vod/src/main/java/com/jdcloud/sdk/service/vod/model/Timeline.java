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

package com.jdcloud.sdk.service.vod.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 视频剪辑时间线配置
 */
public class Timeline  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 媒体轨列表，有序，若有重合时间段，则排在后面的媒体轨上的重叠部分将被忽略
     */
    private List<MediaTrack> trackList;


    /**
     * get 媒体轨列表，有序，若有重合时间段，则排在后面的媒体轨上的重叠部分将被忽略
     *
     * @return
     */
    public List<MediaTrack> getTrackList() {
        return trackList;
    }

    /**
     * set 媒体轨列表，有序，若有重合时间段，则排在后面的媒体轨上的重叠部分将被忽略
     *
     * @param trackList
     */
    public void setTrackList(List<MediaTrack> trackList) {
        this.trackList = trackList;
    }


    /**
     * set 媒体轨列表，有序，若有重合时间段，则排在后面的媒体轨上的重叠部分将被忽略
     *
     * @param trackList
     */
    public Timeline trackList(List<MediaTrack> trackList) {
        this.trackList = trackList;
        return this;
    }


    /**
     * add item to 媒体轨列表，有序，若有重合时间段，则排在后面的媒体轨上的重叠部分将被忽略
     *
     * @param trackList
     */
    public void addTrackList(MediaTrack trackList) {
        if (this.trackList == null) {
            this.trackList = new ArrayList<>();
        }
        this.trackList.add(trackList);
    }

}