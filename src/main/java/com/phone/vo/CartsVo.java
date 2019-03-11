package com.phone.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: jiangxinyang
 * @Date: 2019/03/11 12:42
 * @Description: TODO
 */
@Data
public class CartsVo implements Serializable {

    private Integer productId;
    private String productName;
    private String brandName;
    private String colorName;
    private Double price;
    private Integer buyNum;
    private String versionName;
    private String imgPath1;
}
