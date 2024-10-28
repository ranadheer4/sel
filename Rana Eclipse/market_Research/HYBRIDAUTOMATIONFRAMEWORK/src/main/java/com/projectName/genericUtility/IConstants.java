package com.projectName.genericUtility;
/**
 * 
 * @author PrakashSrivastava
 *
 */
public interface IConstants 
{
	String filePath="./src/test/resources/DataRepo/config.properties";
	String excelPath="./src/test/resources/DataRepo/TestData.xls";
	String chromeValue="./Drivers/chromedriver.exe";
    String chromeKey="webdriver.chrome.driver";
    String edgeKey="webdriver.edge.driver";
    String edgeValue="C:\\Users\\PrakashSrivastava\\eclipse-workspace\\HYBRIDAUTOMATIONFRAMEWORK\\Drivers\\msedgedriver.exe";
	String DbUrl="jdbc:mysql://localhost:3306/";
	String REPORT_PATH="./Extent Report";
	String DBUsername="root";
	String DBPassword="root";
	int implicitlyWaitDuration=10;
	int explicitWaitDuration=10;
	int scriptTimeOutDuration=10;
	
	
	
}
