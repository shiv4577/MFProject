package AllPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.w2a.Base.TestBase;

public class LoginPage extends TestBase {

WebDriver ldriver;
	
	@FindBy(xpath="//a[@href='https://trimitiy.com/shubhavishva/home/login']") WebElement LoginButton;
	@FindBy(xpath="//input[@id='inp_usr_nm']") WebElement EnterUserName;
	@FindBy(xpath="//input[@id='inp_pass']") WebElement EnterPassWord;
	@FindBy(xpath="//button[@type='submi']") WebElement ClickOnsubmit;
	
	
	
	public LoginPage(WebDriver rdriver) {
		
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void ClickOnLoginButtonMethod() {
		LoginButton.click();
	}
	
	public void EnterUserNameMethod(String UserName) {
		EnterUserName.sendKeys(UserName);
		
	}

	public void EnterPasswordMethod(String PassWord) {
		EnterPassWord.sendKeys(PassWord);
		
	}
	
	public void ClickOnSubmitButton(){
		ClickOnsubmit.click();
		}
	
	public String VerifyLoginTitle() {
		return driver.getTitle();
	}
	
}
