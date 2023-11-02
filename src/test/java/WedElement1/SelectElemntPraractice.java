package WedElement1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectElemntPraractice {

	public static void main(String[] args) throws InterruptedException {
		// find the the contact names in the table

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/challenging-dom");
		List<WebElement> element = driver.findElements(By.xpath("//table//tbody//tr"));
	
		for (int i = 1; i <= element.size(); i++) {
			WebElement contact=driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[2]//p"));
			 System.out.println(contact.getText());
		}
		
	}

}
