package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drag {
	WebDriver driver;
	  @Test
	  public void f() {
		 
		  WebElement firstframe=driver.findElement(By.className("demo-frame"));	
		  
	     driver.switchTo().frame(firstframe);
	     
	     
	     WebElement source=driver.findElement(By.id("draggable"));	
	      WebElement target=driver.findElement(By.id("droppable"));
	      
	      
	/*      JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView()",target);*/
        
        
		Actions ac=new Actions(driver);
		ac.dragAndDrop(source, target).perform();
		
		driver.switchTo().defaultContent();
		
		
		

	  }
	  @BeforeTest
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("https://jqueryui.com/droppable/");
			 driver.manage().window().maximize();
			 
	  }

	  @AfterTest
	  public void afterTest() {
	  }
}
