package packtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Scrolling {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	//  WebElement user=driver.findElement(By.id("lastname"));
	  
	  
	
JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("window.scrollBy(0,500)");
//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
js.executeScript("window.scrollBy(0,2000)");
Thread.sleep(5000);
//js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");


//js.executeScript("arguments[0].scrollIntoView()",user);
//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//js.executeScript("window.scrollBy(0,0)");

  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  	driver.get("https://stackoverflow.com/questions/12293158/page-scroll-up-or-down-in-selenium-webdriver-selenium-2-using-java");
  	driver.manage().window().maximize();
   
  }
  /*window.scrollTo(0,4000)
  window.scrollTo(0,document.body.scrollHeight)
  window.scrollTo(0,document.body.scrollTop)
  window.scrollTo(0,document.body.scrollLeft)*/
  @AfterTest
  public void afterTest() {
  }

}
