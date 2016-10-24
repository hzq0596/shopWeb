<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<a href="add.jsp">新增数据</a>
	<a href="getAll.do">查看全部数据</a>
</body>

<form action="<%=basePath%>login/custLogin" method="post" id="formid">
	<input type="text" id="custName" name="custName"> <input
		type="password" id="custPass" name="custPass">
	<button type="button" id="but">提交1</button>
	<button type="submit" id="sub">提交2</button>
</form>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
<!-- <script type="text/javascript"
	src="http://jquery-json.googlecode.com/files/jquery.json-2.2.min.js"></script> -->
<%--   <script type="text/javascript" src="<%=basePath%>adminweb/plugin/ace/assets/js/jquery-1.10.2.min.js"></script>
 --%>
   <script type="text/javascript" src="<%=basePath%>adminweb/plugin/ace/assets/js/jquery.json.min.js"></script>
 
<script type="text/javascript">

  $("#but").click(function () { //“登录”按钮单击事件
      //获取用户名称
      var strTxtName = encodeURI($("#custName").val());
      //获取输入密码
      var strTxtPass = encodeURI($("#custPass").val()); 
      var cust ={
    		'custName': strTxtName,
    		'custPass':strTxtPass
      };
     // var jsonuserinfo = $.toJSON($('#formid').serializeObject());  
/*      var loginData= { loginName: strTxtName, password: strTxtPass };
 */      //开始发送数据
      $.ajax
      ({ //请求登录处理页
          url: "<%=basePath%>test/testLogin", //登录处理页
/* 			contentType : 'application/json',
 */			dataType : "json",
			type : "POST",
			//传送请求数据
			data : cust,
			success : function(strValue) { //登录成功后返回的数据
				alert(strValue);
				//根据返回值进行状态显示
				/* if (strValue == "True") {//注意是True,不是true
				    $(".clsShow").html("操作提示，登录成功！" + strValue);
				}
				else {
				    $("#divError").show().html("用户名或密码错误！" + strValue);
				} */
			}
		})
	})
</script>
</html>
