package LabSession3_Naqibullah;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropeDownwithoutSelect {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

		/*
		 * 
		 * Bootstrap drop down does not have a select tag.
		 * 
		 * How to select multiple options from drop down.
		 * 
		 */

		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

		/*
		 * 
		 * //ul[contains(@class,multiselect)]//li
		 * 
		 * //ul[contains(@class,multiselect)]//li//a
		 * 
		 * //ul[contains(@class,multiselect)]//li//a//label
		 * 
		 */

		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//li//a//label"));
		System.out.println("Total Number of Options: " + options.size());

		// In here we want to print all values inside the drop down

		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());

		}

		// now we want to select an option from the drop down?

		// How to select one single option or value from drop down which does not have

		// a select tag.

		for (int i = 0; i < options.size(); i++) {
			if (options.get(i).getText().equals("MySQL")) {
				options.get(i).click();
				break;

			}

		}
		System.err.println("-------------------------------------------------------");
		// How to select multiple values from the drop down?

		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).getText();
			if (text.equals("Java") || text.equals("Python")) {

				options.get(i).click();

			}

//		}
//          // how to use enhanced for loop
//		for (WebElement option : options) {
//			
//		String text = option.getText();
//
//		if(text.equals("Java") || text.equals("Python")) {
//
//		option.click();
//
//		}

		}
			
		
		
		
		
		
	}
		
		
		
	}

