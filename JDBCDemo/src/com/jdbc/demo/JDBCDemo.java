package com.jdbc.demo;

import java.sql.*;

public class JDBCDemo {
	
	public static void main(String args[]) throws Exception{
		
		
		// loading driver class
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root", "password");
		
		Statement st = con.createStatement();
		
		
		
		ResultSet rs = st.executeQuery("Select * from usercredential");
		
		System.out.print(rs.getString(0));
		
		st.close();
		con.close();
		
		
	}
	
	
	
	
	
	
	
	

}
