package JDBC;
import java.sql.*;
import java.io.*;
public class BlobDemo 
{

	Connection con;
	PreparedStatement pstm;
	ResultSet rs;
	
	void createConnection()
	{
		
		try 
		{
				Class.forName("com.mysql.cj.jdbc.Driver"); // cj is a latest driver //loading and registering the driver
				con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc", "root", "connection");
		}

			catch (Exception e) {
				System.out.println(e);
			}
	}
	
	public void writeBlob(int candidateId , String filename)
	{
		//update sql
		String updateSQL = "UPDATE candidates " + "SET resume = ? " + "WHERE id =?";
		
		try
		{
			pstm = con.prepareStatement(updateSQL);
			
			//read the file
			File file = new File(filename);
			FileInputStream input = new FileInputStream(file);
			
			//set parameters
			
			pstm.setBinaryStream(1, input);
			pstm.setInt(2, candidateId);
			
			//store the resume file in database
			System.out.println("Reading file " + file.getAbsolutePath());
			System.out.println("store file in the database.");
			pstm.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception is" + e);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BlobDemo bd1=new BlobDemo();
		bd1.createConnection();
		bd1.writeBlob(133, "johndoe_resume.pdf");

	}

}
