package com.niit.demo;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class UserServlet2
 */
@WebServlet("/UserServlet2")
public class UserServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ServletContext context=getServletContext();
		Object obj=context.getAttribute("userid");
		PrintWriter out=response.getWriter();
		out.println("<br>");
		Connection con;
		Statement stmt;
		try
		{  
			Class.forName("com.mysql.jdbc.Driver");  
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","connection");  
			stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from candidates where id='"+obj.toString()+"'");
			boolean flag=rs.next();
			
			if(flag==true)
			{
				out.println("First Name:"+rs.getString("first_name"));
				out.println("<br><br>");
				out.println("Last Name:"+rs.getString("last_name"));
				out.println("<br><br>");
				out.println("Phone Number:"+rs.getString("phone"));
				
			}
		/*	while(rs.next())
			{
				out.println(rs.getString("first_name"));
			}*/
			
			else
			{
				out.println("<font color=red size=7>Login Failed</font>");
			}
		con.close();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
