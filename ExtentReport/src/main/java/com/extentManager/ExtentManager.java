package com.extentManager;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.BasePackage.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;//this class used for attaching testcases reports
	public static ExtentTest test;
	
	
	public static void setExtent()
	{
		htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtentReport/"+"MyReport_"+BaseClass.getCurrentTime()+".html");
		htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
		//htmlReporter.config().setDocumentTitle("Automation test report");
		//htmlReporter.config().setReportName("OrangeHrm test automation report ");
		//htmlReporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("HostName", "MyHost");
		extent.setSystemInfo("ProjectName", "OrangeHRM");
		extent.setSystemInfo("Tester", "Jagananth");
		extent.setSystemInfo("OS", "W-10");
		extent.setSystemInfo("Brwoser", "Chrome");
		
		
		
		
	}
	
	public static void endReport()
	{
		extent.flush();
	}

}
