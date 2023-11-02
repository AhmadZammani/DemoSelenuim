package HandlingAlertInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlertInSelenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/javascript-alerts");
		driver.manage().window().maximize();

		// Selenium is providing us with a class called Alert
		// so either we can switch to alert using the the reference to webdriver
		// or using reference to Alert class and then switch to alert using reference to
		// webdriver
		//driver.switchTo().alert();

		// Simple Alert=Alert
		// we can only accept this alert
		WebElement SimpleAlert = driver.findElement(By.id("alertBtn"));
		SimpleAlert.click();
		Thread.sleep(3000);
		// driver.switchTo().alert().accept();
		 Alert alert=driver.switchTo().alert();
             alert.accept();
		// confirm Alert
		// we can either accept or dismiss the alert.
		WebElement ConfirmAlert = driver.findElement(By.id("confirmBtn"));
		ConfirmAlert.click();
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		//driver.switchTo().alert().dismiss();

		// Prompt Alert
		// we can sendKeys , accept or dismiss the alert.
		WebElement PromptAlert = driver.findElement(By.id("promptBtn"));
		
		PromptAlert.click();
		driver.switchTo().alert().sendKeys("Scam!");
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.close();
	}

}
