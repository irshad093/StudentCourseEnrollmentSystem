package com.sms.studentdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sms.util.MyConnection;

public class StudentDAOImpl implements StudentDAO {

	private Connection con;

	@Override
	public StudentModel verifyStudent(String email, String password) 
	{
		StudentModel sm = null;
		try
		{
			con = MyConnection.reqConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from students where email = ? and password = ?");
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				sm = new StudentModel(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
				return sm;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return sm;
	}

	@Override
	public boolean studentRegistration(StudentModel sm) 
	{
		try
		{
			con = MyConnection.reqConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into students(name,email,roll_no,password,course_interest)values(?,?,?,?,?)");
			pstmt.setString(1, sm.getName());
			pstmt.setString(2, sm.getEmail());
			pstmt.setString(3, sm.getRoll_no());
			pstmt.setString(4, sm.getPassword());
			pstmt.setString(5, sm.getCourse_interest());
			
			int x = pstmt.executeUpdate();
			if(x != 0)
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public StudentModel fetchStudent(int id) {
		return null;
	}

}
