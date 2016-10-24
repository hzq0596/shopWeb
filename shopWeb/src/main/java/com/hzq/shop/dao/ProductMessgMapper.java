package com.hzq.shop.dao;

import com.hzq.shop.domain.ProductMessg;

public interface ProductMessgMapper {
    int deleteByPrimaryKey(Long prodId);

    int insert(ProductMessg record);

    int insertSelective(ProductMessg record);

    ProductMessg selectByPrimaryKey(Long prodId);

    int updateByPrimaryKeySelective(ProductMessg record);

    int updateByPrimaryKey(ProductMessg record);
}