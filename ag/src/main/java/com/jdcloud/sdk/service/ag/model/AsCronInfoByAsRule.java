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

package com.jdcloud.sdk.service.ag.model;


/**
 * 定时任务信息
 */
public class AsCronInfoByAsRule  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 定时任务ID
     */
    private String asCronId;

    /**
     * 定时任务名称
     */
    private String name;

    /**
     * 定时任务描述
     */
    private String description;

    /**
     * 定时任务触发的时间点
时间格式：&#x60;2023-05-10 10:10:00&#x60;，目前只支持到分钟，秒数会被忽略，但是需要严格按照此时间格式填写
- 如果未指定&#x60;repeatType&#x60;，则按指定的日期和时间执行一次
- 如果指定了&#x60;repeatType&#x60;，则此属性指定的时间点，表示从这个时间之后开始按照重复周期执行定时任务

     */
    private String launchTime;

    /**
     * 重复执行定时任务的类型，如果&#x60;repeatType&#x60;有值，则&#x60;repeatValue&#x60;也会有值
取值范围：[&#x60;Daily&#x60;,&#x60;Weekly&#x60;,&#x60;Monthly&#x60;,&#x60;Cron&#x60;]
- Daily：每多少天重复执行一次定时任务
- Weekly：每周指定几天重复执行一次定时任务
- Monthly：每月内指定几天重复执行一次定时任务
- Cron：按照指定的Cron表达式执行定时任务

     */
    private String repeatType;

    /**
     * 重复执行定时任务的数值，如果&#x60;repeatType&#x60;有值，则&#x60;repeatValue&#x60;也会有值
- &#x60;repeatType&#x60;取值为&#x60;Daily&#x60;时，只能填一个值，取值范围：[ &#x60;1&#x60; ~ &#x60;31&#x60; ]，表示：每几天执行
- &#x60;repeatType&#x60;取值为&#x60;Weekly&#x60;时，可以填入多个值，填多个值时使用半角逗号（,）分隔。取值范围：[&#x60;0&#x60;,&#x60;1&#x60;,&#x60;2&#x60;,&#x60;3&#x60;,&#x60;4&#x60;,&#x60;5&#x60;,&#x60;6&#x60;]，分别对应：周日、周一、周二、周三、周四、周五、周六，表示：每周几执行
- &#x60;repeatType&#x60;取值为&#x60;Monthly&#x60;时，格式为A-B。A、B的取值范围：[ &#x60;1&#x60; ~ &#x60;31&#x60; ]，并且B必须大于等于A，表示：每个月的几号到几号执行
- &#x60;repeatType&#x60;取值为&#x60;Cron&#x60;时，必须填写Cron表达式，不支持秒，最小单位为分钟

支持的Cron格式如下：
*    *    *    *    *   从左到右依次表示：&#x60;[分] [小时] [日] [月] [周]&#x60;

- 分，取值范围：[&#x60;0&#x60; ~ &#x60;59&#x60;]，允许的连接符号取值范围：[&#x60;*&#x60; &#x60;/&#x60; &#x60;,&#x60; &#x60;-&#x60;]
- 小时，取值范围：[&#x60;0&#x60; ~ &#x60;23&#x60;]，允许的连接符号取值范围：[&#x60;*&#x60; &#x60;/&#x60; &#x60;,&#x60; &#x60;-&#x60;]
- 日，取值范围：[&#x60;1&#x60; ~ &#x60;31&#x60;]，允许的连接符号取值范围：[&#x60;*&#x60; &#x60;/&#x60; &#x60;,&#x60; &#x60;-&#x60; &#x60;?&#x60;]
- 月，取值范围：[&#x60;1&#x60; ~ &#x60;12&#x60;]，允许的连接符号取值范围：[&#x60;*&#x60; &#x60;/&#x60; &#x60;,&#x60; &#x60;-&#x60;]
- 周，取值范围：[&#x60;0&#x60; ~ &#x60;6&#x60;]，允许的连接符号取值范围：[&#x60;*&#x60; &#x60;/&#x60; &#x60;,&#x60; &#x60;-&#x60; &#x60;?&#x60;]

符号解析：&#x60;*&#x60;表示任意值，&#x60;/&#x60;表示步长，&#x60;,&#x60;表示多个值，&#x60;-&#x60;表示范围，&#x60;?&#x60;表示不指定值

示例：0 10 * * *  表示：每天10点执行

     */
    private String repeatValue;

    /**
     * 重复执行定时任务的结束时间，若为空，表示不限制结束时间，一直重复执行
     */
    private String repeatEndTime;

    /**
     * 定时任务触发操作失败后，在此时间内重试，单位为秒
     */
    private Integer launchExpirationTime;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 定时任务状态，取值范围如下：
  - &#x60;Disabled&#x60;：已禁用
  - &#x60;Enabled&#x60;：已启用

     */
    private String displayState;



    /**
     * get 定时任务ID
     *
     * @return
     */
    public String getAsCronId() {
        return asCronId;
    }

    /**
     * set 定时任务ID
     *
     * @param asCronId
     */
    public void setAsCronId(String asCronId) {
        this.asCronId = asCronId;
    }


    /**
     * get 定时任务名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 定时任务名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 定时任务描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 定时任务描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 定时任务触发的时间点
时间格式：&#x60;2023-05-10 10:10:00&#x60;，目前只支持到分钟，秒数会被忽略，但是需要严格按照此时间格式填写
- 如果未指定&#x60;repeatType&#x60;，则按指定的日期和时间执行一次
- 如果指定了&#x60;repeatType&#x60;，则此属性指定的时间点，表示从这个时间之后开始按照重复周期执行定时任务

     *
     * @return
     */
    public String getLaunchTime() {
        return launchTime;
    }

    /**
     * set 定时任务触发的时间点
时间格式：&#x60;2023-05-10 10:10:00&#x60;，目前只支持到分钟，秒数会被忽略，但是需要严格按照此时间格式填写
- 如果未指定&#x60;repeatType&#x60;，则按指定的日期和时间执行一次
- 如果指定了&#x60;repeatType&#x60;，则此属性指定的时间点，表示从这个时间之后开始按照重复周期执行定时任务

     *
     * @param launchTime
     */
    public void setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
    }


    /**
     * get 重复执行定时任务的类型，如果&#x60;repeatType&#x60;有值，则&#x60;repeatValue&#x60;也会有值
取值范围：[&#x60;Daily&#x60;,&#x60;Weekly&#x60;,&#x60;Monthly&#x60;,&#x60;Cron&#x60;]
- Daily：每多少天重复执行一次定时任务
- Weekly：每周指定几天重复执行一次定时任务
- Monthly：每月内指定几天重复执行一次定时任务
- Cron：按照指定的Cron表达式执行定时任务

     *
     * @return
     */
    public String getRepeatType() {
        return repeatType;
    }

    /**
     * set 重复执行定时任务的类型，如果&#x60;repeatType&#x60;有值，则&#x60;repeatValue&#x60;也会有值
取值范围：[&#x60;Daily&#x60;,&#x60;Weekly&#x60;,&#x60;Monthly&#x60;,&#x60;Cron&#x60;]
- Daily：每多少天重复执行一次定时任务
- Weekly：每周指定几天重复执行一次定时任务
- Monthly：每月内指定几天重复执行一次定时任务
- Cron：按照指定的Cron表达式执行定时任务

     *
     * @param repeatType
     */
    public void setRepeatType(String repeatType) {
        this.repeatType = repeatType;
    }


    /**
     * get 重复执行定时任务的数值，如果&#x60;repeatType&#x60;有值，则&#x60;repeatValue&#x60;也会有值
- &#x60;repeatType&#x60;取值为&#x60;Daily&#x60;时，只能填一个值，取值范围：[ &#x60;1&#x60; ~ &#x60;31&#x60; ]，表示：每几天执行
- &#x60;repeatType&#x60;取值为&#x60;Weekly&#x60;时，可以填入多个值，填多个值时使用半角逗号（,）分隔。取值范围：[&#x60;0&#x60;,&#x60;1&#x60;,&#x60;2&#x60;,&#x60;3&#x60;,&#x60;4&#x60;,&#x60;5&#x60;,&#x60;6&#x60;]，分别对应：周日、周一、周二、周三、周四、周五、周六，表示：每周几执行
- &#x60;repeatType&#x60;取值为&#x60;Monthly&#x60;时，格式为A-B。A、B的取值范围：[ &#x60;1&#x60; ~ &#x60;31&#x60; ]，并且B必须大于等于A，表示：每个月的几号到几号执行
- &#x60;repeatType&#x60;取值为&#x60;Cron&#x60;时，必须填写Cron表达式，不支持秒，最小单位为分钟

支持的Cron格式如下：
*    *    *    *    *   从左到右依次表示：&#x60;[分] [小时] [日] [月] [周]&#x60;

- 分，取值范围：[&#x60;0&#x60; ~ &#x60;59&#x60;]，允许的连接符号取值范围：[&#x60;*&#x60; &#x60;/&#x60; &#x60;,&#x60; &#x60;-&#x60;]
- 小时，取值范围：[&#x60;0&#x60; ~ &#x60;23&#x60;]，允许的连接符号取值范围：[&#x60;*&#x60; &#x60;/&#x60; &#x60;,&#x60; &#x60;-&#x60;]
- 日，取值范围：[&#x60;1&#x60; ~ &#x60;31&#x60;]，允许的连接符号取值范围：[&#x60;*&#x60; &#x60;/&#x60; &#x60;,&#x60; &#x60;-&#x60; &#x60;?&#x60;]
- 月，取值范围：[&#x60;1&#x60; ~ &#x60;12&#x60;]，允许的连接符号取值范围：[&#x60;*&#x60; &#x60;/&#x60; &#x60;,&#x60; &#x60;-&#x60;]
- 周，取值范围：[&#x60;0&#x60; ~ &#x60;6&#x60;]，允许的连接符号取值范围：[&#x60;*&#x60; &#x60;/&#x60; &#x60;,&#x60; &#x60;-&#x60; &#x60;?&#x60;]

符号解析：&#x60;*&#x60;表示任意值，&#x60;/&#x60;表示步长，&#x60;,&#x60;表示多个值，&#x60;-&#x60;表示范围，&#x60;?&#x60;表示不指定值

示例：0 10 * * *  表示：每天10点执行

     *
     * @return
     */
    public String getRepeatValue() {
        return repeatValue;
    }

    /**
     * set 重复执行定时任务的数值，如果&#x60;repeatType&#x60;有值，则&#x60;repeatValue&#x60;也会有值
- &#x60;repeatType&#x60;取值为&#x60;Daily&#x60;时，只能填一个值，取值范围：[ &#x60;1&#x60; ~ &#x60;31&#x60; ]，表示：每几天执行
- &#x60;repeatType&#x60;取值为&#x60;Weekly&#x60;时，可以填入多个值，填多个值时使用半角逗号（,）分隔。取值范围：[&#x60;0&#x60;,&#x60;1&#x60;,&#x60;2&#x60;,&#x60;3&#x60;,&#x60;4&#x60;,&#x60;5&#x60;,&#x60;6&#x60;]，分别对应：周日、周一、周二、周三、周四、周五、周六，表示：每周几执行
- &#x60;repeatType&#x60;取值为&#x60;Monthly&#x60;时，格式为A-B。A、B的取值范围：[ &#x60;1&#x60; ~ &#x60;31&#x60; ]，并且B必须大于等于A，表示：每个月的几号到几号执行
- &#x60;repeatType&#x60;取值为&#x60;Cron&#x60;时，必须填写Cron表达式，不支持秒，最小单位为分钟

支持的Cron格式如下：
*    *    *    *    *   从左到右依次表示：&#x60;[分] [小时] [日] [月] [周]&#x60;

- 分，取值范围：[&#x60;0&#x60; ~ &#x60;59&#x60;]，允许的连接符号取值范围：[&#x60;*&#x60; &#x60;/&#x60; &#x60;,&#x60; &#x60;-&#x60;]
- 小时，取值范围：[&#x60;0&#x60; ~ &#x60;23&#x60;]，允许的连接符号取值范围：[&#x60;*&#x60; &#x60;/&#x60; &#x60;,&#x60; &#x60;-&#x60;]
- 日，取值范围：[&#x60;1&#x60; ~ &#x60;31&#x60;]，允许的连接符号取值范围：[&#x60;*&#x60; &#x60;/&#x60; &#x60;,&#x60; &#x60;-&#x60; &#x60;?&#x60;]
- 月，取值范围：[&#x60;1&#x60; ~ &#x60;12&#x60;]，允许的连接符号取值范围：[&#x60;*&#x60; &#x60;/&#x60; &#x60;,&#x60; &#x60;-&#x60;]
- 周，取值范围：[&#x60;0&#x60; ~ &#x60;6&#x60;]，允许的连接符号取值范围：[&#x60;*&#x60; &#x60;/&#x60; &#x60;,&#x60; &#x60;-&#x60; &#x60;?&#x60;]

符号解析：&#x60;*&#x60;表示任意值，&#x60;/&#x60;表示步长，&#x60;,&#x60;表示多个值，&#x60;-&#x60;表示范围，&#x60;?&#x60;表示不指定值

示例：0 10 * * *  表示：每天10点执行

     *
     * @param repeatValue
     */
    public void setRepeatValue(String repeatValue) {
        this.repeatValue = repeatValue;
    }


    /**
     * get 重复执行定时任务的结束时间，若为空，表示不限制结束时间，一直重复执行
     *
     * @return
     */
    public String getRepeatEndTime() {
        return repeatEndTime;
    }

    /**
     * set 重复执行定时任务的结束时间，若为空，表示不限制结束时间，一直重复执行
     *
     * @param repeatEndTime
     */
    public void setRepeatEndTime(String repeatEndTime) {
        this.repeatEndTime = repeatEndTime;
    }


    /**
     * get 定时任务触发操作失败后，在此时间内重试，单位为秒
     *
     * @return
     */
    public Integer getLaunchExpirationTime() {
        return launchExpirationTime;
    }

    /**
     * set 定时任务触发操作失败后，在此时间内重试，单位为秒
     *
     * @param launchExpirationTime
     */
    public void setLaunchExpirationTime(Integer launchExpirationTime) {
        this.launchExpirationTime = launchExpirationTime;
    }


    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * get 定时任务状态，取值范围如下：
  - &#x60;Disabled&#x60;：已禁用
  - &#x60;Enabled&#x60;：已启用

     *
     * @return
     */
    public String getDisplayState() {
        return displayState;
    }

    /**
     * set 定时任务状态，取值范围如下：
  - &#x60;Disabled&#x60;：已禁用
  - &#x60;Enabled&#x60;：已启用

     *
     * @param displayState
     */
    public void setDisplayState(String displayState) {
        this.displayState = displayState;
    }



    /**
     * set 定时任务ID
     *
     * @param asCronId
     */
    public AsCronInfoByAsRule asCronId(String asCronId) {
        this.asCronId = asCronId;
        return this;
    }


    /**
     * set 定时任务名称
     *
     * @param name
     */
    public AsCronInfoByAsRule name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 定时任务描述
     *
     * @param description
     */
    public AsCronInfoByAsRule description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 定时任务触发的时间点
时间格式：&#x60;2023-05-10 10:10:00&#x60;，目前只支持到分钟，秒数会被忽略，但是需要严格按照此时间格式填写
- 如果未指定&#x60;repeatType&#x60;，则按指定的日期和时间执行一次
- 如果指定了&#x60;repeatType&#x60;，则此属性指定的时间点，表示从这个时间之后开始按照重复周期执行定时任务

     *
     * @param launchTime
     */
    public AsCronInfoByAsRule launchTime(String launchTime) {
        this.launchTime = launchTime;
        return this;
    }


    /**
     * set 重复执行定时任务的类型，如果&#x60;repeatType&#x60;有值，则&#x60;repeatValue&#x60;也会有值
取值范围：[&#x60;Daily&#x60;,&#x60;Weekly&#x60;,&#x60;Monthly&#x60;,&#x60;Cron&#x60;]
- Daily：每多少天重复执行一次定时任务
- Weekly：每周指定几天重复执行一次定时任务
- Monthly：每月内指定几天重复执行一次定时任务
- Cron：按照指定的Cron表达式执行定时任务

     *
     * @param repeatType
     */
    public AsCronInfoByAsRule repeatType(String repeatType) {
        this.repeatType = repeatType;
        return this;
    }


    /**
     * set 重复执行定时任务的数值，如果&#x60;repeatType&#x60;有值，则&#x60;repeatValue&#x60;也会有值
- &#x60;repeatType&#x60;取值为&#x60;Daily&#x60;时，只能填一个值，取值范围：[ &#x60;1&#x60; ~ &#x60;31&#x60; ]，表示：每几天执行
- &#x60;repeatType&#x60;取值为&#x60;Weekly&#x60;时，可以填入多个值，填多个值时使用半角逗号（,）分隔。取值范围：[&#x60;0&#x60;,&#x60;1&#x60;,&#x60;2&#x60;,&#x60;3&#x60;,&#x60;4&#x60;,&#x60;5&#x60;,&#x60;6&#x60;]，分别对应：周日、周一、周二、周三、周四、周五、周六，表示：每周几执行
- &#x60;repeatType&#x60;取值为&#x60;Monthly&#x60;时，格式为A-B。A、B的取值范围：[ &#x60;1&#x60; ~ &#x60;31&#x60; ]，并且B必须大于等于A，表示：每个月的几号到几号执行
- &#x60;repeatType&#x60;取值为&#x60;Cron&#x60;时，必须填写Cron表达式，不支持秒，最小单位为分钟

支持的Cron格式如下：
*    *    *    *    *   从左到右依次表示：&#x60;[分] [小时] [日] [月] [周]&#x60;

- 分，取值范围：[&#x60;0&#x60; ~ &#x60;59&#x60;]，允许的连接符号取值范围：[&#x60;*&#x60; &#x60;/&#x60; &#x60;,&#x60; &#x60;-&#x60;]
- 小时，取值范围：[&#x60;0&#x60; ~ &#x60;23&#x60;]，允许的连接符号取值范围：[&#x60;*&#x60; &#x60;/&#x60; &#x60;,&#x60; &#x60;-&#x60;]
- 日，取值范围：[&#x60;1&#x60; ~ &#x60;31&#x60;]，允许的连接符号取值范围：[&#x60;*&#x60; &#x60;/&#x60; &#x60;,&#x60; &#x60;-&#x60; &#x60;?&#x60;]
- 月，取值范围：[&#x60;1&#x60; ~ &#x60;12&#x60;]，允许的连接符号取值范围：[&#x60;*&#x60; &#x60;/&#x60; &#x60;,&#x60; &#x60;-&#x60;]
- 周，取值范围：[&#x60;0&#x60; ~ &#x60;6&#x60;]，允许的连接符号取值范围：[&#x60;*&#x60; &#x60;/&#x60; &#x60;,&#x60; &#x60;-&#x60; &#x60;?&#x60;]

符号解析：&#x60;*&#x60;表示任意值，&#x60;/&#x60;表示步长，&#x60;,&#x60;表示多个值，&#x60;-&#x60;表示范围，&#x60;?&#x60;表示不指定值

示例：0 10 * * *  表示：每天10点执行

     *
     * @param repeatValue
     */
    public AsCronInfoByAsRule repeatValue(String repeatValue) {
        this.repeatValue = repeatValue;
        return this;
    }


    /**
     * set 重复执行定时任务的结束时间，若为空，表示不限制结束时间，一直重复执行
     *
     * @param repeatEndTime
     */
    public AsCronInfoByAsRule repeatEndTime(String repeatEndTime) {
        this.repeatEndTime = repeatEndTime;
        return this;
    }


    /**
     * set 定时任务触发操作失败后，在此时间内重试，单位为秒
     *
     * @param launchExpirationTime
     */
    public AsCronInfoByAsRule launchExpirationTime(Integer launchExpirationTime) {
        this.launchExpirationTime = launchExpirationTime;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createTime
     */
    public AsCronInfoByAsRule createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public AsCronInfoByAsRule updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set 定时任务状态，取值范围如下：
  - &#x60;Disabled&#x60;：已禁用
  - &#x60;Enabled&#x60;：已启用

     *
     * @param displayState
     */
    public AsCronInfoByAsRule displayState(String displayState) {
        this.displayState = displayState;
        return this;
    }


}