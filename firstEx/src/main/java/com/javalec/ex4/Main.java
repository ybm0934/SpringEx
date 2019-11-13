package com.javalec.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javalec.ex4.Student;
import com.javalec.ex4.Worker;

public class Main {

	public static void main(String[] args) {

		String config = "com/setting/applicationCTX2.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
		Student student = ctx.getBean("student", Student.class);
		student.getStudentInfo();
		Worker worker = ctx.getBean("worker", Worker.class);
		worker.getWorkerInfo();

	}

}
