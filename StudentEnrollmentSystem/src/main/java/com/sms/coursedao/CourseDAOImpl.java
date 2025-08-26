package com.sms.coursedao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sms.util.MyConnection;

public class CourseDAOImpl implements CourseDAO
{

	@Override
	public List<CourseModel> viewCourses() 
	{
		List<CourseModel> list = new ArrayList<CourseModel>();
		
		try
		{
			Connection con = MyConnection.reqConnection();
			PreparedStatement stmt = con.prepareStatement("select * from courses");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				CourseModel cm = new CourseModel();
				cm.setCourse_id(rs.getInt(1));
				cm.setCourse_name(rs.getString(2));
				cm.setCourse_description(rs.getString(3));
				cm.setCourse_duration(rs.getString(4));
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
