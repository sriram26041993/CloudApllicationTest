package TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Libraries.UtilityScreenShotFailure;
import Utilities.BrowserFactory;
import pages.SignInPage;


public class endtoend {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;

	@BeforeMethod
	public void setup() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/test.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		logger = extent.createTest("test");
	}

	@Test
	@Parameters("browser")
	public void endtoend(String browserName) throws AWTException, InterruptedException, IOException {

		driver = BrowserFactory.startbrowser(browserName, "http://localhost:4200/");

		SignInPage signin = new SignInPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		signin.registerlinkclick();
		Thread.sleep(2000);
		signin.entervaluesRegister();
		Thread.sleep(2000);
		signin.Registerclick();
		Thread.sleep(2000);
		signin.entervalueslogin();
		Thread.sleep(2000);
		signin.loginclick();
		Thread.sleep(2000);
		signin.envalertsclick();
//		driver.close();
//		driver.quit();
				
	}
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {

		
	 if (result.getStatus() == ITestResult.FAILURE) {
			String temp = UtilityScreenShotFailure.getScreenshotFailed(driver);

			logger.fail(result.getThrowable().getMessage(),
					MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
		extent.flush();
		// driver.quit();
	}
}