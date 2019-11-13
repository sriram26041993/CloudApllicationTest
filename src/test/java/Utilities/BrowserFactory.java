package Utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class BrowserFactory {

	static WebDriver driver;

	public static WebDriver startbrowser(String browserName, String URL) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\syarabarla\\eclipse-workspace\\OMS\\src\\test\\resources\\Drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-features=VizDisplayCompositor");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\syarabarla\\eclipse-workspace\\OMS\\src\\test\\resources\\Drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
		return driver;
	}

}
