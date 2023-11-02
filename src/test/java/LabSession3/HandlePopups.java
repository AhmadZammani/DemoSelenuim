package LabSession3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlePopups {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Handling Alerts 1.Alert with ok 2. alert with ok and cancel 3. alert with
		 * input box along with Ok and cacell Waits handling Tables
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/javascript-alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    // simple Alert -select.
		Thread.sleep(3000);
        driver.findElement(By.id("alertBtn")).click();
		 Alert alertWindow=driver.switchTo().alert();
		 // we can conduct two command
		 //1. accept
		 //2. dismiss
		
	
		// this how print the text
		System.out.println(alertWindow.getText());
		
		alertWindow.accept();
		
		
		//another way to handle alert 
			//driver.switchTo().alert().accept();
			
		
	}

}
