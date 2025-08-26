<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Verification</title>
<link rel="stylesheet" type="text/css" href="style.css">

</head>
<body>
	<div class="container">
		<h1>Login</h1>
        <form action="loginServlet" method="post">
            <table>
            	<tr>
            		<td><label>Email ID</label></td>
            		<td><input type="text" name="email"></td>
            	</tr>
				<tr>
					<td><label>Password</label></td>
            		<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><button type="submit" class="btn">Login</button></td>
				</tr>
            </table>
        </form>
        <a class="register-link" href="register.jsp">New user? Register here</a>
	</div>
</body>
</html>