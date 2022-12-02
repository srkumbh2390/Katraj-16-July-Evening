package seleniumWebdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {
	
	static String path = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void submitting() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", path);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("http://www.rediffmail.com");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		
		 driver.findElement(By.id("login1")).sendKeys("srk@rediffmail.com");
		 System.out.println("Username Set");	
		 
	     driver.findElement(By.name("passwd")).sendKeys("abc@123");
	     System.out.println("Password Set");
		
	      // submitting form with submit()
	     driver.findElement(By.name("proceed")).submit();
	     System.out.println("Submit done");
	     
//	     Thread.sleep(5000);
//	      driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		
		submitting();
		

	}

}
