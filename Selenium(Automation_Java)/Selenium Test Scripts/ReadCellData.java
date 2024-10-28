package apirl_18;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadCellData {

	public static void main(String[] args) throws Throwable {
		// read second row first column data and second row second column data
		FileInputStream fi = new FileInputStream("D://Dummy.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheetAt(0);
		//count no of rows in sheet
		int rc = ws.getLastRowNum();
		System.out.println("No of rows are::"+rc);
		//print second row first column data
		String username = ws.getRow(1).getCell(0).getStringCellValue();
		//second row second column data
		String password = ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println(username+" "+password);
		fi.close();
		wb.close();
	}

}
