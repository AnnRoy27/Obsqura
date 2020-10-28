package classwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dropdown {
	WebDriver driver;
  @Test
  public void f() {

	  
	  WebDriverWait wait=new WebDriverWait(driver,20);
	  WebElement user= wait.until(ExpectedConditions.presenceOfElementLocated(By.name("userName")));
	  
      WebElement pass=driver.findElement(By.name("password"));
	    WebElement submitbut =driver.findElement(By.name("login"));
	     user.sendKeys("tutorial");
		  pass.sendKeys("tutorial");
		  submitbut.submit(); 
		
		  WebElement passcount=driver.findElement(By.name("passCount"));	  
		  Select oselect=new Select(passcount);
		  oselect.selectByIndex(2);
		//  oselect.selectByValue("4");
		 // oselect.selectByVisibleText("3");
		  WebElement selectedelement=oselect.getFirstSelectedOption();
		 String s= selectedelement.getText();
	
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
  }

}
