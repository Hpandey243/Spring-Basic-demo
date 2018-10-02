package com.demo.spring;

public class PdfReportGenerator implements ReportGenerator{

	@Override
	public void generateReport(int noOfPages,String name) {
		System.out.println("pdfReport gnertaed" + noOfPages+name);
		
	}

}
