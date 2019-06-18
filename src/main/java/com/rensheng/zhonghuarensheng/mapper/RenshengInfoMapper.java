package com.rensheng.zhonghuarensheng.mapper;

import com.rensheng.zhonghuarensheng.entity.RenshengInfo;

import java.util.List;

/**
 * @author zhousheng
 * @date 2019-06-15 19:07
 */
public interface RenshengInfoMapper {


    /**
     * 根据产品编号查询
     *
     * @param rsCode
     * @return
     */
    RenshengInfo selectByCode(String productCode);


    int deleteByPrimaryKey(Integer id);

    int updateDeletedByPrimaryKey(Integer id);

    int insertSelective(RenshengInfo record);

    List<RenshengInfo> findAll(RenshengInfo renshengInfo);

    int updateByPrimaryKeySelective(RenshengInfo record);

}