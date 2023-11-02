package actionClassInSelenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveElementUsingSendKeysMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/inputs");
		driver.manage().window().maximize();

		// we can also move the element to the left, right, up and down using the
		// sendkeys method
		// and arrow keys
		// .click();
		// .sendKeys(Keys.RETURN);

		// rangInput.click();
		Thread.sleep(5000);
		WebElement rangeInput = driver.findElement(By.id("rangeInput"));
		// rangeInput.click();
		rangeInput.sendKeys(Keys.RETURN);
		rangeInput.sendKeys(Keys.ARROW_RIGHT);// each like move range one click to the right.
		rangeInput.sendKeys(Keys.ARROW_RIGHT);
		rangeInput.sendKeys(Keys.ARROW_RIGHT);
		rangeInput.sendKeys(Keys.ARROW_RIGHT);
		rangeInput.sendKeys(Keys.ARROW_RIGHT);
		rangeInput.sendKeys(Keys.ARROW_RIGHT);

		// How many different method are present in Selenium to click on a Web element
		// .click() method
		// .sendKeys(Keys.RETURN) method
		// Click with Actions class
		// Click with JavascriptExecturo

		Thread.sleep(5000);
		driver.close();

	}

}
