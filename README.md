Student Course Enrollment System

A web-based application built with Java Servlets, JSP, and JDBC to manage student course enrollments. Students can register, log in, view available courses, enroll in courses (with duplicate checks), and view their enrolled courses.

Features

Student registration & login

Course listing with details

Enroll in courses (prevents duplicate enrollments)

View enrolled courses

Session management (login/logout)

Tech Stack

Frontend: JSP, HTML, CSS

Backend: Java Servlets, JDBC

Database: MySQL

Project Structure

Model → Represents entities like Student, Course

DAO → Handles database operations

Servlets → Contains business logic and request handling

JSP → User interface (login, dashboard, courses, etc.)

How It Works

A student registers and logs in.

The dashboard provides options:

View all available courses

Enroll in a course

View enrolled courses

Logout

Enrollment details are saved in the database.

Setup Instructions

Clone this repo

Import into your IDE (Eclipse/IntelliJ)

Create a MySQL database and update credentials in DBConnection.java

Run on Apache Tomcat server

Access the app at: http://localhost:8080/StudentCourseEnrollmentSystem

Future Enhancements

Admin panel to add/manage courses

Email notifications for enrollment

Upgrade to Hibernate & Spring Boot
