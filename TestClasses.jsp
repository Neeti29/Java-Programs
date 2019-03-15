<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.niit.emirates.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Class</title>
</head>
<body>
<h1>Emirates Ticket Booking</h1>
<b>Passenger Name: </b><%= AirUtils.makeItUpper("neeti") %>
<br><br>
<b>Total Fare : </b><%= AirUtils.callTax(5000) %>
</body>
</html>