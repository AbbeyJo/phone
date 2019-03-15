package com.phone.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Table(name = "tb_product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String brandId;

    private Integer orderDetailId;
    private String productNumber;

    private String productName;
    private String productDescribe;

    private String sellPoint;
    private Float productSize;

    private Boolean isSelling;
    private Boolean isBoutique;
    private String imgUrl;
    private Boolean isShelf;

    private List<Version> version;

    private List<Colors> colors;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescribe() {
        return productDescribe;
    }

    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe;
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    public Float getProductSize() {
        return productSize;
    }

    public void setProductSize(Float productSize) {
        this.productSize = productSize;
    }

    public Boolean getSelling() {
        return isSelling;
    }

    public void setSelling(Boolean selling) {
        isSelling = selling;
    }

    public Boolean getBoutique() {
        return isBoutique;
    }

    public void setBoutique(Boolean boutique) {
        isBoutique = boutique;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Boolean getShelf() {
        return isShelf;
    }

    public void setShelf(Boolean shelf) {
        isShelf = shelf;
    }

    public List<Version> getVersion() {
        return version;
    }

    public void setVersion(List<Version> version) {
        this.version = version;
    }

    public List<Colors> getColors() {
        return colors;
    }

    public void setColors(List<Colors> colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", brandId='" + brandId + '\'' +
                ", orderDetailId=" + orderDetailId +
                ", productNumber='" + productNumber + '\'' +
                ", productName='" + productName + '\'' +
                ", productDescribe='" + productDescribe + '\'' +
                ", sellPoint='" + sellPoint + '\'' +
                ", productSize=" + productSize +
                ", isSelling=" + isSelling +
                ", isBoutique=" + isBoutique +
                ", imgUrl='" + imgUrl + '\'' +
                ", isShelf=" + isShelf +
                ", version=" + version +
                ", colors=" + colors +
                '}';
    }
}
