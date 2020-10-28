package packtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class WaitExample {

	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriverWait wait=new WebDriverWait(driver,20);
	  WebElement user= wait.until(ExpectedConditions.presenceOfElementLocated(By.name("userName")));
		
	
		WebElement password=driver.findElement(By.name("password"));
		  WebElement submitbut= wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
	    
	
		user.sendKeys("tutorial");
		
		password.sendKeys("tutorial");
		submitbut.submit();
	
  }
  
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  	driver.get("http://newtours.demoaut.com/");
   
  }

  @AfterTest
  public void afterTest() {
  }

}
