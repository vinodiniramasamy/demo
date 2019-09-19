package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Library.browserFactory;
import pages.LoginPageUsingPageFactory;

public class LogintestusingPageFactory {
		
  @Test
  public void test() {
	//calling the utillitypack for initializing the browser and passing the url
			WebDriver driver=browserFactory.startbrowser("chrome", "http://demoaut.com/");
			
			//this will create a page object of loginpageNew class and return the object.
			LoginPageUsingPageFactory log=PageFactory.initElements(driver, LoginPageUsingPageFactory.class);
			
			
			//call the method
			log.login("tutorial", "tutorial");
		}  
	  
  }

