package pack3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Download {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  
	  
	  WebElement downloadButton = driver.findElement(By.id("messenger-download"));
	  
	  downloadButton.click();
/*	  String sourceLocation = downloadButton.getAttribute("href");
	  
	  String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;
	  
	  
      Runtime.getRuntime().exec(wget_command);*/
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demo.guru99.com/test/yahoo.html");
  }

  @AfterTest
  public void afterTest() {
  }

}
