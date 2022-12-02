package selpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDateCalender {
	
	public static void calender (String monthyr, int dateNo) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		//step-1 initalize instance-
		WebDriver driver = new ChromeDriver();
		
		//step-2 maximize
		driver.manage().window().maximize();
		
		//step-3  open webpage
		driver.get("https://jqueryui.com/datepicker");
		Thread.sleep(1000);
		
		//step-4 handling of frame
		//switch to frame as element is part of frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		//step-5
		WebElement tab = driver.findElement(By.xpath("//input[@id='datepicker']"));
		tab.click();
		Thread.sleep(2000);
		
		//step-6 select date - covid- 24 March 2020
		//step-6A --month & year
		while (true) {
			WebElement monthyearele = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			String monthyear = monthyearele.getText();
			
			if(!monthyear.equals(monthyr)) {
				WebElement prevlink = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
				prevlink.click();	
				
			}
			else {
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='"+dateNo+"']")).click();
		System.out.println("date selected");
		
		Thread.sleep(8000);
		driver.close();
		
	}

	public static void main(String[] args) throws InterruptedException {
		calender("September 1990", 23);

	}

}
