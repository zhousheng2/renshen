package com.renshen.service.impl;

import com.renshen.exception.RenshenException;
import com.renshen.service.RenshenInfoService;
import com.renshen.entity.RenshenInfo;
import com.renshen.enums.ResultEnum;
import com.renshen.mapper.RenshenInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhousheng
 * @date 2019-06-14 22:21
 */
@Service
public class RenshenInfoServiceImpl implements RenshenInfoService {
    @Autowired
    private RenshenInfoMapper renshengInfoMapper;

    @Override
    public RenshenInfo selectByCode(String productCode) {
        RenshenInfo renshengInfo= renshengInfoMapper.selectByCode(productCode);
        if (renshengInfo == null) {
            throw new RenshenException(ResultEnum.RENSHENG_NOT_EXIST);
        }
        return renshengInfo;
    }




    @Override
    public int deleteByPrimaryKey(Integer id) throws Exception {
        return renshengInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateDeletedByPrimaryKey(Integer id) throws Exception {
        return renshengInfoMapper.updateDeletedByPrimaryKey(id);
    }

    @Override
    public int insertSelective(RenshenInfo record) throws Exception {
        return renshengInfoMapper.insertSelective(record);
    }

    @Override
    public List<RenshenInfo> findAll(RenshenInfo renshengInfo) throws Exception {
        return renshengInfoMapper.findAll(renshengInfo);
    }

    @Override
    public int updateByPrimaryKeySelective(RenshenInfo record) throws Exception {
        return renshengInfoMapper.updateByPrimaryKeySelective(record);
    }
}
