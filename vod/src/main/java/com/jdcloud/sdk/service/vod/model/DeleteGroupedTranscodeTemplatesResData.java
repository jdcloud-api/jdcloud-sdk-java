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
 * 删除转码模板组中的模板结果信息
 */
public class DeleteGroupedTranscodeTemplatesResData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模板组ID
     */
    private Long groupId;

    /**
     * 删除成功的模板ID列表
     */
    private List<Long> okTemplateIds;

    /**
     * 不存在的模板ID列表
     */
    private List<Long> notExistTemplateIds;


    /**
     * get 模板组ID
     *
     * @return
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * set 模板组ID
     *
     * @param groupId
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * get 删除成功的模板ID列表
     *
     * @return
     */
    public List<Long> getOkTemplateIds() {
        return okTemplateIds;
    }

    /**
     * set 删除成功的模板ID列表
     *
     * @param okTemplateIds
     */
    public void setOkTemplateIds(List<Long> okTemplateIds) {
        this.okTemplateIds = okTemplateIds;
    }

    /**
     * get 不存在的模板ID列表
     *
     * @return
     */
    public List<Long> getNotExistTemplateIds() {
        return notExistTemplateIds;
    }

    /**
     * set 不存在的模板ID列表
     *
     * @param notExistTemplateIds
     */
    public void setNotExistTemplateIds(List<Long> notExistTemplateIds) {
        this.notExistTemplateIds = notExistTemplateIds;
    }


    /**
     * set 模板组ID
     *
     * @param groupId
     */
    public DeleteGroupedTranscodeTemplatesResData groupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * set 删除成功的模板ID列表
     *
     * @param okTemplateIds
     */
    public DeleteGroupedTranscodeTemplatesResData okTemplateIds(List<Long> okTemplateIds) {
        this.okTemplateIds = okTemplateIds;
        return this;
    }

    /**
     * set 不存在的模板ID列表
     *
     * @param notExistTemplateIds
     */
    public DeleteGroupedTranscodeTemplatesResData notExistTemplateIds(List<Long> notExistTemplateIds) {
        this.notExistTemplateIds = notExistTemplateIds;
        return this;
    }


    /**
     * add item to 删除成功的模板ID列表
     *
     * @param okTemplateId
     */
    public void addOkTemplateId(Long okTemplateId) {
        if (this.okTemplateIds == null) {
            this.okTemplateIds = new ArrayList<>();
        }
        this.okTemplateIds.add(okTemplateId);
    }

    /**
     * add item to 不存在的模板ID列表
     *
     * @param notExistTemplateId
     */
    public void addNotExistTemplateId(Long notExistTemplateId) {
        if (this.notExistTemplateIds == null) {
            this.notExistTemplateIds = new ArrayList<>();
        }
        this.notExistTemplateIds.add(notExistTemplateId);
    }

}