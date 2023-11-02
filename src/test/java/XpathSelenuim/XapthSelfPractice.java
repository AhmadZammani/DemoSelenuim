package XpathSelenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XapthSelfPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriverManager.chromedriver().setup();
   
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
WebElement image=driver.findElement(By.xpath("//a[text()='About']"));
image.click();

driver.close();
		

         
		
		
		
	}

}
