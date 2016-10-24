package com.hzq.shop.dao;

import java.util.List;
import java.util.Map;

import com.hzq.shop.domain.Cust;

public interface CustMapper {
    int deleteByPrimaryKey(Long custDetailId);

    int insert(Cust record);

    int insertSelective(Cust record);

    Cust selectByPrimaryKey(Long custDetailId);

    int updateByPrimaryKeySelective(Cust record);

    int updateByPrimaryKey(Cust record);

	List<Cust> selectCustByMap(Map<String, Object> params);
}