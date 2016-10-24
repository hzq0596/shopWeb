package com.hzq.shop.domain;

import java.util.Date;

public class ProductMessg {
    private Long prodId;

    private String prodName;

    private String prodStatus;

    private Long sortId;

    private Date prodPublishDate;

    private String prodPhotoUrl;

    private Float prodPrice;

    private Float prodVipPrice;

    private Integer prodNum;

    private String prodUnit;

    private String prodIntroduction;

    private Date prodStartSale;

    private Date prodStopSale;

    private Integer prodPoints;

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    public String getProdStatus() {
        return prodStatus;
    }

    public void setProdStatus(String prodStatus) {
        this.prodStatus = prodStatus == null ? null : prodStatus.trim();
    }

    public Long getSortId() {
        return sortId;
    }

    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }

    public Date getProdPublishDate() {
        return prodPublishDate;
    }

    public void setProdPublishDate(Date prodPublishDate) {
        this.prodPublishDate = prodPublishDate;
    }

    public String getProdPhotoUrl() {
        return prodPhotoUrl;
    }

    public void setProdPhotoUrl(String prodPhotoUrl) {
        this.prodPhotoUrl = prodPhotoUrl == null ? null : prodPhotoUrl.trim();
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

    public Integer getProdNum() {
        return prodNum;
    }

    public void setProdNum(Integer prodNum) {
        this.prodNum = prodNum;
    }

    public String getProdUnit() {
        return prodUnit;
    }

    public void setProdUnit(String prodUnit) {
        this.prodUnit = prodUnit == null ? null : prodUnit.trim();
    }

    public String getProdIntroduction() {
        return prodIntroduction;
    }

    public void setProdIntroduction(String prodIntroduction) {
        this.prodIntroduction = prodIntroduction == null ? null : prodIntroduction.trim();
    }

    public Date getProdStartSale() {
        return prodStartSale;
    }

    public void setProdStartSale(Date prodStartSale) {
        this.prodStartSale = prodStartSale;
    }

    public Date getProdStopSale() {
        return prodStopSale;
    }

    public void setProdStopSale(Date prodStopSale) {
        this.prodStopSale = prodStopSale;
    }

    public Integer getProdPoints() {
        return prodPoints;
    }

    public void setProdPoints(Integer prodPoints) {
        this.prodPoints = prodPoints;
    }
}