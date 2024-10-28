package apirl8;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles2 {

	public static void main(String[] args) throws Throwable {
		// multiple window and verify for specific window
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='allcircle circleone'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='allcircle circletwo'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='railDrishti fa fa-line-chart'])[1]")).click();
		ArrayList<String>brw = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(brw);
		//switch to air ticketing window
		driver.switchTo().window(brw.get(3));
		
	}

}
