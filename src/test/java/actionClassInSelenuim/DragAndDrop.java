package actionClassInSelenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/drag-drop");
		WebElement paymentShould = driver.findElement(By.xpath("//div[starts-with(text(),'Payment should ')]"));
		
		WebElement InProgress = driver.findElement(By.xpath("//div[@data-rbd-droppable-id='2']"));
        Actions actions= new Actions(driver);
        // since this is a single action,than we only call perform method.
        actions.dragAndDrop(paymentShould, InProgress).perform();
        Thread.sleep(3000);
        WebElement CheckOut=driver.findElement(By.xpath("//div[starts-with(text(),'In checkout page ')]"));
        actions.dragAndDrop(CheckOut, InProgress).perform();
	    
        Thread.sleep(5000);
		
		
		
		
	}

}
