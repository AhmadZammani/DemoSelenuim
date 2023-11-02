package TakeScreenShotInSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShotReusebleMethod {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		takeScreenshot("Home Page2");

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
