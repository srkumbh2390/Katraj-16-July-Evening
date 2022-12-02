package seleniumWebdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearGetAttributeMethod {
	
	static String path = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void clearSubmitAttributeGetting() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		
		String AttributeUsername = username.getAttribute("name");
		System.out.println("Attribute of Username : " + AttributeUsername);
		
		String AttributePassword = password.getAttribute("type");
		System.out.println("Attribute of Password : " + AttributePassword);
				
		username.sendKeys("abc@gmail.com");		
		password.sendKeys("swap@123");			
		System.out.println("Text Field Set");
		System.out.println("-------------------Step-4-----------");	
		Thread.sleep(3000);	
		
		username.clear();
		password.clear();
		System.out.println("Text Field Cleared");
		System.out.println("-------------------Step-5-----------");	
		Thread.sleep(2000);			
		
		username.sendKeys("student");
		password.sendKeys("Password123");
		System.out.println("Text Field Re-Set");
		System.out.println("-------------------Step-6-----------");	
		
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
		System.out.println("Login Done with Click");
		System.out.println("-------------------Step-7-----------");	
				
		Thread.sleep(6000);
		driver.quit();
		System.out.println("-------------------Step-8-----------");	
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		clearSubmitAttributeGetting();	
	}
}
