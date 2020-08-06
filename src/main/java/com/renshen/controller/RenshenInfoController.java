package com.renshen.controller;

import com.renshen.VO.ResultVO;
import com.renshen.entity.RenshenInfo;
import com.renshen.service.RenshenInfoService;
import com.renshen.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhousheng
 * @date 2019-06-14 22:37
 */
@RestController
@RequestMapping("/renshenInfo")
public class RenshenInfoController {
    @Autowired
    private RenshenInfoService renshengInfoService;


    /**
     * 展示
     * @param productCode
     * @return
     */
    @GetMapping("/detail")
    public ResultVO<RenshenInfo> getRenshenInfoDetail(
            @RequestParam(value = "productCode", required = true) String productCode) throws Exception{
        RenshenInfo renshengInfo = null;
        if (!StringUtils.isEmpty(productCode)) {
            renshengInfo = renshengInfoService.selectByCode(productCode);
        }
        return ResultVOUtil.success(renshengInfo);
    }

}
