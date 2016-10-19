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
	<!-- basic scripts -->

	<!--[if !IE]> -->

	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>

	<!-- <![endif]-->

	<!--[if IE]>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<![endif]-->

	<!--[if !IE]> -->

	<script type="text/javascript">
		window.jQuery
				|| document
						.write("<script src='<%=basePath %>plugin/ace/assets/js/jquery-2.0.3.min.js'>"
								+ "<"+"/script>");
	</script>

	<!-- <![endif]-->

	<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='<%=basePath %>plugin/ace/assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<![endif]-->

	<script type="text/javascript" >
		if ("ontouchend" in document)
			document.write("<script src='<%=basePath %>plugin/ace/assets/js/jquery.mobile.custom.min.js'>"
					+ "<"+"/script>");
	</script>

	<!-- inline scripts related to this page -->
	<script src="<%=basePath %>plugin/ace/assets/js/bootstrap.min.js"></script>
	<script src="<%=basePath %>plugin/ace/assets/js/typeahead-bs2.min.js"></script>

	<!-- page specific plugin scripts -->

	<!--[if lte IE 8]>
		  <script src="<%=basePath %>plugin/ace/assets/js/excanvas.min.js"></script>
		<![endif]-->

	<script src="<%=basePath %>plugin/ace/assets/js/jquery-ui-1.10.3.custom.min.js"></script>
	<script src="<%=basePath %>plugin/ace/assets/js/jquery.ui.touch-punch.min.js"></script>
	<script src="<%=basePath %>plugin/ace/assets/js/jquery.slimscroll.min.js"></script>
	<script src="<%=basePath %>plugin/ace/assets/js/jquery.easy-pie-chart.min.js"></script>
	<script src="<%=basePath %>plugin/ace/assets/js/jquery.sparkline.min.js"></script>
	<script src="<%=basePath %>plugin/ace/assets/js/flot/jquery.flot.min.js"></script>
	<script src="<%=basePath %>plugin/ace/assets/js/flot/jquery.flot.pie.min.js"></script>
	<script src="<%=basePath %>plugin/ace/assets/js/flot/jquery.flot.resize.min.js"></script>

	<!-- ace scripts -->

		<script src="<%=basePath %>plugin/ace/assets/js/ace-elements.min.js"></script>
		<script src="<%=basePath %>plugin/ace/assets/js/ace.min.js"></script>
		
	<script type="text/javascript">
		function show_box(id) {
			jQuery('.widget-box.visible').removeClass('visible');
			jQuery('#' + id).addClass('visible');
		}
	</script>
	<div style="display: none"></div>
</body>
</html>
