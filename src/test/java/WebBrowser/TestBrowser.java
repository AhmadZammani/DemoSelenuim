package WebBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	

	WebDriver driver = new ChromeDriver();
//	driver.get("https://tekschool.us/");
	driver.get("https://www.selenium.dev/downloads/");
	

	
	
	}

}
