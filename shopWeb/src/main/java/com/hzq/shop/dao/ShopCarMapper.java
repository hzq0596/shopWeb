package com.hzq.shop.dao;

import com.hzq.shop.domain.ShopCar;

public interface ShopCarMapper {
    int deleteByPrimaryKey(Long cartId);

    int insert(ShopCar record);

    int insertSelective(ShopCar record);

    ShopCar selectByPrimaryKey(Long cartId);

    int updateByPrimaryKeySelective(ShopCar record);

    int updateByPrimaryKey(ShopCar record);
}