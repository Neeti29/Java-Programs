package JDBC;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class MysqlCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");  //cj is a latest driver  //loading and registering the driver
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels", "root", "connection"); 
			
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("Select * from employees");  //Result Set is virtual table and result is stored in result set
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+ " " +rs.getString(2)+ " " + rs.getString(3) + " " + rs.getString(5));   
				
			}
			con.close();
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
 //Connection,Statement is an Interface 