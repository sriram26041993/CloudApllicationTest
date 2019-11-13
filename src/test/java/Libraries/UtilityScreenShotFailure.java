package Libraries;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;
//for failed scripts
public class UtilityScreenShotFailure {

	public static void captureScreenshot(WebDriver driver, String screenshotName) {
		try {

			TakesScreenshot ts = (TakesScreenshot) driver;

			File source = ts.getScreenshotAs(OutputType.FILE);

			Files.copy(source, new File("./reportScreenshots/" + screenshotName + ".png"));

			System.out.println("Screenshot taken");

		} catch (Exception e) {
			System.out.println("Exception while taking Screenshot" + e.getMessage());
		}
	}

//for extent reports
	public static String getScreenshotFailed(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String path=System.getProperty("user.dir")+"/reportScreenshotsFailed/"+System.currentTimeMillis()+".png";
		
		File destination=new File(path);
		
		try 
		{
			Files.copy(src, destination);
		} catch (IOException e) 
		{
			System.out.println("Capture Failed "+e.getMessage());
		}
		
		return path;
	}
	
	public static String getScreenshotPassed(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String path=System.getProperty("user.dir")+"/reportScreenshotsPassed/"+System.currentTimeMillis()+".png";
		
		File destination=new File(path);
		
		try 
		{
			Files.copy(src, destination);
		} catch (IOException e) 
		{
			System.out.println("Capture Failed "+e.getMessage());
		}
		
		return path;
	}
	
}