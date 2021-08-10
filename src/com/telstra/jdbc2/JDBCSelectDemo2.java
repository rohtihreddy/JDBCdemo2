package com.telstra.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelectDemo2 {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/telstra";
		String username="root";
		String password="Roh!th77";
		String selectCommand="SELECT * FROM Product ";
		int i= 0;
		Connection cn= null;
		Statement st= null;
		ResultSet rs=null;
		try {
			cn= DriverManager.getConnection(url,username,password);
			st = cn.createStatement();
			rs= st.executeQuery(selectCommand);
			while(rs.next()) {
				int pid=rs.getInt("pid");
				String pname =rs.getString("pname");
				String ptype = rs.getString("ptype");
				System.out.println(pid + " : "+ pname +" : "+ptype);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
