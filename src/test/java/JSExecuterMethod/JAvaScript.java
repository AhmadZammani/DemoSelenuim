package JSExecuterMethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JAvaScript {
	private static final String ScreenShotName = null;
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// JavascriptExecutor is an interface in Selenium WebDriver that allows us to
		// execute JavaScript code in Selenium
		// We Use JavascriptExecutor to perform some actions that Selenium does not
		// provide
		// for example: highlighting element background
		// give element border
		// scroll down the page
		// scroll to element to view
		// but also, we can use the javascriptexecutor methods to perform some actions
		// as alternative
		// to Selenium methods
		// for example: click a web element
		// and we use JavascriptExecutor to perform those actions, if the method
		// available in Selenium
		// fails to perfrom that action

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/inputs");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		// using the sendKeysWithJSE method
//		WebElement inputFiled = driver.findElement(By.xpath("//input[@type='text']"));
//		highlightelementRedBorder(inputFiled);// it highlight the element border
//		highlightelementBackground(inputFiled);
//		sendKeysWithJSE(inputFiled, "JavaScript");// send the key directly
//		takeScreenshot("inputFiled");
//		Thread.sleep(6000);
//		// Using the clickWithJSE method
//		driver.navigate().to("https://tek-retail-ui.azurewebsites.net/selenium/dynamic-content");
//		WebElement ClickQuote = driver.findElement(By.id("newQuoteBtn"));
//		Thread.sleep(2000);
//		clickWithJSE(ClickQuote);// click on the element
		driver.navigate().to("https://tek-retail-ui.azurewebsites.net/");
		Thread.sleep(3000);
		//scrolldownPage();// This method scroll down the web Page
		WebElement ScrollView=driver.findElement(By.id("categoryTitle"));
		scrollToView(ScrollView);
		Thread.sleep(6000);
	}

	public static void sendKeysWithJSE(WebElement element, String value) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='" + value + "'", element);

	}

	public static void clickWithJSE(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", element);

	}

	public static void highlightelementRedBorder(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].style.border='2px solid red'", element);

	}

	public static void highlightelementBackground(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].style.background='yellow'", element);

	}

	public static void highlightelementBorderAndBackground(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);

	}

	public static void scrolldownPage() {

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

	public static void scrollToView(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}

	public static void takeScreenshot(String screenshotName) {

		String filePath = ".\\myScreenshots\\";
		try {
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File(filePath + screenshotName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
}
