package pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/test/newtours/");
			/*WebElement user=driver.findElement(By.name("userName"));	
	        WebElement password=driver.findElement(By.name("password"));
		    WebElement submitbutton =driver.findElement(By.name("login"));*/
			
		
		    WebElement linkclick =driver.findElement(By.partialLinkText("Flights")); 
		    linkclick.click();
		    
		    
		  /* user.sendKeys("tutorial");
		   password.sendKeys("tutorial");
		 boolean f=  user.isDisplayed();
		boolean f2= user.isEnabled();
		submitbutton.submit();
		
		String tag=user.getTagName();
		    
		    */

		/*  String innertext=  linkclick.getText();
		    
		String att=  linkclick.getAttribute("href");
		    
		user.getAttribute("type");
		
		
	String bck=	user.getCssValue("background-color");
		
		    Dimension d= user.getSize();
		    
		    
		    System.out.println(d.height);
		    System.out.println(d.width);
		    
		    
		   Point p= user.getLocation();
		   System.out.println(p.x);
		   System.out.println(p.y);
		  */
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    List<WebElement>  myradio= driver.findElements(By.name("tripType"));		   
		    
		  /*  myradio.get(1).click();
		    boolean f=myradio.get(1).isSelected();
		    System.out.println(f);*/
		    System.out.println(myradio.get(1).getText());
		    
		    
		    
		    
		    
		    
		   
			
		
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	}

}
