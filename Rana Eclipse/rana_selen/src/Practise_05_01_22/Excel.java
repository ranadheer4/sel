package Practise_05_01_22;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class Excel {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("./src/test/resources/TestData.xlsx");
		HSSFWorkbook wb= new HSSFWorkbook();
		String data = wb.getSheet("sample").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
	}

}
