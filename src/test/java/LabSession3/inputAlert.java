package LabSession3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class inputAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/javascript-alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.id("promptBtn")).click();
		Thread.sleep(3000);
		// we create the interface of alert 
		Alert alertWindow = driver.switchTo().alert();
		alertWindow.sendKeys("TekSchool");
		alertWindow.accept();
		// in below we get the message we wrote the sendkey message
		   String actual_Text=driver.findElement(By.id("message")).getText();
		   System.out.println(actual_Text);
		  
		   String Expected_text="You wrote TekSchool";
		   if(actual_Text.equals(Expected_text)) {
		   System.out.println("Test Passed");
		   }else {
			   
			   System.out.println("test failed");
		   }
			   
		   
		   
		   
		   
		   
		   
		   

	}

}
