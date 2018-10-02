package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config3.xml");
		//ReportService rs=(ReportService) context.getBean("reportService");
		//ReportService rs=context.getBean(ReportService.class);
		ReportService rs=context.getBean("reportService",ReportService.class);
		rs.generateReport();
		
	}
}
