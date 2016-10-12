package com.hzq.shop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hzq.shop.domain.Address;
import com.hzq.shop.domain.AddressExample;

public interface AddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    int countByExample(AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    int deleteByExample(AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    int deleteByPrimaryKey(Long addrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    int insert(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    int insertSelective(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    List<Address> selectByExample(AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    Address selectByPrimaryKey(Long addrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    int updateByPrimaryKeySelective(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    int updateByPrimaryKey(Address record);
}