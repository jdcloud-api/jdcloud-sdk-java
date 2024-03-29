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

package com.jdcloud.sdk.service.smartdba.model;

import java.util.List;
import java.util.ArrayList;

/**
 * table
 */
public class Table  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 诊断类型id
     */
    private Long typeId;

    /**
     * 诊断名称
     */
    private String title;

    /**
     * 问题与建议
     */
    private String message;

    /**
     * 其他信息提示，如：&quot;mysql 5.5 5.6 mariadb不支持&quot;
     */
    private String note;

    /**
     * 受影响表 表头
     */
    private List<Point> formHeader;

    /**
     * 问题数量
     */
    private Long count;


    /**
     * get 诊断类型id
     *
     * @return
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * set 诊断类型id
     *
     * @param typeId
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    /**
     * get 诊断名称
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * set 诊断名称
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * get 问题与建议
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 问题与建议
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * get 其他信息提示，如：&quot;mysql 5.5 5.6 mariadb不支持&quot;
     *
     * @return
     */
    public String getNote() {
        return note;
    }

    /**
     * set 其他信息提示，如：&quot;mysql 5.5 5.6 mariadb不支持&quot;
     *
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * get 受影响表 表头
     *
     * @return
     */
    public List<Point> getFormHeader() {
        return formHeader;
    }

    /**
     * set 受影响表 表头
     *
     * @param formHeader
     */
    public void setFormHeader(List<Point> formHeader) {
        this.formHeader = formHeader;
    }

    /**
     * get 问题数量
     *
     * @return
     */
    public Long getCount() {
        return count;
    }

    /**
     * set 问题数量
     *
     * @param count
     */
    public void setCount(Long count) {
        this.count = count;
    }


    /**
     * set 诊断类型id
     *
     * @param typeId
     */
    public Table typeId(Long typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * set 诊断名称
     *
     * @param title
     */
    public Table title(String title) {
        this.title = title;
        return this;
    }

    /**
     * set 问题与建议
     *
     * @param message
     */
    public Table message(String message) {
        this.message = message;
        return this;
    }

    /**
     * set 其他信息提示，如：&quot;mysql 5.5 5.6 mariadb不支持&quot;
     *
     * @param note
     */
    public Table note(String note) {
        this.note = note;
        return this;
    }

    /**
     * set 受影响表 表头
     *
     * @param formHeader
     */
    public Table formHeader(List<Point> formHeader) {
        this.formHeader = formHeader;
        return this;
    }

    /**
     * set 问题数量
     *
     * @param count
     */
    public Table count(Long count) {
        this.count = count;
        return this;
    }


    /**
     * add item to 受影响表 表头
     *
     * @param formHeader
     */
    public void addFormHeader(Point formHeader) {
        if (this.formHeader == null) {
            this.formHeader = new ArrayList<>();
        }
        this.formHeader.add(formHeader);
    }

}