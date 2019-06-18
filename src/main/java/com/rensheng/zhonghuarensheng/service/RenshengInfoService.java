package com.rensheng.zhonghuarensheng.service;

import com.rensheng.zhonghuarensheng.entity.RenshengInfo;

import java.util.List;

/**
 * @author zhousheng
 * @date 2019-06-14 22:02
 */
public interface RenshengInfoService {

    int deleteByPrimaryKey(Integer id) throws Exception;

    int updateDeletedByPrimaryKey(Integer id) throws Exception;

    int insertSelective(RenshengInfo record) throws Exception;

    List<RenshengInfo> findAll(RenshengInfo renshengInfo) throws Exception;

    RenshengInfo selectByCode(String productCode)throws Exception;

    int updateByPrimaryKeySelective(RenshengInfo record) throws Exception;
}
