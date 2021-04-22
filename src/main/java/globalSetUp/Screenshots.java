package globalSetUp;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Screenshots extends DriverInitialize  {
	
	
	public   void takeScreenshot(String filename) throws IOException {
	File srcShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Random random=new Random();
	FileUtils.copyFile(srcShot, new File("./screenshots/"+filename+ random.nextInt()+ timestamp()+ ".jpg"));
	
	

}
	
	public  String timestamp() {
        return new SimpleDateFormat("dd-MM-YYYY HH-mm-ss").format(new Date());
    }
	
}
