package XpathSelenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise {

	public static void main(String[] args) throws InterruptedException {
		//name it ExerciseLecture
	     /* Write a code that opens chrome browser 
	     * go to tek retail application
	     * print title 
	     * wait for 5 seconds 
	     * click on Sign in 
	     * click on Want to sell something 
	     * fill the form 
	     * click on create Account
	     */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// thread.sleep : stops execution for certain amount of time
        // implicitlyWait: waits for certain time before it throws exception
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        System.out.println(driver.getTitle() + " TEK Retail Application title");
        //Thread.sleep(5000);
        WebElement signInLink =driver.findElement(By.xpath("//a[@id='signinLink']"));
        signInLink.click();
        WebElement wantToSellSomethingLink = driver.findElement(By.className("login__company-btn"));
        wantToSellSomethingLink.click();
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement companyName = driver.findElement(By.cssSelector("input[id='nameInput']"));
        WebElement description = driver.findElement(By.xpath("//textarea[@id='descriptionInput' and @class='signup__input']"));
        WebElement urlField = driver.findElement(By.id("urlInput"));
        WebElement createAccountButton = driver.findElement(By.xpath("//button[text()='Create Account']"));
        
        emailField.sendKeys("Tod@tekschool.us"); // change the value 
        passwordField.sendKeys("TEK@1234567");
        companyName.sendKeys("TEK");
        description.sendKeys("Coding Bootcamp");
        urlField.sendKeys("tekschool.us");
        
        createAccountButton.click();
        Thread.sleep(5000);
        driver.close();
        
		
		
		
		
		
		

	}

}
