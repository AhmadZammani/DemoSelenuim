package LabSession3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTableInSelenium {

	public static void main(String[] args) {
		/*
		 * What is a table: static table-- fuxed date, fix number of rows and fix number
		 * columns
		 * 
		 * Dynamic table pagination table
		 */
		//
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		// 1:find total number of rows

		//List<WebElement> TotalRows = driver.findElements(By.xpath("//table[@name='BookTable']//tbody/tr"));

		//System.out.println("Total number of rows are: " + TotalRows.size());
		
		// or
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tbody/tr")).size();
		System.out.println("total Rows: " + rows);

		// 2:find total number of columnby.

		//List<WebElement> TotalColumns = driver.findElements(By.xpath("//table[@name='BookTable']//tbody/tr/th"));
		//System.out.println("Total Number of Columns: " + TotalColumns.size());
		
		// or
		int col = driver.findElements(By.xpath("//table[@name='BookTable']//tbody/tr/th")).size();
		System.out.println("Colums: " + col);

		// 3:find specific rows and column data(Master in java from the table)

		String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[1]")).getText();
		System.out.println(data);

		System.out.println("----Read the data from rows and columns-----");

		// 4: read Data from all rows and columns
		// note:for both the table rows and column finding details we use innter and out
		// for loops
          
		for (int r = 2; r <= rows; r++) { // this is outer loop represent the table rows
			for (int c = 1; c <=col; c++) {// this is called inner loop represent the column in table

				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(value);
			}
		
		// 5: print Books whose name is Mukesh
		// 4: read Data from all rows and columns
		// 4: read Data from all rows and columns
	
		
	}
	}
}
