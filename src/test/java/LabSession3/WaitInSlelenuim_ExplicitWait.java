package LabSession3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitInSlelenuim_ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Explicit wait: explicit wait allows you to set specific rules for individual elements
		 * or conditions in your test.
		 * 2 part in explicitly wait
		 * a:Declaration
		 * b:usage
		 *  
		 */
		
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//	WebDriverWait accept two parameters 
		WebDriverWait myWait= new WebDriverWait(driver, Duration.ofSeconds(20));// we declare in here 
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	WebElement UserName=	myWait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//input[@name='username']")));
	UserName.sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin123");

	}

}
