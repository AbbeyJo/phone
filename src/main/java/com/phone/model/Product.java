package com.phone.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Table(name = "tb_product")
@Data
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

    private List<Version> version;

    private List<Colors> colors;

}
