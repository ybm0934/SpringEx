package com.javalec.ex2;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public Student student1() {

		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("요리");
		hobbys.add("게임");

		Student student = new Student("학생1");
		student.setAge(20);
		student.setHobbys(hobbys);

		return student;
	}

	@Bean
	public Student student2() {

		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("독서");
		hobbys.add("낚시");

		Student student = new Student("학생2");
		student.setAge(18);
		student.setHobbys(hobbys);

		return student;
	}

}
