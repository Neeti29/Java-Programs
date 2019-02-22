package JDBC;

import java.sql.*;

public class BatchDemo {
	Connection con;
	Statement stmt;
	ResultSet rs;

	BatchDemo() 
	{

	}

	void createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // cj is a latest driver //loading and registering the driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc", "root", "connection");
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void createBatch()
	{
		try
		{
			stmt=con.createStatement();
			
			stmt.addBatch("insert into skills (name) values ('Hybernate')");
			
			stmt.addBatch("Update skills Set name= 'Web App' Where id=4");
			
		    stmt.addBatch("Delete from skills where id=11 ");
			
			
			
			//disable auto-commit mode
			con.setAutoCommit(false);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
			
	
		try
		{
			int i[]= stmt.executeBatch();
			con.commit();
			System.out.println("Batch is successfully executed");
			con.rollback();
		}
		
		catch(Exception e)
		{
			System.out.println("batch is failed");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BatchDemo bdObj =  new BatchDemo();
		bdObj.createConnection();
		bdObj.createBatch();
	}

}
