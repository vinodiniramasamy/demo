package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageUsingPageFactory {
WebDriver driver;
	
	public LoginPageUsingPageFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	@CacheLookup
	@FindBy(how=How.NAME, using="userName")
	WebElement username;
	
	@FindBy(how=How.NAME, using="password")
	WebElement password;
		
	@FindBy(how=How.NAME,using="login")
	WebElement signin;
		
	public void login(String un, String pass)
	{
		username.sendKeys(un);
		password.sendKeys(pass);
		signin.click();		
		
	}
	
}
