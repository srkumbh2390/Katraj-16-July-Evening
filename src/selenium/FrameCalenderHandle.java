package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameCalenderHandle {

	public static void DateCalender(String monthyr, int dateNo) throws InterruptedException {
		//set path require for create driver instance
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		System.out.println("----------------------------- step-0----------------------------------------------------");
		
		//step-1 crating object of chrome driver
		WebDriver driver = new ChromeDriver();
		System.out.println("----------------------------- step-1----------------------------------------------------");
		
		//step-2 maximize
		driver.manage().window().maximize();
		System.out.println("----------------------------- step-2----------------------------------------------------");
		
		//step-3 open webpage
		driver.get("https://jqueryui.com/datepicker");
		System.out.println("----------------------------- step-3----------------------------------------------------");
		Thread.sleep(2000);
		
		//step-4 find frame & switch into frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		System.out.println("----------------------------- step-4----------------------------------------------------");
		
		//step5 find datepicker tab & click
		WebElement tab = driver.findElement(By.xpath("//input[@class='hasDatepicker']"));
		tab.click();
		System.out.println("----------------------------- step-5----------------------------------------------------");
		
		//step-6 find month year and date
		//step-6A- find month year previous as well as next 
		while (true) {
			WebElement monthyearele = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			String monthyear = monthyearele.getText();
			
			if (!monthyear.equals(monthyr)) {
				// previous month & year
//				WebElement prevlink = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
//				prevlink.click();
				
				// Next month & year
				WebElement nextlink = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
				nextlink.click();
			}
			else {
				break;
			}
		}
		System.out.println("----------------------------- step-6A----------------------------------------------------");
		Thread.sleep(3000);
		
		//step-6B- find date 
		driver.findElement(By.xpath("//a[text()='"+dateNo+"']")).click();
		System.out.println("date selected");	
		System.out.println("----------------------------- step-6B----------------------------------------------------");
		Thread.sleep(5000);
		
		// step-7 close window
		driver.close();
		System.out.println("----------------------------- step-7----------------------------------------------------");
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		DateCalender("November 2025", 12);
	}

}
