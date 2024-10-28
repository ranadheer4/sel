package com.prakash.genericUtility;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * 
 * @author PrakashSrivastava
 *
 */
public class ItestListenerImtn  implements ITestListener{
	ExtentSparkReporter spark;
	ExtentReports report;
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		test=report.createTest(result.getName());
		test.pass(MarkupHelper.createLabel(result.getName()+" method PASSED", ExtentColor.GREEN));

	}
	/**
	 * To take screenshot of failed test scripts
	 */
	public void onTestFailure(ITestResult result) {
//		test.log(Status.FAIL,result.getMethod().getMethodName());
//		test.log(Status.FAIL, result.getThrowable());
		try {
			String screenShotName=WebDriverUtility.takeScreenShot(BaseClass.sdriver, result.getMethod().getMethodName());
			test.addScreenCaptureFromPath(screenShotName, result.getMethod().getMethodName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		test=report.createTest(result.getName());
		test.fail(MarkupHelper.createLabel(result.getName()+" method FAILED", ExtentColor.RED));
		WebDriverUtility wLib = new WebDriverUtility();
		WebDriverUtility.takeScreenShot(BaseClass.sdriver, "./screenShots/"+result.getName()+".PNG");
		
	}
    public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName());
		test.log(Status.SKIP, result.getThrowable());
		test=report.createTest(result.getName());
		test.skip(MarkupHelper.createLabel(result.getName()+" method SKIPPED", ExtentColor.YELLOW));
	}
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    	
	}

	public void onStart(ITestContext context) {
		spark = new ExtentSparkReporter(IConstants.REPORT_PATH);
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("CredentialMyDocs Reports");
		spark.config().setReportName("Prakash Reports");
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("PLATFORM", "Windown 10");
		report.setSystemInfo("Created By", "Prakash");
		report.setSystemInfo("Reviwed By","Raziasulthana syed");
	}
    public void onFinish(ITestContext context) {
		report.flush();
	}

}
