package march31;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowsersUrl {

	public static void main(String[] args) throws Throwable {
		// create instance object
		System.setProperty("webdriver.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver dr = new FirefoxDriver();
		//driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		//dr.manage().deleteAllCookies();
		//dr.manage().window().maximize();
		//launch url
		//driver.get("http://instagram.com");
		//driver.get("http://facebook.com");
		//dr.get("http://instagram.com");
		//dr.get("http://telegram.com");
		//driver.close();
		//driver.quit();
		//suspend tool for 5 secs
		Thread.sleep(50000);
		//driver.close();
		//driver.quit();
	}

}
