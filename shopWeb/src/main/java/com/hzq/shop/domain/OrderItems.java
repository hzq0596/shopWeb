package com.hzq.shop.domain;

import java.util.Date;

public class OrderItems {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_items.order_item_id
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    private String orderItemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_items.order_code
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    private String orderCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_items.prod_price
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    private Float prodPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_items.prod_vip_price
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    private Float prodVipPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_items.order_date
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    private Date orderDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_items.points
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    private Integer points;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_items.prod_id
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    private Long prodId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_items.order_item_id
     *
     * @return the value of order_items.order_item_id
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public String getOrderItemId() {
        return orderItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_items.order_item_id
     *
     * @param orderItemId the value for order_items.order_item_id
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_items.order_code
     *
     * @return the value of order_items.order_code
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_items.order_code
     *
     * @param orderCode the value for order_items.order_code
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_items.prod_price
     *
     * @return the value of order_items.prod_price
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public Float getProdPrice() {
        return prodPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_items.prod_price
     *
     * @param prodPrice the value for order_items.prod_price
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public void setProdPrice(Float prodPrice) {
        this.prodPrice = prodPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_items.prod_vip_price
     *
     * @return the value of order_items.prod_vip_price
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public Float getProdVipPrice() {
        return prodVipPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_items.prod_vip_price
     *
     * @param prodVipPrice the value for order_items.prod_vip_price
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public void setProdVipPrice(Float prodVipPrice) {
        this.prodVipPrice = prodVipPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_items.order_date
     *
     * @return the value of order_items.order_date
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_items.order_date
     *
     * @param orderDate the value for order_items.order_date
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_items.points
     *
     * @return the value of order_items.points
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_items.points
     *
     * @param points the value for order_items.points
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public void setPoints(Integer points) {
        this.points = points;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_items.prod_id
     *
     * @return the value of order_items.prod_id
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public Long getProdId() {
        return prodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_items.prod_id
     *
     * @param prodId the value for order_items.prod_id
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }
}