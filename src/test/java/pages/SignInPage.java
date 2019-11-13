package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;

public class SignInPage {
	WebDriver driver;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By registerlink = By.xpath("//a[@href='/register']");
	
	By firstNameregister = By.xpath("//input[@formcontrolname='firstName']");
	By lastNameregister = By.xpath("//input[@formcontrolname='lastName']");
	By usernameregister = By.xpath("//input[@formcontrolname='username']");
	By passwordregister = By.xpath("//input[@formcontrolname='password']");
	
	By Register = By.xpath("//button[contains(text(),'Register')]");
	
	By username = By.xpath("//input[@formcontrolname='username']");
	By password = By.xpath("//input[@formcontrolname='password']");
	
	By login = By.xpath("//button[@class='btn btn-primary']");
	
	By envalerts = By.xpath("//a[@href='/environmentalerts']");
	
	public void registerlinkclick() {
		driver.findElement(registerlink).click();
	}

	public void Registerclick() {
		driver.findElement(Register).click();
	}
	
	public void loginclick() {
		driver.findElement(login).click();
	}
	
	public void envalertsclick() {
		driver.findElement(envalerts).click();
	}

	public void entervaluesRegister() throws IOException {
		driver.findElement(firstNameregister).sendKeys("sriram");
		driver.findElement(lastNameregister).sendKeys("yarabarla");
		driver.findElement(usernameregister).sendKeys("sriram@gmail.com");
		driver.findElement(passwordregister).sendKeys("sriram");
	}
	public void entervalueslogin() throws IOException {
		driver.findElement(username).sendKeys("sriram@gmail.com");
		driver.findElement(password).sendKeys("sriram");
	}
}
