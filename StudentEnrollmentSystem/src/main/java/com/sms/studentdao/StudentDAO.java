package com.sms.studentdao;

public interface StudentDAO 
{
	StudentModel verifyStudent(String email, String password);
	boolean studentRegistration(StudentModel sm);
	StudentModel fetchStudent(int id);
}
