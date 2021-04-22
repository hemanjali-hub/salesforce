package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import globalSetUp.DriverInitialize;
import globalSetUp.Screenshots;

public class LoginPage extends Screenshots {
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//input[@type=\"email\"]")
	WebElement username;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement submit;
	
	@FindBy(xpath="//input[@type=\"text\"]")
	WebElement otpVerification;
	
	@FindBy(xpath="//input[@value=\"Verify\"]")
	WebElement verifyButton;
	
	
	public WebElement Email() throws IOException {
		
		
		return username;
		
	}
	
	public WebElement password() throws IOException {
		
		
		return password;
	}
	
	public WebElement submit() throws IOException {
		
		
		return submit;
	}
public WebElement otpVerification() throws IOException, InterruptedException {
	
		
	Thread.sleep(15);
		
		return otpVerification;
	}

public WebElement verifyButton() throws IOException, InterruptedException {
	
	
	takeScreenshot("verifyButton");
	
	return verifyButton;
}

  public void LoginTest() throws IOException, InterruptedException {
  
	  LoginPage lp=new LoginPage(driver);
	    String uid=prop.getProperty("username");
		lp.Email().sendKeys(uid);
		lp.takeScreenshot("username-email");

		String pwd=prop.getProperty("password");
		lp.password().sendKeys(prop.getProperty(pwd));
		lp.takeScreenshot("password entered");
		
		lp.submit().click();
		lp.otpVerification();
		lp.verifyButton().click();
  }
}
