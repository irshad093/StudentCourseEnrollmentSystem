package com.sms.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.studentdao.StudentDAOImpl;
import com.sms.studentdao.StudentModel;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String rollnumber = req.getParameter("rollnumber");
		String password = req.getParameter("password");
		String cpassword = req.getParameter("cpassword");
		String courseinterest = req.getParameter("courseinterest");
		
		if(password.equals(cpassword))
		{
			StudentDAOImpl sdi = new StudentDAOImpl();
			StudentModel sm = new StudentModel(name,email,rollnumber,password,courseinterest);
			boolean res = sdi.studentRegistration(sm);
			if(res == true)
			{
				out.print("Registered Successfully..");
			}
			else
			{
				out.print("Not Registered!");
			}
		}
		else
		{
			out.print("Password and Confirm Password not match!");
		}
	}
}
