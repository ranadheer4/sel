package apirl_13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Java_script_3 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//launch url
		js.executeScript("window.location='https://amazon.in'");
		Thread.sleep(5000);
		WebElement aboutuslink = driver.findElement(By.xpath("//a[normalize-space()='About Us']"));
		js.executeScript("document.scrollIntoView",aboutuslink);
		aboutuslink.click();
	}

}
