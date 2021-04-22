package accountSetUp;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.ITestListener;
import org.testng.annotations.Test;

import globalSetUp.Screenshots;
import pageObjects.LoginPage;


public class AccountCreation extends Screenshots implements ITestListener {
	
	@Test
	public  void URLNavigator() throws IOException, InterruptedException {
		
		driver=driverInitialize();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		takeScreenshot("login page");
		
		
		LoginPage lp=new LoginPage(driver);
		//lp.LoginTest();
		lp.Email().sendKeys(prop.getProperty("username"));
		lp.takeScreenshot("username-email");

		lp.password().sendKeys(prop.getProperty("password"));
		lp.takeScreenshot("password entered");
		
		lp.submit().click();
		Thread.sleep(15000);
		/*lp.otpVerification();
		
		lp.verifyButton().click();
		
		
		lp.takeScreenshot("otp page");
		driver.findElement(By.xpath("//button[@title=\"Close this window\"]")).click();
		driver.switchTo().alert().accept();*/
	
}
}
