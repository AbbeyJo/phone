package com.phone.vo;

import lombok.Data;
import java.io.Serializable;

/**
 * @Auther: Deng.Xiao
 * @Date: 2019/3/11
 * @Description:
 */
public class ResponseVo implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Object data;

    private Integer code;

    private String message;
    
    

    public ResponseVo() {
	}

	public static ResponseVo OK(Object data, Integer code, String message) {
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

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

    
}
