package packtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class MyAlert  {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	
	  WebDriverWait wait=new WebDriverWait(driver,20);
	/*  WebElement username= wait.until(ExpectedConditions.presenceOfElementLocated(By.name("cusidw")));

	  
  username.sendKeys("53920");*/
	  WebElement button= wait.until(ExpectedConditions.elementToBeClickable(By.name("submit")));

	  button.click();
	 
	 
	  
	  Alert al1 = driver.switchTo().alert();
	  al1.accept();



	
  }

  @BeforeTest
  public void beforeTest() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/delete_customer.php");
  }

  @AfterTest
  public void afterTest() {
  }

}
