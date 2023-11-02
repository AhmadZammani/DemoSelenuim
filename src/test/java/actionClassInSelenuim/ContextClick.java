package actionClassInSelenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/context-menu");
		driver.manage().window().maximize();
		
		// right click on the below box
		// 1. We need to find  element and store it in an instance of WebElelment
		
        WebElement rightClick= driver.findElement(By.cssSelector("div[class^='w-40']"));
	    
        // to us action class in Selenium, first we have to create object if action class
        //and pass the reference to instance of webdriver to the class parameter.
        
        Actions actions=new Actions(driver);
        
        // we can use the reference(actions)to call any method(s) available in selenium Actions class
        //and since we are performing a single action ,so we should call only perform()method
       
        actions.contextClick(rightClick).perform();
        
        Thread.sleep(5000);
        
        driver.close();
        
        
        
        
	}
	

}
