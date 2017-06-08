<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="${ pageContext.request.contextPath }/css/dtree.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${ pageContext.request.contextPath }/js/dtree.js"></script>
</head>

<body bgColor=#DDF0FB leftMargin=0 topMargin=0 marginwidth="0" marginheight="0">
	<table width="90%" border="0" cellspacing="1" cellpadding="2" align="center">
		<div class="dtree">
  			<script type="text/javascript">
    			d=new dTree('d');

			    d.add('01','-1','<s:text name="root_title"/>');
			    d.add('0101','01','<s:text name="first_title"/>');
			    d.add('010101','0101','<s:text name="second_1_title"/>','${ pageContext.request.contextPath }/department_findAll.action','','right');
			
			    d.add('010102','0101','<s:text name="second_2_title"/>','${ pageContext.request.contextPath }/employee_findAll.action','','right');
			    document.write(d);
  			</script>
		</div>
	</table>
</body>
</html>