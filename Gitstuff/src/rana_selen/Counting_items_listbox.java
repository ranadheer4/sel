package rana_selen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Counting_items_listbox {


	@Test
	public void Test1() throws Throwable {
		//Count no of items in listbox and print the name of each and every item in listbox
		WebDriver driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		//select listbox into select class
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		//get collection of items in listbox
		List<WebElement>Olist = listbox.getOptions();
		System.out.println("No of items are::"+Olist.size());
		Thread.sleep(5000);
		for(WebElement each:Olist)
		{
			System.out.println(each.getText());
		}
	}

}
