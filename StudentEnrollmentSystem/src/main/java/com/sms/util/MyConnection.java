package com.sms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection 
{
	 static Connection con = null;
	static String url="jdbc:mysql://localhost:3306/StudentCourseEnrollmentSystem";
	static String un = "root";
	static String pwd = "1234";
	
	public static Connection reqConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, un, pwd);
		
		return con;
	}
}
