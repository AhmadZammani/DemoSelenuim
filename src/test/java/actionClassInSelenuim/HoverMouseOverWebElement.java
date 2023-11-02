package actionClassInSelenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HoverMouseOverWebElement {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://tek-retail-ui.azurewebsites.net/selenium/hover");
		 driver.manage().window().maximize();
         Thread.sleep(3000);
		 WebElement firstImage=driver.findElement(By.id("image1"));
		 Actions actions=new Actions(driver);
		 actions.moveToElement(firstImage).perform();//on this perfom the mouse move in the center of image
         Thread.sleep(3000);

		 WebElement SecondImage=driver.findElement( By.id("image2"));
		 actions.moveToElement(SecondImage).perform();
		 
	}

}
