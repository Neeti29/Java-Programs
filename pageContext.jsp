<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page Context</title>
</head>
<body>
<form action="getPageContext.jsp">
	<%
	String Name=request.getParameter("Name");
	String fullName=request.getParameter("fullName");
	out.println("Hello "+ Name+ " ");
	
	pageContext.setAttribute("Name", Name,PageContext.SESSION_SCOPE); //"Name" is an attribute
	pageContext.setAttribute("fullName", fullName);
	
	%>

<input type="submit" value="Click Here"/>
</form>
</body>
</html>