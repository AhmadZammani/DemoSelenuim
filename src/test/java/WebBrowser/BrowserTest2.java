package WebBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest2 {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
//		  driver.get("https://www.selenium.dev/downloads/");
		 driver.manage().window().maximize();// to maximize window 
		 // getTitle();would get the title of the current page
//		  System.out.println("title of page is "+driver.getTitle());
		  // get currentURL(). would get the current page url.
//		  System.out.println("This is the current page URL"+driver.getCurrentUrl());
		  
		  // getpageSource. would give us new page current source.
//		  System.out.println(driver.getPageSource());
		  
		  
		 //close(). will close the current window open by selenuim
//		driver.close();
		  
		  // quit().will close all windows/browser open in you pc open by selenuim.
//		  driver.quit();
		  // get the facebook url title
		  driver.get("https://www.facebook.com/");
		  System.out.println(driver.getTitle());
		  
		  driver.close();
		  
		  
		  
		  
		  
	}

}
