package actionClassInSelenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionInterfaveVsActionClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/inputs");
		driver.manage().window().maximize();
		// Action Interface
		// you can only build your action(s) using Actions interface
		// to build your actions, using Action interface as reference, you will still
		// need to create object of Actions class first and then use the reference to
		// Actions class
		// when building your actions and then you can perform your actions using
		// reference to when
		// you built your actions
		// Actions Class:
		// you can perform or build and perform your actions

		WebElement rangeInput = driver.findElement(By.id("rangeInput"));

		// first create object of action class.
		Actions actions = new Actions(driver);
		// second, we build our actions using Action interface as a reference
		Thread.sleep(3000);
		Action actionBuilder = actions.dragAndDropBy(rangeInput, 200, 25).build();
		// now if you want perform the action or actions you built using Action
		// interface
		// use the reference actionBuilder and call the perform method
		actionBuilder.perform();
//we can also move the element to the left, right, up and down using the sendkeys method
		Thread.sleep(5000);

		driver.close();

	}

}
