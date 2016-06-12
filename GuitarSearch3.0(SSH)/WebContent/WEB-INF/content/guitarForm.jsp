<%@ page contentType=" 	text/html; charset=GBK" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>添加吉他</title>
</head>
<body>
<h3>添加吉他</h3>
<s:form action="addGuitar">
	<s:textfield name="guitar.model" label="模型"/>
	<s:textfield name="guitar.price" label="价格"/>
	<s:textfield name="guitar.builder" label="厂家"/>
	<tr align="center">
		<td colspan="2">
		<s:submit value="添加" theme="simple"/>
		<s:reset value="重设" theme="simple"/>
		</td>
	</tr>
</s:form>
</body>
</html>
