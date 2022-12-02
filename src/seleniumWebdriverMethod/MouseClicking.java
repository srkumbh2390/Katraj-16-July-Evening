package seleniumWebdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClicking {
	
	static String path1 = "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe";
	
	public static void MouseClick() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path1);
		System.out.println("-------------------Step-0-----------");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("-------------------Step-1-----------");	
		
		driver.manage().window().maximize();
		System.out.println("-------------------Step-2-----------");	
		
		driver.get("https://demoqa.com/buttons");
		System.out.println("-------------------Step-3-----------");	
		Thread.sleep(2000);	
		
		WebElement ClickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
		ClickMe.click();
		System.out.println("-------------------Step-4-----------");	
		Thread.sleep(2000);	
		
		WebElement text = driver.findElement(By.id("dynamicClickMessage"));
		String ClickMsg = text.getText();
		System.out.println("-------------------Step-5-----------");	
		Thread.sleep(2000);	
		
		if (ClickMsg.contains("dynamic click")) {
			System.out.println("Test Case Passed");			
		}
		else {
			System.out.println("Test Case Failed");
		}
		System.out.println("-----------Step-6---------");
		Thread.sleep(5000);
		
		//step-6 close
		driver.close();
		System.out.println("-----------Step-7---------");	
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		MouseClick();		
	}

}
