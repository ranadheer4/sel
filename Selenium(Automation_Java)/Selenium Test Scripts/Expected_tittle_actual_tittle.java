package april04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Expected_tittle_actual_tittle {

	public static void main(String[] args) throws Throwable {
		// verify expected tittle and actual tittle
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		//driver.get("https://google.com");
		Thread.sleep(5000);
		String exptdtittle = "google";
		//get tittle in runtime
		String actualtittle = driver.getTitle();
		//verify both tittles
		if(exptdtittle.equalsIgnoreCase(actualtittle))
		{
			System.out.println("tittle is matching::"+exptdtittle+" "+actualtittle);
		}
		else
		{
			System.out.println("tittle is not matching::"+exptdtittle+" "+actualtittle);
		}
		

	}

}
