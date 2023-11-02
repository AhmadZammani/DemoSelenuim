package WedElement1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElement1_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
    driver.get("https://tek-retail-ui.azurewebsites.net/");
    driver.manage().window().maximize();
//    WebElement SearchField=driver.findElement(By.id("searchInput"));
//	SearchField.sendKeys("Video game");
    // find the search input field and send text
    //then change upper case I (searchInput) to lowercase and try to send text to 
    // the field again
   // in selenium we handle the NoSuchElement Exception with try and catch block.
   try {
	   WebElement SearchField=driver.findElement(By.id("searchtnput"));
	     SearchField.sendKeys("Video game");
		
} catch (NoSuchElementException e) {
	// TODO: handle exception
	e.printStackTrace();
	System.out.println(e.getMessage());
	driver.close();
	
}
  
	
	}

}
