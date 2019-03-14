<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First JSP Page</title>
</head>
<body>
	<font size="3" color="blue">
		<%        //Scriplets
			for(int num=1;num<=10;num++)
			{
				out.println("Welcome to JSP "+ num + "<br>");
			}
		%>
		
		<h3> Today's Date:<%=(new java.util.Date()).toLocaleString() %></h3> <!-- Expressions -->
		
	</font>
</body>
</html>