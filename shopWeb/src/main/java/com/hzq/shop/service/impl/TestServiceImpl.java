package com.hzq.shop.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzq.shop.dao.CustsMapper;
import com.hzq.shop.domain.Custs;
import com.hzq.shop.domain.CustsExample;
import com.hzq.shop.service.TestService;
import com.hzq.shop.utils.MD5;

/**
 * 
 * @ClassName: TestService 
 * @Description: TODO
 * @author: xiaoquan
 * @date: 2016年10月12日 下午7:16:23
 */
@Service("testService")
public class TestServiceImpl implements TestService {
	@Autowired
	private CustsMapper custs;
	/**
	 * 
	 * @Title: testLogin 
	 * @Description: TODO
	 * @param loginName
	 * @param password
	 * @return
	 * @return: String
	 */
	@Override
	public String testLogin(String loginName, String password) {
		 
		CustsExample example = new CustsExample();
	example.createCriteria().andCustNameEqualTo(loginName);
	example.createCriteria().andCustPassEqualTo(MD5.md5(password));
	 List<Custs> list =	 custs.selectByExample(example);
		return list.size()+"";
	}
	
	
	
}
