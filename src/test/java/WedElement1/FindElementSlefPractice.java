package WedElement1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementSlefPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://tek-retail-ui.azurewebsites.net/");
	driver.manage().window().maximize();
	
//	WebElement element=driver.findElement(By.id("signinLink"));
//	element.click();
	
//	WebElement element2=driver.findElement(By.className("top-nav__btn"));
//	element2.click();
	// We click on sign in in Tek Retail web 
	WebElement element3=driver.findElement(By.linkText("Sign in"));
	 element3.click();
	// once we signed in we create an account.
	 WebElement creatNewAccount= driver.findElement(By.partialLinkText(" New Account"));
	creatNewAccount.click();
	 // now we create the name
	WebElement name=driver.findElement(By.name("name"));
	name.click();
	name.sendKeys("Ahmad");// sendKeys accept char and string and I directly called and add my name
	
	// Enter Email
	WebElement email=driver.findElement(By.id("emailInput"));
	email.sendKeys("Ahmad1.786@gmail.com");
	// enter password
	String str="Ahmad@123";
	WebElement pass= driver.findElement(By.id("passwordInput"));
	pass.sendKeys(str);
	
	// confirm password
	 WebElement ConfPass=driver.findElement(By.id("confirmPasswordInput"));
	   
	 ConfPass.sendKeys(str);
	 
	 // sing up
	
	WebElement Sigup=driver.findElement(By.id("signupBtn"));
	Sigup.click();
	
	
	}
	
	
	
	

}
