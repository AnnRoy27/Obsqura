package pomstruct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class login  {

	WebDriver driver;
	 WebElement user;
	 WebElement pass;
	 WebElement submitbut;
	    public login(WebDriver driver) {
			this.driver=driver;
			 user=driver.findElement(By.name("userName"));	
		      pass=driver.findElement(By.name("password"));
			   submitbut =driver.findElement(By.name("login"));
			
		}
	
	public void setusername(String username,String password )
	
	{
	
		    
		    driver.get("http://newtours.demoaut.com/");
		user.sendKeys(username);
	
		

		pass.sendKeys(password);
		
	
		submitbut.submit();
	}	
	
	public void print()
	{
		user.sendKeys("abc");
	}
	
	
	

}
