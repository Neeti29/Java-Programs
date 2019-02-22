package JDBC;
import java.sql.*;
public class DemoTransaction {

	// TODO Auto-generated method stub

	
	public static void main(String[] args) throws Exception 
	{
		Connection con;
		Class.forName("com.mysql.cj.jdbc.Driver"); // cj is a latest driver //loading and registering the driver
		con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc", "root", "connection");
		
		System.out.println("driver is loaded");
		
		Statement stmt = con.createStatement();
		
		con.setAutoCommit(false);
		
		//DML OPERATIONS 
		try
		{
			int i1 = stmt.executeUpdate("Insert into candidate_skills values(100,3)");
			
			int i2= stmt.executeUpdate("Update skills set name= 'Ruby' where id=11");
			
			int i3= stmt.executeUpdate("Delete from candidates where id=120");
			
			con.commit();
			
			System.out.println("Transaction is Successfull!!");
		}
		
		catch(Exception e)
		{
			try
			{
				con.rollback();
				System.out.println("Transaction is Failed");
			}
			
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}//end of catch
		
		stmt.close();
		con.close();
		System.out.println("Connection is closed");
		
		
		
	}

}
