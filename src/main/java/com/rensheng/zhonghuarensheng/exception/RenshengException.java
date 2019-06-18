package com.rensheng.zhonghuarensheng.exception;

import com.rensheng.zhonghuarensheng.enums.ResultEnum;
import lombok.Getter;

/**
 * @author zhousheng
 * @date 2019-06-15 19:07
 */
@Getter
public class RenshengException extends RuntimeException{

    private Integer code;

    public RenshengException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public RenshengException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
