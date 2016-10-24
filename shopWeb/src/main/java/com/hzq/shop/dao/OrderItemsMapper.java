package com.hzq.shop.dao;

import com.hzq.shop.domain.OrderItems;

public interface OrderItemsMapper {
    int deleteByPrimaryKey(String orderItemId);

    int insert(OrderItems record);

    int insertSelective(OrderItems record);

    OrderItems selectByPrimaryKey(String orderItemId);

    int updateByPrimaryKeySelective(OrderItems record);

    int updateByPrimaryKey(OrderItems record);
}