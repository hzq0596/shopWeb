package com.hzq.shop.utils.sendsms;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

/**
 * 
 * @ClassName: SendSMS 
 * @Description: TODO  手机短信验证
 * @author: xiaoquan
 * @date: 2016年10月16日 下午6:36:16
 */
public class SendSMS {
private static String Url = "http://106.ihuyi.cn/webservice/sms.php?method=Submit";
/**
 * 
 * @Title: sendIdentifyCode 
 * @Description: TODO  给认证客户手机发送验证码
 * @param mobile_code  验证码
 * @return
 * @return: boolean
 */
	public static boolean sendIdentifyCode(String mobile_code){
		HttpClient client = new HttpClient(); 
		PostMethod method = new PostMethod(Url);

		client.getParams().setContentCharset("GBK");
		method.setRequestHeader("ContentType","application/x-www-form-urlencoded;charset=GBK");

//		int mobile_code = (int)((Math.random()*9+1)*100000);

	    String content = new String("您的验证码是：" + mobile_code + "。请不要把验证码泄露给其他人。");

		NameValuePair[] data = {//提交短信
			    new NameValuePair("account", "cf_xiaoquan"), 
			    new NameValuePair("password", "hzq12345"), //查看密码请登录用户中心->验证码、通知短信->帐户及签名设置->APIKEY
			    //new NameValuePair("password", util.StringUtil.MD5Encode("密码")),
			    new NameValuePair("mobile", "13235015818"), 
			    new NameValuePair("content", content),
		};
		method.setRequestBody(data);

		try {
			client.executeMethod(method);
			
			String SubmitResult =method.getResponseBodyAsString();

			//System.out.println(SubmitResult);

			Document doc = DocumentHelper.parseText(SubmitResult);
			Element root = doc.getRootElement();

			String code = root.elementText("code");
//			String msg = root.elementText("msg");
//			String smsid = root.elementText("smsid");
			 if("2".equals(code)){//2为成功
				return true;
			}

		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
		} catch (DocumentException e) {
			e.printStackTrace();
		}	
		return false;
		
	}
	
}
