package WedElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebEelementgetSize {

	public static void main(String[] args) throws InterruptedException {
		// getText();
		// Requirement:Verify the button name:Add new element

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement SignBtn = driver.findElement(By.linkText("Log In"));
		// getsize=( width , height)

		System.out.println("log in size" + SignBtn.getSize());
		// we use dimension to specify the width and height
		Dimension size = SignBtn.getSize();
		int x = size.getWidth();
		int y = size.getHeight();
		System.out.println("(Width="+x+","+"Height="+y+")");
		// how can we get the element location
	System.out.println("get the element location"+SignBtn.getLocation());
	 //or
	Point location=SignBtn.getLocation();
	int x1=location.getX();
	int y1=location.getY();
	System.out.println("X1="+x1+"---"+"Y1="+y1);

	}

}
