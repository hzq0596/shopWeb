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
<title>Home</title>

 <jsp:include page="/shopweb\header.jsp"></jsp:include>
 <jsp:include page="/shopweb\foot.jsp"></jsp:include>
 
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Fashion Mania Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- start menu -->
 <script>
	$(document).ready(function() {
		$(".memenu").memenu();
	});
	 
</script>
 
	
</script>
<!-- slide -->
<script>
	$(function() {
		$("#slider").responsiveSlides({
			auto : true,
			speed : 500,
			namespace : "callbacks",
			pager : true,
		});
	});
</script>
</head>
<body>
	<!--header-->
	<div class="header">
		<%-- <div class="header-top">
			<div class="container">
				<!-- <div class="col-sm-4 world">
					<ul>
						<li><select class="in-drop">
								<option>English</option>
								<option>Japanese</option>
								<option>French</option>
						</select></li>
						<li><select class="in-drop1">
								<option>Dollar</option>
								<option>Euro</option>
								<option>Yen</option>
						</select></li>
					</ul>
				</div> -->
				<div class="col-sm-4 ">
					<a href="index.html"><img src="<%=basePath%>plugin\proscenium\images/logo.png" alt=""></a>
				</div>

				<div class="col-sm-4 ">
					<p class="log">
						<a href="account.html">Login</a> <span>or</span><a
							href="account.html">Signup</a>
					</p>
					<div class="cart box_1">
						<a href="checkout.html">
							<h3>
								<div class="total">
									<span class="simpleCart_total"></span>
								</div>
								<img src="<%=basePath%>plugin\proscenium\images/cart.png" alt="" />
							</h3>
						</a>
						<p>
							<a href="javascript:;" class="simpleCart_empty">Empty Cart</a>
						</p>

					</div>
					<div class="clearfix"></div>
				</div>
				<!-- <div class="clearfix"></div> -->
			</div>
		</div> --%>
		<div class="container">
			<div class="head-top">
				<div class="col-sm-2 ">
					<a href="index.html"><img src="<%=basePath%>plugin\proscenium\images/logo.png" alt="" height="70px"></a>
				</div>
				<div class="col-sm-8 h_menu4">
					<ul class="memenu skyblue">
						<li class=" grid"><a href="index.html">Home</a></li>
						<li><a href="#">Men</a>
							<div class="mepanel">
								<div class="row">
									<div class="col1">
										<div class="h_nav">
											<h4>All Clothing</h4>
											<ul>
												<li><a href="products.html">Shirts</a></li>
												<li><a href="products.html">Sports Wear</a></li>
												<li><a href="products.html">Shorts</a></li>
												<li><a href="products.html">Suits & Blazers</a></li>
												<li><a href="products.html">Formal Shirts</a></li>
												<li><a href="products.html">Sweatpants</a></li>
												<li><a href="products.html">Swimwear</a></li>
												<li><a href="products.html">Trousers & Chinos</a></li>
												<li><a href="products.html">T-Shirts</a></li>
												<li><a href="products.html">Underwear & Socks</a></li>

											</ul>
										</div>
									</div>
									<div class="col1">
										<div class="h_nav">
											<h4>Footwear</h4>
											<ul>
												<li><a href="products.html">Formal Shoes</a></li>
												<li><a href="products.html">Boots</a></li>
												<li><a href="products.html">Sports Shoes</a></li>
												<li><a href="products.html">Casual Shoes</a></li>
												<li><a href="products.html">Running Shoes</a></li>
												<li><a href="products.html">Sneakers</a></li>
												<li><a href="products.html">Loafers</a></li>
												<li><a href="products.html">Slippers</a></li>
												<li><a href="products.html">Sandals</a></li>
												<li><a href="products.html">Flip-flops</a></li>

											</ul>
										</div>
									</div>
									<div class="col1">
										<div class="h_nav">
											<h4>Popular Brands</h4>
											<ul>
												<li><a href="products.html">Levis</a></li>
												<li><a href="products.html">Persol</a></li>
												<li><a href="products.html">Nike</a></li>
												<li><a href="products.html">Edwin</a></li>
												<li><a href="products.html">New Balance</a></li>
												<li><a href="products.html">Jack & Jones</a></li>
												<li><a href="products.html">Paul Smith</a></li>
												<li><a href="products.html">Ray-Ban</a></li>
												<li><a href="products.html">Wood Wood</a></li>
											</ul>
										</div>
									</div>
								</div>
							</div></li>
						<li class="grid"><a href="#"> Women</a>
							<div class="mepanel">
								<div class="row">
									<div class="col1">
										<div class="h_nav">
											<h4>All Clothing</h4>
											<ul>
												<li><a href="products.html">Shirts & Tops</a></li>
												<li><a href="products.html">Sports Wear</a></li>
												<li><a href="products.html">Kurtas & Kurties</a></li>
												<li><a href="products.html">Suits & Blazers</a></li>
												<li><a href="products.html">Sarees</a></li>
												<li><a href="products.html">Sweatpants</a></li>
												<li><a href="products.html">Swimwear</a></li>
												<li><a href="products.html">Night-Suits</a></li>
												<li><a href="products.html">T-Shirts</a></li>
												<li><a href="products.html">Jeans</a></li>

											</ul>
										</div>
									</div>
									<div class="col1">
										<div class="h_nav">
											<h4>Footwear</h4>
											<ul>
												<li><a href="products.html">Heels</a></li>
												<li><a href="products.html">Flats</a></li>
												<li><a href="products.html">Sports Shoes</a></li>
												<li><a href="products.html">Casual Shoes</a></li>
												<li><a href="products.html">Running Shoes</a></li>
												<li><a href="products.html">Wedges</a></li>
												<li><a href="products.html">Boots</a></li>
												<li><a href="products.html">Pumps</a></li>
												<li><a href="products.html">Slippers</a></li>
												<li><a href="products.html">Flip-flops</a></li>

											</ul>
										</div>
									</div>
									<div class="col1">
										<div class="h_nav">
											<h4>Popular Brands</h4>
											<ul>
												<li><a href="products.html">Levis</a></li>
												<li><a href="products.html">Persol</a></li>
												<li><a href="products.html">Nike</a></li>
												<li><a href="products.html">Edwin</a></li>
												<li><a href="products.html">New Balance</a></li>
												<li><a href="products.html">Jack & Jones</a></li>
												<li><a href="products.html">Paul Smith</a></li>
												<li><a href="products.html">Ray-Ban</a></li>
												<li><a href="products.html">Wood Wood</a></li>
											</ul>
										</div>
									</div>
								</div>
							</div></li>
						<li><a href="typo.html">Blog</a></li>
						<li><a class="color6" href="contact.html">Conact</a></li>
					</ul>
				</div>
				<div class="col-sm-2 search">
					<a class="play-icon popup-with-zoom-anim" href="#small-dialog"><i
						class="glyphicon glyphicon-search"> </i> </a>
				</div>
				
				<div class="cart box_1">
						<a href="checkout.html">
							<h3>
								<div class="total">
									<span class="simpleCart_total"></span>
								</div>
								<img src="<%=basePath%>plugin\proscenium\images/cart.png" alt="" />
							</h3>
						</a>
						<p>
							<a href="javascript:;" class="simpleCart_empty">Empty Cart</a>
						</p>

					</div>
				<!---//pop-up-box---->
				<!-- <div id="small-dialog" class="mfp-hide">
					<div class="search-top">
						<div class="login">
							<input type="submit" value=""> <input type="text"
								value="Type something..." onFocus="this.value = '';"
								onBlur="if (this.value == '') {this.value = '';}">
						</div>
						<p>Shopping</p>
					</div>
				</div>
				<script>
					$(document).ready(function() {
						$('.popup-with-zoom-anim').magnificPopup({
							type : 'inline',
							fixedContentPos : false,
							fixedBgPos : true,
							overflowY : 'auto',
							closeBtnInside : true,
							preloader : false,
							midClick : true,
							removalDelay : 300,
							mainClass : 'my-mfp-zoom-in'
						});

					});
				</script> -->
				<!---->
			</div>
		</div>
	</div>
	<!--banner-->
	<div class="banner">
	<%-- 	<div class="col-sm-3 banner-mat">
			<img class="img-responsive" src="<%=basePath%>plugin\proscenium\images/ba1.jpg" alt="">
		</div> --%>
		<div class="col-sm-12 matter-banner">
			<div class="slider">
				<div class="callbacks_container">
					<ul class="rslides" id="slider">
						<li><img src="<%=basePath%>plugin\proscenium\images/1.jpg" alt=""></li>
						<li><img src="<%=basePath%>plugin\proscenium\images/2.jpg" alt=""></li>
						<li><img src="<%=basePath%>plugin\proscenium\images/1.jpg" alt=""></li>
						<li><img src="<%=basePath%>plugin\proscenium\images/2.jpg" alt=""></li>
						<li><img src="<%=basePath%>plugin\proscenium\images/1.jpg" alt=""></li>
					</ul>
				</div>
			</div>
		</div>
		<%-- <div class="col-sm-3 banner-mat">
			<img class="img-responsive" src="<%=basePath%>plugin\proscenium\images/ba.jpg" alt="">
		</div> --%>
		<div class="clearfix"></div>
	</div>
	<!--//banner-->
	<div class="copyrights">
		Collect from <a href="http://www.cssmoban.com/">手机网站模板</a>
	</div>
	<!--content-->
	<div class="content">
		<div class="container">
			<div class="content-top">
				<h1>Recent Products</h1>
				<div class="content-top1">
					<div class="col-md-3 col-md2">
						<div class="col-md1 simpleCart_shelfItem">
							<a href="single.html"> <img class="img-responsive"
								src="<%=basePath%>plugin\proscenium\images/pi.png" alt="" />
							</a>
							<h3>
								<a href="single.html">Tops</a>
							</h3>
							<div class="price">
								<h5 class="item_price">$300</h5>
								<a href="#" class="item_add">Add To Cart</a>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
					<div class="col-md-3 col-md2">
						<div class="col-md1 simpleCart_shelfItem">
							<a href="single.html"> <img class="img-responsive"
								src="<%=basePath%>plugin\proscenium\images/pi2.png" alt="" />
							</a>
							<h3>
								<a href="single.html">T-Shirt</a>
							</h3>
							<div class="price">
								<h5 class="item_price">$300</h5>
								<a href="#" class="item_add">Add To Cart</a>
								<div class="clearfix"></div>
							</div>

						</div>
					</div>
					<div class="col-md-3 col-md2">
						<div class="col-md1 simpleCart_shelfItem">
							<a href="single.html"> <img class="img-responsive"
								src="<%=basePath%>plugin\proscenium\images/pi4.png" alt="" />
							</a>
							<h3>
								<a href="single.html">Shirt</a>
							</h3>
							<div class="price">
								<h5 class="item_price">$300</h5>
								<a href="#" class="item_add">Add To Cart</a>
								<div class="clearfix"></div>
							</div>

						</div>
					</div>
					<div class="col-md-3 col-md2">
						<div class="col-md1 simpleCart_shelfItem">
							<a href="single.html"> <img class="img-responsive"
								src="<%=basePath%>plugin\proscenium\images/pi1.png" alt="" />
							</a>
							<h3>
								<a href="single.html">Tops</a>
							</h3>
							<div class="price">
								<h5 class="item_price">$300</h5>
								<a href="#" class="item_add">Add To Cart</a>
								<div class="clearfix"></div>
							</div>

						</div>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="content-top1">
					<div class="col-md-3 col-md2">
						<div class="col-md1 simpleCart_shelfItem">
							<a href="single.html"> <img class="img-responsive"
								src="<%=basePath%>plugin\proscenium\images/pi3.png" alt="" />
							</a>
							<h3>
								<a href="single.html">Shirt</a>
							</h3>
							<div class="price">
								<h5 class="item_price">$300</h5>
								<a href="#" class="item_add">Add To Cart</a>
								<div class="clearfix"></div>
							</div>

						</div>
					</div>
					<div class="col-md-3 col-md2">
						<div class="col-md1 simpleCart_shelfItem">
							<a href="single.html"> <img class="img-responsive"
								src="<%=basePath%>plugin\proscenium\images/pi5.png" alt="" />
							</a>
							<h3>
								<a href="single.html">T-Shirt</a>
							</h3>
							<div class="price">
								<h5 class="item_price">$300</h5>
								<a href="#" class="item_add">Add To Cart</a>
								<div class="clearfix"></div>
							</div>

						</div>
					</div>
					<div class="col-md-3 col-md2">
						<div class="col-md1 simpleCart_shelfItem">
							<a href="single.html"> <img class="img-responsive"
								src="<%=basePath%>plugin\proscenium\images/pi6.png" alt="" />
							</a>
							<h3>
								<a href="single.html">Jeans</a>
							</h3>
							<div class="price">
								<h5 class="item_price">$300</h5>
								<a href="#" class="item_add">Add To Cart</a>
								<div class="clearfix"></div>
							</div>

						</div>
					</div>
					<div class="col-md-3 col-md2">
						<div class="col-md1 simpleCart_shelfItem">
							<a href="single.html"> <img class="img-responsive"
								src="<%=basePath%>plugin\proscenium\images/pi7.png" alt="" />
							</a>
							<h3>
								<a href="single.html">Tops</a>
							</h3>
							<div class="price">
								<h5 class="item_price">$300</h5>
								<a href="#" class="item_add">Add To Cart</a>
								<div class="clearfix"></div>
							</div>

						</div>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
	</div>
	<!--//content-->
	<!--footer-->
	<div class="footer">
		<div class="container">
			<div class="footer-top">
				<div class="col-md-4 top-footer1">
					<h2>Newsletter</h2>
					<form>
						<input type="text" value="" onFocus="this.value='';"
							onBlur="if (this.value == '') {this.value ='';}"> <input
							type="submit" value="SUBSCRIBE">
					</form>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="footer-bottom">
			<div class="container">
				<div class="col-sm-3 footer-bottom-cate">
					<h6>Categories</h6>
					<ul>
						<li><a href="#">Curabitur sapien</a></li>
						<li><a href="#">Dignissim purus</a></li>
						<li><a href="#">Tempus pretium</a></li>
						<li><a href="#">Dignissim neque</a></li>
						<li><a href="#">Ornared id aliquet</a></li>

					</ul>
				</div>
				<div class="col-sm-3 footer-bottom-cate">
					<h6>Feature Projects</h6>
					<ul>
						<li><a href="#">Curabitur sapien</a></li>
						<li><a href="#">Dignissim purus</a></li>
						<li><a href="#">Tempus pretium</a></li>
						<li><a href="#">Dignissim neque</a></li>
						<li><a href="#">Ornared id aliquet</a></li>

					</ul>
				</div>
				<div class="col-sm-3 footer-bottom-cate">
					<h6>Top Brands</h6>
					<ul>
						<li><a href="#">Curabitur sapien</a></li>
						<li><a href="#">Dignissim purus</a></li>
						<li><a href="#">Tempus pretium</a></li>
						<li><a href="#">Dignissim neque</a></li>
						<li><a href="#">Ornared id aliquet</a></li>
						<li><a href="#">Ultrices id du</a></li>
						<li><a href="#">Commodo sit</a></li>

					</ul>
				</div>
				<div class="col-sm-3 footer-bottom-cate cate-bottom">
					<h6>Our Address</h6>
					<ul>
						<li>Aliquam metus dui.</li>
						<li>orci, ornareidquet</li>
						<li>ut,DUI.</li>
						<li>nisi, dignissim</li>
						<li>gravida at.</li>
						<li class="phone">PH : 6985792466</li>
					</ul>
				</div>
				<div class="clearfix"></div>
				<p class="footer-class">
					Copyright &copy; 2015.Company name All rights reserved.<a
						target="_blank" href="http://www.cssmoban.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
				</p>
			</div>
		</div>
	</div>

	<!--//footer-->
</body>
</html>