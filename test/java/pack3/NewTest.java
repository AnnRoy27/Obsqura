package pack3;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String usern, String password) {
	  WebElement user=driver.findElement(By.name("userName"));	
      WebElement pass=driver.findElement(By.name("password"));
	    WebElement submitbut =driver.findElement(By.name("login"));
	    user.sendKeys(usern);
		  pass.sendKeys(password);
		  submitbut.submit();
	
  }

  @BeforeMethod
  public void beforeMethod() {
	  driver.get("http://newtours.demoaut.com/");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	
  }


  @DataProvider
  public Object[][] dp() throws BiffException, IOException {
	  FileInputStream f= new FileInputStream("E:\\Testdata.xls");
	  Workbook w=Workbook.getWorkbook(f);
	  Sheet s=w.getSheet("Sheet1");
	  int r=s.getRows();
	  int c=s.getColumns();
	 String input[][]=new String[r][c];
	  for(int i=0;i<r;i++)
	  {
		  for(int j=0;j<c;j++)  
		  {
			  Cell cc=s.getCell(j,i);
	
		
		
			  input[i][j]=cc.getContents();
			
			  }
	  }
	  return input;
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	
  }

  @AfterTest
  public void afterTest() {
  }

}
