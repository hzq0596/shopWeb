package com.hzq.shop.domain;

import java.util.Date;

public class Orders {
    private String orderCode;

    private Float pointDiscount;

    private Date orderDate;

    private Long custDetailId;

    private Long addrId;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Float getPointDiscount() {
        return pointDiscount;
    }

    public void setPointDiscount(Float pointDiscount) {
        this.pointDiscount = pointDiscount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getCustDetailId() {
        return custDetailId;
    }

    public void setCustDetailId(Long custDetailId) {
        this.custDetailId = custDetailId;
    }

    public Long getAddrId() {
        return addrId;
    }

    public void setAddrId(Long addrId) {
        this.addrId = addrId;
    }
}