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
 * 文本检测相关接口
 * API related to text scan
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.censor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.censor.model.TextResultDetailV2;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 文本同步检测-检测文本中是否包含违规信息
 */
public class TextScanV2Result extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * result
     */
    private List<TextResultDetailV2> result;


    /**
     * get result
     *
     * @return
     */
    public List<TextResultDetailV2> getResult() {
        return result;
    }

    /**
     * set result
     *
     * @param result
     */
    public void setResult(List<TextResultDetailV2> result) {
        this.result = result;
    }


    /**
     * set result
     *
     * @param result
     */
    public TextScanV2Result result(List<TextResultDetailV2> result) {
        this.result = result;
        return this;
    }


    /**
     * add item to result
     *
     * @param result
     */
    public void addResult(TextResultDetailV2 result) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(result);
    }

}