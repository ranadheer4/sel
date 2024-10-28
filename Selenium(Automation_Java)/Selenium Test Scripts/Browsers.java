package march30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome2\\chromedriver.exe");
		// create instance object
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		//System.setProperty("webdriver.geckodriver", "d:/geckodriver.exe");
		//WebDriver dr = new FirefoxDriver();
		
			
	}

}
