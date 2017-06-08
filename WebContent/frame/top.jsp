<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
.div1 {
	margin-top: 50px;
	margin-left: 600px;
	font-size: 14px;
	color: white
}
</style>
</head>

<body bgcolor="#0099FF">
	<div class="div1">
		<h1><s:text name="system_title"/></h1><br/>
		<s:text name="welcome_title"/>：<s:property value="#session.existEmployee.ename" />
	</div>
</body>
</html>
