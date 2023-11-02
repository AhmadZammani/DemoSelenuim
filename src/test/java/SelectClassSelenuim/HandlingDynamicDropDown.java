package SelectClassSelenuim;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/challenging-dom");
		driver.manage().window().maximize();
		// print all the company names from the table.

		// in the following line , we are capturing each row in the table and store them
		// in the webElement list.
		List<WebElement> companiesName = driver.findElements(By.xpath("//table//tbody//tr"));
		// create for loop to iterate through each row.
		for (int i = 1; i <= companiesName.size(); i++) {
			WebElement element = driver.findElement(By.xpath("//table//tbody//tr[" + i + "]//td[1]//p"));
			{
				System.out.println("Company name:" + element.getText());

			}

		}
       Thread.sleep(6000);
       driver.close();
	}
}
