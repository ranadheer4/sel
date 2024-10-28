package DriverFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;
import org.testng.annotations.Test;

import commonFunctions.FunctionLibrary;
import constant.AppUtil;
import utilities.ExcelFileUtil;

public class DriverScript extends AppUtil {
String inputpath ="D:\\Automation_Selinum\\DDT_Framework\\TestInput\\LoginData.xlsx";
String outputpath ="D:\\Automation_Selinum\\DDT_Framework\\TestOutput\\DataDrivenResults.xlsx";
@Test
public void validateLogin()throws Throwable
{
	//create object for excelfileutil class
	ExcelFileUtil xl = new ExcelFileUtil(inputpath);
	//count no of rows in a sheet
	int rc = xl.rowCount("Login");
	//count no of cells in first row
	int cc = xl.cellCount("Login");
	Reporter.log("No of rows are::"+rc+"    "+"No of cells in first row::"+cc,true);
	//iterate all rows
	for(int i=1; i<=rc;i++)
	{
		driver.get(config.getProperty("Url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//read username cell
		String user =xl.getCelldata("Login", i, 0);
		String pass = xl.getCelldata("Login", i, 1);
		boolean res =FunctionLibrary.verifyLogin(user, pass);
		if(res)
		{
			xl.setCellData("Login", i, 2, "Login success", outputpath);
			xl.setCellData("Login", i, 3, "Pass", outputpath);
		}
		else
		{
			File screen =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screen, new File("./Screens/Iteration/"+i+"Loginpage.png"));
			xl.setCellData("Login", i, 2, "Invalid Login Details", outputpath);
			xl.setCellData("Login", i, 3, "Fail", outputpath);
		}
		
		
	}
}
}







