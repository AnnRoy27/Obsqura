package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClick {
	
	WebDriver driver;
  @Test
  public void f() {  
	  
	  Actions action = new Actions(driver);

	  WebElement link = driver.findElement(By.xpath("//*[text()='right click me']"));
	  WebElement element = driver.findElement(By.xpath("//*[text()='Edit']"));
	  action.contextClick(link).perform();
	  
	 
	  element.click();
	  
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		  driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }
}
