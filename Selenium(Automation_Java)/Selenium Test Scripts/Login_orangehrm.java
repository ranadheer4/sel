package apirll_15;

import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_orangehrm {

	public static void main(String[] args) throws Throwable {
		// Verify login functionality with multiple data by accesing from notepad
		FileReader fr = new FileReader("D://split.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while((str=br.readLine())!=null)
		{
			//split notepad data into array collection
		String login[] = str.split("/");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("txtUsername")).sendKeys(login[0]);
		driver.findElement(By.name("txtPassword")).sendKeys(login[1]);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		String exptd = "dashboard";
		String actual = driver.getCurrentUrl();
		if(actual.contains(exptd))
		{
			System.out.println("login sucess::"+exptd+" "+actual);
		}
		else
		{
			System.out.println("login fail::"+exptd+" "+actual);
		}
		}
	}
}


