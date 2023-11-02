package WaitsInselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitsAndPageloadTimeout {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		// pageLoadTimeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement element=driver.findElement(By.linkText("Test Selenium"));
		element.click();
		Thread.sleep(6000);
		driver.close();

	}

}
