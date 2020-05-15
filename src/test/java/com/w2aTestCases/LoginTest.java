package com.w2aTestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.w2a.Base.TestBase;

import AllPages.LoginPage;

public class LoginTest extends TestBase{

	@Test
	
	public void loginTestCase() {
		LoginPage login= new LoginPage(driver);
		login.ClickOnLoginButtonMethod();
		login.EnterUserNameMethod("brm5488@gmail.com");
		login.EnterPasswordMethod("9453bfc495e3");
		login.ClickOnSubmitButton();
		Reporter.log("click on submit");
		
		/* System.setProperty("org.uncommons.reportng.escape-output","false"); */
		
		/*
		 * Reporter.
		 * log("<a target=\"_blank\" href=\"E:\\Sceenshot\\error.jpg\">Screenshot</a>");
		 * Reporter.log("<br>");
		 * 
		 * Reporter.
		 * log("<a target=\"_blank\" href=\"E:\\Sceenshot\\error.jpg\"><img src=\"E:\\Sceenshot\\error.jpg  \"hight=200 width=200 ></img></a>"
		 * );
		 */
		//Reporter.log("<a target=\"_blank\" href=\"E:\\Sceenshot\\error.jpg\"><img src=\"E:\\Sceenshot\\error.jpg \" ></img></a>");
	}
}
