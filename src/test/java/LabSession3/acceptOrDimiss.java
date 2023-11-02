package LabSession3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class acceptOrDimiss {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/javascript-alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

// on this type of alert either we acccept or reject /dimiss the alert 
		
		WebElement ConfirmAlert = driver.findElement(By.id("confirmBtn"));
		ConfirmAlert.click();
		Thread.sleep(3000);
		// accept
		//driver.switchTo().alert().accept();
		// dismiss
		//driver.switchTo().alert().dismiss();
		
		// or alert interface
		Alert alertWindow = driver.switchTo().alert();
		System.err.println(alertWindow.getText());
		alertWindow.accept();
		alertWindow.dismiss();

	}

}
