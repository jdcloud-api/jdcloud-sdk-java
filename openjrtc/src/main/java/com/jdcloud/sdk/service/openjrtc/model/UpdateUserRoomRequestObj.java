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

package com.jdcloud.sdk.service.openjrtc.model;


/**
 * updateUserRoomRequestObj
 */
public class UpdateUserRoomRequestObj  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户房间号
     */
    private String userRoomId;

    /**
     * 房间名称
     */
    private String roomName;

    /**
     * 房间类型 1-小房间；2-大房间
     */
    private Integer roomType;


    /**
     * get 用户房间号
     *
     * @return
     */
    public String getUserRoomId() {
        return userRoomId;
    }

    /**
     * set 用户房间号
     *
     * @param userRoomId
     */
    public void setUserRoomId(String userRoomId) {
        this.userRoomId = userRoomId;
    }

    /**
     * get 房间名称
     *
     * @return
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * set 房间名称
     *
     * @param roomName
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * get 房间类型 1-小房间；2-大房间
     *
     * @return
     */
    public Integer getRoomType() {
        return roomType;
    }

    /**
     * set 房间类型 1-小房间；2-大房间
     *
     * @param roomType
     */
    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }


    /**
     * set 用户房间号
     *
     * @param userRoomId
     */
    public UpdateUserRoomRequestObj userRoomId(String userRoomId) {
        this.userRoomId = userRoomId;
        return this;
    }

    /**
     * set 房间名称
     *
     * @param roomName
     */
    public UpdateUserRoomRequestObj roomName(String roomName) {
        this.roomName = roomName;
        return this;
    }

    /**
     * set 房间类型 1-小房间；2-大房间
     *
     * @param roomType
     */
    public UpdateUserRoomRequestObj roomType(Integer roomType) {
        this.roomType = roomType;
        return this;
    }


}