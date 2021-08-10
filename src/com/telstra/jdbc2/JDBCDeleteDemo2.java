package com.telstra.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDeleteDemo2 {
	public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/telstra";
	String username="root";
	String password="Roh!th77";
	String deleteCommand="DELETE FROM product WHERE pid=1233";
	int i= 0;
	Connection cn= null;
	Statement st= null;
	try {
		cn= DriverManager.getConnection(url,username,password);
		st = cn.createStatement();
		i = st.executeUpdate(deleteCommand);
		System.out.println(i+ " details deleted....");
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
