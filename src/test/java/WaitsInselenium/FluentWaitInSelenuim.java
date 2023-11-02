package WaitsInselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitInSelenuim {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://shop.demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// first we have to create an instance of FluentWait

		FluentWait<WebDriver> Fwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

//		WebElement UiText = driver.findElement(By.xpath("//div[text()='umbra blue ']"));
//		Fwait.until(ExpectedConditions.visibilityOf(UiText));
//        System.out.println(UiText.getText());
          //or 
        WebElement Fwiat2=Fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='umbra blue ']")));
        System.out.println(Fwiat2.getText());
        driver.close();
	}

}
