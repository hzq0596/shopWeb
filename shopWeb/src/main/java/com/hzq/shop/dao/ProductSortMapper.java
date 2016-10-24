package com.hzq.shop.dao;

import com.hzq.shop.domain.ProductSort;

public interface ProductSortMapper {
    int deleteByPrimaryKey(Long sortId);

    int insert(ProductSort record);

    int insertSelective(ProductSort record);

    ProductSort selectByPrimaryKey(Long sortId);

    int updateByPrimaryKeySelective(ProductSort record);

    int updateByPrimaryKey(ProductSort record);
}