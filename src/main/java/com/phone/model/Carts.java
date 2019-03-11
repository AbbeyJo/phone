package com.phone.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: jiangxinyang
 * @Date: 2019/03/11 10:53
 * @Description: TODO
 */
@Data
@Table(name = "tb_cart")
public class Carts implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;

    private Integer productId;

    private Integer buyNum;

    private Date createUpdate;
}
