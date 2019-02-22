package JDBC;

import java.sql.*;

public class CallableDemo1 {

Connection con;
	CallableStatement cstmt;
	ResultSet rs;

	CallableDemo1() {

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

	public void getSkills(int candidateId) {
		String query = "{ call get_candidate_skill(?) }";

		try {
			CallableStatement stmt = con.prepareCall(query);
			stmt.setInt(1, candidateId);
			rs = stmt.executeQuery();
			while (rs.next()) {

				System.out.println(String.format("%s - %s",
						rs.getString("first_name") + " " + rs.getString("last_name"), rs.getString("skill")));
			}
		}

		catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallableDemo1 cd = new CallableDemo1();
		cd.createConnection();
		cd.getSkills(133);
	}
}
