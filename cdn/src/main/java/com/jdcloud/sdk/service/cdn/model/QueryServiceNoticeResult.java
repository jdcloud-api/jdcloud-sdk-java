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
 * 服务通知相关接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.cdn.model.ServiceNoticeItem;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询用户服务通知接口
 */
public class QueryServiceNoticeResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * notices
     */
    
    private List<ServiceNoticeItem> notices;


    /**
    * get notices
    *
    * @return
    */
    public List<ServiceNoticeItem> getNotices() {
        return notices;
    }

    /**
    * set notices
    *
    * @param notices
    */
    public void setNotices(List<ServiceNoticeItem> notices) {
        this.notices = notices;
    }



    /**
    * set notices
    *
    * @param notices
    */
    public QueryServiceNoticeResult notices(List<ServiceNoticeItem> notices) {
        this.notices = notices;
        return this;
    }



    /**
     * add item to notices
     *
     * @param notice
     */
    public void addNotice(ServiceNoticeItem notice) {
        if (this.notices == null) {
            this.notices = new ArrayList<>();
        }
        this.notices.add(notice);
    }
}