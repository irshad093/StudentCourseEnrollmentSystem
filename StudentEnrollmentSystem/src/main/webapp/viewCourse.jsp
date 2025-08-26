<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="com.sms.coursedao.CourseModel" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Courses to Enroll</title>
<link rel="stylesheet" type="text/css" href="style.css">

</head>
<body>
    <div class="container">
    	<%
        String message = (String)request.getAttribute("message");
        List<CourseModel> courses =(List<CourseModel>) request.getAttribute("courses");
        if(message != null) {
    %>
        <h1><%= message %></h1>
    <%
        } else if(courses != null) {
    %>
        <table border="1" cellpadding="8" cellspacing="0">
            <tr>
                <th>Course ID</th>
                <th>Course Name</th>
                <th>Course Description</th>
                <th>Course Duration</th>
                <th>Enroll Here</th>
            </tr>
            <%
                for (CourseModel c : courses) {
            %>
            <tr>
                <td><%= c.getCourse_id() %></td>
                <td><%= c.getCourse_name() %></td>
                <td><%= c.getCourse_description() %></td>
                <td><%= c.getCourse_duration() %></td>
                <td>
                    <form action="enrollServlet" method="post">
                        <input type="hidden" name="courseId" value="<%= c.getCourse_id() %>"/>
                        <input type="submit" value="Enroll"/>
                    </form>
                </td>
            </tr>
            <%
                } // end for
            %>
        </table>
    <%
        } else {
            out.print("Error in course");
        }
    %>
    </div>
</body>
</html>
