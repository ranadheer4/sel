package Javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scroll_Up_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js=new JavascriptExecutor() {
			
			@Override
			public Object executeScript(String script, Object... args) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object executeAsyncScript(String script, Object... args) {
				// TODO Auto-generated method stub
				return null;
			}
		};

	}

}
