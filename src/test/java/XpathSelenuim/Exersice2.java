package XpathSelenuim;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exersice2 {

	public static void main(String[] args) throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  
	  /* Open Retail application 
	   click on All icon on left side 
	   click on Electronics
	   click on TV & Video 
	   print list of images present on this page 
	   Hint: you need to use findElements 
	   you need to store it into a list
	   you need to get size of the list and print it
       */
	 
	  WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
//	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// thread.sleep : stops execution for certain amount of time
		// implicitlyWait: waits for certain time before it throws exception
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		// click on All icon on left side of the application
		driver.findElement(By.id("hamburgerBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-id='1']")).click();
		driver.findElement(By.xpath("//span[text()='TV & Video']//parent::div")).click();
		Thread.sleep(3000);
		List<WebElement> elements=driver.findElements(By.tagName("img"));
		System.out.println(elements.size()+" is means the numbers of images in the page");
		
		//can you guys iterate through the list and print name of each image?
		for(WebElement image:elements) {
			String attValue = image.getAttribute("alt");
			System.out.println(attValue);
			if(attValue.contains("TCL 55\" Class 4-Series Smart Roku TV ")) {
				image.click();
			}
	
		}
		
		
		driver.close();
	}

}
