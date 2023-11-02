package SelectClassSelenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingSelectClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");
		driver.manage().window().maximize();
        // find the india with select class from dropdown url
		
		WebElement India =driver.findElement(By.xpath("//select[@id='countrySelect']"));
		Select select= new Select(India);
		//select.selectByValue("India");
		select.selectByIndex(1);
		 
			
		
		
			

	}

}
