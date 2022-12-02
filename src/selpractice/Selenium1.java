package selpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
	
	public static void s1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		//step-1 initalize instance-
		WebDriver driver = new ChromeDriver();	
		
		//step-2 maximize
		driver.manage().window().maximize();
		
		//step-3  open webpage
		driver.get("http://www.facebook.com");
		Thread.sleep(1000);
		
		driver.navigate().to("http://www.rediffmail.com");
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().forward();		
		Thread.sleep(1000);
		
		driver.navigate().refresh();		
		
		Thread.sleep(3000);
		driver.close();		
	}
	public static void main(String[] args) throws InterruptedException {
		s1();
	}

}
