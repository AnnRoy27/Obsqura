package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataReadParameters {
	
	WebDriver driver;
	
	 @Parameters({"username","password"})
	 @Test
	  public void f(String username,String password) {
		  WebElement user=driver.findElement(By.name("userName"));	
	      WebElement pass=driver.findElement(By.name("password"));
		    WebElement submitbut =driver.findElement(By.name("login"));
		     user.sendKeys(username);
			  pass.sendKeys(password);
			  submitbut.submit(); 
	
	  }
	  
	  
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
			 driver=new ChromeDriver();
			
			driver.get("http://newtours.demoaut.com/");
	  }

}
