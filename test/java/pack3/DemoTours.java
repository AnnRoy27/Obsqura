package pack3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class DemoTours {
	
	WebDriver driver;

    @FindBy(name="userName")
	WebElement user;
	@FindBy(name="password")
	WebElement pass;
	@FindBy(name="login")
	WebElement submitbut;

	
	//@Parameters({"susername","spassword"})
  @Test
  public void f() {
	/*  WebElement user=driver.findElement(By.name("userName"));	
      WebElement pass=driver.findElement(By.name("password"));
	    WebElement submitbut =driver.findElement(By.name("login"));*/
		PageFactory.initElements(driver, this);
	
	    user.sendKeys("username");
	    
		  pass.sendKeys("password");
		  submitbut.submit();
  }

	
	
  @BeforeTest
  public void beforeTest() throws IOException {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File DestFile=new File("E:\\Screenshot\\mypagefirst.png");
		FileUtils.copyFile(SrcFile, DestFile);
  }

  @AfterTest
  public void afterTest() {
  }

}
