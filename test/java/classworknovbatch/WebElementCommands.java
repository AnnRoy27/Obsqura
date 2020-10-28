package classworknovbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
	    WebElement username =	driver.findElement(By.name("userName"));
	    WebElement password = driver.findElement(By.name("password"));
	     WebElement submitbutton = driver.findElement(By.name("submit"));
	     username.sendKeys("tutorial");
	     password.sendKeys("tutorial");
	     submitbutton.click();
	    
	    
	    
		
		
		
		
		
		
		
	}

}
