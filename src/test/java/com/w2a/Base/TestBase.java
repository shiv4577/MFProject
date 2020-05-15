package com.w2a.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.w2aUtilities.ExtentManager;




public class TestBase {

	public static WebDriver driver;
	public static Properties config = new Properties();
	FileInputStream fis;
	public ExtentReports repo = ExtentManager.getInstance();
	public static ExtentTest test;
	
	
	
	@BeforeSuite
	public void SetupMethod() throws IOException {
		
		if(driver==null) {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.Properties");
			config.load(fis);
		}
		
		if(config.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\All Selenium Workspace\\MFWorkspace\\MFProject\\src\\test\\resources\\Executabls\\chromedriver.exe");
			driver= new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get(config.getProperty("testsiteurl"));
			 driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicite.wait")),TimeUnit.SECONDS);
			 
		}
	
		
	}
	
	
	
	  @AfterSuite 
	  public void tearDown() { driver.quit(); }
	 
}
