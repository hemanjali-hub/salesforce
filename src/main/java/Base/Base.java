package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\salesforce\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		String url=prop.getProperty("url");
		if(browserName.equals("chrome")) {
			System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			
		}
		else if(browserName.equals("firefox")){
			System.out.println("firefox");
	}
	
		else if(browserName=="edge") {
			System.out.println("edge");
}driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;
}
	
}