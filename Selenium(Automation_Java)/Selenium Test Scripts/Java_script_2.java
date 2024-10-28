package apirl_13;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Java_script_2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//launch url
		js.executeScript("window.location='https://amazon.in'");
		Thread.sleep(5000);
		//scroll vertically top to bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		//scroll vertically bottom to top
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);
		//scroll vertically to certain pixcel
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,700)");
	}

}
