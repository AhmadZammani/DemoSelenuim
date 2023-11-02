package WaitsInselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import WedElement1.NoSuchElement1_Exception;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParaticeTypesOfWaits {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement LoginLink = driver.findElement(By.linkText("Sign in"));
		Click(LoginLink);
		WebElement CreatNewccount = driver.findElement(By.id("newAccountBtn"));
		Click(CreatNewccount);
		WebElement EnterName = driver.findElement(By.id("nameInput"));
		sendkeys(EnterName, "Ahmad");
		WebElement Enteremail = driver.findElement(By.id("emailInput"));
		sendkeys(Enteremail, "Tek11@gmail.com");
		WebElement EnterPassword = driver.findElement(By.id("passwordInput"));
		sendkeys(EnterPassword, "Tek@2023");
		WebElement ConfirmedPass = driver.findElement(By.id("confirmPasswordInput"));
		sendkeys(ConfirmedPass, "Tek@2023");
		WebElement SignUp = driver.findElement(By.id("signupBtn"));
		Click(SignUp);

	}

	// create a method click on web element.
	public static void Click(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.out.println("the Web Element " + element.toString() + "not found");
		}
	}

	// method to sendkeys to Web element
	public static void sendkeys(WebElement element, String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		try {
			wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(value);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.out.println("the Web Element " + element.toString() + "not found");
		}
	}

	// getText from web element
	public static String GetUIText(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		String GetUIText = null;
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (NoSuchElementException e) {
			System.out.println("the Web Element " + element.toString() + "not found");
		}
		return GetUIText;

	}
}
