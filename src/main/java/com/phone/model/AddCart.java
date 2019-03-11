package com.phone.form.news;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Auther: dengxiao
 * @Date: 2018/12/26 17:19
 * @Description:
 */
@Data
public class AddCart implements Serializable {

    /**商品id不能为空*/
    @NotNull(message = "商品id不能为空")
    private Integer title;

}
