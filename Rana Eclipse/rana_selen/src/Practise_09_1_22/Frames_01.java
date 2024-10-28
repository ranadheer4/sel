package Practise_09_1_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames_01 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver rana=new ChromeDriver();
		rana.manage().window().maximize();
		rana.manage().deleteAllCookies();
		
		rana.get("https://demo.automationtesting.in/Frames.html");
		rana.switchTo().frame("SingleFrame");
		//rana.switchTo().frame(0);
		
		rana.findElement(By.xpath("(//input[@type='text'])")).sendKeys("Rana");
		
		Thread.sleep(3000);

		//WebElement rana.findElement(By.xpath("iframe[src='SingleFrame.html']"));
	
			
		//rana.switchTo().defaultContent();
		Thread.sleep(3000);
		
		rana.close();
		
		
	}

}
