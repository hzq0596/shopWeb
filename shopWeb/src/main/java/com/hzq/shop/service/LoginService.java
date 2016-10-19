/**   
 * Copyright © 2016 公司名. All rights reserved.
 * 
 * @Title: LoginService.java 
 * @Prject: shopWeb
 * @Package: com.hzq.shop.service 
 * @Description: TODO
 * @author: xiaoquan   
 * @date: 2016年10月13日 下午10:36:00 
 * @version: V1.0   
 */
package com.hzq.shop.service;

import com.hzq.shop.domain.Cust;
import com.hzq.shop.domain.Staff;

/** 
 * @ClassName: LoginService 
 * @Description: TODO
 * @author: xiaoquan
 * @date: 2016年10月13日 下午10:36:00  
 */
public interface LoginService {
	/**
	 * 
	 * @Title: login 
	 * @Description: TODO  顾客登录验证
	 * @param custName
	 * @param custPass
	 * @return
	 * @return: Custs
	 */
	public Cust custLogin(String custName,String custPass);

	/**
	 * 
	 * @Title: staffLogin 
	 * @Description: TODO  员工登录验证
	 * @param userName
	 * @param pass
	 * @return
	 * @return: Staff
	 */
	public Staff staffLogin(String userName, String pass);

	/**
	 * 
	 * @Title: custRegist 
	 * @Description: TODO  顾客注册
	 * @param custs
	 * @return
	 * @return: int
	 */
	public int custRegist(Cust custs);

	/**
	 * 
	 * @Title: emailHaveRegister 
	 * @Description: TODO  检验注册的邮箱是否已经存在
	 * @param email
	 * @return
	 * @return: boolean
	 */
	public boolean emailHaveRegister(String email);

	/**
	 * 
	 * @Title: emailVerifyCode 
	 * @Description: TODO  邮箱账户激活验证
	 * @param emailVerifyCode
	 * @return
	 * @return: boolean
	 */
	public boolean emailVerifyCode(String emailVerifyCode);
	
}
