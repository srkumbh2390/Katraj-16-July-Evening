package seleniumWebdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleGetCurrentUrlPageSourceMethod {
	
	static String path1 = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void TitleUrlSourceGetting() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path1);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");		
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");		
		
		driver.get("http://www.facebook.com");
		System.out.println("-------------------Step-3-----------");
		Thread.sleep(2000);
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		System.out.println("-------------------Step-4-----------");
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		System.out.println("-------------------Step-5-----------");
		
		String currentPageSource = driver.getPageSource();
		System.out.println(currentPageSource);
		System.out.println("-------------------Step-6-----------");
		Thread.sleep(3000);
		
		driver.close();
		System.out.println("-------------------Step-7-----------");
	}
	public static void main(String[] args) throws InterruptedException {
		
		TitleUrlSourceGetting();
	}

}
