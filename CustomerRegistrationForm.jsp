<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page language="java" import="java.sql.*" %>

<%
String UserId=request.getParameter("txtuserid");
String Password=request.getParameter("txtpassword");
String Confirm=request.getParameter("txtconfirm");
String FirstName=request.getParameter("txtfirstname");
String LastName=request.getParameter("txtlastname");
String Gender=request.getParameter("rbgender");
String Age=request.getParameter("txtage");
String TelephoneNo=request.getParameter("txtphoneno");
String MobileNo=request.getParameter("txtmobileno");
String Email=request.getParameter("txtemail");
String Address=request.getParameter("txtaddress");
String Pincode=request.getParameter("txtpincode");
String AnnualIncome=request.getParameter("txtannualincome");

    
    try
    {
    
    
    	Class.forName("com.mysql.jdbc.Driver");  
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","connection");  
    	String query = " insert into customer (Password, Confirm, FirstName, LastName, Gender, Age, TelephoneNo, MobileNo, Email,  Address, Pincode, AnnualIncome )"
		        + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    	  PreparedStatement pstm=con.prepareStatement(query);
    	  pstm.setString(1,Password);
    	  pstm.setString(2,Confirm);
    	  pstm.setString(3,FirstName);
    	  pstm.setString(4,LastName);
    	  pstm.setString(5,Gender);
    	  pstm.setString(6,Age);
    	  pstm.setString(7,TelephoneNo);
    	  pstm.setString(8,MobileNo);
    	  pstm.setString(9,Email);
    	  pstm.setString(10,Address);
    	  pstm.setString(11,Pincode);
    	  pstm.setString(12,AnnualIncome);
    	  pstm.execute();
    	  con.close();
    	  out.println("<font color=red size=7>User Details Successfully Updated </font><BR/><BR/>");
    	    out.println("Your UserId is : " + UserId + "<BR/>");
    	    out.println("Your Password is : " + Password + "<BR/>");
    	    out.println("Your Confirm Password is : " + Confirm + "<BR/>");
    	    out.println("Your First Name is : " + FirstName + "<BR/>");
    	    out.println("Your Last Name is : " + LastName + "<BR/>");
    	    out.println("Your Gender is : " + Gender + "<BR/>");
    	    out.println("Your Age is : " + Age + "<BR/>");
    	    out.println("Your Telephone Number is : " + TelephoneNo + "<BR/>");
    	    out.println("Your Mobile Number is : " + MobileNo + "<BR/>");
    	    out.println("Your Email is : " + Email + "<BR/>");
    	    out.println("Your Address is : " + Address + "<BR/>");
    	    out.println("Your Pincode is : " + Pincode + "<BR/>");
    	    out.println("Your Annual Income is : " + AnnualIncome + "<BR/>");
		 
    }
    
 	catch(Exception sqle) 
    {
    out.println(sqle);
	} 
    
   
%>