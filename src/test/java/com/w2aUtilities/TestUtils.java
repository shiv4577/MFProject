package com.w2aUtilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.w2a.Base.TestBase;

public class TestUtils extends TestBase {
	
	public static String ScreenshotName;
	public static String screenshotPath;

	public static void  CaptureScreenshot() throws IOException {
		
		
		
		
		  File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  Date d= new Date();
		  
		  ScreenshotName= d.toString().replace(":", "_").replace(" ", " ")+".jpg";
		  
		  FileUtils.copyFile(SrcFile, new
		  File(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\"+
		  ScreenshotName));
		  
		  FileUtils.copyFile(SrcFile, new
		  File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshot "+
		  ScreenshotName));
		 
		
		
		/*
		 * File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 * 
		 * Date d = new Date(); ScreenshotName = d.toString().replace(":",
		 * "_").replace(" ", "_") + ".jpg";
		 * 
		 * FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") +
		 * "\\target\\surefire-reports\\html\\" + ScreenshotName));
		 */
		
	}
}
 