package com.niit.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Validate
 */
@WebServlet("/Validate")
public class Validate extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Validate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		try
		{
			String name=request.getParameter("user");
			String password=request.getParameter("pass");
			
			if(password.equals("testing"))
					{
						RequestDispatcher rd=request.getRequestDispatcher("Welcome1");
						rd.forward(request, response);
					}
			else
			{
				out.println("<font color='red'><b>You have entered incorrect password</b><font>");
				RequestDispatcher rd=request.getRequestDispatcher("index.html");
				rd.include(request, response);
			}
		}
		
		finally
		{
			out.close();
		}
	}

}
