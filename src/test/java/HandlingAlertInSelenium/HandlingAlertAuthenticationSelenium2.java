package HandlingAlertInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlertAuthenticationSelenium2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/alert");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("alertBtn")).click();
		Thread.sleep(3000);
		// click on yes to delete button
		//driver.findElement(By.id("confirmBtn")).click();
		//click here to cancel button
		driver.findElement(By.id("cancelBtn")).click();

	}

}
