package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Library.browserFactory;
import pages.login;

public class logintest {
	
WebDriver driver;	
	
  @Test
  public void logintestcase() {
	  
	  WebDriver driver =browserFactory.startbrowser("chrome", "http://newtours.demoaut.com/mercurywelcome.php?osCsid=d0250c1ed2d6da58e1e109532c3188b7");
	  login log = new login(driver);
	  log.loginuser("vino", "password");
  }
  
  
}
