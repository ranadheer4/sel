package Practise_05_01_22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Udemy_Nsatarx_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating Instance object
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\RanadheerDurgi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver rana=new ChromeDriver();
		
		//rana.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		rana.get("https://nstarx.udemy.com/?next=%2Forganization%2Fhome%2F");
		rana.manage().window().maximize();
		rana.manage().deleteAllCookies();
		
		//Login with valid username and login 

		rana.findElement(By.xpath("(//input[@id='form-group--3'])[1]")).sendKeys("raziasulthana.syed@nstarxinc.com");
		
		rana.findElement(By.xpath("//button[@type='submit']")).click();
		
		rana.findElement(By.name("password")).sendKeys("Test@1234");
		rana.findElement(By.xpath("//span[normalize-space()='Log In']")).click();
		String pageTittle=rana.getTitle();
		System.out.println(pageTittle);
		System.out.println(pageTittle.length());
		
		String exptdTittle=rana.findElement(By.xpath("//h2[@data-purpose='start-learning-title']")).getText();
		String actualTittle="Let's start learning, Razia Sulthana";
		if(exptdTittle.equalsIgnoreCase(actualTittle))
		{
			System.out.println("tittle is matching::"+exptdTittle+" "+actualTittle);
		}
		else
		{
			System.out.println("tittle is not matching::"+exptdTittle+" "+actualTittle);
		}
		
		rana.close();
	
	}

}