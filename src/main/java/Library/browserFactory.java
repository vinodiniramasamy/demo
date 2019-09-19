package Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserFactory {

	static WebDriver driver;
	// as the startbrowser is a static method, it can be directly called without creating an object
	public static WebDriver startbrowser(String browsername, String url)
	{
		if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Selenium Advanced training\\geckodriver.exe");
		    driver = new ChromeDriver();			
		}
		
		else if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium Advanced training\\driver\\chromedriver.exe");
		    driver = new ChromeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
	}
}
