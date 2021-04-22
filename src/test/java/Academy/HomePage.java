package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.Base;

public class HomePage extends Base{
	@Test
	public void basePageNavigator() throws IOException {
		
		driver=initializeDriver();
		//driver.get("http://www.qaclickacademy.com/");
		
	}
	

}
