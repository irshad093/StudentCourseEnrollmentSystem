<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="com.sms.coursedao.CourseModel" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Enrolled Courses</title>
<link rel="stylesheet" type="text/css" href="style.css">

<style>
    table { border-collapse: collapse; width: 80%; margin: 20px 0; }
    th, td { border: 1px solid #ccc; padding: 8px; text-align: left; }
    th { background-color: #f2f2f2; }
    h2 { color: #333; }
</style>
</head>
<body>
	<div class="container">
		<h2>My Enrolled Courses</h2>
<%
    List<CourseModel> mycourses = (List<CourseModel>)request.getAttribute("mycourses");
    String message = (String)request.getAttribute("message");
    
    if(message != null) {
%>
        <h3><%= message %></h3>
<%
    } else if(mycourses != null) {
        if(mycourses.isEmpty()) {
%>
        <h3>No courses enrolled yet.</h3>
<%
        } else {
%>
        <table>
            <tr>
                <th>Course ID</th>
                <th>Course Name</th>
                <th>Course Description</th>
                <th>Course Duration</th>
            </tr>
<%
            for (CourseModel c : mycourses) {
%>
            <tr>
                <td><%= c.getCourse_id() %></td>
                <td><%= c.getCourse_name() %></td>
                <td><%= c.getCourse_description() %></td>
                <td><%= c.getCourse_duration() %></td>
            </tr>
<%
            }
%>
        </table>
<%
        }
    } else {
        out.print("<h3>Error loading courses.</h3>");
    }
%>
	</div>
</body>
</html>
