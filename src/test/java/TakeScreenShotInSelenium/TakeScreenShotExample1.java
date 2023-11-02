package TakeScreenShotInSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShotExample1 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		// In Selenium WebDriver, we have one interface called TakesScreenshot
		// There is a method in TakesScreenshot interface called getScreenshot();
		// We can use the TakesScreenshot interface to cast to the WebDriver instance
		// getScreenshotAs(); which is implemented in RemoteWebDriver class
		// the getScreenshotAs(OutputType.FILE); take the output file type as argument
		// which then we can sore this file in a File and then store it in a location in
		// our computer
		// using the FileUtils class

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);		
		// the FileUtils class libraries are already included in Selenium 4. So we don't
		// have to
		// download the libraries separately and add them to our project build path
		// or get the dependency and add it to our pom.xml file
		
		
		//so after we take the screenshot, we can specify the path/location where we want to
		//sore the screenshot
		//we have to also provide a name for our screenshot file name
		//FileUtils.copyFile(screenshot, new File(location + nameOftheFile + extension));
		FileUtils.copyFile(screenshot, new File(".\\screenShots\\" + "HomePage" + ".png"));
	}

}
