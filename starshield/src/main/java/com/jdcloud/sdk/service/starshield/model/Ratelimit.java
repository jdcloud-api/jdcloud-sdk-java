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

package com.jdcloud.sdk.service.starshield.model;

import java.util.List;
import java.util.ArrayList;

/**
 * ratelimit
 */
public class Ratelimit  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 使用以下一个或多个特征：
UI值&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;API值
(隐式包含)---------cf.colo.id(强制性的)
IP---------------ip.src
Cookie-----------http.request.cookies[&quot;&lt;cookie_name&gt;&quot;]
标头--------------http.request.headers[&quot;&lt;header_name&gt;&quot;]
查询--------------http.request.uri.args[&quot;&lt;query_param_name&gt;&quot;]
支持NAT的IP-------cf.unique_visitor_id
ASN--------------ip.geoip.asnum
国家/地区----------ip.geoip.country
JA3指纹-----------cf.bot_management.ja3_hash

最多使用5个特征。
&#39;IP&#39;和&#39;支持NAT的IP&#39;不能同时使用。
如果你使用http.request.headers[&quot;&lt;header_name&gt;&quot;]，&lt;header_name&gt;必须是小写，因为星盾在边缘规范化了标头名称。

     */
    
    private List<String> characteristics;
    /**
     * 在一段时间内触发规则的请求数。
     */
    private Number requests_per_period;

    /**
     * 评估请求速率时要考虑的时间段（以秒为单位）。
有效值10/60/120/300/600/3600，即10, 60 (1分钟), 120 (2分钟), 300 (5分钟), 600 (10分钟), or 3600 (1小时)。

     */
    private Number period;

    /**
     * 一旦达到速率，速率限制规则将在该时间段内（以秒为单位）生效。
使用质询操作之一时，无法定义持续时间。在这种情况下，当访问者通过质询时，其相应的请求计数器设置为零。当规则特征值相同的访问者发出足够的请求再次触发限速规则时，他们将收到新的质询。
有效值30/60/600/3600/86400，即30, 60 (1分钟), 600 (10分钟), 3600 (1小时), or 86400 (1天)。
当action的值为managed_challenge/js_challenge/challenge时，你必须设置mitigation_timeout的值为0。

     */
    private Number mitigation_timeout;

    /**
     * true代表,在确定请求速率时，只考虑发往源站的请求（即未缓存的请求）。
     */
    private Boolean requests_to_origin;

    /**
     * 定义用于确定请求速率的标准。默认情况下，计数表达式与规则表达式相同。将此字段设置为空字符串（“”）时，也会应用默认值。
计数表达式可以包括HTTP响应字段。当计数表达式中有响应字段时，计数将在发送响应后进行。

     */
    private String counting_expression;



    /**
    * get 使用以下一个或多个特征：
UI值&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;API值
(隐式包含)---------cf.colo.id(强制性的)
IP---------------ip.src
Cookie-----------http.request.cookies[&quot;&lt;cookie_name&gt;&quot;]
标头--------------http.request.headers[&quot;&lt;header_name&gt;&quot;]
查询--------------http.request.uri.args[&quot;&lt;query_param_name&gt;&quot;]
支持NAT的IP-------cf.unique_visitor_id
ASN--------------ip.geoip.asnum
国家/地区----------ip.geoip.country
JA3指纹-----------cf.bot_management.ja3_hash

最多使用5个特征。
&#39;IP&#39;和&#39;支持NAT的IP&#39;不能同时使用。
如果你使用http.request.headers[&quot;&lt;header_name&gt;&quot;]，&lt;header_name&gt;必须是小写，因为星盾在边缘规范化了标头名称。

    *
    * @return
    */
    public List<String> getCharacteristics() {
        return characteristics;
    }

    /**
    * set 使用以下一个或多个特征：
UI值&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;API值
(隐式包含)---------cf.colo.id(强制性的)
IP---------------ip.src
Cookie-----------http.request.cookies[&quot;&lt;cookie_name&gt;&quot;]
标头--------------http.request.headers[&quot;&lt;header_name&gt;&quot;]
查询--------------http.request.uri.args[&quot;&lt;query_param_name&gt;&quot;]
支持NAT的IP-------cf.unique_visitor_id
ASN--------------ip.geoip.asnum
国家/地区----------ip.geoip.country
JA3指纹-----------cf.bot_management.ja3_hash

最多使用5个特征。
&#39;IP&#39;和&#39;支持NAT的IP&#39;不能同时使用。
如果你使用http.request.headers[&quot;&lt;header_name&gt;&quot;]，&lt;header_name&gt;必须是小写，因为星盾在边缘规范化了标头名称。

    *
    * @param characteristics
    */
    public void setCharacteristics(List<String> characteristics) {
        this.characteristics = characteristics;
    }


    /**
     * get 在一段时间内触发规则的请求数。
     *
     * @return
     */
    public Number getRequests_per_period() {
        return requests_per_period;
    }

    /**
     * set 在一段时间内触发规则的请求数。
     *
     * @param requests_per_period
     */
    public void setRequests_per_period(Number requests_per_period) {
        this.requests_per_period = requests_per_period;
    }


    /**
     * get 评估请求速率时要考虑的时间段（以秒为单位）。
有效值10/60/120/300/600/3600，即10, 60 (1分钟), 120 (2分钟), 300 (5分钟), 600 (10分钟), or 3600 (1小时)。

     *
     * @return
     */
    public Number getPeriod() {
        return period;
    }

    /**
     * set 评估请求速率时要考虑的时间段（以秒为单位）。
有效值10/60/120/300/600/3600，即10, 60 (1分钟), 120 (2分钟), 300 (5分钟), 600 (10分钟), or 3600 (1小时)。

     *
     * @param period
     */
    public void setPeriod(Number period) {
        this.period = period;
    }


    /**
     * get 一旦达到速率，速率限制规则将在该时间段内（以秒为单位）生效。
使用质询操作之一时，无法定义持续时间。在这种情况下，当访问者通过质询时，其相应的请求计数器设置为零。当规则特征值相同的访问者发出足够的请求再次触发限速规则时，他们将收到新的质询。
有效值30/60/600/3600/86400，即30, 60 (1分钟), 600 (10分钟), 3600 (1小时), or 86400 (1天)。
当action的值为managed_challenge/js_challenge/challenge时，你必须设置mitigation_timeout的值为0。

     *
     * @return
     */
    public Number getMitigation_timeout() {
        return mitigation_timeout;
    }

    /**
     * set 一旦达到速率，速率限制规则将在该时间段内（以秒为单位）生效。
使用质询操作之一时，无法定义持续时间。在这种情况下，当访问者通过质询时，其相应的请求计数器设置为零。当规则特征值相同的访问者发出足够的请求再次触发限速规则时，他们将收到新的质询。
有效值30/60/600/3600/86400，即30, 60 (1分钟), 600 (10分钟), 3600 (1小时), or 86400 (1天)。
当action的值为managed_challenge/js_challenge/challenge时，你必须设置mitigation_timeout的值为0。

     *
     * @param mitigation_timeout
     */
    public void setMitigation_timeout(Number mitigation_timeout) {
        this.mitigation_timeout = mitigation_timeout;
    }


    /**
     * get true代表,在确定请求速率时，只考虑发往源站的请求（即未缓存的请求）。
     *
     * @return
     */
    public Boolean getRequests_to_origin() {
        return requests_to_origin;
    }

    /**
     * set true代表,在确定请求速率时，只考虑发往源站的请求（即未缓存的请求）。
     *
     * @param requests_to_origin
     */
    public void setRequests_to_origin(Boolean requests_to_origin) {
        this.requests_to_origin = requests_to_origin;
    }


    /**
     * get 定义用于确定请求速率的标准。默认情况下，计数表达式与规则表达式相同。将此字段设置为空字符串（“”）时，也会应用默认值。
计数表达式可以包括HTTP响应字段。当计数表达式中有响应字段时，计数将在发送响应后进行。

     *
     * @return
     */
    public String getCounting_expression() {
        return counting_expression;
    }

    /**
     * set 定义用于确定请求速率的标准。默认情况下，计数表达式与规则表达式相同。将此字段设置为空字符串（“”）时，也会应用默认值。
计数表达式可以包括HTTP响应字段。当计数表达式中有响应字段时，计数将在发送响应后进行。

     *
     * @param counting_expression
     */
    public void setCounting_expression(String counting_expression) {
        this.counting_expression = counting_expression;
    }



    /**
    * set 使用以下一个或多个特征：
UI值&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;API值
(隐式包含)---------cf.colo.id(强制性的)
IP---------------ip.src
Cookie-----------http.request.cookies[&quot;&lt;cookie_name&gt;&quot;]
标头--------------http.request.headers[&quot;&lt;header_name&gt;&quot;]
查询--------------http.request.uri.args[&quot;&lt;query_param_name&gt;&quot;]
支持NAT的IP-------cf.unique_visitor_id
ASN--------------ip.geoip.asnum
国家/地区----------ip.geoip.country
JA3指纹-----------cf.bot_management.ja3_hash

最多使用5个特征。
&#39;IP&#39;和&#39;支持NAT的IP&#39;不能同时使用。
如果你使用http.request.headers[&quot;&lt;header_name&gt;&quot;]，&lt;header_name&gt;必须是小写，因为星盾在边缘规范化了标头名称。

    *
    * @param characteristics
    */
    public Ratelimit characteristics(List<String> characteristics) {
        this.characteristics = characteristics;
        return this;
    }


    /**
     * set 在一段时间内触发规则的请求数。
     *
     * @param requests_per_period
     */
    public Ratelimit requests_per_period(Number requests_per_period) {
        this.requests_per_period = requests_per_period;
        return this;
    }


    /**
     * set 评估请求速率时要考虑的时间段（以秒为单位）。
有效值10/60/120/300/600/3600，即10, 60 (1分钟), 120 (2分钟), 300 (5分钟), 600 (10分钟), or 3600 (1小时)。

     *
     * @param period
     */
    public Ratelimit period(Number period) {
        this.period = period;
        return this;
    }


    /**
     * set 一旦达到速率，速率限制规则将在该时间段内（以秒为单位）生效。
使用质询操作之一时，无法定义持续时间。在这种情况下，当访问者通过质询时，其相应的请求计数器设置为零。当规则特征值相同的访问者发出足够的请求再次触发限速规则时，他们将收到新的质询。
有效值30/60/600/3600/86400，即30, 60 (1分钟), 600 (10分钟), 3600 (1小时), or 86400 (1天)。
当action的值为managed_challenge/js_challenge/challenge时，你必须设置mitigation_timeout的值为0。

     *
     * @param mitigation_timeout
     */
    public Ratelimit mitigation_timeout(Number mitigation_timeout) {
        this.mitigation_timeout = mitigation_timeout;
        return this;
    }


    /**
     * set true代表,在确定请求速率时，只考虑发往源站的请求（即未缓存的请求）。
     *
     * @param requests_to_origin
     */
    public Ratelimit requests_to_origin(Boolean requests_to_origin) {
        this.requests_to_origin = requests_to_origin;
        return this;
    }


    /**
     * set 定义用于确定请求速率的标准。默认情况下，计数表达式与规则表达式相同。将此字段设置为空字符串（“”）时，也会应用默认值。
计数表达式可以包括HTTP响应字段。当计数表达式中有响应字段时，计数将在发送响应后进行。

     *
     * @param counting_expression
     */
    public Ratelimit counting_expression(String counting_expression) {
        this.counting_expression = counting_expression;
        return this;
    }



    /**
     * add item to 使用以下一个或多个特征：
UI值&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;API值
(隐式包含)---------cf.colo.id(强制性的)
IP---------------ip.src
Cookie-----------http.request.cookies[&quot;&lt;cookie_name&gt;&quot;]
标头--------------http.request.headers[&quot;&lt;header_name&gt;&quot;]
查询--------------http.request.uri.args[&quot;&lt;query_param_name&gt;&quot;]
支持NAT的IP-------cf.unique_visitor_id
ASN--------------ip.geoip.asnum
国家/地区----------ip.geoip.country
JA3指纹-----------cf.bot_management.ja3_hash

最多使用5个特征。
&#39;IP&#39;和&#39;支持NAT的IP&#39;不能同时使用。
如果你使用http.request.headers[&quot;&lt;header_name&gt;&quot;]，&lt;header_name&gt;必须是小写，因为星盾在边缘规范化了标头名称。

     *
     * @param characteristic
     */
    public void addCharacteristic(String characteristic) {
        if (this.characteristics == null) {
            this.characteristics = new ArrayList<>();
        }
        this.characteristics.add(characteristic);
    }
}