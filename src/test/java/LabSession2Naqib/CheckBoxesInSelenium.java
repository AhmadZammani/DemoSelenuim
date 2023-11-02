package LabSession2Naqib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxesInSelenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/checkbox");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement JavascriptBox = driver.findElement(By.xpath("//input[@id='javascriptInput']"));
		JavascriptBox.click();
		System.out.println(JavascriptBox.isDisplayed());
		System.out.println(JavascriptBox.isEnabled());
		System.out.println(JavascriptBox.isSelected());
		System.out.println("----------------------------------------------------");
		
		WebElement CPlusplusBox=driver.findElement(By.xpath("//input[@id='cPlusPlusInput']"));
		CPlusplusBox.click();
		System.out.println(CPlusplusBox.isDisplayed());
		System.out.println(CPlusplusBox.isEnabled());
		System.out.println(CPlusplusBox.isSelected());
	
		// How to select multiple check boxes? 
		driver.close();

	}

}
