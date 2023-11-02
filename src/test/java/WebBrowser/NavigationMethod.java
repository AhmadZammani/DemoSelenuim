package WebBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub  
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.selenium.dev/downloads/");
		 // add some pause to the test execution(slowing down the execution process).
		 driver.manage().window().maximize();
		// we navigate to the different URL
		Thread.sleep(3000);
		 driver.navigate().to("https://www.facebook.com/");
		//this navigate you to previous URl
		 Thread.sleep(3000);
		 driver.navigate().back();
		 //we navigate to the next URL.
		 Thread.sleep(3000);
		 driver.navigate().forward();
		// would refresh the current page URL.And it is helpful when our when we can not interact with elements on the.
		// Website.So that the elements are reloaded to the page that we not interact with them
		 Thread.sleep(3000);
		 driver.navigate().refresh();
		 Thread.sleep(3000);
		 driver.close();
	}

}
