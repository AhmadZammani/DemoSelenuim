package SelectClassSelenuim;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTablesSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");
		driver.manage().window().maximize();
		List<WebElement> dropDown = driver.findElements(By.xpath("//select[@id='programmingLanguageSelect']//option"));
		for (int i = 0; i < dropDown.size(); i++) {
			if (dropDown.get(i).getText().equals("C++")) {
				dropDown.get(i).click();
			}
		}

	}

}
