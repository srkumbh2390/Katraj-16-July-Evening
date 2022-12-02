package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDateHandle {
	
	public static void calender() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker");
		Thread.sleep(2000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		WebElement tab = driver.findElement(By.xpath("//input[@class='hasDatepicker']"));
		tab.click();
		
		while (true) {
			WebElement monthyearele = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			String monthyear = monthyearele.getText();
			
			if(!monthyear.equals("April 2019")) {
				WebElement prevlink = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
				prevlink.click();
			}
			else {
				break;
			}
		}
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='23']")).click();
		System.out.println("date selected");
		
		Thread.sleep(3000);
		driver.close();		
	}

	public static void main(String[] args) throws InterruptedException {
		
			calender();
	}

}
