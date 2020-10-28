package pack3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DoubleClick {
	WebDriver driver;
  @Test
  public void f() {
	  
	
/*	  Actions action = new Actions(driver);
	  WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	  action.doubleClick(link).perform();*/
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver=new ChromeDriver();
		  driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		  driver.manage().window().maximize();
		  driver.quit();
  }

  @AfterTest
  public void afterTest() {
  }

}
