package com.sms.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.coursedao.CourseDAOImpl;
import com.sms.coursedao.CourseModel;

@WebServlet("/courseServlet")
public class CourseServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		CourseDAOImpl cdi = new CourseDAOImpl();
		List<CourseModel> courses = cdi.viewCourses();
		
		if(courses == null)
		{
			req.setAttribute("message", "No, Courses are available right now.");
		}
		else
		{
			req.setAttribute("courses", courses);
			req.getRequestDispatcher("viewCourse.jsp").forward(req, resp);
			
		}
	}
}
