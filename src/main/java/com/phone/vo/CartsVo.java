package com.phone.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: jiangxinyang
 * @Date: 2019/03/11 12:42
 * @Description: TODO
 */

public class CartsVo implements Serializable {

    private Integer productId;
    private String productName;
    private String colorName;
    private Double price;
    private Integer buyNum;
    private String versionName;
    private String imgPath1;

  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getColorName() {
    return colorName;
  }

  public void setColorName(String colorName) {
    this.colorName = colorName;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Integer getBuyNum() {
    return buyNum;
  }

  public void setBuyNum(Integer buyNum) {
    this.buyNum = buyNum;
  }

  public String getVersionName() {
    return versionName;
  }

  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }

  public String getImgPath1() {
    return imgPath1;
  }

  public void setImgPath1(String imgPath1) {
    this.imgPath1 = imgPath1;
  }

  @Override
  public String toString() {
    return "CartsVo{" +
            "productId=" + productId +
            ", productName='" + productName + '\'' +
            ", colorName='" + colorName + '\'' +
            ", price=" + price +
            ", buyNum=" + buyNum +
            ", versionName='" + versionName + '\'' +
            ", imgPath1='" + imgPath1 + '\'' +
            '}';
  }
}
