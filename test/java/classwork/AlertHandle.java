package classwork;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AlertHandle {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  WebElement button=driver.findElement(By.name("submit"));
			  
	 button.click();
	 Alert al = driver.switchTo().alert();
	  String s=al.getText();
	  System.out.println(s);
	  al.accept();
	 // al.dismiss();
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
