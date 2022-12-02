package selen2practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteMultiple {
	
	public static void multipleWriting(int r, int c, String val) throws IOException {
		//step-1 
		String path=System.getProperty("user.dir") + "\\TestData\\TestFile.xlsx";
		
		//step-2
		File file = new File(path);
		
		//step-3
		FileInputStream fis=new FileInputStream(file);
		
		//step-4 
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//step-5 
		XSSFSheet sheet=wb.getSheet("Swap");
		
		//step-6
		XSSFRow row = sheet.createRow(r);
		
		//step-7 
		XSSFCell cell=row.createCell(c);
		
		//step-8
		cell.setCellValue(val);
		
		//step-9
		FileOutputStream fos= new FileOutputStream(file);
		
		//step-10
		wb.write(fos);
		System.out.println("successfully written value");
	}

	public static void main(String[] args) throws IOException {
		String [] arr = {"Mumbai", "Pune", "Nagpur", "Nagar"};
		
		for (int row=0; row<arr.length; row++) {
			int col=0;
			
			multipleWriting(row,col,arr[row]);
			System.out.println();
		}

	}

}
