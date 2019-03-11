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

@Data
@Table(name = "tb_color")
public class Colors implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer colorId;
    private Integer productId;
    private String colorName;
    private String colorImgPath;
}
