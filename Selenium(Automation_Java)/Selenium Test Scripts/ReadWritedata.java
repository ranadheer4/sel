package apirl_18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWritedata {

	public static void main(String[] args) throws Throwable {
		// read and write the data
		FileInputStream fi = new FileInputStream("D://Dummy.xls");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Login");
		int rc = ws.getLastRowNum();
		System.out.println("No of rows are::"+rc);
		for(int i=1;i<=rc;i++)
		{
			String username = ws.getRow(i).getCell(0).getStringCellValue();
			String password = ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+" "+password);
			//write as into results cell
			ws.getRow(i).createCell(2).setCellValue("pass");
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D://Results.xls");
		wb.write(fo);
		fo.close();
		wb.close();

	}

}
