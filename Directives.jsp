<%@ page language="java" errorPage="Error.jsp" autoFlush="true" contentType="text/html ; charset=ISO-8859-1"
     session="false" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Directives</title>
</head>
<body>
<body bgcolor="#ffffff">
<%
	int i=20;
	int j=20/0;
	out.println(j);
%>
</body>
</html>