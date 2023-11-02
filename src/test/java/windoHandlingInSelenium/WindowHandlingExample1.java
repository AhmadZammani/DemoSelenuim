package windoHandlingInSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingExample1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		// getWindwoHandle()
		// this will return the name of the current window as string.
		String ParentW = driver.getWindowHandle();
		System.out.println("Name of Parent window " + ParentW);
		driver.findElement(By.linkText("Test Selenium")).click();
		// we use the getWindoHandles() to get list of all windows browser open by
		// selenium.
		// then we store our windows in a set of string
		Set<String> allWidows = driver.getWindowHandles();
		// we can use Iterator to iterate through set<string>(list of all windows)
		Iterator<String> itr = allWidows.iterator();
		// first check and make sure there is a next window open after the parent window
		// using while loop
		while (itr.hasNext()) {
			// itr.next() will get us the child/second window/tab
			// then we can store the name of child window in a String
			String Childw = itr.next();
			// we compare the name of parent and child window and make sure they are not the
			// same
			if (!ParentW.equals(Childw)) {
				// then we are switching to the child window
				driver.switchTo().window(Childw);// switching to next window
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.id("addBtn")).click();
		

		// once you perform your actions on child window, and you want close the child
		// window
		// and then perform some actions on parent window again, make sure to first
		// switch to
		// the parent window
		driver.switchTo().window(ParentW);
		driver.findElement(By.id("searchInput")).sendKeys("Parent Window");

		Thread.sleep(5000);
		driver.quit();

		// if you are working with multiple windows, make sure to use the .quit() method
		// to close all of
		// your browsers
		

	}

}
