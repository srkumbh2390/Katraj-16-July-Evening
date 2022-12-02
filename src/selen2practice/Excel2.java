package selen2practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel2 {
	
	public static String DataRead(int r, int c) throws IOException {
		// step-1 path of file		
		String path = System.getProperty("user.dir") + "\\TestData\\TestFile.xlsx";
		
		//step-2  to handle file type info
		File file = new File(path);
		
		//step-3  to read file we need input steram
		FileInputStream fis = new FileInputStream(file);
		
		//step-4 to read poi library classes we handle excel file
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//step-5 to locate sheet
		XSSFSheet sheet= wb.getSheet("Sheet1");
		
		// step-6 to locate row
		XSSFRow row = sheet.getRow(r);
		
		//step-7 to locate column
		XSSFCell cell = row.getCell(c);
		
		// step-8 to get cell value
		String value = cell.getStringCellValue();
		
//		System.out.println("Values of excel is : " + value);
//		System.out.println("Successfully read Data");
		
		return value;		
	}
	
	public void init1() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver= new ChromeDriver();
		System.out.println("-------------------Step-1-----------");
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");
		
		driver.get("http://www.facebook.com");
		System.out.println("-------------------Step-3-----------");
		Thread.sleep(2000);
		
		//step-4 locate element and enter email
		driver.findElement(By.id("email")).sendKeys(DataRead(0,0));
		Thread.sleep(2000);
		System.out.println("-------------------Step-4-----------");
		
		driver.findElement(By.id("pass")).sendKeys(DataRead(0,1));
		Thread.sleep(2000);
		System.out.println("-------------------Step-5-----------");
		
		//step-6
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(8000);
		System.out.println("-------------------Step-6-----------");
		
		//step-7 close window
		driver.close();
		System.out.println("-------------------Step-7-----------");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Excel2 ref = new Excel2();
		
		//init1();
		
		for (int row=0; row<=3; row++) {
			
			for (int col=0; col<=1; col++) {
				
				System.out.print(DataRead(row,col) + "  |  ");
				
			}
			System.out.println();
		}		
	}
}
