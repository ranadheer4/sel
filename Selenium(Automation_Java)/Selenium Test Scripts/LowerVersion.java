package apirl_18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LowerVersion {

	public static void main(String[] args) throws Throwable {
		// Lower version of excel
		FileInputStream fi = new FileInputStream("D://Dummy.xls");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet ws = wb.getSheet("Login");
		Row row = ws.getRow(0);
		int rc = ws.getLastRowNum();
		int cc = row.getLastCellNum();
		System.out.println(rc+" "+cc);
		for(int i=1;i<=rc;i++)
		{
			String username = ws.getRow(i).getCell(0).getStringCellValue();
			String password = ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+" "+password);
			ws.getRow(i).createCell(2).setCellValue("I am so lazy to practise");
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D://rana.xls");
		wb.write(fo);
		fo.close();
		wb.close();	
	}

}
