

import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.ProjectHomePage2;
import com.TaskManagement.ObjRepo.TaskManagement;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class ProjectHomePage extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(
      groups = {"SmokeTest"}
   )
   public void projectHomepageElements() throws InterruptedException {
	   HomePage hp = new HomePage(driver);
	   Thread.sleep(3000);
	   hp.getTaskManageMent().click();
	   Thread.sleep(3000);
	   TaskManagement t = new TaskManagement(driver);
	   t.getProjectClicik().click();
	   
	   ProjectHomePage2 php = new  ProjectHomePage2(driver);
//	   php.getShowFullScreen().click();
	   
	   php.getExport().click();
	   
   }
   
}