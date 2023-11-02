package LabSession3_Naqibullah;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass2 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Static Drop down // for handling the static drop down we use select class //
		 * in static the value drop down are remain the same and never change .
		 * Bootstrap drop down Dynamic Drop Down
		 */
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://tek-retail-ui.azurewebsites.net/");

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");
		WebElement Select_Element = driver.findElement(By.xpath("//select[@name='language']"));
         Select select=new Select(Select_Element);
		 select.selectByIndex(4);
         
         
         Thread.sleep(3000);
		driver.close();
	}

}
