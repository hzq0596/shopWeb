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

import com.hzq.shop.domain.Custs;

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
	 * @Description: TODO  登录验证
	 * @param custName
	 * @param custPass
	 * @return
	 * @return: Custs
	 */
	public Custs login(String custName,String custPass);
	
}
