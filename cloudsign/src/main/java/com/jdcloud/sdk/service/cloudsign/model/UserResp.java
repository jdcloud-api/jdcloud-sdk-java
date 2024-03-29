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

package com.jdcloud.sdk.service.cloudsign.model;

import java.util.List;
import java.util.ArrayList;

/**
 * userResp
 */
public class UserResp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 总数
     */
    private Integer totalElements;

    /**
     * 总页数
     */
    private Integer totalPages;

    /**
     * 是否最后一页
     */
    private Boolean last;

    /**
     * 当前第几页，从0开始
     */
    private Integer number;

    /**
     * 每页大小
     */
    private Integer size;

    /**
     * 当前页数量
     */
    private Integer numberOfElements;

    /**
     * 是否第一页
     */
    private Boolean first;

    /**
     * 忽略
     */
    private String pageable;

    /**
     * 忽略
     */
    private String sort;

    /**
     * content
     */
    
    private List<Object> content;


    /**
     * get 总数
     *
     * @return
     */
    public Integer getTotalElements() {
        return totalElements;
    }

    /**
     * set 总数
     *
     * @param totalElements
     */
    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }


    /**
     * get 总页数
     *
     * @return
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * set 总页数
     *
     * @param totalPages
     */
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }


    /**
     * get 是否最后一页
     *
     * @return
     */
    public Boolean getLast() {
        return last;
    }

    /**
     * set 是否最后一页
     *
     * @param last
     */
    public void setLast(Boolean last) {
        this.last = last;
    }


    /**
     * get 当前第几页，从0开始
     *
     * @return
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * set 当前第几页，从0开始
     *
     * @param number
     */
    public void setNumber(Integer number) {
        this.number = number;
    }


    /**
     * get 每页大小
     *
     * @return
     */
    public Integer getSize() {
        return size;
    }

    /**
     * set 每页大小
     *
     * @param size
     */
    public void setSize(Integer size) {
        this.size = size;
    }


    /**
     * get 当前页数量
     *
     * @return
     */
    public Integer getNumberOfElements() {
        return numberOfElements;
    }

    /**
     * set 当前页数量
     *
     * @param numberOfElements
     */
    public void setNumberOfElements(Integer numberOfElements) {
        this.numberOfElements = numberOfElements;
    }


    /**
     * get 是否第一页
     *
     * @return
     */
    public Boolean getFirst() {
        return first;
    }

    /**
     * set 是否第一页
     *
     * @param first
     */
    public void setFirst(Boolean first) {
        this.first = first;
    }


    /**
     * get 忽略
     *
     * @return
     */
    public String getPageable() {
        return pageable;
    }

    /**
     * set 忽略
     *
     * @param pageable
     */
    public void setPageable(String pageable) {
        this.pageable = pageable;
    }


    /**
     * get 忽略
     *
     * @return
     */
    public String getSort() {
        return sort;
    }

    /**
     * set 忽略
     *
     * @param sort
     */
    public void setSort(String sort) {
        this.sort = sort;
    }


    /**
    * get content
    *
    * @return
    */
    public List<Object> getContent() {
        return content;
    }

    /**
    * set content
    *
    * @param content
    */
    public void setContent(List<Object> content) {
        this.content = content;
    }



    /**
     * set 总数
     *
     * @param totalElements
     */
    public UserResp totalElements(Integer totalElements) {
        this.totalElements = totalElements;
        return this;
    }


    /**
     * set 总页数
     *
     * @param totalPages
     */
    public UserResp totalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }


    /**
     * set 是否最后一页
     *
     * @param last
     */
    public UserResp last(Boolean last) {
        this.last = last;
        return this;
    }


    /**
     * set 当前第几页，从0开始
     *
     * @param number
     */
    public UserResp number(Integer number) {
        this.number = number;
        return this;
    }


    /**
     * set 每页大小
     *
     * @param size
     */
    public UserResp size(Integer size) {
        this.size = size;
        return this;
    }


    /**
     * set 当前页数量
     *
     * @param numberOfElements
     */
    public UserResp numberOfElements(Integer numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }


    /**
     * set 是否第一页
     *
     * @param first
     */
    public UserResp first(Boolean first) {
        this.first = first;
        return this;
    }


    /**
     * set 忽略
     *
     * @param pageable
     */
    public UserResp pageable(String pageable) {
        this.pageable = pageable;
        return this;
    }


    /**
     * set 忽略
     *
     * @param sort
     */
    public UserResp sort(String sort) {
        this.sort = sort;
        return this;
    }


    /**
    * set content
    *
    * @param content
    */
    public UserResp content(List<Object> content) {
        this.content = content;
        return this;
    }



    /**
     * add item to content
     *
     * @param content
     */
    public void addContent(Object content) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(content);
    }
}