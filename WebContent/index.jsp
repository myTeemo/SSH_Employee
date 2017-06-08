<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="system_name"/> | <s:text name="welcome_title"/></title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
<!--[if IE 6]>
<script type="text/javascript" src="js/DD_belatedPNG_0.0.8a-min.js"></script>
<script type="text/javascript" src="js/ie6Fixpng.js"></script>
<![endif]-->
</head>
<body>
		<div class="headerBar">
			<div class="logoBar login_logo">
				<div class="comWidth">
					<div class="logo fl">
						<a href="#"></a>
					</div>
					<h3 class="welcome_title"><s:text name="system_name"/></h3>
				</div>
			</div>
		</div>
		<center>
			<s:fielderror />
		</center>
		<s:form action="employee_login" method="post" namespace="/unlogin">
			<div class="loginBox">
				<h3> <s:actionerror/></h3>
				<div class="login_cont">
					<ul class="login">
						<li class="l_tit"><s:text name="name"/></li>
						<li class="mb_10"><input type="text" name="username" class="login_input user_icon"></li>
						<li class="l_tit"><s:text name="password"/></li>
						<li class="mb_10"><input type="password" name="password" class="login_input user_icon"></li>
						<li><input type="submit" value="" class="login_btn"></li>
					</ul>
					<div class="login_partners">		
				</div>	
			</div>
			</div>
		</s:form>
<div class="hr_25"></div>
<div class="footer">
</div>
</body>
</html>
