package LabSession2Naqib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomizedLocator {

	public static void main(String[] args) {
		// CSS Selector - Cascading Style Sheets

		//DOM is made of - HTML CSS and javascriptexecuterus
		// the following is the way we use CSS selector 
		/*
		 * Tag and ID     # ( by # we separate the Tag and ID)
		 * Tag and class  . ( by . we separate the Tag and ID)
		 * Tag and attribute []( by [] we separate the Tag and ID)
		 * Tag , class and attribute .[]( by .[] we separate the Tag and ID)
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//1- locate the element by  cssSelector Tag and ID - #
		
		//WebElement searchBtn=driver.findElement(By.cssSelector("input#small-searchterms"));
		//searchBtn.sendKeys("iphone 14");
		//searchBtn.sendKeys(Keys.ENTER);
		
		//2- tag and class - . 
		 //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("ipad");
		 
		// 3- tag and attribute - []
		
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Tablet");
	
		//4- tag class and attribute . []
driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("Computer");

	
	
	
	
	
	
	}

}
