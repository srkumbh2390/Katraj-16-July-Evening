package seleniumWebdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageGetCloseMethod {
	
	 String path1 = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public  void manageGetting() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path1);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
//		ChromeDriver driver = new ChromeDriver();		
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");		
		
		driver.get("http://www.facebook.com");
		System.out.println("-------------------Step-3-----------");
		Thread.sleep(2000);
		
		driver.manage().window().fullscreen();
		System.out.println("-------------------Step-4-----------");
		Thread.sleep(5000);
		
		driver.close();
		System.out.println("-------------------Step-5-----------");			
	}

	public static void main(String[] args) throws InterruptedException {
		
		ManageGetCloseMethod ref= new ManageGetCloseMethod();
		ref.manageGetting();		
	}
}
