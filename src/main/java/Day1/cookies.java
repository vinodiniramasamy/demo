package Day1;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class cookies {
	WebDriver driver; 
	 @BeforeTest 
	  public void setbrowserpath() {
	 // opening a chrome browser 	  
	   	System.setProperty("webdriver.chrome.driver","C:\\Selenium Advanced training\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	  }
	
  @Test
  public void cookiesdemo() {
	  driver.get("http://www.google.com/");
      Cookie name = new Cookie("mycookie", "123456789123");
      driver.manage().addCookie(name);
      Cookie name1 = new Cookie("mycookie1", "123456789222");
      driver.manage().addCookie(name1);
      
      //delete all cookies by below code
    //  driver.manage().deleteAllCookies();
      Set<Cookie> cookiesList =  driver.manage().getCookies();
      for(Cookie getcookies :cookiesList) {
          System.out.println(getcookies );
   }

}  
	  
	  
  
}