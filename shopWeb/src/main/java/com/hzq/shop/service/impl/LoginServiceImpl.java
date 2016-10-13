package com.hzq.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzq.shop.dao.CustsMapper;
import com.hzq.shop.domain.Custs;
import com.hzq.shop.domain.CustsExample;
import com.hzq.shop.service.LoginService;
import com.hzq.shop.utils.MD5;
/**
 * 
 * @ClassName: LoginServiceImpl 
 * @Description: TODO
 * @author: xiaoquan
 * @date: 2016年10月13日 下午10:40:01
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {
	@Autowired
	private CustsMapper custsMapper;
	CustsExample example;
	CustsExample.Criteria criteria;
	@Override
	public Custs login(String custName, String custPass) {
		example = new CustsExample();
		criteria  =example.createCriteria();
		criteria.andCustNameEqualTo(custName);
		criteria.andCustPassEqualTo(MD5.md5(custPass));
		
		List<Custs> list = custsMapper.selectByExample(example);
		if (list.size()>0) {
			return list.get(0);
		}
		return null;
	}
}
