package actionClassInSelenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PressShiftKeyAndPressSendKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		WebElement searchInput = driver.findElement(By.id("searchInput"));
		// we create object of Actions Class.

		Actions actions = new Actions(driver);
		// we want to press shift key and then send keys to the search input filed
		// since we are performing composite actions, we need to build out actions first
		// and then perform.
		actions.keyDown(Keys.SHIFT)// we pressing shift key
		.sendKeys(searchInput, " tekschool")// we send key
		.keyUp(Keys.SHIFT)// releasing shif key
		.build().perform();// build and perform our action

		Thread.sleep(5000);

		driver.close();

	}

}
