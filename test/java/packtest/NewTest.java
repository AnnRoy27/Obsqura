package packtest;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  
	 // WebDriverManager.chromedriver().setup();
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		WebElement user=driver.findElement(By.name("userName"));	
        WebElement password=driver.findElement(By.name("password"));
	    WebElement submitbut =driver.findElement(By.name("login"));
	    
	 // WebElement link=  driver.findElement(By.partialLinkText("featured vacation  "));
    /* String tagname=  user.getTagName();
     System.out.println(tagname);
     
    String text= link.getText();
    System.out.println(text);

   String type=  user.getAttribute("type");
   System.out.println(type);
   
  String space=  user.getCssValue("word-spacing");
  System.out.println(space);
  
 Dimension d= user.getSize();
 System.out.println(d.height);
 System.out.println(d.width);
 
 
Point p= user.getLocation();
System.out.println(p.x);
System.out.println(p.y);
link.click();*/
	  
	  user.sendKeys("tutorial");
	  password.sendKeys("tutorial");
	  submitbut.submit();
	// List<WebElement> l= driver.findElements(By.name("tripType"));

	

WebElement drop1=driver.findElement(By.name("passCount"));
Select obj=new Select(drop1);
//obj.selectByIndex(1);
//obj.selectByValue("4");
obj.selectByVisibleText("3");





     
  }
  

}
