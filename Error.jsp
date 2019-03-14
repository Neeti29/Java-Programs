<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isErrorPage="true"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error</title>
</head>
<body bgcolor="#ffffff">
<h3>
	<%@ include file="WelcomeMessage.html"
	 %>
	 Exception Raised:<%= exception.getMessage() %>
</h3>

</body>
</html>