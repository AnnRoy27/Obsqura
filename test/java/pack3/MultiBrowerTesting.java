package pack3;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class MultiBrowerTesting {
	
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://newtours.demoaut.com/");
	 
  }
  
  @Parameters({"browser"})
  @BeforeTest
  public void beforeTest(String browser) {
	  
	  
	  if(browser.equalsIgnoreCase("chrome")) {
		  
		  WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();

		 
		  }else if (browser.equalsIgnoreCase("ie")) { 
		
		 WebDriverManager.iedriver().setup();
		   driver = new InternetExplorerDriver();
		 
		  } 
		
		 
		 
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
