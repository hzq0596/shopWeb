package com.hzq.shop.domain;

import java.util.Date;

public class OrderItems {
    private String orderItemId;

    private String orderCode;

    private Float prodPrice;

    private Float prodVipPrice;

    private Date orderDate;

    private Integer points;

    private Long prodId;

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId == null ? null : orderItemId.trim();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Float getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(Float prodPrice) {
        this.prodPrice = prodPrice;
    }

    public Float getProdVipPrice() {
        return prodVipPrice;
    }

    public void setProdVipPrice(Float prodVipPrice) {
        this.prodVipPrice = prodVipPrice;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }
}