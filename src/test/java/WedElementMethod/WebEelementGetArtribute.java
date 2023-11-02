package WedElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebEelementGetArtribute {

	public static void main(String[] args) throws InterruptedException {
		// getAttribute: sometimes a webElment may not have a WebElemnet text 
		// get Attribute is another method that we can get the text for specific
		// WebElement . and it is  also used to get the attribute value of a 
		//WebElement in specific node.
    
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.get("https://tek-retail-ui.azurewebsites.net/selenium/inputs");
		 Thread.sleep(3000);
		driver.manage().window().maximize();
		 WebElement getAtrr=driver.findElement(By.id("textInput"));
		System.out.println(getAtrr.getAttribute("placeholder"));
		driver.close();
		
	}

}
