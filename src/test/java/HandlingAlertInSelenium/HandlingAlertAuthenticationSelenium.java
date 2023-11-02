package HandlingAlertInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlertAuthenticationSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// for authentication alert, we have to incorporate the authentication into the
		// url:http://the-internet.herokuapp.com/basic_auth
		// username = admin
		// password = admin
		//admin:admin@the-internet.herokuapp.com/basic_auth
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		//in above we added admin:admin@ to let us get into the webpage
		driver.manage().window().maximize();

	}

}
