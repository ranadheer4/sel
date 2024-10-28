

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.AddProjectPage;
import com.TaskManagement.ObjRepo.InlineEdit;
import com.TaskManagement.ObjRepo.TaskManagement;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class TaskInlineEdit extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(
      groups = {"SmokeTest"}
   )
   public void inlineEdit() throws InterruptedException {
	   HomePage hp = new HomePage(driver);
	   Thread.sleep(3000);
	   hp.getTaskManageMent().click();
	   Thread.sleep(3000);
	   TaskManagement t = new TaskManagement(driver);
	   Thread.sleep(2000);
	   
	   t.getTasksClick().click();
	   InlineEdit ie = new InlineEdit(driver);

	   Thread.sleep(2000);
	   ie.getEditExistingTaskName().click();
	  // Thread.sleep(2000);
	   Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
	   ie.getEditExistingTaskName().clear();
	   ie.getEditExistingTaskName().sendKeys(eLib.readDataFromExcel("Inline", 1, 0));
	   AddProjectPage ap = new AddProjectPage(driver);
	   ap.clickEnter(driver);
	   
//	   ie.getAddRow().click();
//	   Thread.sleep(5000);
//	   ie.getTaskNameField().click();
//	   Thread.sleep(2000);
//	   ie.getTaskNameField().click();
//	   Thread.sleep(5000);
//	   ie.getTaskNameField().sendKeys(eLib.readDataFromExcel("Inline", 1, 0));

//	   Thread.sleep(5000);
//	   ie.getAddRow().click();
//	   Thread.sleep(2000);
//	   ie.getTaskNameField().click();
//	   Thread.sleep(2000);
//	   Actions action = new Actions(driver);
//	   action.sendKeys(Keys.ESCAPE).perform();
	 
//	   action.doubleClick(ie.getTaskNameField());
	   
	   
//	   ie.getTaskNameField().sendKeys(eLib.readDataFromExcel("Inline", 1, 0));
//	   action.doubleClick(ie.getEditLocation());
//	   Thread.sleep(2000);
//	   action.doubleClick(ie.getEditLocation()).perform();
//	   Thread.sleep(2000);
//	   
//	   ie.getEditLocation().clear();
//	   ie.getEditLocation().sendKeys(eLib.readDataFromExcel("Inline", 1, 0));
	   
//	   ie.getTaskNameField().click();
//	   Thread.sleep(5000);
//	   ie.getTaskNameField().sendKeys(eLib.readDataFromExcel("Inline", 1, 0));
//	   AddProjectPage ap = new AddProjectPage(driver);
//	   ap.clickEnter(driver);
	   ie.getCheckbox().click();
	   ie.getDeletelog().click();
	   ie.getDeleteButton().click();

	   hp.getTrash().click();
	   Thread.sleep(5000);
	   ie.getRestoreCheckbox().click();
	   ie.getRestoreButton().click();
	   ie.getRestorePopup().click();
	   Thread.sleep(5000);
	   t.getTasksClick().click();
	   
	   
	   
	   
	   
	   

	   
}
}