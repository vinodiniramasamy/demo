package Day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class search {
	WebDriver driver;
	@Test
	public void testkeyboardActions() throws InterruptedException
	{
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
		//wait implicitly until the page load  
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//find the search box and search bag by typing 
		WebElement search=driver.findElement(By.id("myInput"));
		search.sendKeys("b");
		search.sendKeys("a");
		search.sendKeys("g");
		
		Actions act1=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// move the mouse to the list of elements listed which contains Hand Bag and click on it 
		act1.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).click().build().perform();
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		//the click actions take to the next page hence comparing the text message displaced to validate we are onthe right page 
		String text=driver.findElement(By.xpath("//h4[contains(text(),'Hand bag')]")).getText();
		Assert.assertTrue(text.contains("Hand bag")); 
		System.out.println(text);
			 		
	}
	
	  @BeforeTest 
	  public void setbrowserpath() {
	 // opening a chrome browser 	  
	   	System.setProperty("webdriver.chrome.driver","C:\\Selenium Advanced training\\chromedriver.exe");
	    driver = new ChromeDriver();
	  }
	  

}
