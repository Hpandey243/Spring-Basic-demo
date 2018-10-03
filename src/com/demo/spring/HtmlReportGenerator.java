package com.demo.spring;

public class HtmlReportGenerator implements ReportGenerator {

	@Override
	public void generateReport(int noOfPages,String name) {
		System.out.println("html report generted with " + noOfPages +" pages by "+name);
		
	}

}
