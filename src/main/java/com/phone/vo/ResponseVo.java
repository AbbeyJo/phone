package com.phone.vo;

import lombok.Data;
import org.omg.PortableInterceptor.ObjectReferenceFactory;

import java.io.Serializable;

/**
 * @Auther: Deng.Xiao
 * @Date: 2019/3/11
 * @Description:
 */
@Data
public class ResponseVo implements Serializable {

    private Object data;

    private Integer code;

    private String message;

    public static ResponseVo error(Object data, Integer code, String message) {
        ResponseVo rv = new ResponseVo();
        rv.data = data;
        rv.code = code;
        rv.message = message;
        return rv;
    }

    public static ResponseVo error(Integer code, String message) {
        ResponseVo rv = new ResponseVo();
        rv.code = code;
        rv.message = message;
        return rv;
    }

    public static ResponseVo OK(Object data) {
        ResponseVo rv = new ResponseVo();
        rv.data = data;
        rv.code = 200;
        rv.message = "SUCCESS";
        return rv;
    }

    public static ResponseVo OK(Integer code, String message) {
        ResponseVo rv = new ResponseVo();
        rv.code = code;
        rv.message = message;
        return rv;
    }

}
