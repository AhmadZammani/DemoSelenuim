package WedElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebEelementGetCssValue {

	public static void main(String[] args) throws InterruptedException {
		// getText();
		// Requirement:Verify the button name:Add new element

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		/*
		 * 1 Color =color 2 Font Size = font-size 3 Background Color =background-color 4
		 * Background =background 5 Height/Width =height or width 6 Box Model
		 * (Margin/Padding)=(content, border,padding,margin 7 Border=border 8 Border
		 * Radius=border-radius
		 */

		WebElement element = driver.findElement(By.xpath("//a[text()='TEKSCHOOL']"));
		String str = element.getCssValue("color");
		System.out.println("The TekSchool logo font color: " + str);

		WebElement element2 = driver.findElement(By.xpath("//h1[text()='Shop By Category']"));
		System.out.println("The Shop by catagory font size: " + element2.getCssValue("color"));
         
		driver.navigate().to("https://tek-retail-ui.azurewebsites.net/products/16");
		Thread.sleep(3000);
		WebElement element3= driver.findElement(By.xpath("//img[@alt='Roblox Digital Gift Card ']"));
	     System.out.println(element3.getCssValue("background-color"));
	}
	

}
