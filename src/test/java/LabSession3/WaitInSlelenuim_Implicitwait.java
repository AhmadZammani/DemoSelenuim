package LabSession3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitInSlelenuim_Implicitwait {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*
		 * Waits 1-thread.sleep-- its a hard stop, it not belong to selenium . it comes
		 * java and not recommaded
		 * 
		 * 2.PageLoadTimeout--
		 * 
		 * we have three kind of waits as below 1.ImplecitlyWait-
		 * 
		 * 2.Explicit Wait 3.FluentWait
		 */

		// Implicit wait: its a global wait. because we initiate it one/
		// we define it at the beginning of execution and it will be applicable till end
		// of execution
		// in implicit wait we are asking web driver to wait for specific time before
		// throwing
		// an exception.
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin123");

	}

}
