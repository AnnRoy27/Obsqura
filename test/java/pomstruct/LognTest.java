package pomstruct;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LognTest {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  login login=new login(driver);
	  login.setusername("tutorial","tutorial");
	

	
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
  }

  @AfterClass
  public void afterClass() {
  }

}
