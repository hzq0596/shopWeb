package com.hzq.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzq.shop.domain.Custs;
import com.hzq.shop.service.LoginService;

/**
 * 
 * @ClassName: LoginController 
 * @Description: TODO  顾客和管理员登录
 * @author: xiaoquan
 * @date: 2016年10月13日 下午10:20:28
 */
@Controller
@RequestMapping("login")

public class LoginController {
	 @Autowired
	LoginService service;
	RetVo vo =null;
	@RequestMapping("custLogin")
	@ResponseBody
	public RetVo custLogin(String userName ,String pass ,String verifyCode){
		 Custs custs  = service.login(userName, pass);
		 vo= new RetVo();
		 vo.setObject(custs);
		return vo;
	}
	
	
}
