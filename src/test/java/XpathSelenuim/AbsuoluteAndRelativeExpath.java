package XpathSelenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbsuoluteAndRelativeExpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/auth/login");
		driver.manage().window().maximize();
		

        //Absolute XPath
        WebElement emailField = driver.findElement(By.xpath("/html/body/div/div[1]/div/form/div[1]/input"));
        emailField.sendKeys("guardians@tekschool.com");

        //Relative XPath
        WebElement passField = driver.findElement(By.xpath("//input[@name='password']"));
        passField.sendKeys("12345$");
	}

}
