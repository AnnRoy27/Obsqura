package pack3;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demo {
	
	WebDriver driver;
  @Test(priority=1)
  public void verifyPageTitle() {
	  String actualtitle= driver.getTitle();
		 String expectedtitle="Welcome: Mercury Tours";
		Assert.assertEquals(actualtitle, expectedtitle, "wrong page");  
	
  }
 
  @Test(priority=2)
  public void verifyLogin() {
	  WebElement user=driver.findElement(By.name("userName"));	
      WebElement pass=driver.findElement(By.name("password"));
	    WebElement submitbut =driver.findElement(By.name("login"));
	     user.sendKeys("tutorial");
		  pass.sendKeys("tutorial");
		  submitbut.submit();  
		  String actualtitle= driver.getTitle();
			 String expectedtitle="Find a Flight: Mercury Tours:";
				Assert.assertEquals(actualtitle, expectedtitle, "wrong page"); 
				Assert.assertNull(driver);
  }
  @Test(priority=2)
  public void verifydrivervaue() {
	
				Assert.assertNotNull(driver, "driver is null");
  }
  
  @Test(priority=3)
  public void verifyRadiobutton() {
	  List<WebElement>  radio= driver.findElements(By.name("tripType"));
		boolean f=radio.get(1).isSelected();
		boolean f1=radio.get(0).isSelected();
		
		SoftAssert s1=new SoftAssert();
		s1.assertTrue(f,"round trip");
		s1.assertTrue(f1,"one way radio button");
		System.out.println("rest of the codes");
	s1.assertAll();
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
  }

  @AfterTest
  public void afterTest() {
  }

  

}
