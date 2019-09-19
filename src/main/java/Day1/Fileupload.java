package Day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	WebDriver driver; 
	
	 @BeforeTest 
	  public void setbrowserpath() {
	 // opening a chrome browser 	  
	   	System.setProperty("webdriver.chrome.driver","C:\\Selenium Advanced training\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	  }
	 
  @Test
  public void upload() throws AWTException{
	  Robot robot = new Robot();	
	// open page
	  
	      // driver.get("https://tus.io/demo.html");
	      // driver.findElement(By.xpath("/html/body/div/div[3]/div/p[3]/input")).click();
	  		driver.get("C:\\Selenium Advanced training\\fileupload.html");
	  driver.findElement(By.xpath("//*[@id=\"1\"]")).click();
	  
	        robot.setAutoDelay(1000);
			String path="C:\\Selenium Advanced training\\Sample basic code\\test.txt";
			StringSelection sel = new StringSelection(path);
			// Copy to clipboard
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		
			robot.setAutoDelay(1000);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.setAutoDelay(1000);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
	  
  }
  
 
}
