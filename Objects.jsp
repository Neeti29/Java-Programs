<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Expression Language Example</title>

</head>
<body>
<h1>JSP Page</h1>
<jsp:useBean class="Test.UserBean1" id="user" scope="session"/>
<%
	user.setUserName("neeti");
	user.setPassword("1234");
%>

<b>Accessing beans using EL:</b><br>
${ '${' }user.userName }=${user.userName }<br>
${'${' }user.password }=${user.password }<br>

<jsp:useBean class="java.util.ArrayList" id="lst" />
<%
	lst.add("Item1");
	lst.add("Item2");
%>


<br><b>Accessing elements of an ArrayList instance lst using EL:</b><br>
${'${' } lst[0] } = ${lst[0] }<br>
${'${' } lst[1]} = ${lst[1] } <br>

</body>
</html>