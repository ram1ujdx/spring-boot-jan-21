package com.example.mvn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

	
	public static Connection getConnection() throws SQLException {
		Connection con;
		con=DriverManager.getConnection("jdbc:mysql://localhost/mysql_emp_db","root","password");
		return con;
	}
	
	
}
