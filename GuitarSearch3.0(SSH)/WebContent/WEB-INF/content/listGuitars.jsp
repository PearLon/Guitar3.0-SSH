<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>吉他列表</title>
</head>
<body>
<h3>吉他列表</h3>
<table width="640" border="1">
		<tr>
			<td>模型</td>
			<td>价格</td>
			<td>厂家</td>
			<td>操作</td>
		</tr>
	<s:iterator value="guitars" var="g">
		<tr>
			<td><s:property value="model"/></td>
			<td><s:property value="price"/></td>
			<td><s:property value="builder"/></td>
			<td><a href="${pageContext.request.contextPath}/deleteGuitar?id=${g.id}">删除</a></td>
		</tr>
	</s:iterator>
</table>
</body>
</html>
