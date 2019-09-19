package Day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class readxl {

	WebDriver driver; 
	 @BeforeTest 
	  public void setbrowserpath() {
	 // opening a chrome browser 	  
	   	System.setProperty("webdriver.chrome.driver","C:\\Selenium Advanced training\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp");
	    driver.manage().window().maximize();
	  }
  @Test
    public void readdata() throws IOException{
	 // Path of the file is set   
	 File src = new File("C:\\files\\TestData.xlsx");
	 // the file is taken as the input and assigned to the java file input stream
	 FileInputStream fis = new FileInputStream(src);
	 
	 // XSSF is used to access the SLXS latest excel format 
	 //HSSF is used to access the XLS old format
	 XSSFWorkbook wb = new XSSFWorkbook(fis); 
	 XSSFSheet sheet1 = wb.getSheetAt(0);
	 // you get the first row and see how many cells are there 
	 XSSFRow row = sheet1.getRow(0);
	 int colNum = row.getLastCellNum();
	 System.out.println("total number of columns : " + colNum);
	 
	 // get he whole sheet and see how many rows are there 
	 //as the row and column index always start with 
	 int rowNum = sheet1.getLastRowNum()+1;
	 System.out.println("total number of rows : " + rowNum);
	 
	 for(int i=0;i<rowNum;i++)
	 {
	 String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
	 System.out.println("Data from excel is : "+ data0);
	 
	 String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
	 System.out.println("Data from excel is : "+ data1);
	 
	 driver.findElement(By.linkText("SignIn")).click();
	 driver.findElement(By.name("userName")).sendKeys(data0);
	 driver.findElement(By.name("password")).sendKeys(data1); 
	 driver.findElement(By.name("Login")).click();
	 driver.navigate().back();
	 driver.navigate().back();
	 // write pass in the cell 2 of the excel 
	 sheet1.getRow(i).createCell(2).setCellValue("pass");
	 }
	 
// 	 creating the new output stream object to write the file in the given path 
	 FileOutputStream fo = new FileOutputStream(src);
	 
	 
	 // writing the output file in the giver path in src 
	 wb.write(fo);
	 
	 // close the excel file 
	 wb.close(); 
  }
}
