package XpathSelenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToTekRetailWedsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://tek-retail-ui.azurewebsites.net/auth/login");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("guardiansautomation1@gmail.com");
	        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password@123");
	        driver.findElement(By.xpath("//button")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//a[@id='accountLink']")).click();
	        driver.findElement(By.xpath("//input[@id='personalPhoneInput']")).sendKeys("4208889292");
	        driver.findElement(By.xpath("//button[@id='personalUpdateBtn']")).click();

	        //When we don't have to create/store webelement in instance of WebElement
	        //click()
	        //sendKeys(string arg);

	        //When you have to create/store webelement in instance of WebElement
	        //getText();
	        //isDisplayed();
	        //isEnabled();
	        //isSelected();
		
		
		
	}

}
