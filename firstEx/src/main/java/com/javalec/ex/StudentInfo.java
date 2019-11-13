package com.javalec.ex;

public class StudentInfo {

	private Student student;

	public StudentInfo(Student student) {
		this.student = student;
	}

	public void getStudentInfo() {
		if (student != null) {
			System.out.println("===========================");
			System.out.println("이름 : " + student.getName());
			System.out.println("나이 : " + student.getAge());
			System.out.println("학년 : " + student.getGrade());
			System.out.println("반 : " + student.getGroup());
			System.out.println("===========================");
		}
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
