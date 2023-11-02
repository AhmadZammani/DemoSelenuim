package LabSession3_Naqibullah;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass {

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


		driver.get("https://tek-retail-ui.azurewebsites.net/");

		driver.manage().window().maximize();

		WebElement reactDropDown = driver.findElement(By.xpath("//select[@id='search']"));

		// Select class

		Select select = new Select(reactDropDown);

		/*
		 * 
		 * How to handle static dropdown: We have to use select class.
		 * 
		 * We will create object of select class and then we can use
		 * 
		 * selectByIndex
		 * 
		 * selectByVisibleText
		 * 
		 * selectByValue
		 *
		 * 
		 * 
		 * The value of drop down is fixed and will not change.
		 * 
		 */

		//select.selectByIndex(3);

		Thread.sleep(3000);

		// 2. Select ByVisible text

		select.selectByVisibleText("Automative");

		Thread.sleep(3000);

		// 3. select byVlaue

		select.selectByValue("2");
		select.selectByIndex(2);
		
		
		// please print size of the drop down
	    
		List<WebElement > AvailableOption=select.getOptions();
		System.out.println("the total number of optiona"+AvailableOption.size());
		 for (int i = 0; i < AvailableOption.size(); i++) {
			System.out.println(AvailableOption.get(i).getText());
		}
		
		Thread.sleep(3000);
         driver.close();
	}

}
