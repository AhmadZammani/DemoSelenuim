package LabSession2Naqib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class URlAuthentication {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		// How to handle the authentication Popup in Selenium?
		// In Selenium we can pass username and password in concatenation with url to by pass
		// the authentication pop up. 
	
		// URL Before  Authentication "http://the-internet.herokuapp.com/basic_auth"
		// userName = admin
		// password = admin
	
         driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	}

}
