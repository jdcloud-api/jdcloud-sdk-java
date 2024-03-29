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

package com.jdcloud.sdk.service.censor.model;


/**
 * boarderInfoItem
 */
public class BoarderInfoItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图片是否包含边框（任一边包含边框均视为包含）ture:包含边框；false:不包含边框
     */
    private Boolean hit;

    /**
     * 图片顶部是否包含边框，ture:包含边框；false:不包含边框
     */
    private Boolean top;

    /**
     * 图片右侧是否包含边框，ture:包含边框；false:不包含边框
     */
    private Boolean right;

    /**
     * 图片底部是否包含边框，ture:包含边框；false:不包含边框
     */
    private Boolean bottom;

    /**
     * 图片左侧是否包含边框，ture:包含边框；false:不包含边框
     */
    private Boolean left;


    /**
     * get 图片是否包含边框（任一边包含边框均视为包含）ture:包含边框；false:不包含边框
     *
     * @return
     */
    public Boolean getHit() {
        return hit;
    }

    /**
     * set 图片是否包含边框（任一边包含边框均视为包含）ture:包含边框；false:不包含边框
     *
     * @param hit
     */
    public void setHit(Boolean hit) {
        this.hit = hit;
    }

    /**
     * get 图片顶部是否包含边框，ture:包含边框；false:不包含边框
     *
     * @return
     */
    public Boolean getTop() {
        return top;
    }

    /**
     * set 图片顶部是否包含边框，ture:包含边框；false:不包含边框
     *
     * @param top
     */
    public void setTop(Boolean top) {
        this.top = top;
    }

    /**
     * get 图片右侧是否包含边框，ture:包含边框；false:不包含边框
     *
     * @return
     */
    public Boolean getRight() {
        return right;
    }

    /**
     * set 图片右侧是否包含边框，ture:包含边框；false:不包含边框
     *
     * @param right
     */
    public void setRight(Boolean right) {
        this.right = right;
    }

    /**
     * get 图片底部是否包含边框，ture:包含边框；false:不包含边框
     *
     * @return
     */
    public Boolean getBottom() {
        return bottom;
    }

    /**
     * set 图片底部是否包含边框，ture:包含边框；false:不包含边框
     *
     * @param bottom
     */
    public void setBottom(Boolean bottom) {
        this.bottom = bottom;
    }

    /**
     * get 图片左侧是否包含边框，ture:包含边框；false:不包含边框
     *
     * @return
     */
    public Boolean getLeft() {
        return left;
    }

    /**
     * set 图片左侧是否包含边框，ture:包含边框；false:不包含边框
     *
     * @param left
     */
    public void setLeft(Boolean left) {
        this.left = left;
    }


    /**
     * set 图片是否包含边框（任一边包含边框均视为包含）ture:包含边框；false:不包含边框
     *
     * @param hit
     */
    public BoarderInfoItem hit(Boolean hit) {
        this.hit = hit;
        return this;
    }

    /**
     * set 图片顶部是否包含边框，ture:包含边框；false:不包含边框
     *
     * @param top
     */
    public BoarderInfoItem top(Boolean top) {
        this.top = top;
        return this;
    }

    /**
     * set 图片右侧是否包含边框，ture:包含边框；false:不包含边框
     *
     * @param right
     */
    public BoarderInfoItem right(Boolean right) {
        this.right = right;
        return this;
    }

    /**
     * set 图片底部是否包含边框，ture:包含边框；false:不包含边框
     *
     * @param bottom
     */
    public BoarderInfoItem bottom(Boolean bottom) {
        this.bottom = bottom;
        return this;
    }

    /**
     * set 图片左侧是否包含边框，ture:包含边框；false:不包含边框
     *
     * @param left
     */
    public BoarderInfoItem left(Boolean left) {
        this.left = left;
        return this;
    }


}