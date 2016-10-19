<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=basePath%>login/custRegist" method="get">
姓名<input type="text" name="userName"><br/>
email<input type="text" name="email"><br/>
密码<input type="password" name="pass"><br/>
验证码<input type="text" name="verifyCode"><br/>
<button type="submit">提交</button>
</form>
</body>
</html>