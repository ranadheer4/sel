package com.prakash.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author PrakashSrivastava
 *
 */
public class ExcelUtility {
	/**
	 *its used to read the data from excel file  
	 *
	 */
	public String readDataFromExcel(String sheetName,int rowNum,int cellNum){
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(IConstants.excelPath);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		HSSFWorkbook workbook = null;
		try {
			workbook = (HSSFWorkbook) WorkbookFactory.create(fileInputStream);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		HSSFSheet sheet = workbook.getSheet(sheetName);
		HSSFRow row = sheet.getRow(rowNum);
		HSSFCell cell = row.getCell(cellNum);
		String data = cell.toString();
		return data;
	}
	/**
	 * its used to write data into excel file
	 */
	public void writeDataIntoExcel(String sheetName,int rowNum,int cellNum,String data) {
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(IConstants.excelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Workbook workbook = null;
		try {
			workbook = WorkbookFactory.create(fileInputStream);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(data);
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(IConstants.excelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			workbook.write(fileOutputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
