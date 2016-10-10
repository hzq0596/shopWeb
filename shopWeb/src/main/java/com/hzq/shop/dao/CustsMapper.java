package com.hzq.shop.dao;

import com.hzq.shop.domain.Custs;
import com.hzq.shop.domain.CustsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custs
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    int countByExample(CustsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custs
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    int deleteByExample(CustsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custs
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    int deleteByPrimaryKey(Long custId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custs
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    int insert(Custs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custs
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    int insertSelective(Custs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custs
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    List<Custs> selectByExample(CustsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custs
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    Custs selectByPrimaryKey(Long custId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custs
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    int updateByExampleSelective(@Param("record") Custs record, @Param("example") CustsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custs
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    int updateByExample(@Param("record") Custs record, @Param("example") CustsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custs
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    int updateByPrimaryKeySelective(Custs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custs
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    int updateByPrimaryKey(Custs record);
}