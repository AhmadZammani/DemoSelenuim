package SelectClassSelenuim;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDynamicDropDown2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");
		driver.manage().window().maximize();
		List<WebElement> dropDown1 = driver.findElements(By.xpath("//select[@id='countrySelect']//option"));
		 for (int i = 0; i < dropDown1.size(); i++) {
			if(dropDown1.get(i).getText().equals("United States")) {
				dropDown1.get(i).click();
			}
		}
		
			

	}

}
