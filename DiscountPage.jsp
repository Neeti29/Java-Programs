<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Discount Page</title>
</head>
<body bgcolor="#ffffff">
<h1>
	Welcome to Shop Stop
</h1>
<jsp:useBean id="bean" scope="page" class="Test.DiscountBean">
<jsp:setProperty name="bean" property="totalamt" param="txtamount"/>
Discount on total purchase is:Rs.
<jsp:getProperty name="bean" property="totalamt"/> 

</jsp:useBean>
</body>
</html>