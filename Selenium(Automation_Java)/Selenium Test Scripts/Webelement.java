package apirl5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webelement {

	public static void main(String[] args) throws Throwable {
		// collection of elemennts in webpage and name each and every hyperlink in webpage
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		Thread.sleep(5000);
		//get collections of links in page which are stores into html tag a
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println("No of links are::"+links.size());
		for (WebElement each:links)
		{
			//Thread.sleep(5000);
			System.out.println(each.getAttribute(null));
		}
	}

}
