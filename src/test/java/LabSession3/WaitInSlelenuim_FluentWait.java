package LabSession3;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitInSlelenuim_FluentWait {

	public static void main(String[] args) throws InterruptedException {
 
		// Fluent Wait: the fluent wait in Selenium is use to define maximum
		// time for the web driver to wait for a condition and frequency  which
		//we watn to check element conditions before throwing an exception.
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();

		// the below is the syntax of the fluent wait
		Wait<WebDriver> myWait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(50))// specifyig max time for loop
				.pollingEvery(Duration.ofSeconds(5))// check the condiotn after 5 second
				.ignoring(NoSuchElementException.class);//
	// below is the usage part
	WebElement SearchBTn=myWait.until(new Function<WebDriver, WebElement >(){
        public WebElement apply(WebDriver driver) {
        	return driver.findElement(By.xpath("//input[@id='searchInput']"));
        	
        }
	});
	SearchBTn.sendKeys("Computer");
	}
	}


