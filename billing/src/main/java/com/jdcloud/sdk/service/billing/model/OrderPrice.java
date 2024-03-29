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

package com.jdcloud.sdk.service.billing.model;

import java.util.List;
import java.util.ArrayList;

/**
 * orderPrice
 */
public class OrderPrice  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 折扣前总价
     */
    private Number totalPrice;

    /**
     * 折扣前总价4位
     */
    private Number totalPriceScale4;

    /**
     * 折扣后订单价格
     */
    private Number discountedTotalPrice;

    /**
     * 总折扣金额
     */
    private Number totalDiscount;

    /**
     * 计算完价格后的详细订单列表
     */
    
    private List<OrderPriceDetail> list;
    /**
     * 订单原价 包年时 一年原价为12个月价格，totalPrice为10个月价格
     */
    private Number totalOriginalPrice;

    /**
     * 参与优惠的明细
     */
    private Integer favorableInfos;

    /**
     * 备注
     */
    private Integer remark;



    /**
     * get 折扣前总价
     *
     * @return
     */
    public Number getTotalPrice() {
        return totalPrice;
    }

    /**
     * set 折扣前总价
     *
     * @param totalPrice
     */
    public void setTotalPrice(Number totalPrice) {
        this.totalPrice = totalPrice;
    }


    /**
     * get 折扣前总价4位
     *
     * @return
     */
    public Number getTotalPriceScale4() {
        return totalPriceScale4;
    }

    /**
     * set 折扣前总价4位
     *
     * @param totalPriceScale4
     */
    public void setTotalPriceScale4(Number totalPriceScale4) {
        this.totalPriceScale4 = totalPriceScale4;
    }


    /**
     * get 折扣后订单价格
     *
     * @return
     */
    public Number getDiscountedTotalPrice() {
        return discountedTotalPrice;
    }

    /**
     * set 折扣后订单价格
     *
     * @param discountedTotalPrice
     */
    public void setDiscountedTotalPrice(Number discountedTotalPrice) {
        this.discountedTotalPrice = discountedTotalPrice;
    }


    /**
     * get 总折扣金额
     *
     * @return
     */
    public Number getTotalDiscount() {
        return totalDiscount;
    }

    /**
     * set 总折扣金额
     *
     * @param totalDiscount
     */
    public void setTotalDiscount(Number totalDiscount) {
        this.totalDiscount = totalDiscount;
    }


    /**
    * get 计算完价格后的详细订单列表
    *
    * @return
    */
    public List<OrderPriceDetail> getList() {
        return list;
    }

    /**
    * set 计算完价格后的详细订单列表
    *
    * @param list
    */
    public void setList(List<OrderPriceDetail> list) {
        this.list = list;
    }


    /**
     * get 订单原价 包年时 一年原价为12个月价格，totalPrice为10个月价格
     *
     * @return
     */
    public Number getTotalOriginalPrice() {
        return totalOriginalPrice;
    }

    /**
     * set 订单原价 包年时 一年原价为12个月价格，totalPrice为10个月价格
     *
     * @param totalOriginalPrice
     */
    public void setTotalOriginalPrice(Number totalOriginalPrice) {
        this.totalOriginalPrice = totalOriginalPrice;
    }


    /**
     * get 参与优惠的明细
     *
     * @return
     */
    public Integer getFavorableInfos() {
        return favorableInfos;
    }

    /**
     * set 参与优惠的明细
     *
     * @param favorableInfos
     */
    public void setFavorableInfos(Integer favorableInfos) {
        this.favorableInfos = favorableInfos;
    }


    /**
     * get 备注
     *
     * @return
     */
    public Integer getRemark() {
        return remark;
    }

    /**
     * set 备注
     *
     * @param remark
     */
    public void setRemark(Integer remark) {
        this.remark = remark;
    }



    /**
     * set 折扣前总价
     *
     * @param totalPrice
     */
    public OrderPrice totalPrice(Number totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }


    /**
     * set 折扣前总价4位
     *
     * @param totalPriceScale4
     */
    public OrderPrice totalPriceScale4(Number totalPriceScale4) {
        this.totalPriceScale4 = totalPriceScale4;
        return this;
    }


    /**
     * set 折扣后订单价格
     *
     * @param discountedTotalPrice
     */
    public OrderPrice discountedTotalPrice(Number discountedTotalPrice) {
        this.discountedTotalPrice = discountedTotalPrice;
        return this;
    }


    /**
     * set 总折扣金额
     *
     * @param totalDiscount
     */
    public OrderPrice totalDiscount(Number totalDiscount) {
        this.totalDiscount = totalDiscount;
        return this;
    }


    /**
    * set 计算完价格后的详细订单列表
    *
    * @param list
    */
    public OrderPrice list(List<OrderPriceDetail> list) {
        this.list = list;
        return this;
    }


    /**
     * set 订单原价 包年时 一年原价为12个月价格，totalPrice为10个月价格
     *
     * @param totalOriginalPrice
     */
    public OrderPrice totalOriginalPrice(Number totalOriginalPrice) {
        this.totalOriginalPrice = totalOriginalPrice;
        return this;
    }


    /**
     * set 参与优惠的明细
     *
     * @param favorableInfos
     */
    public OrderPrice favorableInfos(Integer favorableInfos) {
        this.favorableInfos = favorableInfos;
        return this;
    }


    /**
     * set 备注
     *
     * @param remark
     */
    public OrderPrice remark(Integer remark) {
        this.remark = remark;
        return this;
    }



    /**
     * add item to 计算完价格后的详细订单列表
     *
     * @param list
     */
    public void addList(OrderPriceDetail list) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(list);
    }
}