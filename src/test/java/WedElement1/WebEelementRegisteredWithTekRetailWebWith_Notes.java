package WedElement1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebEelementRegisteredWithTekRetailWebWith_Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/%22);");
		driver.manage().window().maximize();
		WebElement element =driver.findElement(By.id("searchInput"));
		
	    //By id
        //By name
        //By class name
        //By linkText
        //By partialLinkText

        //Create an automation test case to automate the process of registering
        //with retail website
        //click(); and sendKeys(char sequence);

        //to click on sign in link we have the following options:
        //ID: id="signinLink"
//        WebElement signInLink = driver.findElement(By.id("signinLink"));
//        signInLink.click();
        //ClassName: class="top-nav__btn"
//        WebElement signInLink2 = driver.findElement(By.className("top-nav__btn"));
//        signInLink2.click();
        //LinkText: Sign in
        WebElement signInLink3 = driver.findElement(By.linkText("Sign in"));
        signInLink3.click();
        //Click on Create New Account link
        //I have the link text (Create New Account)
        //If I want to use partial text to click on this link, then I can use the
        //By.partialLinkText(String arg) method
        //Create New Account
        //Create New
        //New Account
        //Account or Create
        WebElement createNewAcct = driver.findElement(By.partialLinkText("New Account"));
        createNewAcct.click();

        //enter name
        WebElement nameField = driver.findElement(By.name("name"));
        nameField.sendKeys("guardians");
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
