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
 * Rds-Migration-MySQL
 * 与MySQL数据迁移相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdfusion.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.jdfusion.model.ChannelInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询数据同步通道信息
 */
public class GetChannelsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * channels
     */
    private List<ChannelInfo> channels;


    /**
     * get channels
     *
     * @return
     */
    public List<ChannelInfo> getChannels() {
        return channels;
    }

    /**
     * set channels
     *
     * @param channels
     */
    public void setChannels(List<ChannelInfo> channels) {
        this.channels = channels;
    }


    /**
     * set channels
     *
     * @param channels
     */
    public GetChannelsResult channels(List<ChannelInfo> channels) {
        this.channels = channels;
        return this;
    }


    /**
     * add item to channels
     *
     * @param channel
     */
    public void addChannel(ChannelInfo channel) {
        if (this.channels == null) {
            this.channels = new ArrayList<>();
        }
        this.channels.add(channel);
    }

}