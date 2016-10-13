package com.hzq.shop.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.hzq.shop.service.TestService;

/**
 * 
 * @ClassName: test 
 * @Description: TODO
 * @author: xiaoquan
 * @date: 2016年10月11日 下午11:53:19
 */
@Controller
@RequestMapping("test")
@ResponseBody
public class TestController {
	@Autowired
	TestService services;
	@RequestMapping(value="testLogin",method=RequestMethod.POST)
	public Map<String, Object> testLogin( String custName, String custPass){
//		String loginName ="admin";
//		String password ="admin";
		String msgString = services. testLogin(custName,custPass);
	
		
		//String object =JSON.toJSONString(vo);
//		System.out.println(JSON.toJSON(vo));
		return new HashMap<>();
	}
	
}
