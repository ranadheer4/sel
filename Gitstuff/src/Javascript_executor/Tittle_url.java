package Javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tittle_url {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		// JS of launch url, title, url, domain
				WebDriver driver = new EdgeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				JavascriptExecutor js = (JavascriptExecutor)driver;
				//launch url
				js.executeScript("window.location='https://amazon.in'");
				Thread.sleep(5000);
				//page title and length of title
				String pagetitle = js.executeScript("return document.title").toString();
				System.out.println(pagetitle);
				System.out.println(pagetitle.length());
				//print url and length of url
				String strurl = js.executeScript("return document.URL").toString();
				System.out.println(strurl);
				System.out.println(strurl.length());
				//domain and length
				String srdomain = js.executeScript("return document.domain").toString();
				System.out.println(srdomain);
				System.out.println(srdomain.length());
	}

}
