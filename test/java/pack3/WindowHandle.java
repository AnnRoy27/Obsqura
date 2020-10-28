package pack3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WindowHandle {
	WebDriver driver;
  @Test
  public void f() throws AWTException {
	 
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_T);
	  
	  r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_T);
	
	
	
	driver.get("http://demo.guru99.com/test/newtours/");
	 String parent= driver.getWindowHandle();
	 System.out.println(parent);
	 
	 Set<String> s=driver.getWindowHandles();
	 System.out.println(s);
	
	/*
	 Iterator<String> i=s.iterator();
	 while(i.hasNext())
	 {
		String child=i.next();
		if(!parent.equals(child))
		{
			driver.switchTo().window(child);
			driver.get("http://demo.guru99.com/test/newtours/");
			
		}
	 }*/
	 
	 
	
  }
  @BeforeTest
  public void beforeTest() throws IOException {

	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		  driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	
		  
  }

}
