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

<link href="<%=basePath%>plugin/ace/assets/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="<%=basePath%>plugin/ace/assets/css/font-awesome.min.css" />

<!--[if IE 7]>
		  <link rel="stylesheet" href="<%=basePath%>plugin/ace/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->

<!-- page specific plugin styles -->

<!-- fonts -->

<!-- <link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" /> -->

<!-- ace styles -->

<link rel="stylesheet"
	href="<%=basePath%>plugin/ace/assets/css/ace.min.css" />
<link rel="stylesheet"
	href="<%=basePath%>plugin/ace/assets/css/ace-rtl.min.css" />
<link rel="stylesheet"
	href="<%=basePath%>plugin/ace/assets/css/ace-skins.min.css" />

<!--[if lte IE 8]>
		  <link rel="stylesheet" href="<%=basePath%>plugin/ace/assets/css/ace-ie.min.css" />
		<![endif]-->
<script src="<%=basePath%>plugin/ace/assets/js/ace-extra.min.js"></script>
<!-- inline styles related to this page -->

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

<!--[if lt IE 9]>
		<script src="<%=basePath%>plugin/ace/assets/js/html5shiv.js"></script>
		<script src="<%=basePath%>plugin/ace/assets/js/respond.min.js"></script>
		<![endif]-->
</head>
</html>