package com.hzq.shop.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzq.shop.dao.CustMapper;
import com.hzq.shop.dao.StaffMapper;
import com.hzq.shop.domain.Cust;
import com.hzq.shop.domain.Staff;
import com.hzq.shop.service.LoginService;
import com.hzq.shop.utils.MD5;

/**
 * @ClassName: LoginServiceImpl
 * @Description: TODO 会员，顾客登录注册
 * @author: xiaoquan
 * @date: 2016年10月13日 下午10:40:01
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {
	@Autowired
	private CustMapper custsMapper;
	@Autowired
	private StaffMapper staffMapper;
	@Override
	public Cust custLogin(String custName, String custPass) {
		Map<String, Object> params = new HashMap<>();
		params.put("loginName", custName);
		params.put("loginPass", MD5.md5(custPass));
		List<Cust> list = custsMapper.selectCustByMap(params);
		return list.get(0);
	}
	@Override
	public Staff staffLogin(String userName, String pass) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int custRegist(Cust custs) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean emailHaveRegister(String email) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean emailVerifyCode(String emailVerifyCode) {
		// TODO Auto-generated method stub
		return false;
	}
 

	 

}
