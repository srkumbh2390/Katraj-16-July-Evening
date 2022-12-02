package seleniumWebdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassRightClick {
	
	static String path1 = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void RightClicking() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path1);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("https://demoqa.com/buttons");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);	
		
		WebElement Button2 = driver.findElement(By.id("rightClickBtn"));
		
		Actions act=new Actions(driver);
		act.contextClick(Button2).perform();
		System.out.println("-------------------Step-4-----------");	
		Thread.sleep(2000);	
		
		String text = driver.findElement(By.id("rightClickMessage")).getText();		
		System.out.println("-------------------Step-5-----------");	
		
		if (text.contains("right click")) {
			System.out.println("Test case Passed");
		}
		else {
			System.out.println("Test case Failed");
		}
		System.out.println("-------------------Step-6-----------");	
		Thread.sleep(5000);	
		
		driver.close();
		System.out.println("-------------------Step-7-----------");			
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		RightClicking();
	}

}
