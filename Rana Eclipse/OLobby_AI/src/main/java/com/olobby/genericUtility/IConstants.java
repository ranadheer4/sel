package com.olobby.genericUtility;

public interface IConstants 
{
	String filePath="./src/test/resources/DataRepo/config.properties";

	//String excelPath="./src/test/resources/DataRepo/TestData (5).xls";
	//String chromeValue="./Drivers/chromedriver.exe";

	String excelPath="./src/test/resources/DataRepo/TestData.xls";

	String chromeValue="C:\\Users\\RanadheerDurgi\\git\\qa-automation2\\OLobby\\OLOBBYHYBRIDAUTOMATION\\Drivers\\chromedriver.exe";
	

//	String chromeValue="./Drivers/chromedriver.exe";


    String chromeKey="webdriver.chrome.driver";
//    String edgeKey="webdriver.edge.driver";
//    String edgeValue="C:\\Users\\PrakashSrivastava\\git\\qa-automation1\\Drivers\\msedgedriver.exe";
	String DbUrl="jdbc:mysql://localhost:3306/";
	String REPORT_PATH="./Extent Reports";
	String DBUsername="root";
	String DBPassword="root";
	int implicitlyWaitDuration=10;
	int explicitWaitDuration=10;
	int scriptTimeOutDuration=10;
	
	
}
