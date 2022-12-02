package seleniumWebdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateHandle {
	
	static String path = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void dateHandling() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", path);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("https://jqueryui.com/datepicker");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		WebElement dateTab = driver.findElement(By.id("datepicker"));
		dateTab.click();
		
		while (true) {
			WebElement monthyearele = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			String monthyear = monthyearele.getText();
			if(!monthyear.equals("March 2020")) {
				
				WebElement prevLink = driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all' or @data-handler='prev']"));
				prevLink.click();
			}
			else {
				break;
			}
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='24']")).click();
		System.out.println("date selected");
		
		Thread.sleep(5000);
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
	
		dateHandling();
	}
}
