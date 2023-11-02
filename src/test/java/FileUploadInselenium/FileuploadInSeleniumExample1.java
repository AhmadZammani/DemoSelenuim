package FileUploadInselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import WaitsInselenium.WebDriaverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FileuploadInSeleniumExample1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.foundit.in/seeker/registration");
		driver.manage().window().maximize();
		// pageLoadTimeout
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// implicitlyWait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 

		WebElement FileUpload = driver.findElement(By.xpath("//input[@type='file']"));
		//FileUpload.sendKeys("file path + file name+ extension");
	
		FileUpload.sendKeys("C:\\Users\\farha\\OneDrive\\Desktop\\personal Folder\\21 march 2023.docx");
		
		//click on the Okay button on the next screen popping up on the same window
		//use WebDriverWait 
	//WebElement okayBttn = driver.findElement(By.cssSelector("div[class^='primaryBtn'][class$='commonBtn']"));
    //okayBttn.click();
	WebDriverWait wait=new 	WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement OBbttn2=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class^='primaryBtn'][class$='commonBtn']")));
	//the following line of code will not be executed unless the web element is not clickable
	OBbttn2.click();
		
		Thread.sleep(6000);
		driver.close();

}

}
