package com.renshen.mapper;

import com.renshen.entity.RenshenInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zhousheng
 * @date 2019-06-15 19:07
 */
@Mapper
public interface RenshenInfoMapper {


    /**
     * 根据产品编号查询
     *
     * @param productCode
     * @return
     */
    RenshenInfo selectByCode(String productCode);


    int deleteByPrimaryKey(Integer id);

    int updateDeletedByPrimaryKey(Integer id);

    int insertSelective(RenshenInfo record);

    List<RenshenInfo> findAll(RenshenInfo renshengInfo);

    int updateByPrimaryKeySelective(RenshenInfo record);

}