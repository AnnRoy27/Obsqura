package classworknovbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.get("https://zoom.us/postattendee?id=5");
		String pagetitle =driver.getTitle();
		String currenturl =driver.getCurrentUrl();
		String pagesource =driver.getPageSource();
		System.out.println(pagetitle);
		System.out.println(currenturl);
		System.out.println(pagesource);


		//driver.close();
		driver.quit();
	
		
		  

	}

}
