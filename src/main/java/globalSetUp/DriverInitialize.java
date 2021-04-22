package globalSetUp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverInitialize  {

	public   WebDriver driver;
	public  Properties prop;
	
	
	public  WebDriver driverInitialize() throws IOException {
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\salesforce\\data.properties");
		prop.load(fis);
		String browserType=prop.getProperty("browser");
		System.out.println("type of the browser selected :" +browserType);
		
		if(browserType.equalsIgnoreCase("chrome")) {
			
		System.setProperty("Webdriver.chrome.driver", "C:\\allDrivers\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.setExperimentalOption("debuggerAddress", "localhost:9922");
		driver=new ChromeDriver();
		
		
		
		
		
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	
	
}


