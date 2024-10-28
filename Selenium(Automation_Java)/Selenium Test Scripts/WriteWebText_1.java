package apirll_15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteWebText_1 {

	public static void main(String[] args) throws Throwable {
		// Write web text from primus bank store into as given file
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		File f = new File("D://primus bank.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		String para1 = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/p[1]")).getText();
		String para2 = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/p[2]")).getText();
		bw.write(para1);
		bw.newLine();
		bw.write(para2);
		bw.flush();
		bw.close();
		driver.close();
	}

}
