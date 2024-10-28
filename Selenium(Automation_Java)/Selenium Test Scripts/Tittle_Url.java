package april04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tittle_Url {

	public static void main(String[] args) throws Throwable {
		// tittle of page, url of page along with length
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		//tittle of page and along with length
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//print url of page along with length
		String strUrl = driver.getCurrentUrl();
		System.out.println(strUrl);
		System.out.println(strUrl.length());
	}

}
