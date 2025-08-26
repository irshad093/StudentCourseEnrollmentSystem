<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.sms.studentdao.StudentModel" %><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Enrollment System</title>
<link rel="stylesheet" type="text/css" href="style.css">

</head>
<body>
	<div class="container">
		<%
		StudentModel sm=(StudentModel)session.getAttribute("sm");
	%>
	
	<h1>Welcome, <%= sm.getName()%></h1><br>
	<h3>Email Id: <%= sm.getEmail() %></h3>
	
	<diV>
		<a href="courseServlet">List of Courses | </a>
		<a href="myCourseServlet">My Enrollments | </a>
		<a href="logoutServlet">Logout</a>
	</diV>
	</div>
</body>
</html>