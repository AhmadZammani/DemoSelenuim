package SelectClassSelenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAndDeselectSelenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

		driver.manage().window().maximize();
		// first we have to store the dropdown element in an instance of webElement

		WebElement Month = driver.findElement(By.xpath("//select[@name='Month']"));
		// create object of select class

		Select select = new Select(Month);
		// now we can use the select class reference to call the helper methods are
		// available in select class.
		select.selectByIndex(4);
		Thread.sleep(3000);
		select.selectByValue("May");
		Thread.sleep(3000);
		select.selectByVisibleText("June");
		
		//the deselect methods are also helper methods available in selenium Select class which we
		//can use to deselect option from a dropdown
		;
		select.deselectByIndex(4);
		Thread.sleep(2000);
		select.deselectByValue("May");
		Thread.sleep(2000);
		select.deselectByVisibleText("June");
		
		//We can select multiple option in a dropdown only if the dropdown has multi-select option
		//and selenium select class is providing us with the helper method isMultiple() through which
		//we can check to see if that dropdown has a multi-select option
		
		if(select.isMultiple()) {
			System.out.println("This dropdown has multi-select option");
		}else {
			System.out.println("This dropdown does not have multi-select option");
		}
		
		
		
		Thread.sleep(5000);
		driver.close();

	}

}
