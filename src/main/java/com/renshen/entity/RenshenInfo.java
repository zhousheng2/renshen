package com.renshen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Date;

/**
 * renshen_info
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RenshenInfo implements Serializable {

    private static final long serialVersionUID = 2492807547107043270L;

    /**
     * 产品主键
     */
    private Integer productId;

    /**
     * 产品编号
     */
    private String productCode;

    /**
     * 鉴定日期
     */
    @JsonFormat(pattern="yyyy/MM/dd")
    private Date checkDate;

    /**
     * 鉴定结果
     */
    private String checkResult;

    /**
     * 图片编号
     */
    private String imageCode;

    /**
     * 图片地址
     */
    private String imageUrl;

    /**
     * 种类
     */
    private String productType;

    /**
     * 是否合格
     */
    private String qualifiedFlag;

    /**
     * 产地
     */
    private String productOrigin;

    /**
     * 等级
     */
    private String productLevel;

    /**
     * 重量
     */
    private String productWeight;

    /**
     * 品名
     */
    private String productBrand;

    /**
     * 删除标识
     */
    private Boolean deletedFlag;

    /**
     * 创建时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 修改时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;


}