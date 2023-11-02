package FileUploadInselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import WaitsInselenium.WebDriaverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FileuploadInSeleniumExample2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/upload");
		driver.manage().window().maximize();
		// pageLoadTimeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ImageAppld = driver.findElement(By.id("fileInput"));
		ImageAppld.sendKeys("C:\\Users\\farha\\OneDrive\\Pictures\\Screenshots//Screenshot 2023-03-23 123940.png");
		Thread.sleep(6000);
        driver.close();
	}

}
