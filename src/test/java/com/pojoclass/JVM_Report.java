package com.pojoclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVM_Report {

	public static void generateJVMReport(String jsonFileLoc) {

		//File jvmReportLoc = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");
		
		File jvmReportLoc = new File("F:\\Gurava Reddy\\Selenium\\EclipsePractice\\FacebookwithCucumberandPOM2\\src\\test\\resources\\Reports");


		List<String> emp = new ArrayList<String>();

		emp.add(jsonFileLoc);

		Configuration con = new Configuration(jvmReportLoc, "CucumberReports");

		con.addClassifications("Browser", "Chrome");
		con.addClassifications("OS", "Windows");
		
		ReportBuilder builder = new ReportBuilder(emp, con);

		builder.generateReports();

	}

}
