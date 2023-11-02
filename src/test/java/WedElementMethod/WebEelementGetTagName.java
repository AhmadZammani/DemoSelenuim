package WedElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebEelementGetTagName {

	public static void main(String[] args) throws InterruptedException {
		//getText();
		//Requirement:Verify the button name:Add  new element 
    
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/checkbox//");
		WebElement element=driver.findElement(By.id("javaInput"));
		System.out.println(element.getTagName());
		 
		WebElement element2=driver.findElement(By.xpath("//label[@for='javaInput']"));
		System.out.println(element2.getTagName());
		
	}
	
	

}
