<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>�����б�</title>
</head>
<body>
<h3>�����б�</h3>
<table width="640" border="1">
		<tr>
			<td>ģ��</td>
			<td>�۸�</td>
			<td>����</td>
			<td>����</td>
		</tr>
	<s:iterator value="guitars" var="g">
		<tr>
			<td><s:property value="model"/></td>
			<td><s:property value="price"/></td>
			<td><s:property value="builder"/></td>
			<td><a href="${pageContext.request.contextPath}/deleteGuitar?id=${g.id}">ɾ��</a></td>
		</tr>
	</s:iterator>
</table>
</body>
</html>
