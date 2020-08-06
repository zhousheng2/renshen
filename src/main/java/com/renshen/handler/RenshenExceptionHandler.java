package com.renshen.handler;

import com.renshen.exception.RenshenException;
import com.renshen.exception.ResponseBankException;
import com.renshen.VO.ResultVO;
import com.renshen.utils.ResultVOUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author zhousheng
 * @date 2019-06-15 19:07
 */
@ControllerAdvice
public class RenshenExceptionHandler {

    @ExceptionHandler(value = RenshenException.class)
    @ResponseBody
    public ResultVO handlerRenshengException(RenshenException e) {
        return ResultVOUtil.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = ResponseBankException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public void handleResponseBankException() {

    }
}
