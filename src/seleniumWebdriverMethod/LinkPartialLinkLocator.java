package seleniumWebdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPartialLinkLocator {
	
	static String path1 = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void TagClassLinking() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path1);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("https://www.facebook.com");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);		
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		System.out.println("-------------------Step-4----------");	
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("-------------------Step-5----------");	
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Forgotten")).click();
		System.out.println("-------------------Step-6----------");	
		Thread.sleep(4000);
		
		driver.close();
		System.out.println("-------------------Step-7----------");			
	}

	public static void main(String[] args) throws InterruptedException {
		
		TagClassLinking();
		
	}

}
