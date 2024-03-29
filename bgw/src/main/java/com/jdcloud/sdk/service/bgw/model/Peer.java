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

package com.jdcloud.sdk.service.bgw.model;


/**
 * peer
 */
public class Peer  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Peer的Id
     */
    private String peerId;

    /**
     * Peer的BGP状态，取值为：Up, Down
     */
    private String peerBgpStatus;

    /**
     * Peer的ip信息详情
     */
    private PeerIps peerIps;



    /**
     * get Peer的Id
     *
     * @return
     */
    public String getPeerId() {
        return peerId;
    }

    /**
     * set Peer的Id
     *
     * @param peerId
     */
    public void setPeerId(String peerId) {
        this.peerId = peerId;
    }


    /**
     * get Peer的BGP状态，取值为：Up, Down
     *
     * @return
     */
    public String getPeerBgpStatus() {
        return peerBgpStatus;
    }

    /**
     * set Peer的BGP状态，取值为：Up, Down
     *
     * @param peerBgpStatus
     */
    public void setPeerBgpStatus(String peerBgpStatus) {
        this.peerBgpStatus = peerBgpStatus;
    }


    /**
     * get Peer的ip信息详情
     *
     * @return
     */
    public PeerIps getPeerIps() {
        return peerIps;
    }

    /**
     * set Peer的ip信息详情
     *
     * @param peerIps
     */
    public void setPeerIps(PeerIps peerIps) {
        this.peerIps = peerIps;
    }



    /**
     * set Peer的Id
     *
     * @param peerId
     */
    public Peer peerId(String peerId) {
        this.peerId = peerId;
        return this;
    }


    /**
     * set Peer的BGP状态，取值为：Up, Down
     *
     * @param peerBgpStatus
     */
    public Peer peerBgpStatus(String peerBgpStatus) {
        this.peerBgpStatus = peerBgpStatus;
        return this;
    }


    /**
     * set Peer的ip信息详情
     *
     * @param peerIps
     */
    public Peer peerIps(PeerIps peerIps) {
        this.peerIps = peerIps;
        return this;
    }


}