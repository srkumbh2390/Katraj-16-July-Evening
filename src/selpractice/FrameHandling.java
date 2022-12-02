package selpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameHandling {
	
	public static void date() throws InterruptedException {
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
		
		//step-6 select date - covid- 24 march 2020
		//step-6A --month & year
		while (true) {
			WebElement monthyearele = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			String monthyear = monthyearele.getText();			
			
			if(!monthyear.equals("May 2020")) {
				WebElement prevlink = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
				prevlink.click();				
			}
			else {
				break;
			}
			}
		Thread.sleep(2000);
		
		//step-6B --select date
		driver.findElement(By.xpath("//a[text()='24']")).click();
		System.out.println("date selected");
		
		
			Thread.sleep(8000);
			driver.close();
		}
		
	
	public static void main(String[] args) throws InterruptedException {
	
		date();
	}

}
