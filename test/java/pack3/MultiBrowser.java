package pack3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class MultiBrowser {
	
	
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://demo.guru99.com/test/newtours/");
  }
  
  @Parameters({"browser"})  
  @BeforeTest
  public void beforeTest(String browser) {
	  
	
	  if(browser.equalsIgnoreCase("chrome")) {
		  
		  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
			 driver=new ChromeDriver();
		 
		  }else if (browser.equalsIgnoreCase("ie")) { 
			  System.setProperty("webdriver.ie.driver", "E:\\selenium\\IEDriverServer.exe");
		
		   driver = new InternetExplorerDriver();
		 
		  } 
		
		 
		 
  }
}
