package WaitsInselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitInSelenium2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://shop.demoqa.com/");
		driver.manage().window().maximize();
		// pageLoadTimeout
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// implicitlyWait
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//below line should fail because the webElement not visible when the webdriver try to interact with that element
		// WebElement element = driver.findElement(By.xpath("//div[text()='umbra blue
		// ']"));
//		System.out.println(element.getText());
//
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement UItext = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='umbra blue ']")));
		System.out.println(UItext.getText());

		// getting UI text by locator
		// System.out.println(getUItext(driver , By.xpath("//div[text()='umbra blue
		// ']")));

		// getting UI text by webelement
//		WebElement element=driver.findElement(By.xpath("//div[text()='umbra blue ']"));
//		System.out.println(getUIBywebElement(driver, element));
		Thread.sleep(1000);
		driver.close();
		// or we can conduct the method with below
	}

	public static String getUItext(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		String ActualText = wait.until(ExpectedConditions.visibilityOfElementLocated(by)).getText();
		return ActualText;

	}

// or with element 
	public static String getUIBywebElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		String ActualText = wait.until(ExpectedConditions.visibilityOf(element)).getText();
		return ActualText;
	}
}