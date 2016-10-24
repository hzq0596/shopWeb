package com.hzq.shop.dao;

import com.hzq.shop.domain.Orders;

public interface OrdersMapper {
    int deleteByPrimaryKey(String orderCode);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(String orderCode);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}