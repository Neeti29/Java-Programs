<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Example</title>
</head>

<body>
<c:set var="example" value="${100+1 }"
	scope="session"/>
<c:out value="${example }"/>
<c:remove var="example" scope="session"/>

<p>
<c:set var = "sessionvariable" value="${80+8 }" scope="session"/>
Value of session variable before removing it:

<c:out value="${sessionvariable }"/>
<c:remove var="sessionvariable" scope="session"/>
<br/>

Value of session variable after removing it:<br/>
<c:out value="${sessionvariable }"></c:out>

</body>
</html>