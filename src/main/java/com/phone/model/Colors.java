package com.phone.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Auther: jiangxinyang
 * @Date: 2019/03/11 10:59
 * @Description: TODO
 */

@Table(name = "tb_color")
public class Colors implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer colorId;
    private Integer productId;
    private String colorName;
    private String colorImgPath;

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getColorImgPath() {
        return colorImgPath;
    }

    public void setColorImgPath(String colorImgPath) {
        this.colorImgPath = colorImgPath;
    }

    @Override
    public String toString() {
        return "Colors{" +
                "colorId=" + colorId +
                ", productId=" + productId +
                ", colorName='" + colorName + '\'' +
                ", colorImgPath='" + colorImgPath + '\'' +
                '}';
    }
}
