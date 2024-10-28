package apirl_14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Counting_rows_columns {

	public static void main(String[] args) throws Throwable {
		// count no of rows in table and columns
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		//store table into webelement
		WebElement table = driver.findElement(By.id("customers"));
		//count no of rows in table
		List<WebElement>rows = table.findElements(By.tagName("tr"));
		System.out.println("no of row are::"+rows.size());
		Thread.sleep(5000);
		//iterate all rows
		for(int i=1;i<rows.size();i++)
		{
			//get column collection each row
			List<WebElement>cols = rows.get(i).findElements(By.tagName("td"));
			Thread.sleep(5000);
			System.out.println("rows no."+i+" "+"column size in each row::"+cols.size());
			Thread.sleep(5000);
		}
		Thread.sleep(5000);
	}
}
