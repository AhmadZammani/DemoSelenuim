package LabSession2Naqib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomizedLocatorXpath {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		/*
		 * xpath: It is and address of an element on the web page. 
		 * xpath is a type of locator used to locate web elements in XML. 
		 * 
		 * 1. Absolute xpath: Full xpath 
		 * starts from top of html tag and travels all the way down to element. 
		 * This is not recommended to use unless the is no other way. 
		 * Absolute xpath starts with single slash(/) Example for this 
		 * can be : /html/body/div[2]/div/div/form/fieldset[1]/div[2]/div/input 
		 *  
		 *  
		 * 2. Relative xpath: Partial xpath: 
		 *  starts with // and it means location of that element tag and it is 
		 *  most used when we don’t have a unique attribute to find an element.  
		 *  Syntax for basic xpath : //tagName[@attributeName=’valueOfAttribute’]
		 *  Example: //input[@name='firstname']
		 * 
		 * 
		 */
		
		/*
		 * Locating Elements with Tag Name and an attribute
		 * <a id="signinLink" class="top-nav__btn" href="/auth/login">Sign in</a>
		 * //tagName[@attributeName=’valueOfAttribute’]
		 *  //a[@id='signinLink']
		 * 
		 */
		
		
		/*
		 * Locating Elements with Static visible text 
		 * <a id="signinLink" class="top-nav__btn" href="/auth/login">Sign in</a>
		 *  //tagName[text()='exact text']
		 *  //a[text()='Sign in']
		 */
		
		/*
		 * Locating Element when part of visible text is Static
		 * We use contains in order to locate dynamic elements.
		 * <a id="newAccountBtn" class="login__account-btn" href="/auth/sign-up">Create New Account</a> 
		 *  //tagName[contains(text(),'substring')]
		 *  //a[contains(text(),'Create New')]
		 * 
		 */
		
		
		/*
		 * Locating Elements when prefix of the inner text is static
		 * <a id="newAccountBtn" class="login__account-btn" href="/auth/sign-up">Create New Account</a> 
		 *  //tagName[starts-with(text(),'Prefix of Inner Text')]
		 *  //a[starts-with(text(),'Create')]
		 * 
		 */
		
		
		/*
		 * Locating Elements with Multiple attributes
		 * <a id="newAccountBtn" class="login__account-btn" href="/auth/sign-up">Create New Account</a> 
		 *  //tagName[@attribute 1 = 'value'][@attribute2 ='value2']
		 *  //a[@id='newAccountBtn'][@class='login__account-btn']
		 */
		
		
	
	
	
	
	
	}

}
