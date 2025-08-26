package com.sms.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sms.coursedao.CourseModel;
import com.sms.enrolldao.EnrollDAOImpl;
import com.sms.studentdao.StudentModel;


@WebServlet("/myCourseServlet")
public class MyCourseServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession session = req.getSession();
		StudentModel sm = (StudentModel)session.getAttribute("sm");
		int studentId = sm.getStudent_id();
		
		EnrollDAOImpl edi = new EnrollDAOImpl();
		List<CourseModel> myCourses = edi.getEnrolledCoursesByStudent(studentId);
		if(myCourses.isEmpty())
		{
			req.setAttribute("message", "Enroll courses, to Learn.");
		}
		else
		{
			req.setAttribute("mycourses", myCourses);
			req.getRequestDispatcher("mycourses.jsp").forward(req, resp);
			
		}
	}
}
