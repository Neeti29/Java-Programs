<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Using JavaBean in JSP</title>
<jsp:useBean id="BeanId" class="Test.UserBean" scope="session"/>

<jsp:setProperty name="BeanId" property="username"/>
<jsp:setProperty name="BeanId" property="password"/>


</head>
<% BeanId.getEmailid(); %>

<body>
	
	<jsp:getProperty name="BeanId" property="username"/><br>
	<jsp:getProperty name="BeanId" property="email"/>
</body>
</html>