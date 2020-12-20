package com.renshen.enums;

import lombok.Getter;

/**
 * @author zhousheng
 * @date 2019-06-15 19:07
 */
@Getter
public enum ResultEnum {

    /**
     * 成功
     */
    SUCCESS(1000, "成功"),

    /**
     * 产品不存在
     */
    RENSHENG_NOT_EXIST(1001, "产品不存在!")


    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
