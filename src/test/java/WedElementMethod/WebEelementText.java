package WedElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebEelementText {

	public static void main(String[] args) throws InterruptedException {
		//getText();
		//Requirement:Verify the button name:Add  new element 
    
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/add-remove-elements");
		Thread.sleep(2000);
		//getText();
		//Requirement:Verify the button name:Add  new element 
		    
	    WebElement GetTextFromURl=driver.findElement(By.id("addBtn"));
	    System.out.println(GetTextFromURl.getText());
		if(GetTextFromURl.getText().equals("Add New Element")) {
			System.out.println("text are equal");
		}else {
			System.out.println("text are not equal");
		}
		driver.close();
		
	}
	
	

}
