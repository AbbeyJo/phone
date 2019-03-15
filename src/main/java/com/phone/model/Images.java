package com.phone.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Auther: Deng.Xiao
 * @Date: 2019/3/7
 * @Description:
 */
@Table(name = "tb_imgs")
public class Images implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer imgId;
    private Integer productId;
    private String imgPath1;
    private String imgPath2;
    private String imgPath3;
    private String imgPath4;
    private String imgPath5;

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getImgPath1() {
        return imgPath1;
    }

    public void setImgPath1(String imgPath1) {
        this.imgPath1 = imgPath1;
    }

    public String getImgPath2() {
        return imgPath2;
    }

    public void setImgPath2(String imgPath2) {
        this.imgPath2 = imgPath2;
    }

    public String getImgPath3() {
        return imgPath3;
    }

    public void setImgPath3(String imgPath3) {
        this.imgPath3 = imgPath3;
    }

    public String getImgPath4() {
        return imgPath4;
    }

    public void setImgPath4(String imgPath4) {
        this.imgPath4 = imgPath4;
    }

    public String getImgPath5() {
        return imgPath5;
    }

    public void setImgPath5(String imgPath5) {
        this.imgPath5 = imgPath5;
    }

    @Override
    public String toString() {
        return "Images{" +
                "imgId=" + imgId +
                ", productId=" + productId +
                ", imgPath1='" + imgPath1 + '\'' +
                ", imgPath2='" + imgPath2 + '\'' +
                ", imgPath3='" + imgPath3 + '\'' +
                ", imgPath4='" + imgPath4 + '\'' +
                ", imgPath5='" + imgPath5 + '\'' +
                '}';
    }
}
