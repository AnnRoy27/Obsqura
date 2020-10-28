package packtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		/*	WebElement drop1=driver.findElement(By.id("continents"));
			Select obj=new Select(drop1);
			obj.selectByIndex(1);
			obj.selectByIndex(2);
			List<WebElement> l=obj.getAllSelectedOptions();
		WebElement s=	obj.getFirstSelectedOption();
		System.out.println(s.getText());
			int n=l.size();
			System.out.println(n);
			for(int i=0;i<n;i++)
			{
				System.out.println(l.get(i).getText());
			}
			*/
			//continentsmultiple
			
			WebElement drop2=driver.findElement(By.id("multi-select"));
			Select obj2=new Select(drop2);
			obj2.selectByIndex(2);
			obj2.selectByIndex(1);
			List<WebElement> l=	obj2.getAllSelectedOptions();
			int n=l.size();
			System.out.println(n);
			for(int i=0;i<n;i++)
			{
				System.out.println(l.get(i).getText());
			}
		
		
			//List<WebElement> l2=obj2.getAllSelectedOptions();
			WebElement s2=	obj2.getFirstSelectedOption();
			System.out.println("first selected "+s2.getText());
				/*int n2=l2.size();
				System.out.println(n2);
				for(int i=0;i<n2;i++)
				{
					System.out.println(l2.get(i).getText());
				}*/
				
			

	}

}
