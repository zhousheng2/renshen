package com.rensheng.zhonghuarensheng.service.impl;

import com.rensheng.zhonghuarensheng.entity.RenshengInfo;
import com.rensheng.zhonghuarensheng.enums.ResultEnum;
import com.rensheng.zhonghuarensheng.exception.RenshengException;
import com.rensheng.zhonghuarensheng.mapper.RenshengInfoMapper;
import com.rensheng.zhonghuarensheng.service.RenshengInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhousheng
 * @date 2019-06-14 22:21
 */
@Service
public class RenshengInfoServiceImpl implements RenshengInfoService {
    @Autowired
    private RenshengInfoMapper renshengInfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) throws Exception {
        return renshengInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateDeletedByPrimaryKey(Integer id) throws Exception {
        return renshengInfoMapper.updateDeletedByPrimaryKey(id);
    }

    @Override
    public int insertSelective(RenshengInfo record) throws Exception {
        return renshengInfoMapper.insertSelective(record);
    }

    @Override
    public List<RenshengInfo> findAll(RenshengInfo renshengInfo) throws Exception {
        return renshengInfoMapper.findAll(renshengInfo);
    }

    @Override
    public RenshengInfo selectByCode(String productCode) throws Exception {
        RenshengInfo renshengInfo= renshengInfoMapper.selectByCode(productCode);
        if (renshengInfo == null) {
            throw new RenshengException(ResultEnum.RENSHENG_NOT_EXIST);
        }
        return renshengInfo;
    }

    @Override
    public int updateByPrimaryKeySelective(RenshengInfo record) throws Exception {
        return renshengInfoMapper.updateByPrimaryKeySelective(record);
    }
}
