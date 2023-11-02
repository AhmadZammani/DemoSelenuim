package SelectClassSelenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassSelenium2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		Thread.sleep(3000);
		driver.manage().window().maximize();

		WebElement dropDown=driver.findElement(By.tagName("select"));
		
		Select select=new Select(dropDown);
		
		select.selectByIndex(3);
		Thread.sleep(3000);
		select.selectByValue("4");
		Thread.sleep(3000);
		select.selectByVisibleText("Automative");
		Thread.sleep(3000);
		 driver.close();

	}

}
