import org.openqa.selenium.By;

import pageObjects.LoginPage;

public class LoginTest extends LoginPage{

	
	public void login() {
		LoginPage lp=new LoginPage(driver);
		//lp.LoginTest();
		lp.Email().sendKeys(prop.getProperty("username"));
		lp.takeScreenshot("username-email");

		lp.password().sendKeys(prop.getProperty("password"));
		lp.takeScreenshot("password entered");
		
		lp.submit().click();
		Thread.sleep(15000);
		lp.otpVerification();
		
		lp.verifyButton().click();
		
		
		lp.takeScreenshot("otp page");
		driver.findElement(By.xpath("//button[@title=\"Close this window\"]")).click()
		
	}
}
