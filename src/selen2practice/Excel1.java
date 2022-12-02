package selen2practice;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel1 {
	
	public static String DataReading(int r, int c) throws IOException {
		
		//step-1 folder path
		String path = "C:\\Users\\swapn\\eclipse-workspace\\Katraj 16-July-Evening\\TestData\\TestFile.xlsx";
		
		//step2- to handle file type info
		File file=new File(path);
		
		//step-3 to read file we need input Stream
		FileInputStream fis= new FileInputStream(file);
		
		//step-4 we need poi library to handle excel file
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		//step-5 locate sheet
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
		//step-6 locate row
		XSSFRow row=sheet.getRow(r);
		
		//step-7 locate column
		XSSFCell cell=row.getCell(c);
		
		// step-8 to get cell value
		String value = cell.getStringCellValue();
		
		System.out.println("values of excel are : " + value);
		System.out.println("Successfully read data");
		
		return value;		
	}
	
	public static void init() throws InterruptedException, IOException {
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
		driver.findElement(By.id("email")).sendKeys(DataReading(0,0));
		Thread.sleep(2000);
		System.out.println("-------------------Step-4-----------");
		
		driver.findElement(By.id("pass")).sendKeys(DataReading(0,1));
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

	public static void main(String[] args) throws IOException, InterruptedException {
		
		init();
	}

}
