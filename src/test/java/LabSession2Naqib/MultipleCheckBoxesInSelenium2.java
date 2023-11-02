package LabSession2Naqib;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleCheckBoxesInSelenium2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/checkbox");
		driver.manage().window().maximize();

		// How to select multiple check boxes?
		Thread.sleep(3000);
		List<WebElement> CheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total Check Boxes: " + CheckBoxes.size());
		for (int i = 0; i < CheckBoxes.size(); i++) {
			CheckBoxes.get(i).click();
		}
			// how to use enhances for loop
			Thread.sleep(3000);
	for(WebElement chBox : CheckBoxes) {
			chBox.click();		
			}
			}

		}
	


