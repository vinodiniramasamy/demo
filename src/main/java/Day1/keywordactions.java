package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class keywordactions {
	WebDriver driver;
	
	 @BeforeTest 
	  public void setbrowserpath() {
	 // opening a chrome browser 	  
	   	System.setProperty("webdriver.chrome.driver","C:\\Selenium Advanced training\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	  }
	
  @Test (priority =1 , enabled = true)
  public void login() {
	  driver.get("http://10.232.237.143:443/TestMeApp");
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("SignIn")).click();;
	  WebElement uname = driver.findElement(By.name("userName"));
	  Actions actions = new Actions(driver);
	  //moving your mouse to the username and click.
	  //keydown is press and hold the particular key here we press shift key and type the user name 
	  //later we release the shift key by saying keyup command. 
	  //later you  double click the user name text box and do the right click by the contextclick function.
	  actions.moveToElement(uname).click().keyDown(uname,Keys.SHIFT)
	  .sendKeys(uname,"pravin")
	  .keyUp(uname, Keys.SHIFT)
	  .doubleClick(uname)
	  .contextClick().build().perform(); // multiple key actions in one statement here.
	  
	  //Please check https://stqatools.com/selenium-keyboard-events/ for more keyboard events in selenium 
	  
	  
  }
}
