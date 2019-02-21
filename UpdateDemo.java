package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class UpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//User giving values at run time
		PreparedStatement pstmt;
		ResultSet rs;
		int cnt=0;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");  //cj is a latest driver  //loading and registering the driver
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels", "root", "connection");
			
			String sqlUpdate="UPDATE employees " + "SET jobTitle=?" + "WHERE employeeNumber = ?";  //? - Parameter Operator
			 
			pstmt=con.prepareStatement(sqlUpdate);
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Employee ID:");
			
			int eid=s.nextInt();  //1702
			
			s.nextLine();
			System.out.println("Enter new job Title");
			String strm=s.nextLine(); //Sales Manager
			
			
			pstmt.setString(1, strm);
			pstmt.setInt(2,eid);
			
			int rowAffected=pstmt.executeUpdate();
			System.out.println("Row Affected" + rowAffected);
			
			//reuse the Prepared Statement
			strm="Sales Head";
			eid=1370;
			pstmt.setString(1, strm);  //using hard code values( because prepared statements are Pre-Compiled statements)
			pstmt.setInt(2, eid);
			
			
			rowAffected=pstmt.executeUpdate();
		
			System.out.println("Row Affected "+ rowAffected);
			
			con.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
