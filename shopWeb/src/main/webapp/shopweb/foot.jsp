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
 <script src="<%=basePath%>plugin\proscenium\js/jquery.min.js"></script>
 
<script type="text/javascript" src="<%=basePath%>plugin\proscenium\js/memenu.js"></script>
 
<script src="<%=basePath%>plugin\proscenium\js/simpleCart.min.js"></script>
<script src="<%=basePath%>plugin\proscenium\js/imagezoom.js"></script>
<script src="<%=basePath%>plugin\proscenium\js/jquery.flexslider.js"></script>
<script src="<%=basePath%>plugin\proscenium\js/jquery.magnific-popup.js"></script>
<script src="<%=basePath%>plugin\proscenium\js/responsiveslides.min.js"></script>
<!-- slide -->
</html>