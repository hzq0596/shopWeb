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
<link href="<%=basePath%>plugin\proscenium\css\bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="<%=basePath%>plugin\proscenium\css\flexslider.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="<%=basePath%>plugin\proscenium\css\memenu.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="<%=basePath%>plugin\proscenium\css\popuo-box.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="<%=basePath%>plugin\proscenium\css\style.css" rel="stylesheet" type="text/css"
	media="all" />
</head>
 
</html>