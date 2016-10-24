package com.hzq.shop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hzq.shop.domain.Cust;
import com.hzq.shop.domain.Staff;
import com.hzq.shop.service.LoginService;
import com.hzq.shop.utils.DateUtil;
import com.hzq.shop.utils.Logger;
import com.hzq.shop.utils.MD5;
import com.hzq.shop.utils.SessionUtil;
import com.hzq.shop.utils.StringUtils;
import com.hzq.shop.utils.mail.MailSenderInfo;
import com.hzq.shop.utils.mail.SimpleMailSender;

/**
 * @ClassName: LoginController
 * @Description: TODO 顾客和管理员登录
 * @author: xiaoquan
 * @date: 2016年10月13日 下午10:20:28
 */
@Controller
@RequestMapping("login")
public class LoginController {
	@Autowired
	LoginService service;
	Logger logger = Logger.getLogger(LoginController.class);
	RetVo vo = null;
	@RequestMapping("custLogin")
	public String custLogin(String custName, String custPass,HttpServletRequest request){
		Cust cust=service.custLogin(custName, custPass);
		if (!StringUtils.isBlank(cust)) {
			HttpSession session = request.getSession();
			SessionUtil.setSession(session);
		}
		return null;
		
	}
	/**
	 * @Title: 
	 * @Description: TODO 顾客登录验证
	 * @param userName 登录名
	 * @param pass 密码
	 * @param verifyCode 验证码
	 * @param request
	 * @return
	 * @return: String
	 */
	public @RequestMapping("staffLogin") String staffLogin(String userName, String pass, String verifyCode,
			HttpServletRequest request) {
		HttpSession session = request.getSession();
		Staff staff = service.staffLogin(userName, pass);
		if (!StringUtils.isBlank(staff)) {
			session.setAttribute("staff", staff);
			SessionUtil.setSession(session);
		} else {
			return "adminweb/login";
		}
		return "redirect:/adminweb/main.jsp";
	}
	/**
	 * @Title: custRegist
	 * @Description: TODO 顾客注册
	 * @param userName
	 * @param pass
	 * @param email
	 * @param verifyCode
	 * @return
	 * @return: String
	 */
	public @RequestMapping("custRegist") String custRegist(String userName, String pass, String email,
			String verifyCode, HttpServletRequest request) {
		if (emailHaveRegister(email)) {
			request.getSession().setAttribute("emailHaveRegister", true);
			return "shopweb/custRegister";
		}
		Cust custs = new Cust();
		custs.setCustDetailId(DateUtil.getCurrentDateTime().getTime());
		custs.setCustEmail(email);
		custs.setLoginName(userName);
		custs.setLoginPass(MD5.md5(pass));
		custs.setIsActivity("f");
		custs.setCustPassMsgAnswer(MD5.md5(MD5.md5(email)));
		int n = service.custRegist(custs);
		if (n > 0) {
			MailSenderInfo mailInfo = new MailSenderInfo();
			mailInfo.setMailServerHost("smtp.qq.com");
			mailInfo.setMailServerPort("465");
			mailInfo.setValidate(true);
			mailInfo.setUserName("569349045@qq.com");
			mailInfo.setPassword("tehehookotylbbdd");// 您的邮箱密码
			mailInfo.setFromAddress("569349045@qq.com");
			mailInfo.setToAddress(email);
			mailInfo.setSubject("设置邮箱标题");
			mailInfo.setContent(request.getRequestURL().append("/emailVerifyCode?VerifyCode=")
					.append(MD5.md5(MD5.md5(email))).toString());
			SimpleMailSender sender = new SimpleMailSender();
			try {
				sender.sendTextMail(mailInfo);
			} catch (Exception e) {
				logger.debug("--------顾客邮箱验证邮件发送失败-----");
				e.printStackTrace();
			}
			return "shopweb/emailActivityTip";
		}
		return "shopweb/custRegister";
	}
	/**
	 * @Title: emailHaveRegister
	 * @Description: TODO 判断email是否已经注册
	 * @param email
	 * @return
	 * @return: Boolean
	 */
	@RequestMapping("emailHaveRegister")
	public Boolean emailHaveRegister(String email) {
		boolean bo = service.emailHaveRegister(email);
		return bo;
	}
	/**
	 * @Title: emailVerifyCode
	 * @Description: TODO 邮箱激活链接验证。
	 * @param emailVerifyCode
	 * @return
	 * @return: String
	 */
	@RequestMapping("custRegist/emailVerifyCode")
	public String emailVerifyCode(String VerifyCode) {
		boolean tf = service.emailVerifyCode(VerifyCode);
		return tf == true ? "shopweb/emailActivityTip" : "shopweb/custRegister";
	}
	public StringBuffer getUrl(HttpServletRequest request) {
		StringBuffer url = new StringBuffer(request.getScheme()).append("://").append(request.getServerName());
		if (request.getServerPort() > 0
				&& (("http".equalsIgnoreCase(request.getScheme()) && request.getServerPort() != 80)
						|| ("https".equalsIgnoreCase(request.getScheme()) && request.getServerPort() != 443))) {
			url.append(':').append(request.getServerPort());
		}
		url.append(request.getContextPath());
		// System.out.println(url);
		return url;
	}
}
