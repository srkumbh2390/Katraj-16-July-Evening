package selen2practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void excelWriting() throws IOException {
		//step - 1
		String path = System.getProperty("user.dir") + "\\TestData\\TestFile.xlsx";
		
		//step-2
		File file=new File(path);
		
		//step-3
		FileInputStream fis= new FileInputStream(file);
		
		//step-4
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		// step-5
		XSSFSheet sheet = wb.createSheet("Swapnil");
		
		//step-6
		XSSFRow row = sheet.createRow(0);
		
		//step-7
		XSSFCell cell = row.createCell(0);
		
		//step-8 
		cell.setCellValue("swap@gmail.com");
		
		//step-9
		FileOutputStream fos=new FileOutputStream(file);
		
		// step-10 
		wb.write(fos);
		
		System.out.println("Successfully write data");			
	}		

	public static void main(String[] args) throws IOException {
		
		excelWriting();

		}
}
