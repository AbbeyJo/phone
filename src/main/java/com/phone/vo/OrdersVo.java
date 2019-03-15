package com.phone.vo;

import java.io.Serializable;


public class OrdersVo implements Serializable {

    private Integer id;
    private Integer userId;
    private Integer productId;
    private Integer productCount;
    private Integer payStatus;
    private String color;
    private String version;
    private String imgUrl;
    private String productName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "OrdersVo{" +
                "id=" + id +
                ", userId=" + userId +
                ", productId=" + productId +
                ", productCount=" + productCount +
                ", payStatus=" + payStatus +
                ", color='" + color + '\'' +
                ", version='" + version + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }
}
