<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
<link rel="stylesheet" type="text/css" href="style.css">

</head>
<body>
	<div class="container">
		<h1>Register</h1>
        <form action="registerServlet" method="post">
            <table>
           		<tr>
           			 <td><label>Student Name</label></td>
            		<td><input type="text" name="name"></td>
           		</tr>

           		<tr>
           			<td> <label>Email ID</label></td>
            		<td> <input type="email" name="email"></td>
           		</tr>
           		
           		<tr>
           			<td><label>Roll Number</label></td>
            		<td><input type="text" name="rollnumber"></td>
           			
           		</tr>

            	<tr>
            		<td><label>Password</label></td>
            		<td><input type="password" name="password"></td>
            	</tr>
            
				<tr>
					<td><label>Confirm Password</label></td>
            		<td><input type="password" name="cpassword"></td>
				</tr>
            
				<tr>
					<td><label>Course Interest</label></td>
            		<td><input type="text" name="courseinterest"></td>
				</tr>
            
				<tr>
					<td><button type="submit" class="btn">Register</button></td>
				</tr>
            
            </table>
        </form>
        <a  href=login.jsp>Already Registered? Login here</a>
	</div>
</body>
</html>