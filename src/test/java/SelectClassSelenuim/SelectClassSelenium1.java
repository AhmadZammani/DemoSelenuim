package SelectClassSelenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassSelenium1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();

		// To use Select class in Selenium to handle dropdown, first we have to make
		// sure the node
		// that represents that webelement in the DOM, has a tag name (select)
		/*
		 * <select class="search__select" id="search"> <option value="-1"
		 * class="search__select-option ">All departments</option> <option value="1"
		 * class="search__select-option ">Electronics</option> <option value="2"
		 * class="search__select-option ">Computers</option> <option value="3"
		 * class="search__select-option ">Smart Home</option> <option value="4"
		 * class="search__select-option ">Sports</option> <option value="5"
		 * class="search__select-option ">Automative</option> </select>
		 */
		// then we can store the webelement(dropdown) in an instance of webelement
		WebElement dropDown = driver.findElement(By.id("search"));

		// then create object of Select class in Selenium and pass the reference to that
		// webelement
		// in the method paramter
		Select select = new Select(dropDown);

		// then we can use the reference to object of select class to call any of the
		// methods available in the
		// Select class to select options from the dropdwon
		select.selectByIndex(3);
		//Thread.sleep(3000);
		//select.selectByValue("4");
		//Thread.sleep(3000);
		//select.selectByVisibleText("Automative");

		Thread.sleep(6000);
		driver.close();

	}

}
