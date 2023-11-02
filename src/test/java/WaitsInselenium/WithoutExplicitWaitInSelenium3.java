package WaitsInselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutExplicitWaitInSelenium3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://shop.demoqa.com/");
		driver.manage().window().maximize();
		// pageLoadTimeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// should fail because the web element is not visible when WebDriver is trying
		// to interact with that element
	
		WebElement element = driver.findElement(By.xpath("//div[text()='umbra blue ']"));
		System.out.println(element.getText());

		Thread.sleep(6000);
		driver.close();
	}

}
