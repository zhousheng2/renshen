package com.rensheng.zhonghuarensheng.handler;

import com.rensheng.zhonghuarensheng.VO.ResultVO;
import com.rensheng.zhonghuarensheng.exception.RenshengException;
import com.rensheng.zhonghuarensheng.exception.ResponseBankException;
import com.rensheng.zhonghuarensheng.utils.ResultVOUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhousheng
 * @date 2019-06-15 19:07
 */
@ControllerAdvice
public class RenshengExceptionHandler {

    @ExceptionHandler(value = RenshengException.class)
    @ResponseBody
    public ResultVO handlerRenshengException(RenshengException e) {
        return ResultVOUtil.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = ResponseBankException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public void handleResponseBankException() {

    }
}
