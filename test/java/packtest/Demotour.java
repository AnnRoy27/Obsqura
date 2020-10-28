package packtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;

public class Demotour {
	
	WebDriver driver;
  @Test()
  public void verifyPageTitleTest() {
	  String actualtitle= driver.getTitle();
		 String expectedtitle="hello";
		  
		 if(!actualtitle.equals(expectedtitle))
		  {
	  throw new SkipException("Skipping this exception");
		  }
		  else
			  System.out.println("hello");
	
  }
  @Test()
  public void verify() {
	  
	
	  
	  
  }
	
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
