package com.sms.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sms.enrolldao.EnrollDAOImpl;
import com.sms.studentdao.StudentModel;


@WebServlet("/enrollServlet")
public class EnrollServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out = resp.getWriter();
		String courseIdstr = req.getParameter("courseId");
		int courseId = Integer.parseInt(courseIdstr);
		
		HttpSession session = req.getSession(false);
		StudentModel sm = (StudentModel) session.getAttribute("sm");
		int studentId = sm.getStudent_id();
		
		EnrollDAOImpl edi =new EnrollDAOImpl();
		boolean res = edi.enrollStudentInCourse(studentId, courseId);
		if(res == true)
		{
			out.print("<h1>Enrolled Successfully</h1>");
		}
		else
		{
			out.print("<h1>Student Already Enrolled!</h1>");
		}
	}
}
