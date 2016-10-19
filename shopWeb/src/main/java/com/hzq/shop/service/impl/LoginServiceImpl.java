package com.hzq.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzq.shop.dao.CustMapper;
import com.hzq.shop.dao.StaffMapper;
import com.hzq.shop.domain.Cust;
import com.hzq.shop.domain.CustExample;
import com.hzq.shop.domain.Staff;
import com.hzq.shop.domain.StaffExample;
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
	CustExample custExample;
	CustExample.Criteria custCriteria;
	StaffExample staffExample;
	StaffExample.Criteria staffCriteria;

	@Override
	public Cust custLogin(String custName, String custPass) {
		custExample = new CustExample();
		custCriteria = custExample.createCriteria();
		custCriteria.andLoginNameEqualTo(custName);
		custCriteria.andLoginPassEqualTo(MD5.md5(custPass));
		List<Cust> list = custsMapper.selectByExample(custExample);
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
	@Override
	public Staff staffLogin(String userName, String pass) {
		staffExample = new StaffExample();
		staffCriteria = staffExample.createCriteria();
		staffCriteria.andStaffCodeEqualTo(userName);
		staffCriteria.andLoginPassEqualTo(MD5.md5(pass));
		List<Staff> list = staffMapper.selectByExample(staffExample);
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
	@Override
	public int custRegist(Cust custs) {
		return custsMapper.insert(custs);
	}
	@Override
	public boolean emailHaveRegister(String email) {
		custExample = new CustExample();
		custCriteria = custExample.createCriteria();
		custCriteria.andCustEmailEqualTo(email);
		List<Cust> list = custsMapper.selectByExample(custExample);
		return list.size() > 0 ? true : false;
	}
	@Override
	public boolean emailVerifyCode(String emailVerifyCode) {
		custExample = new CustExample();
		custCriteria = custExample.createCriteria();
		custCriteria.andCustPassMsgAnswerEqualTo(emailVerifyCode);
		List<Cust> list = custsMapper.selectByExample(custExample);
		return list.size() > 0 ? true : false;
	}
}
