package windoHandlingInSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingExample3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();

		String Paretw = driver.getWindowHandle();
		driver.findElement(By.linkText("Test Selenium")).click();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> itr = allWindows.iterator();
		while (itr.hasNext()) {
			String chld1 = itr.next();
			if (!Paretw.equals(chld1)) {
				driver.switchTo().window(chld1);
				driver.findElement(By.id("addBtn")).click();
				Thread.sleep(2000);
			}
		}
		Thread.sleep(3000);
		WebElement DropDownLink = driver.findElement(By.linkText("Drop Down"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(DropDownLink).keyUp(Keys.CONTROL).build().perform();
		Set<String> allWindows2 = driver.getWindowHandles();
		Iterator<String> itr1 = allWindows2.iterator();
		while (itr1.hasNext()) {
			String Child2 = itr1.next();
			if (!Paretw.equals(Child2)) {
				driver.switchTo().window(Child2);
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.id("programmingLanguageSelect")).click();
		Thread.sleep(6000);
		driver.quit();
	}

}
