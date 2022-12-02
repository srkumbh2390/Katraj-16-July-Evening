package seleniumWebdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDoubleClick {
	
	static String path1 = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void doubleClicking() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path1);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("https://demoqa.com/buttons");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);	
		
		WebElement Button3 = driver.findElement(By.id("doubleClickBtn"));
		
		Actions Act=new Actions(driver);
		
		Act.doubleClick(Button3).perform();
		System.out.println("-------------------Step-4-----------");	
		Thread.sleep(2000);	
		
		String DoubleClickText = driver.findElement(By.id("doubleClickMessage")).getText();
		System.out.println("-------------------Step-5-----------");	
		Thread.sleep(2000);	
		
		if (DoubleClickText.contains("double click")) {
			System.out.println("Test case Passed");
		}
		else {
			System.out.println("Test case Failed");
		}
		System.out.println("-------------------Step-6----------");	
		
		Thread.sleep(5000);	
		driver.close();
		System.out.println("-------------------Step-7-----------");	
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		doubleClicking();
	}

}
