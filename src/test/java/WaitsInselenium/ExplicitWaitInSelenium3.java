package WaitsInselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitInSelenium3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dynamic-select");
		driver.manage().window().maximize();
		// pageLoadTimeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement FromEle = driver.findElement(By.xpath("//p[text()='From']//following-sibling::input"));
		FromEle.sendKeys("Balkh");
		//when we try to click on Balkh provice from the dropdown, because it takes some time
		//for this dynamic web element to appear on the page, our test fails, and we get
		//a noSuchElementFound exception.
		
//		WebElement BalkhPr = driver.findElement(By.xpath("//li[text()='Balkh']"));
//		BalkhPr.click();
//		
		//we can use explicit wait
		//explicit wait is WebDriverWait
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement Balkh2= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Balkh']")));
		Balkh2.click();
		Thread.sleep(6000);
		driver.close();
	}

}
