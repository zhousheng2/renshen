package com.renshen.exception;

import com.renshen.enums.ResultEnum;
import lombok.Getter;

/**
 * @author zhousheng
 * @date 2019-06-15 19:07
 */
@Getter
public class RenshenException extends RuntimeException{

    private Integer code;

    public RenshenException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public RenshenException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
