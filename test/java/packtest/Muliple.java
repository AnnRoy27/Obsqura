package packtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pack2.Play;

public class Muliple {

	String s1;
	Play p;
	WebDriver driver;
	@Test()
	public void f() {

		WebElement user=driver.findElement(By.name("userName"));	
		WebElement password=driver.findElement(By.name("password"));
		WebElement submitbut =driver.findElement(By.name("login"));
		user.sendKeys("tutorial");
		password.sendKeys("tutorial");
		submitbut.submit();
	/*	List<WebElement>  radio= driver.findElements(By.name("tripType"));
		boolean f=radio.get(1).isEnabled();
		boolean f1= radio.get(0).isEnabled();
        SoftAssert s=new SoftAssert();
        s.assertTrue(f1);
        s.assertFalse(f);
        s.assertAll();*/
    
        WebDriverWait wait=new WebDriverWait(driver,10);
  	boolean MY= wait.until(ExpectedConditions.elementToBeSelected(By.name("tripType")));
System.out.println(MY);

}
	
	
	@Test
	public void g()
	{
	
    
	}




	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
      driver=new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
