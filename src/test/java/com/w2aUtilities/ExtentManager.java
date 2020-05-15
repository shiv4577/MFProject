package com.w2aUtilities;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;



public class ExtentManager {

	private static ExtentReports extent;
	  
	public static ExtentReports getInstance() {
		
		if(extent==null) {
			
			
			extent= new ExtentReports(System.getProperty("user.dir")+"\\src\\test\\resources\\ExtentReport\\extent.html",true,DisplayOrder.OLDEST_FIRST);
			//extent.loadConfig(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\ExtentConfiq\\ReportConfig.xml "));
			extent.loadConfig(new File("E:\\All Selenium Workspace\\MFWorkspace\\MFProject\\src\\test\\resources\\ExtentConfiq\\ReportConfig.xml"));
		
			//E:\All Selenium Workspace\MFWorkspace\MFProject\src\test\resources\ExtentConfiq\ReportConfig.xml
			//E:\All Selenium Workspace\MFWorkspace\MFProject\src\test\java\com\w2aUtilities\ExtentManager.java
		}
		return extent;
	}
	
	
}
