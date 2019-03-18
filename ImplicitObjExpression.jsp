<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Implicit Objects in EL</title>
</head>
<%
	pageContext.setAttribute("color", "#66FFFF");
	pageContext.setAttribute("size", "30");
	pageContext.setAttribute("textclr", "Blue");
	pageContext.setAttribute("foregr", "Red");
%>
<body bgcolor='${pageScope.color }'
	text="${pageScope.textclr }">
	<h1>Use of Implicit Objects in EL.</h1>
	<Font color="${pageScope.foregr }"
	size="${pageScope.size }">
		Background color and text color changed.
	</Font>

</body>
</html>