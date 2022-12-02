package seleniumWebdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateQuit {
	
	 static String path1 = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void navigating() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path1);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("http://www.google.com");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);
		
		driver.navigate().to("http://www.facebook.com");
		System.out.println("-------------------Step-4-----------");
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("-------------------Step-5-----------");
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println("-------------------Step-6----------");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		System.out.println("-------------------Step-7-----------");
		Thread.sleep(5000);		
		
		driver.quit();
		System.out.println("-------------------Step-8-----------");
	}
	public static void main(String[] args) throws InterruptedException {
		
				navigating();
	}
}
