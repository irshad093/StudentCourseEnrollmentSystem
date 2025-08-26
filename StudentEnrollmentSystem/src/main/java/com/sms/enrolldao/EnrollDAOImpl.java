package com.sms.enrolldao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sms.coursedao.CourseModel;
import com.sms.util.MyConnection;

public class EnrollDAOImpl implements EnrollDAO
{

	private Connection con;

	@Override
	public boolean enrollStudentInCourse(int studentId, int courseId) 
	{
		try {
	        con = MyConnection.reqConnection();

	        // Check if already enrolled
	        String checkQuery = "SELECT * FROM enrollments WHERE student_id = ? AND course_id = ?";
	        PreparedStatement checkStmt = con.prepareStatement(checkQuery);
	        checkStmt.setInt(1, studentId);
	        checkStmt.setInt(2, courseId);
	        ResultSet rs = checkStmt.executeQuery();

	        if (rs.next()) {
	            //Already enrolled ,skip insert
	            return false;
	        }

	        //  Insert only if not enrolled
	        PreparedStatement pstmt = con.prepareStatement(
	                "INSERT INTO enrollments(student_id,course_id) VALUES(?,?)");
	        pstmt.setInt(1, studentId);
	        pstmt.setInt(2, courseId);

	        int x = pstmt.executeUpdate();
	        return (x != 0);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return false;
	}

	@Override
	public List<CourseModel> getEnrolledCoursesByStudent(int studentId) 
	{
		List<CourseModel> list = new ArrayList<CourseModel>();
		String query = "SELECT c.course_id, c.course_name, c.course_description, c.course_duration " +
	             "FROM enrollments e JOIN courses c ON e.course_id = c.course_id " +
	             "WHERE e.student_id = ?";
		try
		{
			con = MyConnection.reqConnection();
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, studentId);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				CourseModel cm = new CourseModel(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				list.add(cm);
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
}









