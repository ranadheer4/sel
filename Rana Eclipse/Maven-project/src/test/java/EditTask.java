

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.Edit_AddTask;
import com.TaskManagement.ObjRepo.TaskManagement;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class EditTask extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(
      groups = {"SmokeTest"}
   )
   public void taskEdit() throws InterruptedException {
	   HomePage hp = new HomePage(driver);
	   Thread.sleep(3000);
	   hp.getTaskManageMent().click();
	   Thread.sleep(3000);
	   TaskManagement t = new TaskManagement(driver);
	   
	   t.getTasksClick().click();
	   WebElement hidenelement3 = driver.findElement(By.xpath("//tbody[@role='presentation']/../descendant::td[@aria-colindex='4']/../descendant::span[text()='123456']/..//following-sibling::span[text()='Open']"));
	   Thread.sleep(2000);
	   ((JavascriptExecutor)driver).executeScript("document.scrollIntoView",hidenelement3);
	   hidenelement3.click();
	   Edit_AddTask ea=new Edit_AddTask(driver);
	   ea.getTaskName().clear();
	   ea.getTaskName().sendKeys(eLib.readDataFromExcel("EditTask", 1, 0));
	   ea.getLocation().sendKeys(eLib.readDataFromExcel("EditTask", 1, 1));
	   ea.clickEnter(driver);
	   ea.getProjectName().sendKeys(eLib.readDataFromExcel("EditTask", 1, 2));
	   ea.clickEnter(driver);
	   Thread.sleep(2000);
//	   ea.getStartDate().clear();
//	   ea.getStartDate().sendKeys(eLib.readDataFromExcel("EditTask", 1, 3));
//
//	   ea.getDueDate().clear();
//	   
//	   ea.getDueDate().sendKeys(eLib.readDataFromExcel("EditTask", 1, 4));
	   ea.getStatus().sendKeys(eLib.readDataFromExcel("EditTask", 1, 5));
	   ea.clickEnter(driver);
	   ea.getPriority().sendKeys(eLib.readDataFromExcel("EditTask", 1, 6));
	   ea.clickEnter(driver);
	   ea.getSave().click();


	   
	   
	   
	   
   }
}
