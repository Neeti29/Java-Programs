package JDBC;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class InsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Statement stmt;
		ResultSet rs;
		int cnt=0;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");  //cj is a latest driver  //loading and registering the driver
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels", "root", "connection");
			
			String str="insert into offices values(9,'Greater Noida','+91 650 219 3556','Knowledge Park','Utility Building A','KB','INDIA','56003','NA')";
			
			stmt=con.createStatement();
			int rowcount=stmt.executeUpdate(str);
			if(rowcount>0)
			{
				System.out.println("Record Inserted Successfully");
			}
			
			String str1="Select count(officeCode) from offices";
			
			rs=stmt.executeQuery(str1);
			
			while(rs.next())
			{
				cnt=rs.getInt(1);
				System.out.println("Total no. of records is: "+cnt);
			}
			con.close();
			
		}	
		
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
