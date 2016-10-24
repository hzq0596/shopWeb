package com.hzq.shop.domain;

import java.util.Date;

public class ShopCar {
    private Long cartId;

    private Long custDetailId;

    private Long prodId;

    private Integer num;

    private Date addTime;

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Long getCustDetailId() {
        return custDetailId;
    }

    public void setCustDetailId(Long custDetailId) {
        this.custDetailId = custDetailId;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}