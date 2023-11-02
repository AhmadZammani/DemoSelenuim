package WedElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebEelementGettext {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/challenging-dom");

		driver.manage().window().maximize();
		WebElement getText = driver.findElement(By.xpath("//table//tbody//tr[3]//td[4]//button[2]"));

		System.out.println("Row # 3 Delet button: " + getText.getText());
		getText.click();
		Thread.sleep(5000);

		driver.close();

	}

}
