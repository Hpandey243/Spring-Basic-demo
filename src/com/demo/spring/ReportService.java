package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class ReportService {

	@Autowired(required = false)
	// @Qualifier("htmlReportGenerator")
	private ReportGenerator master;

	private int noOfPages;
	private String name;

	public ReportGenerator getMaster() {
		return master;
	}

	public void setMaster(ReportGenerator master) {
		this.master = master;
	}

	public void generateReport() {
		master.generateReport(noOfPages, name);
	}

	public ReportService(int noOfPages, String nm, ReportGenerator master) {
		this.noOfPages = noOfPages;
		this.name = nm;
		this.master = master;
	}

	public ReportService() {

	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
