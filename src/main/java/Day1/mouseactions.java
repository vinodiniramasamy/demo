package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mouseactions {
	WebDriver driver;
	
	
	  @Test
	  public void openwebpage() {
		  
		  driver.get("http://10.232.237.143:443/TestMeApp");
		  WebElement   aboutus = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span"));
		  WebElement ouroffice = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));
		  WebElement chennai = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[1]/a"));
	  
	  Actions act = new Actions(driver);
	  
	  act.moveToElement(aboutus).click().build().perform();
	  
	  WebDriverWait wait = new WebDriverWait(driver,50);
	  
	  wait.until(ExpectedConditions.elementToBeClickable(ouroffice));
	  act.moveToElement(ouroffice).click().build().perform();
	                                                                         
	  wait.until(ExpectedConditions.elementToBeClickable(chennai));
	  act.moveToElement(chennai).click().build().perform();
	  
	  	  
	  
	  
	  }
 
  
  
  
  @BeforeTest 
  public void setbrowserpath() {
 // opening a chrome browser 	  
   	System.setProperty("webdriver.chrome.driver","C:\\Selenium Advanced training\\chromedriver.exe");
    driver = new ChromeDriver();
  }
  
  
  @AfterTest 
  public void closebrowser()
  {   
	  // close will close the current tab 
	  // driver.close();  
	  
	  // Quit will close all the tabs
	 // driver.quit();
  }
  
    
}
