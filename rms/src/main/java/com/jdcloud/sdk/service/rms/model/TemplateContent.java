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

package com.jdcloud.sdk.service.rms.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * templateContent
 */
public class TemplateContent  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 类型只能为 txt/jpg/png/gif/mp3/mp4
     * Required:true
     */
    @Required
    private String fileType;

    /**
     * 类型为txt时，为文本信息；类型为非txt时，这里需要填写文件对应的base64编码
     * Required:true
     */
    @Required
    private String value;


    /**
     * get 类型只能为 txt/jpg/png/gif/mp3/mp4
     *
     * @return
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * set 类型只能为 txt/jpg/png/gif/mp3/mp4
     *
     * @param fileType
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * get 类型为txt时，为文本信息；类型为非txt时，这里需要填写文件对应的base64编码
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set 类型为txt时，为文本信息；类型为非txt时，这里需要填写文件对应的base64编码
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * set 类型只能为 txt/jpg/png/gif/mp3/mp4
     *
     * @param fileType
     */
    public TemplateContent fileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * set 类型为txt时，为文本信息；类型为非txt时，这里需要填写文件对应的base64编码
     *
     * @param value
     */
    public TemplateContent value(String value) {
        this.value = value;
        return this;
    }


}