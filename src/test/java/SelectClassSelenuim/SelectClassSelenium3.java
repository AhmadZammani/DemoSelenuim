package SelectClassSelenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassSelenium3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");
		
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.tagName("select"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Erlang");
		Thread.sleep(3000);
		select.selectByIndex(4);
		Thread.sleep(3000);
		select.selectByValue("cPlusPlus");
		Thread.sleep(6000);
		 System.out.println(select.isMultiple());// this show if the dropdown is multiple option
		
		
		driver.close();
	}

}
