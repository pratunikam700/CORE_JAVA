package com.jdbcdemo2.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DButil {

	static Connection cn;
	public static Connection getcCn()  throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");//for loading the driver
		System.out.println("Driver Loaded Successfully!!!");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jn07","root","123");//create connection
		System.out.println("Connection establish successfully!!");
		
		return cn;
	}
	public void closeConnection() throws SQLException{
		if(cn!=null)
			cn.close();
	}
}
