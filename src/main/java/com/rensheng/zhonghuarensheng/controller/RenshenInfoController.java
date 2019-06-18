package com.rensheng.zhonghuarensheng.controller;

import com.rensheng.zhonghuarensheng.VO.ResultVO;
import com.rensheng.zhonghuarensheng.entity.RenshengInfo;
import com.rensheng.zhonghuarensheng.enums.ResultEnum;
import com.rensheng.zhonghuarensheng.exception.RenshengException;
import com.rensheng.zhonghuarensheng.service.RenshengInfoService;
import com.rensheng.zhonghuarensheng.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author zhousheng
 * @date 2019-06-14 22:37
 */
@RestController
@RequestMapping("/renshenInfo")
public class RenshenInfoController {
    @Autowired
    private RenshengInfoService renshengInfoService;


    /**
     * 展示
     * @param productCode
     * @return
     */
    @GetMapping("/detail")
    public ResultVO<RenshengInfo> getRenshenInfoDetail(
            @RequestParam(value = "productCode", required = true) String productCode) throws Exception{
        RenshengInfo renshengInfo = null;
        if (!StringUtils.isEmpty(productCode)) {
            renshengInfo = renshengInfoService.selectByCode(productCode);
        }
        return ResultVOUtil.success(renshengInfo);
    }

}
