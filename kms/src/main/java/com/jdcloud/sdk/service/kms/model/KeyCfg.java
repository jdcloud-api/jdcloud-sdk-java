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

package com.jdcloud.sdk.service.kms.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * keyCfg
 */
public class KeyCfg  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 密钥描述配置
     * Required:true
     */
    @Required
    private KeyDescCfg keyDescCfg;

    /**
     * 对称密钥的轮换配置；非对称密钥的操作，不支持该配置
     */
    private KeyRotateCfg keyRotateCfg;


    /**
     * get 密钥描述配置
     *
     * @return
     */
    public KeyDescCfg getKeyDescCfg() {
        return keyDescCfg;
    }

    /**
     * set 密钥描述配置
     *
     * @param keyDescCfg
     */
    public void setKeyDescCfg(KeyDescCfg keyDescCfg) {
        this.keyDescCfg = keyDescCfg;
    }

    /**
     * get 对称密钥的轮换配置；非对称密钥的操作，不支持该配置
     *
     * @return
     */
    public KeyRotateCfg getKeyRotateCfg() {
        return keyRotateCfg;
    }

    /**
     * set 对称密钥的轮换配置；非对称密钥的操作，不支持该配置
     *
     * @param keyRotateCfg
     */
    public void setKeyRotateCfg(KeyRotateCfg keyRotateCfg) {
        this.keyRotateCfg = keyRotateCfg;
    }


    /**
     * set 密钥描述配置
     *
     * @param keyDescCfg
     */
    public KeyCfg keyDescCfg(KeyDescCfg keyDescCfg) {
        this.keyDescCfg = keyDescCfg;
        return this;
    }

    /**
     * set 对称密钥的轮换配置；非对称密钥的操作，不支持该配置
     *
     * @param keyRotateCfg
     */
    public KeyCfg keyRotateCfg(KeyRotateCfg keyRotateCfg) {
        this.keyRotateCfg = keyRotateCfg;
        return this;
    }


}