<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isErrorPage="true"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page Demo</title>
</head>
<body>
	<strong>Page Example- Page Name:</strong>
		<%= page.getClass().getName()%>
		
		<br>
		<br>
		
	 <%-- <%(HttpServlet) page.log("message"); %> --%>
		
		<br>
		<br>
		
		<%String pageName=page.toString(); 
			out.println("Page Name is :"+pageName);
			
		int[] num1={1,2,3,4};
		out.println(num1[3]);
		%>
		
		Exception Raised:<%= exception.getMessage()%>
		
</body>
</html>