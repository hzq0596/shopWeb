package com.hzq.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hzq.shop.service.TestService;

/**
 * 
 * @ClassName: test 
 * @Description: TODO
 * @author: xiaoquan
 * @date: 2016年10月11日 下午11:53:19
 */
@Controller
@RequestMapping("test/xx")
public class TestController {
	@Autowired
	TestService services;
	@RequestMapping("testLogin")
	public String testLogin(String loginName,String password){
//		String loginName ="admin";
//		String password ="admin";
		String msgString = services. testLogin(loginName,password);
		return msgString;
	}
	
}
