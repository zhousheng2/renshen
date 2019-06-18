package com.rensheng.zhonghuarensheng.utils;

import com.rensheng.zhonghuarensheng.VO.ResultVO;
import com.rensheng.zhonghuarensheng.enums.ResultEnum;

/**
 * @author zhousheng
 * @date 2019-06-15 19:07
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(ResultEnum.SUCCESS.getCode());
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
