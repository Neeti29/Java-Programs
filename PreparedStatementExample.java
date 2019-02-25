package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementExample {
	Connection con;
	PreparedStatement pstm;
	PreparedStatementExample()
	{
		
	}
	
	void createConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // cj is a latest driver //loading and registering the driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc", "root", "connection");
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}

	 
	public void insertIntoCandidate()
	{
		try
		{
			String query = " insert into candidates (first_name, last_name, dob, phone, email)"
			        + " values (?, ?, ?, ?, ?)";
			 
			// create the mysql insert preparedstatement
			
		      PreparedStatement preparedStmt = con.prepareStatement(query);
		      
		      preparedStmt.setString (1, "Barney");
		      preparedStmt.setString (2, "Rubble");
		      preparedStmt.setString(3, "1995-01-01");
		      preparedStmt.setString(4, "886789012");
		      preparedStmt.setString(5, "abc@gmail.com");

		      // execute the preparedstatement
		      preparedStmt.execute();
		      
		      con.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
		public static void main (String[] args) 
		{
			// TODO Auto-generated method stub
			PreparedStatementExample psm =  new PreparedStatementExample();
			psm.createConnection();
			psm.insertIntoCandidate();
		}
		
		
		
	

     }



