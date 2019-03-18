<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Expression language example2</title>
</head>
<body>
<form action="display.jsp"> 
Student Name: <input type="text" name="stuname" /><br>
Student RollNum:<input type="text" name="rollno" /><br>
<input type="submit" value="Submit Details!!"/> 
</form> 
<br>
<br>
<h1>Getting values from application object</h1>
<%
 application.setAttribute("author", "neeti");
 application.setAttribute("Site", "niit.com");
 %>
 <a href="display.jsp">Click</a>
</body>
</html>