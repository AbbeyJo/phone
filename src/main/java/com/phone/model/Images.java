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
@Data
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


}
