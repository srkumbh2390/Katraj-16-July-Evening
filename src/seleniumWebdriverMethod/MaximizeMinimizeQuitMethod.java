package seleniumWebdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeMinimizeQuitMethod {
	
	static String path="D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void minimizeAndmaximize() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", path);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver= new ChromeDriver();
		System.out.println("-------------------Step-1-----------");
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");
		
		driver.get("http://www.facebook.com");
		System.out.println("-------------------Step-3-----------");
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		System.out.println("-------------------Step-4-----------");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-5-----------");
		Thread.sleep(3000);
		
		driver.quit();
		System.out.println("-------------------Step-6-----------");
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		minimizeAndmaximize();
	}

}
