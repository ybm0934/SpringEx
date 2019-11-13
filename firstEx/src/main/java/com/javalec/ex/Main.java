package com.javalec.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {

		//String configLoc = "classpath:applicationCTX.xml";
		//AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
/*		
		String configLoc = "com/setting/applicationCTX.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configLoc);
		MyInfo info = ctx.getBean("myInfo", MyInfo.class);
		info.getInfo();
		
		
		String configLoc = "com/setting/applicationCTX.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configLoc);
		StudentInfo info = ctx.getBean("studentInfo", StudentInfo.class);
		info.getStudentInfo();
		
		Student student = ctx.getBean("student2", Student.class);
		info.setStudent(student);
		info.getStudentInfo();
*/
		
		String configLoc = "com/setting/applicationCTX.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configLoc);
		Pencil pencil = ctx.getBean("pencil", Pencil.class);
		pencil.use();

	}

}
