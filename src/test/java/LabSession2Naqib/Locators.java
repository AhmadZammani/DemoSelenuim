package LabSession2Naqib;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// Locators - locate web elements.

		// as a tester we should know the two below following
		// 1-Identify Elements - Locators
		// 2-Perform Actions - Use methods

		/*
		 * ID, Name, ClassName , TagName, PartialLinkText Linked Text - Normal Locators
		 * 
		 * CSS Selector - Customized Locators xpath
		 * 
		 */

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// thread.sleep : stops execution for certain amount of time
		// implicitlyWait: waits for certain time before it throws exception
		driver.get("https://tek-retail-ui.azurewebsites.net");
		Thread.sleep(3000);
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size() + " number of images present in this page");
		driver.close();
		/*
		 * driver.findElement(By.locator(); - Return single element from UI and return
		 * type is WebElement. - If no element found it will through
		 * "NoSuchElementFound". driver.findElements(Bu.locator(); - Return list of
		 * WebElements, and return type is list of WebElement - If no element is found
		 * it will return zero. - We use it for dynamic drop downs.
		 */
	   
		
		/*
		 * length - this is used for array. 
		 * length()- this is used for String
		 * size() - this is used for list collection. 
		 */
	
	
	
	}
	

}
