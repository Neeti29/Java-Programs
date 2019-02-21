package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteDemo {
	
	
	public static void main(String[] args)
	{
		Statement stmt;
		ResultSet rs;
		int cnt=0;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");  //cj is a latest driver  //loading and registering the driver
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels", "root", "connection");
			
			String sql="Delete from offices where city='Greater Noida';";
			stmt=con.createStatement();
			cnt=stmt.executeUpdate(sql);
			
			if(cnt>0)
			{
				System.out.println("Record Deleted");
		
		    }
			
			con.close();
	}
		catch(Exception e)
		{
			System.out.println(e);
		}

		
	}
}

	