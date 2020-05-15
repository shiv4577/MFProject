package com.w2a.listners;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;
import com.w2a.Base.TestBase;
import com.w2aUtilities.TestUtils;

public class CustomListner extends TestBase implements ITestListener ,ISuiteListener  {

	public void onTestStart(ITestResult result) {
		System.out.println("on test start");
		test = repo.startTest(result.getName().toUpperCase());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(LogStatus.PASS, result.getName().toUpperCase()+" PASS");
		repo.endTest(test);
		repo.flush();
		
	}

	public void onTestFailure(ITestResult result) {
		
		
		
		/*
		 * System.setProperty("org.uncommons.reportng.escape-output","false");
		 * Reporter.log("Capturing Screenshot ");
		 * 
		 * try { TestUtils.CaptureScreenshot(); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * test.log(LogStatus.FAIL,result.getTestName().toUpperCase()
		 * +"Failed with exception :"+result.getThrowable() ); test.log(LogStatus.FAIL,
		 * test.addScreenCapture(TestUtils.ScreenshotName));
		 * 
		 * Reporter.log("<a target=\"_blank\" href="+TestUtils.ScreenshotName+
		 * ">Screenshot</a>"); //Reporter.log("<br>");
		 * 
		 * Reporter.log("<a target=\"_blank\" href="+TestUtils.
		 * ScreenshotName+"><img src="+TestUtils.c+" ></img></a>");
		 * repo.endTest(test); repo.flush();
		 */
		
		
		System.setProperty("org.uncommons.reportng.escape-output","false");
		try {
			TestUtils.CaptureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.FAIL, result.getName().toUpperCase()+" Failed with exception : "+result.getThrowable());
		test.log(LogStatus.FAIL, test.addScreenCapture(TestUtils.ScreenshotName));
		
		
		
		Reporter.log("Click to see Screenshot");
		Reporter.log("<a target=\"_blank\" href="+TestUtils.ScreenshotName+">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href="+TestUtils.ScreenshotName+"><img src="+TestUtils.ScreenshotName+" ></img></a>");
		repo.endTest(test);
		repo.flush();
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(LogStatus.SKIP, result.getName().toUpperCase()+" Skipped the test as the Run mode is NO");
		repo.endTest(test);
		repo.flush();
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

	
}
