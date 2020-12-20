package com.renshen.service;

import com.renshen.entity.RenshenInfo;

import java.util.List;

/**
 * @author zhousheng
 * @date 2019-06-14 22:02
 */
public interface RenshenInfoService {


    /**
     * 根据商品编号查询商品
     *
     * @param productCode
     * @return
     * @throws Exception
     */
    RenshenInfo selectByCode(String productCode);





    int deleteByPrimaryKey(Integer id) throws Exception;

    int updateDeletedByPrimaryKey(Integer id) throws Exception;

    int insertSelective(RenshenInfo record) throws Exception;

    List<RenshenInfo> findAll(RenshenInfo renshengInfo) throws Exception;

    int updateByPrimaryKeySelective(RenshenInfo record) throws Exception;
}
