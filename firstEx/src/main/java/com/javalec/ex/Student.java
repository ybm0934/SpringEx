package com.javalec.ex;

public class Student {

	private String name;
	private int age;
	private int grade;
	private String group;

	public Student(String name, int age, int grade, String group) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

}
