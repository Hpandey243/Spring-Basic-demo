package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("AutoWiringByTypeConfig.xml");
		
		// ApplicationContext context= new
		// ClassPathXmlApplicationContext("NoAutoWiringconfig.xml");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationAutowiredconfig.xml");
		
		ReportService rs = context.getBean("reportService", ReportService.class);
		rs.generateReport();

	}
}
