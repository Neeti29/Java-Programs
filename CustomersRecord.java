package JDBC;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CustomersRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");  //cj is a latest driver  //loading and registering the driver
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels", "root", "connection"); 
			
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY); 
			ResultSet rs=stmt.executeQuery("Select * from customers where city='NYC'");
			
			//reading from bottom to top
			
			rs.afterLast();
			while(rs.previous())
			{
				System.out.println(rs.getInt(1)+ " " +rs.getString(2)+ " " + rs.getString(3) + " " + rs.getString(5) + " " + rs.getString(8));   
				
			}
			
			System.out.println("*************************************************************");
			
			//move the cursor to 3rd record
			
			rs.absolute(3);  //getting record of 3rd row
			System.out.println(rs.getInt(1)+" "+ rs.getString(2));
			
			System.out.println("*************************************************************");
			
			//move the cursor to 2nd record using relative()
			
			rs.relative(-1);
			
			System.out.println(rs.getInt(1)+" "+ rs.getString(2));
			System.out.println("*************************************************************");
			
			int i=rs.getRow();  //get cursor position
			
			System.out.println("cursor position="+i);
			
			//Cleanup
			rs.close();
			stmt.close();
			con.close();
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
