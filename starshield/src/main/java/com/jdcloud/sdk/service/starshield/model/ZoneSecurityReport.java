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
 * zoneSecurityReport
 */
public class ZoneSecurityReport  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名
     */
    private String zoneName;

    /**
     * 统计时段：查询起始时间 ~ 查询截至时间
     */
    private String queryDate;

    /**
     * 总请求数
     */
    private Double requestSum;

    /**
     * 总流量
     */
    private Double trafficSum;

    /**
     * 总清洗流量
     */
    private Double cleanTrafficSum;

    /**
     * 缓存率
     */
    private String cachedPercentage;

    /**
     * 遭受攻击总次数
     */
    private Double attackSum;

    /**
     * 攻击占总请求比例
     */
    private String attackPercentage;

    /**
     * Web攻击防御趋势
     */
    
    private List<WebAttackDefenseTrends> webAttackDefenseTrends;
    /**
     * 被攻击详情
     */
    
    private List<AttackInfo> attackInfo;


    /**
     * get 域名
     *
     * @return
     */
    public String getZoneName() {
        return zoneName;
    }

    /**
     * set 域名
     *
     * @param zoneName
     */
    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }


    /**
     * get 统计时段：查询起始时间 ~ 查询截至时间
     *
     * @return
     */
    public String getQueryDate() {
        return queryDate;
    }

    /**
     * set 统计时段：查询起始时间 ~ 查询截至时间
     *
     * @param queryDate
     */
    public void setQueryDate(String queryDate) {
        this.queryDate = queryDate;
    }


    /**
     * get 总请求数
     *
     * @return
     */
    public Double getRequestSum() {
        return requestSum;
    }

    /**
     * set 总请求数
     *
     * @param requestSum
     */
    public void setRequestSum(Double requestSum) {
        this.requestSum = requestSum;
    }


    /**
     * get 总流量
     *
     * @return
     */
    public Double getTrafficSum() {
        return trafficSum;
    }

    /**
     * set 总流量
     *
     * @param trafficSum
     */
    public void setTrafficSum(Double trafficSum) {
        this.trafficSum = trafficSum;
    }


    /**
     * get 总清洗流量
     *
     * @return
     */
    public Double getCleanTrafficSum() {
        return cleanTrafficSum;
    }

    /**
     * set 总清洗流量
     *
     * @param cleanTrafficSum
     */
    public void setCleanTrafficSum(Double cleanTrafficSum) {
        this.cleanTrafficSum = cleanTrafficSum;
    }


    /**
     * get 缓存率
     *
     * @return
     */
    public String getCachedPercentage() {
        return cachedPercentage;
    }

    /**
     * set 缓存率
     *
     * @param cachedPercentage
     */
    public void setCachedPercentage(String cachedPercentage) {
        this.cachedPercentage = cachedPercentage;
    }


    /**
     * get 遭受攻击总次数
     *
     * @return
     */
    public Double getAttackSum() {
        return attackSum;
    }

    /**
     * set 遭受攻击总次数
     *
     * @param attackSum
     */
    public void setAttackSum(Double attackSum) {
        this.attackSum = attackSum;
    }


    /**
     * get 攻击占总请求比例
     *
     * @return
     */
    public String getAttackPercentage() {
        return attackPercentage;
    }

    /**
     * set 攻击占总请求比例
     *
     * @param attackPercentage
     */
    public void setAttackPercentage(String attackPercentage) {
        this.attackPercentage = attackPercentage;
    }


    /**
    * get Web攻击防御趋势
    *
    * @return
    */
    public List<WebAttackDefenseTrends> getWebAttackDefenseTrends() {
        return webAttackDefenseTrends;
    }

    /**
    * set Web攻击防御趋势
    *
    * @param webAttackDefenseTrends
    */
    public void setWebAttackDefenseTrends(List<WebAttackDefenseTrends> webAttackDefenseTrends) {
        this.webAttackDefenseTrends = webAttackDefenseTrends;
    }


    /**
    * get 被攻击详情
    *
    * @return
    */
    public List<AttackInfo> getAttackInfo() {
        return attackInfo;
    }

    /**
    * set 被攻击详情
    *
    * @param attackInfo
    */
    public void setAttackInfo(List<AttackInfo> attackInfo) {
        this.attackInfo = attackInfo;
    }



    /**
     * set 域名
     *
     * @param zoneName
     */
    public ZoneSecurityReport zoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }


    /**
     * set 统计时段：查询起始时间 ~ 查询截至时间
     *
     * @param queryDate
     */
    public ZoneSecurityReport queryDate(String queryDate) {
        this.queryDate = queryDate;
        return this;
    }


    /**
     * set 总请求数
     *
     * @param requestSum
     */
    public ZoneSecurityReport requestSum(Double requestSum) {
        this.requestSum = requestSum;
        return this;
    }


    /**
     * set 总流量
     *
     * @param trafficSum
     */
    public ZoneSecurityReport trafficSum(Double trafficSum) {
        this.trafficSum = trafficSum;
        return this;
    }


    /**
     * set 总清洗流量
     *
     * @param cleanTrafficSum
     */
    public ZoneSecurityReport cleanTrafficSum(Double cleanTrafficSum) {
        this.cleanTrafficSum = cleanTrafficSum;
        return this;
    }


    /**
     * set 缓存率
     *
     * @param cachedPercentage
     */
    public ZoneSecurityReport cachedPercentage(String cachedPercentage) {
        this.cachedPercentage = cachedPercentage;
        return this;
    }


    /**
     * set 遭受攻击总次数
     *
     * @param attackSum
     */
    public ZoneSecurityReport attackSum(Double attackSum) {
        this.attackSum = attackSum;
        return this;
    }


    /**
     * set 攻击占总请求比例
     *
     * @param attackPercentage
     */
    public ZoneSecurityReport attackPercentage(String attackPercentage) {
        this.attackPercentage = attackPercentage;
        return this;
    }


    /**
    * set Web攻击防御趋势
    *
    * @param webAttackDefenseTrends
    */
    public ZoneSecurityReport webAttackDefenseTrends(List<WebAttackDefenseTrends> webAttackDefenseTrends) {
        this.webAttackDefenseTrends = webAttackDefenseTrends;
        return this;
    }


    /**
    * set 被攻击详情
    *
    * @param attackInfo
    */
    public ZoneSecurityReport attackInfo(List<AttackInfo> attackInfo) {
        this.attackInfo = attackInfo;
        return this;
    }



    /**
     * add item to Web攻击防御趋势
     *
     * @param webAttackDefenseTrend
     */
    public void addWebAttackDefenseTrend(WebAttackDefenseTrends webAttackDefenseTrend) {
        if (this.webAttackDefenseTrends == null) {
            this.webAttackDefenseTrends = new ArrayList<>();
        }
        this.webAttackDefenseTrends.add(webAttackDefenseTrend);
    }

    /**
     * add item to 被攻击详情
     *
     * @param attackInfo
     */
    public void addAttackInfo(AttackInfo attackInfo) {
        if (this.attackInfo == null) {
            this.attackInfo = new ArrayList<>();
        }
        this.attackInfo.add(attackInfo);
    }
}