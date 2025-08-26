package com.sms.enrolldao;

import java.util.List;

import com.sms.coursedao.CourseModel;

public interface EnrollDAO 
{
	boolean enrollStudentInCourse(int studentId,int courseId);
	List<CourseModel> getEnrolledCoursesByStudent(int studentId);
}
