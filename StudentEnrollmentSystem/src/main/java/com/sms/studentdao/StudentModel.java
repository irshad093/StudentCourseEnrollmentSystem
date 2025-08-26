package com.sms.studentdao;

public class StudentModel 
{
	private int student_id;
	private String name;
	private String email;
	private String roll_no;
	private String password;
	private String course_interest;
	
	
	public StudentModel() 
	{
		
	}
	
	public StudentModel(int student_id, String name, String email, String roll_no, String password,
			String course_interest) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.email = email;
		this.roll_no = roll_no;
		this.password = password;
		this.course_interest = course_interest;
	}

	public StudentModel(String name, String email, String roll_no, String password, String course_interest) {
		super();
		this.name = name;
		this.email = email;
		this.roll_no = roll_no;
		this.password = password;
		this.course_interest = course_interest;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCourse_interest() {
		return course_interest;
	}

	public void setCourse_interest(String course_interest) {
		this.course_interest = course_interest;
	}

	@Override
	public String toString() {
		return "StudentModel [student_id=" + student_id + ", name=" + name + ", email=" + email + ", roll_no=" + roll_no
				+ ", password=" + password + ", course_interest=" + course_interest + "]";
	}
	
	
	
}
