<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get Page Context</title>
</head>
<body>
<%
	String Name=(String) pageContext.getAttribute("Name",PageContext.SESSION_SCOPE); 
	String fullName=(String) pageContext.getAttribute("fullName");  //Parsing because pageContext is an Object
	out.println("Hello "+ Name+" ");
	out.println("This is your fullName :"+fullName);
%>
</body>
</html>