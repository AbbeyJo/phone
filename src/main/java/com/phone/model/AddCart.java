package com.phone.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Auther: dengxiao
 * @Date: 2018/12/26 17:19
 * @Description:
 */
public class AddCart implements Serializable {

    /**商品id不能为空*/
    @NotNull(message = "商品id不能为空")
    private Integer title;

    public Integer getTitle() {
        return title;
    }

    public void setTitle(Integer title) {
        this.title = title;
    }
}
