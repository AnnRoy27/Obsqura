package pack3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Table {
	WebDriver driver;
  @Test
  public void f() {
	  
	  
	  
	List<WebElement> col= driver.findElements(By.xpath("//table[@class='dataTable']//th"));
	List<WebElement> row= driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
	WebElement element=driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[2]//td[3]"));
	System.out.println("element is"+ element.getText());
	int rsize=row.size();
	int csize=col.size();
	
	
	for(int i=0;i<rsize;i++)
	{
		List<WebElement> cell= row.get(i).findElements(By.tagName("td"));
		for(int j=0;j<csize;j++)
		{
			
			String cc=cell.get(j).getText();
			System.out.print(" "+cc);
		}
		System.out.println();
		
		
	}
	
	 
	
  }
  @BeforeTest
  public void beforeTest() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
  }

  @AfterTest
  public void afterTest() {
  }

}
