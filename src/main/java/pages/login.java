package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	WebDriver driver;
	
	By username = By.name("userName");
	By password = By.name("password");
	By login = By.name("login");

	
	public login (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void loginuser(String un, String pass)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
		
	}
	
}
