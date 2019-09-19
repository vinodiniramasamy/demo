package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class javaexecutor {
	
	WebDriver driver;
	
	 @BeforeTest 
	  public void setbrowserpath() {
	 // opening a chrome browser 	  
	   	System.setProperty("webdriver.chrome.driver","C:\\Selenium Advanced training\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	  }
	 
  @Test
  public void javaexecutorcommands() {
 
  driver.get("http://www.allstate.com");
  
  // How to get title of the webpage using javascript
  JavascriptExecutor js = (JavascriptExecutor)driver;
  String sText = js.executeScript("return document.title;").toString();
  System.out.println(sText);
  
   //how to click a button in Selenium WebDriver using JavaScript

		WebElement contact_icon = driver.findElement(By.linkText("Contact Us"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", contact_icon );
	

		
//	execute a alert popup window using javascript

		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("alert('hello world');", driver.findElement(By.xpath(".//*[@id='s_Text']")));

  
  
  
  }
}
