package apirl_19;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class TypeConversionReadWrite {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("D://Dummy.xls");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet ws = wb.getSheet("Login");
		int rc = ws.getLastRowNum();
		System.out.println("No of row are::"+rc);
		for(int i=1;i<=rc;i++)
		{
			String username = ws.getRow(i).getCell(0).getStringCellValue();
	if(wb.getSheet("Login").getRow(i).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC);
	{
		//read integer type cell
		int celldata=(int)wb.getSheet("Login").getRow(i).getCell(1).getNumericCellValue();
		//convert int type into string type
		String password = String.valueOf(celldata);
		System.out.println(username+" "+password);
		ws.getRow(i).createCell(2).setCellValue("Fail");
		}
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D://Results.xls");
		wb.write(fo);
		fo.close();
		wb.close();
	}

}
