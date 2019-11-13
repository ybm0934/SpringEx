package com.javalec.ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
/*
		String configLoc = "com/setting/applicationCTX2.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configLoc);
		AdminConnection con = ctx.getBean("adminConnection", AdminConnection.class);
		System.out.println("AdminID : " + con.getAdminId());
		System.out.println("AdminPW : " + con.getAdminPw());
		System.out.println("Sub_AdminID : " + con.getSub_adminId());
		System.out.println("Sub_AdminPW : " + con.getSub_adminPw());
*/
		String configLoc = "com/setting/applicationCTX2.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configLoc);
		Student student = ctx.getBean("student", Student.class);
		student.getStudentInfo();
		Worker worker = ctx.getBean("worker", Worker.class);
		worker.getWorkerInfo();
		
	}

}
