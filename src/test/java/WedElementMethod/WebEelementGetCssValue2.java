package WedElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebEelementGetCssValue2 {

	public static void main(String[] args) throws InterruptedException {
		// getText();
		// Requirement:Verify the button name:Add new element

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		/*
		 * 1 Color =color 2 Font Size = font-size 3 Background Color =background-color 4
		 * Background =background 5 Height/Width =height or width 6 Box Model
		 * (Margin/Padding)=(content, border,padding,margin 7 Border=border 8 Border
		 * Radius=border-radius
		 */

		WebElement element=driver.findElement(By.xpath("//a[text()='Create new account']"));
		System.out.println("coclor: "+element.getCssValue("color"));
		System.out.println("Font Size: "+element.getCssValue("font-size"));
		System.out.println("Background Color: "+element.getCssValue("background-color"));
		System.out.println("content: "+element.getCssValue("content"));
		System.out.println("border: "+element.getCssValue("border"));
		
		
	}
	

}
