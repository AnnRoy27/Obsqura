package classworknovbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/newtours/");
		
		driver.navigate().to("https://zoom.us/postattendee?id=5");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
