package com.telstra.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcInserDemo2 {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/telstra";
		String username="root";
		String password="Roh!th77";
		String insertCommand="INSERT INTO product VALUES(1234,'Watch','Accessories'),(1235,'GOT','Book')";
		int i= 0;
		Connection cn= null;
		Statement st= null;
		try {
			cn= DriverManager.getConnection(url,username,password);
			st = cn.createStatement();
			i = st.executeUpdate(insertCommand);
			System.out.println(i+ " Products added....");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
