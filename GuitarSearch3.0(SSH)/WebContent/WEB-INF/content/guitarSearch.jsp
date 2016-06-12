<%@ page contentType=" 	text/html; charset=GBK" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>搜索吉他</title>
</head>
<body>
<h3>搜索吉他</h3>
<s:form action="searchGuitar">
	<s:textfield name="guitar.model" label="模型"/>
	<tr align="center">
		<td colspan="2">
		<s:submit value="搜索" theme="simple"/>
		<s:reset value="重设" theme="simple"/>
		</td>
	</tr>
</s:form>
</body>
</html>
