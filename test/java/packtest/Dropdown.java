package packtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		WebElement user=driver.findElement(By.name("userName"));	
        WebElement password=driver.findElement(By.name("password"));
	    WebElement submitbut =driver.findElement(By.name("login"));
	    user.sendKeys("tutorial");
		  password.sendKeys("tutorial");
		  submitbut.submit();
		  
		  
		  
		  
		  WebElement drop1=driver.findElement(By.name("passCount"));
		  Select obj=new Select(drop1);
		  //obj.selectByIndex(1);
		  obj.selectByValue("3");
		  
		  obj.selectByVisibleText("May");
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		WebElement selvalue=  obj.getFirstSelectedOption();
		
		
		
		   String s=selvalue.getText();
		   System.out.println(s);
		   
		   
		   
		   
		   
		   
		   
		   
		   
	
		 List<WebElement> l=  obj.getOptions();
		 
		 int n=l.size();
		 
		 for(int i =0;i< n ;i++)
			 
		 {
		String s1=	l.get(i).getText(); 
		System.out.println(s1);
		 }
		 
		 
		 
		 
		 WebElement drop2=driver.findElement(By.id("continentsmultiple"));
		  Select obj2=new Select(drop2);
		  obj2.selectByIndex(2);
		  obj2.selectByIndex(3);
		  obj2.deselectByIndex(3);

		 
		 
		 
		 
		 
		List<WebElement>  radio= driver.findElements(By.name("tripType"));
		boolean f=radio.get(1).isSelected();
	
			radio.get(1).click();
		
		
		
		
		
		WebElement radio1=driver.findElement(By.id("ttt"));
		radio1.click();
		WebElement link=driver.findElement(By.linkText("featured vacation destinations"));
		link.click();
	String s1=	link.getText();
		
		
		
		WebElement partial = driver.findElement(By.partialLinkText("featured vacation"));
	
	partial.click();
		
		  
		 
	
		   

	}

}
