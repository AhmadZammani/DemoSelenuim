package XpathSelenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class labSession2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     Thread.sleep(5000);
     driver.get("https://techcrunch.com");
	 //driver.findElement(By.xpath("//input[@id='searchInput']")).click();
 	driver.findElement(By.xpath("//input[@id='checkbox-Readership']")).click();
	Thread.sleep(5000);
	 
	driver.close();
	
	
	
	
	}

}
